package day2;

public class SwitchStatementDemo2 {

	public static void main(String[] args) throws java.io.IOException {
		char ch = (char)System.in.read();
		switch(ch) {
		case 'a','e','i','o','u' -> System.out.println("Vowel");
		default -> System.out.println("Not vowel");
		}
	}

}
