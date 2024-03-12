import java.io.FileReader;

public class Temp extends Display {
    //co2 emission per day per area
    //temperature per day per area
    //this is the class that will represent the COTwo per year
    private int daysToGoBack;
    private double[] temp = new double[daysToGoBack];

    //the tons array will be made with the text file of all the tons.
    public Temp(int daysToGoBack, double[] temp){
        super(daysToGoBack);
        this.createTemp()
    }

    public static double[] createTemp(){
          double[] tempData = FileReader.toDoubleArray("Temperatures.txt"); //amongus
        return tempData; 
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