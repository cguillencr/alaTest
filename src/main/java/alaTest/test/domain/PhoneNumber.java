package alaTest.test.domain;

public class PhoneNumber {
	
	private String number;

	public PhoneNumber(String number) 
	{
		super();
		this.number = number;
	}

	public String getNumber() 
	{
		return number;
	}

	public void setNumber(String number) 
	{
		this.number = number;
	}
	
	public boolean isPrefix(String prefix)
	{
		return number.startsWith(prefix);
	}

}
