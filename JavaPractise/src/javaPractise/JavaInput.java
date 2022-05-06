package javaPractise;

import java.util.Scanner;

public class JavaInput {

	public static void main(String[] args) {
		
		// Use scanner to accept input
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		
		scanner.nextLine();  // Use this to clear the '\n' after nextInt()
		
		System.out.println("Which city do you live in? ");
		String place = scanner.nextLine();
		
		System.out.println("Age: "+age+"; City: "+place);

	}
	
}
