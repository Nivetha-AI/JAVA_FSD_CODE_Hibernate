package com.hex.hibereonetoone.com.hex.hibereonetoone;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Certificate")
public class Certificate {
	@Id
	
	int id;
    String courseName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Certificate [id=" + id + ", courseName=" + courseName + "]";
	}
    

}