package com.flexon.studentRegistration.studentRegistration.SpringBootArtifacts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Students {
		private String firstName;
	   	private String lastName;
	   	private String degree;
	   	private int contactNumber;
	   	private String emailAddress;
	   
	   @Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
	   public int studentID;
	   
//	   public Students(String firstName, String lastName, String degree, int contactNumber, String emailAddress)
//	   {
//	       this.firstName = firstName;
//	       this.lastName = lastName;
//	       this.degree = degree;
//	       this.contactNumber = contactNumber;
//	       this.emailAddress = emailAddress;
//	   }
	   public Students() {}

		 public String getFirstName() {
				return firstName;
			}
			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}
			public String getLastName() {
				return lastName;
			}
			public void setLastName(String lastName) {
				this.lastName = lastName;
			}
			public String getDegree() {
				return degree;
			}
			public void setDegree(String degree) {
				this.degree = degree;
			}
			public int getStudentID() {
				return studentID;
			}
			public void setStudentID(int studentID) {
				this.studentID = studentID;
			}
			public int getContactNumber() {
				return contactNumber;
			}
			public void setContactNumber(int contactNumber) {
				this.contactNumber = contactNumber;
			}
			public String getEmailAddress() {
				return emailAddress;
			}
			public void setEmailAddress(String emailAddress) {
				this.emailAddress = emailAddress;
			}  

}
