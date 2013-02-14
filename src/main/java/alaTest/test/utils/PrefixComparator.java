package alaTest.test.utils;

import java.util.Comparator;

import alaTest.test.domain.Prefix;

public class PrefixComparator implements Comparator<Prefix>
{

	public int compare(Prefix arg0, Prefix arg1) {
		
		int prefix0 = new Integer(arg0.getCountry()+arg0.getArea());
		int prefix1 = new Integer(arg1.getCountry()+arg1.getArea());
		
		if(prefix0 > prefix1)
		{
			return -1;
		}
		else if(prefix0 < prefix1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
}
