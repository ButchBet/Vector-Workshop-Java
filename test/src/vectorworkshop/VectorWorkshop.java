package vectorworkshop;

import java.util.Scanner;

public class VectorWorkshop {
    private static WezeParking parkingLot = new WezeParking();

    public static void main(String[] args) {     
        char op = 'a';
        
        Scanner cmd = new Scanner(System.in);
        
        do {
            System.out.println("");
            
            // Show possible options
            System.out.println("Please select which question do you want to test:");
            System.out.println("1: Weze Parking has asked the user to make a program to control the number of cars in their parking lot. The user has four options: enter the license plates of 10 cars that have entered the lot, register the ticket of a person who has entered the movie theater, delete the license plate of the car that the user wants to leave, and show the number of people who have entered the movie theater and the number of cars that have left.");
            System.out.println("2. Store a series of values in a vector, and then separately sum the values in the even and odd positions.");
            System.out.println("3. Given an array of n integers, write an algorithm to detectements, writing the element and the number of times it repeats.");
            System.out.println("Other. exit.");
            
            String proveOp = cmd.nextLine();
            
            if(proveOp.length() == 1) {
                op = proveOp.charAt(0);
            } else {
                op = 'e';                
            }
            
            // Validate user option
            switch(op) {
                case '1':
                       parkingLot.main();
                    break;
                case '2':
                    System.out.println("You have selected the second option.");
                    break;
                case '3':
                    System.out.println("You have selected the third option.");
                    break;
                default:
                    System.out.println("Exiting...");
            }
        } while(op == '1' || op == '2' || op == '3');
    }
    
    // This is suppose to be working as a screen cleaner. Unfortunately this method does not work with NetBeans 8.2.
    // I'm planing to solve it soon 
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    
}
