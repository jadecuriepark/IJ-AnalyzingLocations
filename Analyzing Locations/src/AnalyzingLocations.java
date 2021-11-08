// This program will analyze locations input by the user. (Jade Park - 7/29/2021)

import java.util.Scanner;

public class AnalyzingLocations {
   
   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to Starr! This program will identify 4 possible office locations and determine their viability.");
      

      // creating an array that holds the office locations input by the user
      StringBuilder[] officeLocation = new StringBuilder[4];
      
      System.out.println("\n");
      
      // lets user input 4 times
      for (int i = 0; i < 4; i++) {
         System.out.print("Please enter a potential office location: ");
         officeLocation[i] = new StringBuilder(input.next());
         
         // if the input length exceeds 15 characters, the user has an option to input again
         if (officeLocation[i].length() > 15) {
            System.out.println("INVALID INPUT! Please ensure your input's length is less or equal to 15 characters.");
            i -= 1;
         } 

      }


       
      
      // TEST CODE BELOW: only for the programmer's use, prints the user's location inputs
      /*
      for (StringBuilder i: officeLocation) {
         System.out.println(i);
      } */
      


      // creating an array holding each location's distance
      int[] locationDistances = new int [4];
      System.out.println("\n");
      
      for (int i = 0; i < 4; i++) {
         
         System.out.print("Please enter the distance in miles from " + officeLocation[i] + " to Starr headquarters (Chicago, IL): ");
         locationDistances[i] = input.nextInt(); 
         
         // lets the user know if they input something invalid
         if (locationDistances[i] > 800 || locationDistances[i] < 100) {
            System.out.println("Please re-enter an acceptable distance that's <800 and >100 miles.");
            i -= 1;
         }
         
      }
      
      // confirmation, prints out the locations the user input
      System.out.println("\nThe program sees you've input the following locations: ");
      for (int i = 0; i < 4; i++) {
         System.out.println(officeLocation[i]);
      }
      
      System.out.println("Thank you for your inputs!");
      
      
   }
   
}