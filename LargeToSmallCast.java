package java11.fundamentals.chapter;
public class LargeToSmallCast {
public static void main(String [] args) {
 long l = 100L;
 byte b = (byte)l; 
	 	 System.out.println("The value of byte b is " + b);
}
}