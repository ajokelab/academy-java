package com.bptn.course._employeeclass;

public class Employee {


	    // Instance variable to store salary
	    private int salary;
	    
	    // Instance variable to store hours per day worked by employee
	    private int hoursPerDay;

	    // Constructor to set instance variables (salary and hoursPerDay) value
	    public Employee(int salary, int hoursPerDay) {
	        setSalary(salary);
	        setHoursPerDay(hoursPerDay);
	    }

	    // Set method to update salary
	    public void setSalary(int salary) {
	        if (salary < 500) {
	            this.salary = salary + 10; // Increase salary by 10 if less than 500
	        } else {
	            this.salary = salary; // Otherwise, keep it unchanged
	        }
	    }

	    // Set method to update hoursPerDay
	    public void setHoursPerDay(int hoursPerDay) {
	        this.hoursPerDay = hoursPerDay;
	        if (hoursPerDay > 6) {
	            this.salary += 5; // Increase salary by 5 if hours per day is greater than 6
	        }
	    }

	    // Get method to return salary
	    public int getSalary() {
	        return this.salary;
	    }

	}


