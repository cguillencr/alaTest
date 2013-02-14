package alaTest.test.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import alaTest.test.utils.PrefixComparator;

public class Operator {

	private String name;
	private List<Prefix> extensions;
	
	public Operator(String name) 
	{
		super();
		this.name = name;
		this.extensions = new ArrayList<Prefix>();
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public List<Prefix> getPrefixes() 
	{
		return extensions;
	}
	
	public void addPrefix(Prefix prefix)
	{
		prefix.setOperator(this);
		this.extensions.add(prefix);
	}
	public void printList()
	{
		//TODO delete this method
		System.out.println("---Sort elements---");
		for(Prefix p: extensions)
		{
			System.out.println(p.toString());
		}
	}
	
	public void sort()
	{
		Collections.sort( extensions, new PrefixComparator());
	}
		
	public String toString()
	{
		return "Operator.Name: "+name;
	}
}


