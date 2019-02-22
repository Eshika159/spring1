package com;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import dao.AddressInterface;

@Component
public class Employee {
@Value("Aviral")
public String name;
@Resource
@Qualifier("WA")
private AddressInterface address;
//private Map<Integer,String> phone;

//constructor injection
/*public Employee(String name, Address address) {
	super();
	this.name = name;
	this.address = address;
}*/

/*public Map<Integer,String> getPhone() {
	return phone;
}
public void setPhone(Map<Integer,String> phone) {
	this.phone = phone;
}*/
//cons injection
/*public Employee(Address address) {
	super();
	
	this.address = address;
}*/
/*public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}*/
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
//public Employee(){System.out.println("Obj created");}
	
	public void sayHello(){ 
		System.out.println("Name="+name);
	address.printAdd();
		//System.out.println("Country="+address.getCountry());
	//	System.out.println("Phone="+phone);
	}
	
	
}
