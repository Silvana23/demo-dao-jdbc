package application;

import java.util.Date;

import model.entities.Department;
import model.entities.seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		seller Seller = new seller(21, "Bob" , "bog@gmail.com" , new Date() , 3000.0 ,obj);
		
		System.out.println(Seller);
	}

}
