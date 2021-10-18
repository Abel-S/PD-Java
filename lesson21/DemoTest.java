package lesson21;

import org.junit.Test;
import static org.junit.Assert.*;

public class DemoTest {

	private byte myByte;
	private short myShort;
	private int myInt;
	private long myLong;
	private float myFloat;
	private double myDouble;
	private Object myObject;
	
	private boolean myBoolean;
	private char myChar;
	
	@Test
	public void shouldDemonstrateStaticImport() {
		
	}
	
	@Test
	public void shouldDemonstrateDataTypeDefaultValues() {
		System.out.println("byte default value: " + myByte);
		System.out.println("short default value: " + myShort);
		System.out.println("int default value: " + myInt);
		System.out.println("long default value: " + myLong);
		System.out.println("float default value: " + myFloat);
		System.out.println("double default value: " + myDouble);
		System.out.println("Object default value: " + myObject);
		System.out.println("boolean default value:" + myBoolean);
		System.out.println("char default value:" + myChar);
		System.out.println("char as int default value: " + (int) myChar);
		
	}
	
	@Test
	public void shouldDemonstrateNumberObjects() {
		/*float fl = 43.41f;
		System.out.println(fl);*/
		Byte b = Byte.valueOf(myByte);
		Integer i = Integer.valueOf(myInt);
		Boolean boo = Boolean.FALSE;
	}
	
	@Test
	public void shouldDemonstrateRanges () {
		System.out.println("Byte:" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
		System.out.println("Short:" + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
		System.out.println("Integer:" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
		System.out.println("Long:" + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
		System.out.println("Float:" + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
		System.out.println("Double:" + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
		System.out.println("Char:" + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
	}
	
	@Test
	public void shouldDemonstrateBase2() { //binary denoted by the "0b" 
		byte binary1 = 0B0;
		short binary2 = 0b1; //non-case-sensitive
		int binary3 = 0b0100101_0101_0101_0101_1100_0000;
		System.out.println(binary1);
		System.out.println(binary2);
		System.out.println(binary3);
		
	}
	@Test
	public void shouldDemonstrateBase8() { //base8 denoted by the "0"10 
		byte octal1 = 07;
		short octal2 = 010;
		long octal3 = 017653100___________476L;
		System.out.println(octal1);
		System.out.println(octal2);
		System.out.println(octal3);
	}
	@Test
	public void shouldDemonstrateBase16() { //base16 denoted by the "0x"
		byte octal1 = 10;
		System.out.println(octal1);
		byte hex1 = 0x0;
		short hex2 = 0xF;
		long hex3 = 0x39__e49Fa___BCD10L;
		System.out.println(hex1);
		System.out.println(hex2);
		System.out.println(hex3);
	}
}
