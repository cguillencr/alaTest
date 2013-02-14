package alaTest.test.domain;

import java.math.BigDecimal;

public class Prefix {
	private String country;
	private String area;
	private BigDecimal price;
	private Operator operator;
		
	public Prefix(String country, String area, BigDecimal price) 
	{
		this.country = country;
		this.area = area;
		this.price = price;
	}
	
	public Prefix(String country, BigDecimal price) 
	{
		this.country = country;
		this.area = "";
		this.price = price;
	}
	
	public Prefix() {
		this.country = "";
		this.area = "";
		this.price = new BigDecimal(0);
		this.operator =new Operator("");
	}

	public BigDecimal getPrice() 
	{
		return price;
	}
	public void setPrice(BigDecimal price) 
	{
		this.price = price;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String toString() {
		String text = " Country: "+country+", Area: "+area+", Price:"+price.floatValue();
		
		if(operator != null)
		{
			text = operator.toString() + text;
		}
		return text;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	
	public boolean equals(Object object) {
		if(object instanceof Prefix)
		{
			Prefix prefix = (Prefix)object;
			boolean isSamePrice = price.compareTo(prefix.getPrice()) == 0;
			boolean isSameArea =  area.equals(prefix.getArea());
			boolean isSameCountry = country.equals(prefix.getCountry());
			
			if( isSamePrice && isSameArea && isSameCountry )
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}

}
