package com.prowing.hibernatemapping.OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String collage_name;
	int no_of_prob_solved;
	public StudentDetails(String collage_name, int no_of_prob_solved) {
		super();
		this.collage_name = collage_name;
		this.no_of_prob_solved = no_of_prob_solved;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollage_name() {
		return collage_name;
	}
	public void setCollage_name(String collage_name) {
		this.collage_name = collage_name;
	}
	public int getNo_of_prob_solved() {
		return no_of_prob_solved;
	}
	public void setNo_of_prob_solved(int no_of_prob_solved) {
		this.no_of_prob_solved = no_of_prob_solved;
	}
	
	
	
	

}
