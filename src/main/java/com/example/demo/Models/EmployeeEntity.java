package com.example.demo.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employeesinfo")
public class EmployeeEntity {
	
	
		@Id
		@Column(name="id")
		private int id;
		
		@Column(name = "first_name")
		private String firstName;

		@Column(name = "last_name")
		private String lastName;
		
		@Column(name = "email_id")
		private String emailId;
		
		@Column(name = "salary")
		private float salary;
		
		public EmployeeEntity() {
			
		}
		
		public EmployeeEntity(int id,String firstName, String lastName, String emailId, float salary) {
			super();
			this.id= id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailId = emailId;
			this.salary=salary;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
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
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary=salary;
		}
	}

