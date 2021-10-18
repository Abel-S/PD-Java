package lesson13;

/*
import com.sun.javaws.exceptions.InvalidArgumentException;
import sun.plugin.dom.exception.InvalidStateException;
*/
import java.io.IOException;


public class CarSelector {

	public static void main (String[] arguments) {

		CarService carService = new CarService();
		for (String argument:arguments) {
			if(isValid(argument)) {
				carService.process(argument);			
			} else {
				System.err.println("ignoring invalid argument: "+ argument);
			}			
		}
	}
	private static boolean isValid(String argument) {
		try{
			//CarState.isValid(); //would be more ideal
			CarState.valueOf(argument);
			System.out.println("valid arugment: " + argument);
		} catch (RuntimeException e) {
			//e.printStackTrace();
			IOException e2 = new IOException ("My IOException"); //a hack to wrap the IO exception in another exception; to prevent throwing exceptions all over the place
			throw new RuntimeException (e2);
			//System.out.println ("Hello again ;-)" + e.getMessage());
		} finally { //will always call whether try or caught
			// closeResource(myResource); //need to code yourself
			// IOUtils.closeResource?
			System.out.println("in finally block");
		}
		
		return true;

		
	
	}
}