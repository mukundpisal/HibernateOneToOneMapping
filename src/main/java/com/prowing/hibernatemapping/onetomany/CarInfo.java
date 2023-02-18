package com.prowing.hibernatemapping.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class CarInfo {
	@Id
	int Engine_no;
	String Engine_type;
	String cartype;	

	@ManyToOne
	@JoinColumn(name = "car_no",nullable =false )
	Car car;

	public CarInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	public CarInfo(int engine_no, String engine_type, String cartype, Car car) {
		super();
		Engine_no = engine_no;
		Engine_type = engine_type;
		this.cartype = cartype;
		this.car = car;
	}




	public int getEngine_no() {
		return Engine_no;
	}

	public void setEngine_no(int engine_no) {
		Engine_no = engine_no;
	}

	public String getEngine_type() {
		return Engine_type;
	}

	public void setEngine_type(String engine_type) {
		Engine_type = engine_type;
	}

	public String getCartype() {
		return cartype;
	}

	public void setCartype(String cartype) {
		this.cartype = cartype;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "CarInfo [Engine_no=" + Engine_no + ", Engine_type=" + Engine_type + ", cartype=" + cartype + ", car="
				+ car + "]";
	}
	
	
	
	
}
