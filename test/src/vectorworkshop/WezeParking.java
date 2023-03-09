
package vectorworkshop;

import java.util.ArrayList;
import java.util.Scanner;

public class WezeParking {
    private Car carsIn[] = new Car[10];
    
    private ArrayList<Car> carsOut = new ArrayList<Car>();
    
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    
    WezeParking(){}
    
     public void main () {
        char op;
        
        Scanner cmd = new Scanner(System.in);
        
        do {      
            System.out.println("");
            
            // Show possible options
            System.out.println("What do you want to do?.");
            System.out.println("1: Add car in the parking lot.");
            System.out.println("2. Remove car from the parking lot.");
            System.out.println("3. Create cinema ticket");
            System.out.println("4. Show number of tickes and cars out of the parking lot.");
            System.out.println("Other. Get to main menu.");
            
            String proveOp = cmd.nextLine();
            
            if(proveOp.length() == 1) {
                op = proveOp.charAt(0);
            } else {
                op = 'e';                
            }
            
            // Validate user option
            switch(op) {
                case '1':
                    System.out.println("You have selected the first option.");
                    break;
                case '2':
                    System.out.println("You have selected the second option.");
                    break;
                case '3':
                    System.out.println("You have selected the third option.");
                    break;
                case '4': 
                    System.out.println("You have selected the fouth option.");
                    break;
                default:
                    System.out.println("Getting back...");
            }
            
        } while(op == '1' || op == '2' || op == '3' || op == '4');
    }
}
