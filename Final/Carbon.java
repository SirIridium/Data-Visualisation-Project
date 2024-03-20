import org.code.theater.*;
import org.code.media.*;


public class Carbon{
/* This is the class that will measure the CO2 levels
 * ----------------------------------------------------------------
*/
  
      /* Creates and returns a 1d array of doubles
       * that stores the Tonnes of CO2 of each month in row 0 
       */
      public static double[] createGreenhouse(String CO2File){
            double[] carbonFile = FileReader.toDoubleArray(CO2File);
          
            
          return carbonFile;
    }
    
}
