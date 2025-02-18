package oops;
class Employee{
	
}

public class Puzzle3 {
	private static void printMessage(String str) {
		System.out.println(str);
	}
//	private static void printMessage(Employee emp) {
//		System.out.println(emp);
//	}
	private static void printMessage(Object obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		printMessage(null);
	}

}
