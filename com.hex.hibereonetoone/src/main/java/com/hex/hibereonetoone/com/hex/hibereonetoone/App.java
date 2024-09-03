package com.hex.hibereonetoone.com.hex.hibereonetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;





/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory fac=new Configuration().configure("hiber.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Certificate.class).buildSessionFactory();
    	
		 Session ses=fac.openSession();
			
		 Transaction tx=ses.beginTransaction();
		 Student s1=new Student();
		 Certificate c1=new Certificate();
		 s1.setRoll(3);
		 s1.setName("Nivetha");
		 c1.setCourseName("DSA");
		 c1.setId(3);
		 s1.setCes(c1);
		 ses.save(s1);
	    	tx.commit();
		
        System.out.println( "Hello World!" );
    }
}