//import org.code.theater.*;
import java.util.*;
public class DataRunner {
    public static void main(String[] args){
        //Where all the running will happen
        System.out.println("\n\n\nData Visusalisation project on climate change.\n\n\n");
        //we are doing the project on the tons of CO2 in the atmosphere per year over the past 100 year
        
        Scanner userChoice = new Scanner(System.in);
        
        /* we are going to be using the user choice
         * This is going to check what the user is picking for their graph / years they want to see
         * We are going to build the conditionals as a debugging structure, 
         * however we need to decide what we are doing for the project.
         */
        System.out.println("Please state which graph you would like to see: CO2, Ice, Temp"); 
        String choice = userChoice.nextLine();
        
        
        if(choice.equals("CO2")){
            System.out.println("How many years would you like to go back?");
            userChoice.nextInt();
            //whatever(choice);
            }

        

        if(choice.equals("Ice")){
            System.out.println("How many years would you like to go back?");
            userChoice.nextInt();
            //whatever(choice);
            }


        //closes the scanner
        userChoice.close();
    }
}