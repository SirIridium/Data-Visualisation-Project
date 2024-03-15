Public class Temp(
    /*This is the class that will represent the rain/snowfall over the years
    ----------------------------------------------------------------
    Rain will be measured in CM per month for 10 years
    ^ Same with snow 
    */
    
    private double rain;
    private double snow;
    public Rain(double rain){
        this.rain = rain;
        this.snow=snow;
  
      }

      public static double[][] createRain(String rainFile, String snowFile){
        double[] rain = FileReader.toDoubleArray(rainFile);
        double[] snow = FileReader.toDoubleArray(snowFile);
        double[][] dataSet = new double[rain.length][2]; 
    
        for(int i= 0;i<rain.length; i++){
          dataSet[i][0]=rain[i];
          dataSet[i][1]=snow[i];
        }
      return dataSet;
}

public double getRain(){
    return rain; 
}
public double getSnow(){
    return snow; 
}
public int getDay(){
  return day; 
}



public static String rainToString(double[][] rainGraph2){
    String result = ""; 
    for(int row = 0; row < rainGraph2.length; row++){
      result += "Day " + (row+1) + " ";
        for(int col=0; col <= 1; col++){
            result+= " | " + rainGraph2[row][col] +" | ";
        }
        result += "\n";
    }
    return result;
}

)