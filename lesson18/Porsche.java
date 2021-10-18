package lesson18;

public class Porsche {

	IOReader ioReader = new IOReader();
	
	public void drive () {
		System.out.println("Porsche driving...");
	}
	
	/*public void close() {
		// clean up IO Resources;
	}*/
	@Override
	public void finalize() {
	}
	
}
