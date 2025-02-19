package day2;

import java.io.Console;

public class ExceptionDemo2 {

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
    		}
 		
    		catch(ArithmeticException | NumberFormatException ae){
    		  //  ae.printStackTrace();
    		  if (ae instanceof ArithmeticException)
    		    System.out.println("Divisor should be non-zero!");
    		  else
    		    System.out.println("The values should be digits");
    		}
    		 catch(Exception ex){
    		    System.out.println("Unknown error!");
    		}   

		}
		System.out.println("Thank you for being very interactive int the class");
		System.out.println("End of Exception!");
	}

}
