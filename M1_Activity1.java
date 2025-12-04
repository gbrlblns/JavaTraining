package OutputName;

import java.util.Scanner;

public class OutputMain {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		
		System.out.print("What is your name? ");
		
		name = scanner.nextLine();
		System.out.println("Hello " + name + "!");
		
		
		
		scanner.close();
	}
 
}
