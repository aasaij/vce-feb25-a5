package day2;
@FunctionalInterface
//SAM - Single Abstract Method
interface Shape{
	double findArea();
//	double findVolume();
}

class Rectangle implements Shape{
	double len, breadth;
	public Rectangle(double len, double breadth) {
		this.len = len;
		this.breadth = breadth;
	}
	@Override
	public double findArea() {
		return len * breadth;
	}
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10,20);
		System.out.println(rect.findArea());

	}

}
