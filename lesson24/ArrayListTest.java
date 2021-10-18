package lesson24;

import org.junit.Test;

//import javax.xml.ws.soap.MTOM;
import java.util.ArrayList;
import java.util.*;

import static org.junit.Assert.*;

public class ArrayListTest {

	private final int INITIAL_CAPACITY = 100;
	
	@Test
	public void shouldDemonstrateArrayList() {
		List <String> elements = new ArrayList <>(INITIAL_CAPACITY); //keep Collection if possible (most generic) to enable easier changing
		System.out.println(elements.isEmpty());
		elements.add("A");
		elements.add("B");
		elements.add("A");
		elements.add("C");
		//elements.add(0,"T");
		//elements.remove(1);
		elements.clear();
		//elements.add("E");
		//elements.add("E");
		System.out.println(elements.size());
		//System.out.println(elements.lastIndexOf("A"));
		//elements.remove ("A");
		
		System.out.println(elements);
		/*for (String str : elements) {
			System.out.println(str);
		}*/
		
	}
}
