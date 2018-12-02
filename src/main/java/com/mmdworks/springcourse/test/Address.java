package com.mmdworks.springcourse.test;

public class Address {
	
	
	public Address(String street, String area) {
		super();
		this.street = street;
		this.area = area;
	}
	private String street;
	private String area;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [street=");
		builder.append(street);
		builder.append(", area=");
		builder.append(area);
		builder.append("]");
		return builder.toString();
	}
	
	

}
