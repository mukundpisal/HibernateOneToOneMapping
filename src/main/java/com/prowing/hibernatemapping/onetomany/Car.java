package com.prowing.hibernatemapping.onetomany;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int car_no;
	String car_name;
	String make;	
	
	@OneToMany(mappedBy = "car")
	Set<CarInfo> carinfo;


	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Car(int car_no, String car_name, String make) {
		super();
		this.car_no = car_no;
		this.car_name = car_name;
		this.make = make;
	}






	public int getCar_no() {
		return car_no;
	}


	public void setCar_no(int car_no) {
		this.car_no = car_no;
	}


	public String getCar_name() {
		return car_name;
	}


	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}

	public Set getCarinfo() {
		return carinfo;
	}


	public void setCarinfo(Set carinfo) {
		this.carinfo = carinfo;
	}


	@Override
	public String toString() {
		return "Car [car_no=" + car_no + ", car_name=" + car_name + ", make=" + make + ", carinfo=" + carinfo + "]";
	}
	
	
	

}
