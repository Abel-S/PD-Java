package lesson2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import lesson10.LoggingLevel;

//import org.jnit.Test;

public class PersonTest {
	
	private static final String[] MY_STATE_VALUES = {"PENDING", "PROCESSING", "PROCESSED"}; //problem is that values are not final
	
	private static final int SOPMETHING = 40;
	private static final int PROCESSING = 41;
	private static final int PROCESSED = 42;
	
	private static final String PENDING = "42;"
	
	public String[] states () {
		return Arrays.copyOf(MY_STATE_VALUES, MY_STATE_VALUES.length);
	}
	
	@Test
	public void shouldReturnHelloWorld() {
		Person marcus = new Person();
		assertEquals ("Hello World", marcus.helloWorld());
	}
	
	@Test
	public void shouldReturnHelloMarcus() {
		Person person = new Person();
		assertEquals("Hello Marcus", person.hello("Marcus"));
		
	}
	
	@Test //When running, only run this test, else you will run all of them and the number of persons will be off
	public void shouldReturnNumberOfPersons() {
		Person person1;
		int i = 0;
		while (i<4) {
			person1 = new Person();
			i++;
		}	
		assertEquals (4, Person.numberOfPersons());
	}
	
	@Test
	public void demonstrateArrays () {
		Person[] persons = new Person [4];
		for (int i = 0; i < 4; i++) {
			persons [i] = new Person();
		}
		
		for (Person person : persons) {
			person.helloWorld();
		}
		
		Person myPerson = new Person();
		Person myPerson2 = null;
		final Person[] persons2 = {persons[0], null, myPerson, myPerson2, persons[2],};
		
		LoggingLevel state = LoggingLevel.PROCESSING;
		
		int myState = PENDING;
		myState = 300;
		
		String myString = "myString"
		
		switch(myString) {
			case PENDING:
			/*
			 * falls through
			 */
			case PROCESSING:
				callAMethod2();
				break;
			case PROCESSED:
				callAMethod3();
				break;
			default:
				callDefaultMethod();
				/*
				 * throw error (in case the enum is extended)
				 */
		}
		
		//state = "blah";
		for (LoggingLevel state: LoggingLevel.values()) {		
			if (state == LoggingLevel.PENDING) {
				callAMethod();
			}
			if (state == LoggingLevel.PROCESSING) {
				callAMethod();	
			}
			if (state == LoggingLevel.PROCESSED) {
				callAMethod();	
			}
		}
		
	}
	
	@Test
	public void demonstrateBoolean() {
		int i = 4;
		int j = 3;
	
		if (i > j) {
			
		} else if (j > i){
			
		} else if (i ==j ){
			
		} else {
			j--;
		}
	}
	
}
