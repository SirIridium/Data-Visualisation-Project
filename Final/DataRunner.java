package Final;
import org.code.media.*;
import org.code.theater.*;
import java.util.Scanner;
public class DataRunner {
    public static void main(String[] args){
        Scanner userChoice = new Scanner(System.in);
         System.out.println("\n\n\nData Visusalisation project on climate change.\n\n\n");
        /* we are going to be using the user choice
         * This is going to check what the user is picking for their graph / years they want to see
         * We are going to build the conditionals as a debugging structure, 
         * however we need to decide what we are doing for the project.
         */
        System.out.println("Please state which graph you would like to see: CO2, Rain, Temp"); 
        String choice = userChoice.nextLine();
        
        
        if(choice.equals("CO2") || choice.equals("co2")){
          int days=0;
            System.out.println("How many years would you like to go back?");
            days=userChoice.nextInt();
          CarbonVisual thing= new CarbonVisual();
     thing.drawGraph(Carbon.createGreenhouse("megatons.txt"),days);
      Theater.playScenes(thing);
            }

        

        if(choice.equals("Rain") || choice.equals("rain")){
          int month=0;
            System.out.println("What month would you like to see?");
            month=userChoice.nextInt();
      WaterVisual thing= new WaterVisual();
     thing.drawGraph(Precipitation.createWetPrecipitation("wet.txt"),Precipitation.createDryPrecipitation("dry.txt"),month);
      Theater.playScenes(thing);
            }

        

        if(choice.equals("Temp") || choice.equals("temp")){
          int days=0;
            System.out.println("How many ({days} or {years}) would you like to go back?");
            days=userChoice.nextInt();
          TempVisual thing= new TempVisual();
     thing.drawGraph(Temp.createTemp("tempHigh.txt","tempLow.txt"),days);
      Theater.playScenes(thing);
            }

        userChoice.close();
      
        }

}
