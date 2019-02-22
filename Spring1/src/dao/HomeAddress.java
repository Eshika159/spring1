package dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository
public class HomeAddress implements AddressInterface {
	private String street="GovindNagar";
	public void printAdd() {
		System.out.println("Home Address="+street);
		
	}

}
