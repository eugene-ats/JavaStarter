package javaPractise;

public class JavaVariables {

	public static void main(String[] args) {
		/* PRIMITIVE VARIABLES*/
		// - INTEGER
		int num1 = 12345; //up to 2 billion
		
		// - DOUBLE
		double pi = 3.1415926535897; //can store much more digits than integer
				
		// - CHARACTER
		char symbol = '@'; //single character in single quotes
		
		// - BOOLEAN
		boolean isTrue = true;
		boolean isFalse = false;
		
		// STRING (A REFERENCE)
		String whatever = "MONEYYYYYY"; //'String' must be capitalised
		
		System.out.println("int: "+num1);
		System.out.println("double: "+pi);
		System.out.println("char: '"+symbol+"' (in single quotes)");
		System.out.println("boolean: "+isTrue+" or "+isFalse);
		System.out.println("String: \""+whatever+"\"");
		
	}
	
}
