package com.prowing.hibernatemapping.OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentApi {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student student1 = new Student("Ram", "abc@gmail.com");
		Student student2= new Student("Sham", "abc@gmail.com");
		Student student3 = new Student("Pranav", "abc@gmail.com");
		Student student4 =new Student("Mukund", "abc@gmail.com");
		Student student5 = new Student("Vaidahee", "abc@gmail.com");
		Student student6 = new Student("Snehal", "abc@gmail.com");


		StudentDetails sd1= new StudentDetails("Abc_collage", 20);
		StudentDetails sd2= new StudentDetails("Coe_collage", 10);
		StudentDetails sd3= new StudentDetails("Scoe_collage", 15);
		StudentDetails sd4= new StudentDetails("Dyp_collage", 8);
		StudentDetails sd5= new StudentDetails("Xyz_collage", 12);
		StudentDetails sd6= new StudentDetails("Abcd_collage", 12);

		student1.setStudentDetails(sd1);
		student2.setStudentDetails(sd2);
		student3.setStudentDetails(sd3);
		student4.setStudentDetails(sd4);
		student5.setStudentDetails(sd5);
		student6.setStudentDetails(sd6);

		session.save(student1);
		session.save(student2);
		session.save(student3);
		session.save(student4);
		session.save(student5);
		session.save(student6);

		
		tx.commit();
		
		
	}

}
