package OutputName;

import java.util.Scanner;

public class OutputMain {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		

        System.out.print("Enter your age: ");
        int age1 = scanner.nextInt();



        if (age1 < 18) {
                 System.out.println("Minor");
             } else if (age1 < 59) {
                 System.out.println("Adult");
             } else if (age1 >= 60) {
                 System.out.println("Senior");
             }

        
		scanner.close();
	}
 
}
