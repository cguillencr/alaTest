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
			
			if(phoneNumber.isPrefix(countryAndArea))
			{
				result = p;
				break;
			}
			
		}
		return result;
	}
}
