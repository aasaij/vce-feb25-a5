package day2;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

import java.io.Console;

public class Main
{
	public static void main(String[] args) {
		int x, y, z;
		String str;
		Console con = System.console();
		System.out.println("Welcome to exception handling");
		while(true){
 		try{
 		x = Integer.parseInt(con.readLine());
 		y = Integer.parseInt(con.readLine());
 		
 		    z = x /y;
 		    str = x + " / " + y + " = " + z;
 		    System.out.println(str);
 		    break;
 		}catch(ArithmeticException ae){
 		  //  ae.printStackTrace();
 		  System.out.println("Divisor should be non-zero!");
 		}
 		catch(NumberFormatException ex){
 		  //  ex.printStackTrace();
 		  System.out.println("The values should be digits!");
 		}
 		catch(Exception ex){
 		    System.out.println("Unknown error!");
 		}
		}
		System.out.println("Thank you for being very interactive int the class");
		System.out.println("End of Exception!");
	}
}