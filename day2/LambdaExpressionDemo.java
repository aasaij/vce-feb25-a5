package day2;

@FunctionalInterface
interface Addition{
	int sum(int x, int y);
}
interface Greeting {
	void greet(String user);
}

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		//lambda expression with two arguments
//		Addition calc = (a,b)->a+b;
		Addition calc = (a,b)->{return a+b;};
		System.out.println(calc.sum(10,20));
		Greeting mess = userName -> System.out.println("Good afernoon "+userName);
		mess.greet("Kamal");		
	}
}

//Syntax for lambda expression
//() -> <statement> // lambda expression without argument
//<argument> -> <statement> // lambda expression with one parameter
//(<arg1>,<arg2>,...,<argN>) -> <statement>

//(<arg1>,<arg2>,...,<argN>) -> {
//		<statements>
//	}

