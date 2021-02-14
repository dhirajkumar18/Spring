package com.student.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String studentName;
	private String course;
	private String sex;
	private String address;
	@OneToOne
	@JoinColumn(name="state_id")
	private State state;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Long id, String studentName, String course, String sex, String address) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.course = course;
		this.sex = sex;
		this.address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCouse() {
		return course;
	}
	public void setCouse(String couse) {
		this.course = couse;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", course=" + course + ", sex=" + sex
				+ ", address=" + address + ", state=" + state + "]";
	}
	
	
	

}
