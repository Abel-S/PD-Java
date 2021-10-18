package lesson13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//normally would need to import each cars class

public class CarService {
	/*
	private final Logger log = LoggerFactory.getLogger(CarService.class);
	
	public void process (String input) {
		//CarState carState = CarState.from(input);
		//System.out.println ("valid state:" + carState);
		//doSomething (carState);
	}*/
	
	//Lesson 16 - Interfaces
	public void drive() {
		/*Car bmw = new BMW ();
		Car porsche = new Porsche();
		Car mercedes = new Mercedes();
		*/
		Car[] cars = {new BMW (), new Porsche(), new Mercedes(), };
		
		for (Car car: cars) {
			car.drive();
		}
		
		/*bmw.drive();
		porsche.drive();
		mercedes.drive();
		*/
		
	}
}
