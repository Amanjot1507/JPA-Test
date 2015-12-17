package com.tutorialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;
import com.tutorialspoint.eclipselink.entity.Employee;
import java.util.Random;
public class UpdateEmployee {
	
   public static void updateEmployee( long id, String name ) {
	  Random rnd = new Random();
	  System.out.println("Executing update " + id);
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
      
      EntityManager entitymanager = emfactory.createEntityManager( );
      entitymanager.getTransaction( ).begin( );
      Employee employee = entitymanager.find( Employee.class, (int) id );
      entitymanager.lock(employee, LockModeType.OPTIMISTIC);
      if(employee == null)
    	  System.out.println("Employee null");
      
      //before update
      System.out.println("Employee" + employee );
      int sal = rnd.nextInt(100000);
      System.out.println(name + "Setting to " + sal);
      employee.setSalary( sal );
      entitymanager.getTransaction( ).commit( );
      
      //after update
      //System.out.println( employee );
      entitymanager.close();
      emfactory.close();
   }
}