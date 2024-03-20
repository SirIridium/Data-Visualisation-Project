package Final.Graph;

import org.code.theater.*;
import org.code.media.*;
public class Precipitation{
  /*This is the class that will represent the % of wet and dry areas
   *----------------------------------------------------------------
   * this%s measured for past 136 years per month
   * uses the 2d array created when you call precipitatiom
   */
    
  public static double[] createWetPrecipitation(String wetFile){
    double[] wet = FileReader.toDoubleArray(wetFile);
    return wet;
  }

  public static double[] createDryPrecipitation(String dryFile){
    double[] dry = FileReader.toDoubleArray(dryFile);
    return dry;
  }
}
