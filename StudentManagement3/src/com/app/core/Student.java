package com.app.core;

import java.time.LocalDate;
import static java.time.LocalDate.*;
import static java.time.temporal.ChronoUnit.*;

import java.io.Serializable;

public class Student implements Serializable {
	
	private int RollNo ;
	private String Name;
	private LocalDate dob;
	private subject CurrentSubject;
	private double gpa;
	private address addr;
	
	public Student(int rollNo, String name, LocalDate dob, subject currentSubject, double gpa) {
		super();
		RollNo = rollNo;
		Name = name;
		this.dob = dob;
		CurrentSubject = currentSubject;
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", Name=" + Name + ", dob=" + dob + ", CurrentSubject=" + CurrentSubject
				+ ", gpa=" + gpa + ", addr=" + addr + "]";
	}

	public void assignAddress(address a)
	{
		this.addr = a;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public subject getCurrentSubject() {
		return CurrentSubject;
	}

	public void setCurrentSubject(subject currentSubject) {
		CurrentSubject = currentSubject;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public address getAddr() {
		return addr;
	}

	public void setAddr(address addr) {
		this.addr = addr;
	}
	
	public long computeAge()
	{
		return YEARS.between(dob, now());
	}
}
