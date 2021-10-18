package lesson19;

import javax.naming.Name;

public class BMW implements Car, Cloneable {
	
	private Name ownersName;
	private Color color;
	
	public static BMW newInstance (BMW bmw) { //"static factory method" (preferred)
		return new BMW (Name.newInstance(bmw.ownersName)), Color.newInstance(bmw.color));		
	}
	
	public BMW (BMW bmw) { //copy constructor
		this.ownersName = new Name (bmw.ownersName);
		this.color = new Color(bmw.color);
	}
	
	public BMW (Name ownersName, Color color) {
		this.ownersName = ownersName;
		this.color = color;
		
	}

	public void paint (Color newColor) {
		//this.color = newColor;
		this.color.alterColor(newColor.name());
	}
	
	public void sellTo (Name newOwner) {
		//this.ownersName = newOwner
		this.ownersName.alterTo(newOwner.firstName(), newOwner.lastName());
	}
	
	public void drive() {System.out.println("BMW driving..."); }

	public String asString() {
		return "BMW of " + ownersName.name() + " has color: " + color.name();
	}
	
	public BMW clone () {
		try {
			BMW = bmw = (BMW) super.clone();
			bmw.ownersName = ownersName.clone(); //ensures a "deep" copy, i.e. all the attributes w/in
			bmw.color = color.clone();
			return bmw;
		} catch(CloneNotSupportedException e) {
			throw new AssertionError ();
		}
	}
}
