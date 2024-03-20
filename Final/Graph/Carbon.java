package Final.Graph;
import org.code.theater.*;
import org.code.media.*;


public class Carbon{
/* This is the class that will measure the CO2 levels and plastic levels in the ocean  
 * ----------------------------------------------------------------
 * TODO:
 * LUKE - get Tonnes CO2 and Tonnes Plastic per month for 10 years 
 * -DF123 : Make visual for this and KYS (Keep yourself safe)
*/
  
      /* Creates and returns a 2d array of doubles
       * that stores the Tonnes of CO2 of each month in row 0
       * and the tonnes plastic in ocean of each day in row 1  
       */
      public static double[] createGreenhouse(String CO2File){//Creates a double array storing carbon dioxide levels/ greenhouse gasses
            double[] carbonFile = FileReader.toDoubleArray(CO2File);
          
            
          return carbonFile;
    }
    
}
