package alaTest.test.service;

import java.util.concurrent.CopyOnWriteArrayList;

import alaTest.test.domain.Operator;
import alaTest.test.domain.PhoneNumber;
import alaTest.test.domain.Prefix;
import alaTest.test.searchers.Search;
import alaTest.test.sortable.Sort;

public class OperatorManager {
	
	private CopyOnWriteArrayList<Operator> operators;
	private PhoneNumber phoneNumber;
	private Sort sort;
	private Search search;

	public Prefix getCheapest()
	{
		Prefix result = null;
		
		for(Operator o : operators)
		{
			Prefix subResult = null;
			
			sort.prefixes = o.getPrefixes();
			sort.run();

		//	o.printList();
			
			search.prefixes = o.getPrefixes();
			search.phoneNumber = phoneNumber;
			subResult = search.run();
			
			if( result == null && subResult != null)
			{
				result = subResult;
			}
			else if(result != null && subResult != null)
			{
				
				boolean isLastResultgreaterThanActual = (result.getPrice().compareTo(subResult.getPrice())) == 1;
				
				if(isLastResultgreaterThanActual)
				{
					result =  subResult;
				}
			}

		}
		
		return result;
	}

	public CopyOnWriteArrayList<Operator> getOperators() {
		return operators;
	}

	public void setOperators(CopyOnWriteArrayList<Operator> operators) {
		this.operators = operators;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Sort getSort() {
		return sort;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}

	public Search getSearch() {
		return search;
	}

	public void setSearch(Search search) {
		this.search = search;
	}
	
	
	
}
