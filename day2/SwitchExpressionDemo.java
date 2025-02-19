package day2;

import java.util.Scanner;

public class SwitchExpressionDemo {
	private static String calculate(int x, int y, char sign) {
		return switch(sign) {
		case '+' -> x +y +"";
		case '-' -> x - y +"";
		case '*', 'x', 'X' -> x * y +"";
		case '/' -> x / (float)y +"";
		default -> "Invalid operation";
		};
	}
	public static void main(String[] args) {
			Scanner in  = new Scanner(System.in);
			int x , y;
			char opr;
			String z;
			x = in.nextInt();  
			opr = in.next().charAt(0);
			y = in.nextInt();
			z = calculate(x,y,opr);
			if (!z.equalsIgnoreCase("Invalid Operation"))
					System.out.println(x + " " + opr + " " + y + " = " + z);
			else
				System.out.println(z);
	}

}
