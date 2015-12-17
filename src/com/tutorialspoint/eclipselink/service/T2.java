package com.tutorialspoint.eclipselink.service;

public class T2 extends Thread{
	private String threadName;
	   
	public T2 (String name){
		threadName = name;
		System.out.println("Creating " +  threadName );
	}
   
	public void run() {
		System.out.println("Running " +  threadName );
		try {
			//for(int i=0;i<5;i++){
				FindEmployee.findEmployee();
			//}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Thread " +  threadName + " exiting.");
	}


}
