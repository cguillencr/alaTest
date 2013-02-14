package alaTest.test.searchers;

import java.util.ArrayList;
import java.util.List;

import alaTest.test.domain.PhoneNumber;
import alaTest.test.domain.Prefix;

public abstract class Search {

	public List<Prefix> prefixes;
	public PhoneNumber phoneNumber;
	
	public abstract Prefix run();
	
}
