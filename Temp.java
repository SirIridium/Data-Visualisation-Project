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
    

    /********* THIS WORKS IN CODE.ORG ***********/
    public static Temp[] createTemp(String tempHighFile, String tempLowFile){
          double[] tempHigh= FileReader.toDoubleArray(tempHighFile);
          double[] tempLow = FileReader.toDoubleArray(tempLowFile);
          Temp[] dataSet = new Temp[tempHigh.length]; 
      
          for(int i = 0; i<tempHigh.length; i++){
            dataSet[i] = new Temp(tempHigh[i], tempLow[i]); 
          }

        return dataSet;
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