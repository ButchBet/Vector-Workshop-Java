package vectorworkshop;

import java.util.Scanner;

public class VectorWorkshop {

    public static void main(String[] args) {
        char op = 'a';
        
        Scanner cmd = new Scanner(System.in);
        
        do {
            clearScreen();
            
            System.out.println("Please select witch questin do you want to prove:");
            System.out.println("1: Weze Parking has asked the user to make a program to control the number of cars in their parking lot. The user has four options: enter the license plates of 10 cars that have entered the lot, register the ticket of a person who has entered the movie theater, delete the license plate of the car that the user wants to leave, and show the number of people who have entered the movie theater and the number of cars that have left.");
            System.out.println("2. Store a series of values in a vector, and then separately sum the values in the even and odd positions.");
            System.out.println("3. Given an array of n integers, write an algorithm to detectements, writing the element and the number of times it repeats.");
            System.out.println("Other. exit.");
            
            if(cmd.nextLine().length() == 1) {
                op = cmd.next().charAt(0);
            } else {
                op = 'e';                
            }
            
            System.out.println("The opition is: " + op);
            if(op == '1') {
                System.out.println("You have selected the first option.");
            } else if(op == '2') {
                System.out.println("You have selected the second option.");
            } else if(op == '1') {
                System.out.println("You have selected the third option.");
            } else  {
                System.out.println("Leaving...");
            }
            
        } while(op == '1' || op == '2' || op == '3');
    }
    
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    
}
