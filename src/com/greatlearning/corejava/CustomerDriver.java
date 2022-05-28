package com.greatlearning.corejava;

public class CustomerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customer customer=new Customer();
System.out.println(customer.age);
//System.out.println(customer.name); //since its private it will show error
System.out.println(customer.lastname);

	}

}
