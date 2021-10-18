package lesson13;

import org.junit.jupiter.api.Test;

public class CarServiceTest {

	/*@Test
	public void shouldDemonstrateLogging() {
		CarService carService = new CarService();
		carService.process("BMW");
	*/
	
	@Test
	public void shouldDemonstrateInterfaces() {
		CarService carService = new CarService();
		carService.drive();
	
	}
}
