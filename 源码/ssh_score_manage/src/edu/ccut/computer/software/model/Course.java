package edu.ccut.computer.software.model;


/**
 * @author duwenbo
 *
 */
public class Course implements java.io.Serializable {

	private String courseId;
	private String courseName;
	private String courseDate;
	private String student;
	private int credit;

	public Course() {
	}
	
	
	public Course(String courseId, String courseName, String courseDate, String student, int credit) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDate = courseDate;
		this.student = student;
		this.credit = credit;
	}


	public Course(String courseName, String courseDate, String student, int credit) {
		this.courseName = courseName;
		this.courseDate = courseDate;
		this.student = student;
		this.credit = credit;
	}

	public String getCourseDate() {
		return courseDate;
	}

	public String getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public int getCredit() {
		return credit;
	}

	public String getStudent() {
		return student;
	}

	public void setCourseDate(String courseDate) {
		this.courseDate = courseDate;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public void setStudent(String student) {
		this.student = student;
	}
}