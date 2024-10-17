package com.bptn.course._personsuperclass;


		
		public class Person {
		    private String name;

		    public Person(String name) {
		        this.name = name;
		    }

		    @Override
		    public String toString() {
		        return name;
		    }

		    public static void main(String[] args) {
		        Person p = new Person("Sila");
		        Student s = new Student("Tully", 1001);
		        APStudent aps = new APStudent("Tully", 1001, 90);

		        System.out.println(p); // Calls Person toString method
		        System.out.println(s); // Calls Student toString method
		        System.out.println(aps); // Calls APStudent toString method
		    }
		

	}


