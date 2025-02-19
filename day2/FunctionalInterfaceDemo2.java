package day2;

@FunctionalInterface
interface Circle{
	double findArea();
}

public class FunctionalInterfaceDemo2 {

	public static void main(String[] args) {
		Circle obj = new Circle() {
			public double findArea() {
				return Math.PI * 10;
			}
		};
		System.out.println(obj.findArea());
	}

}
