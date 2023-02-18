package com.prowing.hibernatemapping.onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Cartest {
	
	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tnx = session.beginTransaction();
		
		
		
		Car car1 = new Car(8484, "Thar", "Mahindra");
		Car car2 = new Car(9999, "Safari", "Tata");		
		
		CarInfo carInfo1 = new CarInfo(1234,"petrol","suv",car1);
	
		CarInfo carInfo2 = new CarInfo(1232,"disel","suv", car2);

		CarInfo carInfo3 = new CarInfo(1235,"disel","suv", car1);
		CarInfo carInfo4 = new CarInfo(1233,"petrol","suv", car2);
		CarInfo carInfo5 = new CarInfo(1224,"disel","suv", car2);

		Set< CarInfo> carset = new HashSet();
		carset.add(carInfo1);
		carset.add(carInfo2);

		
		session.save(car1);
		session.save(car2);
		session.save(carInfo1);
		session.save(carInfo2);
		session.save(carInfo3);
		session.save(carInfo4);
		session.save(carInfo5);

		tnx.commit();
		System.out.println(carset);

		
		System.out.println(" Data stored succesfully");
	}

}
