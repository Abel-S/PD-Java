package lesson17;

public class Lion extends Animal implements Loggable, Printable{
// extends first, b/c can extend only one class, whereas implements can be multiple
	
	public void eat() {
		System.out.println("Lion is eating...");
	}
	
	public void print() {
		System.out.println ("printing...");
	}
	
	public String message() {
		return "something";
	}
}
