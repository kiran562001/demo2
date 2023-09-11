package com.cj.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Traininfo {
	@Id
	private int trainno;
	private String trainname;
	private String desatiny;
	public int getTrainno() {
		return trainno;
	}
	public void setTrainno(int trainno) {
		this.trainno = trainno;
	}
	public String getTrainname() {
		return trainname;
	}
	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}
	public String getDesatiny() {
		return desatiny;
	}
	public void setDesatiny(String desatiny) {
		this.desatiny = desatiny;
	}
	
	
	
	

}
