package alaTest.test.sortable;

import java.util.ArrayList;
import java.util.List;

import alaTest.test.domain.Prefix;

public abstract class Sort {

	public List<Prefix> prefixes = new ArrayList<Prefix>();
	
	public abstract void run();
}
