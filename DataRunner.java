import org.code.media.*;
import org.code.theater.*;
import java.util.Scanner;
public class DataRunner {
    public static void main(String[] args){
      
      //  Temp[] temperatures = Temp.createTemp("tempHigh.txt","tempLow.txt");
      TempVisual tempGraph = new TempVisual();
      tempGraph.drawGraph(Temp.createTemp("tempHigh.txt","tempLow.txt"));

      // PrecipitationVisual precipitationGraph = new PrecipitationVisual();
      // precipitationGraph.drawGraph(Precipitation.createPrecipitation("Wet%perMonth.txt","Dry%perMonth.txt"));

      // Need Data for greenhouse (just CO2 Tons)
      // GreenhouseVisual greenhouseGraph = new GreenhouseVisual();
      // greenhouseGraph.drawGraph(Greenhouse.createGreenhouse("CO2.txt","plastic.txt"));

      /* How do we integrate this ^*/
     

      Theater.playScenes(tempGraph);
        //Where all the running will happen
        System.out.println("\n\n\nData Visusalisation project on climate change.\n\n\n");
        //we are doing the project on the tons of CO2 in the atmosphere per year over the past 100 year

      
      //  System.out.println(Temp.printTemps(temperatures));

      
        Scanner userChoice = new Scanner(System.in);
         System.out.println("\n\n\nData Visusalisation project on climate change.\n\n\n");
        /* we are going to be using the user choice
         * This is going to check what the user is picking for their graph / years they want to see
         * We are going to build the conditionals as a debugging structure, 
         * however we need to decide what we are doing for the project.
         */
        System.out.println("Please state which graph you would like to see: CO2, Rain, Temp"); 
        String choice = userChoice.nextLine();
        
        
        if(choice.equals("CO2")){
          int days=0;
            System.out.println("How many or years would you like to go back?");
            days=userChoice.nextInt();


          PrecipitationVisual thing= new PrecipitationVisual();
        thing.drawGraph(FileReader.toDoubleArray("tons.txt"),days);
        Theater.playScenes(thing);
            //whatever(choice);
            }

        

        if(choice.equals("Rain")){
          int days=0;
            System.out.println("How many ({days} or {years}) would you like to go back?");
            days=userChoice.nextInt();
            
            }

        

        if(choice.equals("Temp") || choice.equals("temp")){
          int days=0;
            System.out.println("How many ({days} or {years}) would you like to go back?");
            days=userChoice.nextInt();
          TempVisual thing= new TempVisual();
     thing.drawGraph(Temp.createTemp("tempHigh.txt","tempLow.txt"),days);
      Theater.playScenes(thing);
        //Where all the running will happen
            //whatever(choice);
            }

        userChoice.close();
      
        }

}
