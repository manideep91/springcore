package com.mmdworks.springcourse.test;

import java.util.List;

public class Employee {
	
	private String eName;
	private String eSal;
	private List<Address> addressList;
	private List<String> friends;
	
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteSal() {
		return eSal;
	}
	public void seteSal(String eSal) {
		this.eSal = eSal;
	}
	
	public List<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [eName=");
		builder.append(eName);
		builder.append(", eSal=");
		builder.append(eSal);
		builder.append(", addressList=");
		builder.append(addressList);
		builder.append(", friends=");
		builder.append(friends);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
