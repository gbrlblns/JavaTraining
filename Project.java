package OutputName;

import java.util.Scanner;

public class OutputMain {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    String GREEN  = "\u001B[32m";
	    String RED    = "\u001B[31m";
	    String RESET  = "\u001B[0m";
	    String YELLOW = "\u001B[33m";
	    String CYAN   = "\u001B[36m";
	    
		String name = null;
		String statusGrade = null;
		char choice;
		int studentID = 0, numSubj = 0;
		double grade = 0, total = 0,average = 0;
		
		
		do {

				System.out.println(CYAN + "======================================");
				System.out.println("*    //////     //////     //////    *");
				System.out.println("*   //    //   //    //   //    //   *");
				System.out.println("*   //         //         //         *");
				System.out.println("*    //////    //  ////    //////    *");
				System.out.println("*         //   //    //         //   *");
				System.out.println("*   //    //   //    //   //    //   *");
				System.out.println("*    //////     //////     //////    *");
				System.out.println("*   STUDENT     GRADING    SYSTEM    *");
				System.out.println("======================================");
				
				System.out.println("*   A - Add Student Information      *");
				System.out.println("*   B - Compute Student Average      *");
				System.out.println("*   C - Display Student Information  *");
				System.out.println("*   D - Exit                         *" );
				System.out.println(CYAN + "======================================" + RESET);
				
				System.out.print("Enter Choice: ");
				choice = scanner.next().toUpperCase().charAt(0); ;
		
				System.out.println();
				System.out.println();
				
		
			switch(choice) {
				case 'A':
					System.out.print("Enter student name: ");
					name = scanner.next(); 
					
					System.out.print("Enter student ID: ");
					studentID = scanner.nextInt(); 
					
					System.out.print("Enter number of Subject: ");
					numSubj = scanner.nextInt();
					
					for (int i = 1; i <= numSubj; i++ ) {
						System.out.print("Enter grade for subject " + i + ": ");
						
						grade = scanner.nextDouble();
						total += grade;
						
					}// end of for loop
					
					
					
					
						System.out.println(GREEN + "===== STUDENT SAVED =====" + RESET);
						System.out.println();
						System.out.println();
						
					break;
						
						
				case 'B':
					if(name == null ) {   //Validation if user has already entered student info
						System.out.println(RED + "Please enter student info first (Option A) " + RESET);
						System.out.println();
						System.out.println();
						break;	
						
					} else {
						
						average = total/numSubj;
						System.out.println("Average: " + average);
						
						if (average <= 74) {
							
							statusGrade = "FAILED 😔";
							System.out.println(RED + "Status: " + statusGrade + RESET);
							System.out.println();
							System.out.println();
							break;
						} else {
							
							statusGrade = "PASSED 😁";
							System.out.println(GREEN + "Status: " + statusGrade + RESET);
							System.out.println();
							System.out.println();
							break;
						} //end of if else
						
						
					}//end of if else
				
					
				case 'C':
					
					if(name == null ) {   //Validation if user has already entered student info
						System.out.println(RED + "No student data yet. Please choose option A in the menu " + RESET);
						System.out.println();
						System.out.println();
						break;	
						
					} else if (statusGrade == null){ //Validation if user has already compute the average
						System.out.println(RED + "No Computation yet, please proceed to 'B - Compute Student Average " + RESET);
						System.out.println();
						System.out.println();
						break;	
						
					} else {    //display student summary
						System.out.println(YELLOW + "===== STUDENT SUMMARY =====");
						System.out.println("Student Name: " + name);
						System.out.println("Student ID: " + studentID );
						System.out.println("Average Grade: " + average );
						System.out.println("Status: " + statusGrade );
						System.out.println("===========================" + RESET);
						
						System.out.println();
						System.out.println();
						
					}// end of if else
					
					break;
					
			}// end of switch
			
			
			
			} while (choice != 'D'); //end of do while loop
			
		scanner.close();
	} // end of main method
 
} // end of main class
