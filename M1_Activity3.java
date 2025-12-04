package OutputName;

import java.util.Scanner;

public class OutputMain {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		

        System.out.print("Enter 1st integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter 2nd integer: ");
        int num2 = scanner.nextInt();
        
        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;
   
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
		
		scanner.close();
	}
 
}
