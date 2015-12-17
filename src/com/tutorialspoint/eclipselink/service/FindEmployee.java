package com.tutorialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;
import com.tutorialspoint.eclipselink.entity.Employee;

public class FindEmployee {
   public static void findEmployee(  ) {
   
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
      EntityManager entitymanager = emfactory.createEntityManager();
      entitymanager.getTransaction().begin();
      Employee employee = entitymanager.find( Employee.class, 1201 );
      entitymanager.lock(employee, LockModeType.OPTIMISTIC);

      /*System.out.println("employee ID = " + employee.getEid( ));
      System.out.println("employee NAME = " + employee.getEname( ));
      System.out.println("employee SALARY = " + employee.getSalary( ));
      System.out.println("employee DESIGNATION = " + employee.getDeg( ));
      */
      entitymanager.getTransaction().commit();
   }
}
