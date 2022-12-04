package com.prowing.hibernateOneToOne.OneToOneMapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	int id;
	
	String name;
	String mail_id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "studentDetails")
	StudentDetails studentDetails;
	public Student( String name, String mail_id) {
		super();
		this.name = name;
		this.mail_id = mail_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	public StudentDetails getStudentDetails() {
		return studentDetails;
	}
	public void setStudentDetails(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
	}
	
	
	
	
	

}
