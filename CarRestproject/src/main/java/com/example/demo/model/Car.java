package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	int carid;
	String carname;
	String carmodel;
	
	@Override
	public String toString() {
		return "Car [carid=" + carid + ", carname=" + carname + ", carmodel=" + carmodel + "]";
	}
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}

}
