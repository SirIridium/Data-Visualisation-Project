//import java.io.FileReader;

public class Temp {
    //co2 emission per day per area
    //temperature per day per area
    //this is the class that will represent the temp per year
    private double high;
    private double low; 

    //the temp array will be made with the text file of all the tons.
    public Temp(double high, double low){
      this.high = high;
      this.low = low; 
    }

    public static double[][] createTemp(String tempHighFile, String tempLowFile){
          double[] tempHigh= FileReader.toDoubleArray(tempHighFile);
          double[] tempLow = FileReader.toDoubleArray(tempLowFile);
          double[][] dataSet = new double[tempHigh.length][2]; 
      
          for(int i= 0;i<tempHigh.length; i++){
           dataSet[i][0]=tempHigh[i];
            dataSet[i][1]=tempLow[i];
          }
        return dataSet;
  }

    /* getter methods
     * will be used to return a graph 
     */
    public double getHighTemp(){
        return high; 
    }
    public double getLowTemp(){
        return low; 
    }
    
    /* this converts the teMpGraph created in the print Temps method
     * into a string which would make this a lot easier to print
     * bassically this is a support method
     */
    public static String tempsToString(double[][] tempsGraph2){
        String result = ""; 
        for(int row = 0; row < tempsGraph2.length; row++){
          result += "Day " + (row+1) + " ";
            for(int col=0; col <= 1; col++){
                result+= " | " + tempsGraph2[row][col] +" | ";
            }
            result += "\n";
        }
        return result;
    }
}
