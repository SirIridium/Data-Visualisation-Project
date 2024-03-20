import org.code.theater.*;
Public class Precipitation{
    /*This is the class that will represent the rain/snowfall over the years
    ----------------------------------------------------------------
    Rain will be measured in CM per month for 10 years
    Get on it bozo
    */
    
    private double wet;
    private double dry;
    public Precipitation(double wet, double dry){
        this.wet = wet;
        this.dry = dry;
  
      }

      public static double[][] createPrecipitation(String wetFile, String dryFile){
        double[] wet = FileReader.toDoubleArray(wetFile);
        double[] dry = FileReader.toDoubleArray(dryFile);
        double[][] dataSet = new double[wet.length][2]; 
    
        for(int i= 0;i<wet.length; i++){
          dataSet[i][0]=wet[i];
          dataSet[i][1]=dry[i];
        }
      return dataSet;
}

public double getWet(){
    return wet; 
}
public double getDry(){
    return dry; 
}



public static String precipitationToString(double[][] wetGraph2){
    String result = ""; 
    for(int row = 0; row < wetGraph2.length; row++){
      result += "Day " + (row+1) + " ";
        for(int col=0; col <= 1; col++){
            result+= " | " + wetGraph2[row][col] +" | ";
        }
        result += "\n";
    }
    return result;
}

}
