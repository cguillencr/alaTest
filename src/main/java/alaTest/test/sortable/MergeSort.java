package alaTest.test.sortable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import alaTest.test.domain.Prefix;
import alaTest.test.utils.PrefixComparator;

public class MergeSort extends Sort{
	
	public void run() {
		Collections.sort(prefixes, new PrefixComparator());	
	}
	
	

}
