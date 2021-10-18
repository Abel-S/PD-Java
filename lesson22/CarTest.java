package lesson22; //consider book: Effective Java (Joshua Bloch)

import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {

	@Test
	public void primitivesShouldBeEqual() {
		int i = 4;
		int j = 4;
		assertTrue (i==j);
	}
	
	@Test
	public void stringShouldBeEqual () {
		String hello1 = "Hello"; //var is stored in mem-area called stack, while object is stored in mem-area called heap
		String hello2 = "Hello";
		String hello3 = "H";
		hello3 = hello3 + "ello";
		System.out.println (hello3);
		
		//assertTrue (hello1 == hello3); //should not use "==" on objects/strings
		assertTrue (hello1.equals(hello3));
		
	}
	
	@Test
	public void proscheShouldBeEqual () {
		Car myPorsche1 = new Car ("Marcus", "Porsche", "silver");
		Car myPorsche2 = new Car ("Marcus", "Porsche", "silver");
		assertTrue (myPorsche1.equals( myPorsche2));
		/*
		 * assertTrue (myPorsche1.equals( myPorsche2));
		 * - doesn't work b/c in string, it was overwritten.
		 * - here's it's only (using the "=="):
		 * return (this == obj);
		 */
	}
	
}
