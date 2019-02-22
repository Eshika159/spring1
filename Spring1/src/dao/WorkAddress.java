package dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository("WA")
public class WorkAddress implements AddressInterface {
private String comapny="GOogle";
	public void printAdd() {
		System.out.println("WorkAdress Comapnay= "+comapny);
		// TODO Auto-generated method stub
		
	}

}
