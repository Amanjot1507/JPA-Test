package com.tutorialspoint.eclipselink.service;

public class T1 extends Thread{
	private String threadName;
   
	public T1( String name){
		threadName = name;
		System.out.println("Creating " +  threadName );
	}
   
	public void run() {
		System.out.println("Running " +  threadName );
		try {
			//for(int i=0;i<5;i++){
				UpdateEmployee.updateEmployee(1201, threadName);
			//}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Thread " +  threadName + " exiting.");
	}

}
