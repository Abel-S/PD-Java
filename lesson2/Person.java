package lesson2;

/**
 * @author Abel
 *
 */

import lesson3.Name;

public class Person {

	private Name personName;
	private static int personCounter;
	
	public Person(Name personName) {
		this.personName = personName;	
	}
	
	public Person () {
		/*
		 * empty on purpose - default constructor
		 */
		personCounter++;
	}
	
	public String helloWorld() {
		// TODO Auto-generated method stub
		return "Hello World";
	}

	public String hello(String name) {
		// TODO Auto-generated method stub
		return "Hello " + name;
	}


	public static int numberOfPersons() {
		// TODO Auto-generated method stub
		return personCounter;
	}
	
}
