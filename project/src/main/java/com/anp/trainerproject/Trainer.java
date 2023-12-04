package com.anp.trainerproject;


	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;

	@Entity
	public class Trainer {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int trainerId;
		private String firstName;
		private String lastName;
		private double salary;
		private String emailAddress;
		private String gender;
		
		
		public int getId() {
			return trainerId;
		}
		public void setId(int id) {
			this.trainerId = id;
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
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getEmail() {
			return emailAddress;
		}
		public void setEmail(String email) {
			this.emailAddress = email;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		@Override
		public String toString() {
			return "Trainer [id=" + trainerId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
					+ ", E-mail=" + emailAddress + ", gender=" + gender + "]";
		}
		 
		public Trainer(int trainerId, String firstName, String lastName, double salary, String emailAddress,
				String gender) {
			super();
			this.trainerId = trainerId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.salary = salary;
			this.emailAddress = emailAddress;
			this.gender = gender;
		}
		public Trainer() {
			super();
		}
	}	
	
	