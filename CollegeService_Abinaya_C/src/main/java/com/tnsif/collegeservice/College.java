package com.tnsif.collegeservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class College {
	@Id
	@Column(name="cid")
	private int cid;
	@Column(name="cname")
	private String cname;
	@Column(name="address")
	private String address;
	@Column(name="course")
	private String course;
	@Column(name="professordetails")
	private String professordetails;
	@Column(name="studentdetails")
	private String studentdetails ;
	@Column(name="universityrank")
    private int universityrank;
	@Column(name="fees")
    private int fees;
	public College(int cid, String cname, String address, String course, String professordetails, String studentdetails,
			int universityrank, int fees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.address = address;
		this.course = course;
		this.professordetails = professordetails;
		this.studentdetails = studentdetails;
		this.universityrank = universityrank;
		this.fees = fees;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
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
	public String getProfessordetails() {
		return professordetails;
	}
	public void setProfessordetails(String professordetails) {
		this.professordetails = professordetails;
	}
	public String getStudentdetails() {
		return studentdetails;
	}
	public void setStudentdetails(String studentdetails) {
		this.studentdetails = studentdetails;
	}
	public int getUniversityrank() {
		return universityrank;
	}
	public void setUniversityrank(int universityrank) {
		this.universityrank = universityrank;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + ", address=" + address + ", course=" + course
				+ ", professordetails=" + professordetails + ", studentdetails=" + studentdetails + ", universityrank="
				+ universityrank + ", fees=" + fees + "]";
	}
	
}
