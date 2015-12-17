package com.tutorialspoint.eclipselink.service;

public class Main {
	public static void main(String args[]){
		//CreateEmployee.createEmployee();
		(new T1("Transaction 1")).start();
		(new T2("Transaction 2")).start();
	}

}
