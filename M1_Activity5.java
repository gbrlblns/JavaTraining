package OutputName;

import java.util.Scanner;

public class OutputMain {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int y = 0;

		for(int x = 1; x <= 50; x++) {
			y += x;
		} // end of for loop
        		
		System.out.print("SUM =  " + y); //Display sum value of 1-50

		scanner.close();
	} // end of main method
 
} // end of main class
