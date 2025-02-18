package oops;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(101, "Rakesh", 19.0);
		s = null;
		System.gc();
		String str = "Testing";
	}
	

}
