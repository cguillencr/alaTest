package alaTest.test.searchers;

import java.util.ArrayList;
import java.util.List;

import alaTest.test.domain.Prefix;

public class RawSearch extends Search{

	public Prefix run()
	{
		
		Prefix result = null;
		String countryAndArea =null;
		
		for(Prefix p : prefixes)
		{
			
			countryAndArea = p.getCountry() + p.getArea();
			
			if( result == null && phoneNumber.isPrefix(countryAndArea))
			{
				result = p;		
			}
			else if( result != null)
			{
				String prefixResult = result.getCountry() + result.getArea();
				String prefixActual = p.getCountry() + p.getArea();
						
				boolean areSamePrefix  = prefixActual.equals(prefixResult);
				boolean currentHasBetterPrice = result.getPrice().compareTo(p.getPrice()) == 1;
							
				if(!areSamePrefix)
				{
					break;
				}
				else if(areSamePrefix && currentHasBetterPrice)
				{
					result = p;	
				}
			}			
		}
		return result;
	}
}
