package lesson19;

public class Name implements Cloneable {
	
	private String firstName;
	private String lastName;
	
	public static Name newInstance (Name name) { return new Name (name.firstName, name.lastName); }
}
