
import org.code.theater.*;
import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args){
      
      //  Temp[] temperatures = Temp.createTemp("tempHigh.txt","tempLow.txt");
      TempVisual tempGraph = new TempVisual();
      tempGraph.drawGraph(Temp.createTemp("tempHigh.txt","tempLow.txt"));

     
      Theater.playScenes(tempGraph);
        //Where all the running will happen
        System.out.println("\n\n\nData Visusalisation project on climate change.\n\n\n");
        //we are doing the project on the tons of CO2 in the atmosphere per year over the past 100 year

      
      //  System.out.println(Temp.printTemps(temperatures));

      
        Scanner userChoice = new Scanner(System.in);
        
        /* we are going to be using the user choice
         * This is going to check what the user is picking for their graph / years they want to see
         * We are going to build the conditionals as a debugging structure, 
         * however we need to decide what we are doing for the project.
         */

        while(!(choice.equalsIgnoreCase("rain") || choice.equalsIgnoreCase("rain") || choice.equalsIgnoreCase("rain"))){

          System.out.println("Please state which graph you would like to see: CO2, Rain, Temp"); 
          String choice = userChoice.nextLine();

          /* the method .equalsIgnoreCase() checks if the string 
           * is equal to the other string but it is NOT
           * case sensitive
           * 
           * i.e. CO2 == co2 
           * 
           */

           if(choice.equalsIgnoreCase("CO2")){
            System.out.println("How many years would you like to go back?");
              userChoice.nextInt();
          }

    
            else if(choice.equalsIgnoreCase("rain")){
                System.out.println("How many days would you like to go back?");
                userChoice.nextInt();
                }

            

            else if(choice.equalsIgnoreCase("temp")){
                System.out.println("How many days would you like to go back?");
                userChoice.nextInt();
                }
        userChoice.close();
              }
        }

}
