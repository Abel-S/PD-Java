package lesson13;

public interface Car {
	
	//public static final int MAX_SPEED = 320; this should be hidden in the class/enum, not here!
	void drive(); 
}

/*
 * advantages:
 * - allows decoupling code (i.e. not tied to specific car); help team cooperation
 * - increase flexibility (@runtime, can determine what kind of variable to use)
 * 		e.g. Car car;
 * 			if (true) {
 * 				car = new Porsche();
 * 			} else {
 * 				car = new BMW();
 *			}
 *			carService.drive(car)
 */