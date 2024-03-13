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

    public static Temp[] createTemp(String tempHighFile, String tempLowFile){
          double[] tempHigh= FileReader.toDoubleArray(tempHighFile);
          double[] tempLow = FileReader.toDoubleArray(tempLowFile);
          Temp[] dataSet = new Temp[tempHigh.length]; 
      
          for(int i = 0; i<tempHigh.length; i++){
            dataSet[i] = new Temp(tempHigh[i], tempLow[i]); 
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

  /* This is something I am building by myself
   * It should return a 2d array holding the high and low temps of the days
   * and it should be as long as the temps data is long. 
   */
  public static double[][] printTemps(Temp[] data){

    double[][] tempsGraph = new double[data.length][2];

    for(int i = 0; i < data.length; i++){
        for(int low = 0; low <= 1; low ++){
            if(low==0)
                tempsGraph[i][0] = data[i].getHighTemp();
            else{
                tempsGraph[i][1] = data[i].getLowTemp(); 
            }
        }
    }
    return tempsGraph; 
  }
}



/* 
public static Brand[] createBrands(String namesFile, String gendersFile) {
    String[] namesData = FileReader.toStringArray(namesFile);
    String[] gendersData = FileReader.toStringArray(gendersFile);
    Brand[] brandsData = new Brand[namesData.length];

    for (int index = 0; index < brandsData.length; index++) {
      brandsData[index] = new Brand(namesData[index], gendersData[index]);
    }

    return brandsData;
    */