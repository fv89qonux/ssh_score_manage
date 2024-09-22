package edu.ccut.computer.software.model;

/*
 * duwenbo
 * 
 * 
 * */
import java.util.Date;

public class Student implements java.io.Serializable {
	public String studentId;
	public Major major;
	public String name;
	public Byte sex;
	public String birthDate;
	public Integer totalCredits;
	public Integer mid;
	public String other;
	public byte[] photo;

	public Student() {
	}

	

	public Student(String studentId, String name, Byte sex, String birthDate, Integer totalCredits, Integer mid,
			String other, byte[] photo) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.sex = sex;
		this.birthDate = birthDate;
		this.totalCredits = totalCredits;
		this.mid = mid;
		this.other = other;
		this.photo = photo;
	}



	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public Major getMajor() {
		return major;
	}

	public String getName() {
		return name;
	}

	public String getOther() {
		return other;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public Byte getSex() {
		return sex;
	}

	public String getStudentId() {
		return studentId;
	}

	public Integer getTotalCredits() {
		return totalCredits;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public void setSex(Byte sex) {
		this.sex = sex;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public void setTotalCredits(Integer totalCredits) {
		this.totalCredits = totalCredits;
	}

}