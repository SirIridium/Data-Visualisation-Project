import org.code.theater.*;
import org.code.media.*;


public class Greenhouse{
/* This is the class that will measure the CO2 levels and plastic levels in the ocean  
 * ----------------------------------------------------------------
 * TODO:
 * LUKE - get Tonnes CO2 and Tonnes Plastic per month for 10 years 
 * -DF123 : Make visual for this and KYS (Keep yourself safe)
*/


    private double tonnesCO2;
    private double tonnesPlastic;

    public Greenhouse(double CO2){
      this.tonnesCO2 =CO2;
    }
  
  
      /* Creates and returns a 2d array of doubles
       * that stores the Tonnes of CO2 of each month in row 0
       * and the tonnes plastic in ocean of each day in row 1  
       */
      public static double[] createGreenhouse(String CO2File){
            double[] CO2File = FileReader.toDoubleArray(CO2File);
          
            
          return CO2File;
    }
      /* getter methods
       * will be used to return a graph 
       */
      public double getCO2(){
          return tonnesCO2; 
      }

      /* this converts the tempGraph created in the print Temps method
       * into a string which would make this a lot easier to print
       * bassically this is a support method
       */
      public static String GreenhouseToString(double[][] greenhouseGraph2){
          String result = ""; 
          for(int row = 0; row < greenhouseGraph2.length; row++){
            result += "Day " + (row+1) + " ";
              for(int col=0; col <= 1; col++){
                  result+= " | " + greenhouseGraph2[row][col] +" | ";
              }
              result += "\n";
          }
          return result;
      }
}