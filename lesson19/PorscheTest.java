package lesson19;

import org.junit.Test;
import static org.junit.Assert.*;

public class PorscheTest {
	@Test
	public void shouldCloneStringArray() {
		String[] array = {"one", "two", "three", };
		String[] copiedArray = array.clone();
		assertSame(array, array); // would be false if both point to same object
		assertNotSame(array, copiedArray); // would be false if both point to same object
		
		for (String str : copiedArray)
			System.out.println(str);
	}
	
	@Test
	public void shouldClonePorsche() {
		Porsche porsche = new Porsche("Marcus");
		Porsche petersPorsche = porsche.clone();
		//petersPorsche.drive();
		petersPorsche.sellTo("Peter");
		assertNotSame(porsche, petersPorsche);
		assertEquals("Porsche of Peter", petersPorsche.asString());
		assertEquals("Porsche of Marcus", porsche.asString());
		
	}
	
}
