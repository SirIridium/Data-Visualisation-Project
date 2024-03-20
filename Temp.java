import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Temp extends Display {
    private int daysToGoBack;
    private double[] temp;



    /* This will display an error because we are using
     * The code.orgs built in filereader so this doesnt really matter
     * 
     */
    public Temp(int daysToGoBack, double[] temp) {
        super(daysToGoBack);
        this.daysToGoBack = daysToGoBack;
        this.temp = temp;
    }

    public static double[] createTemp(String tempFile) {
        try {
            String[] tempData =  FileReader.toStringArray(tempFile);
            double[] tempArray = new double[tempData.length];
            
            for (int i = 0; i < tempData.length; i++) {
                tempArray[i] = Double.parseDouble(tempData[i]);
            }

            return tempArray;
        } catch (IOException e) {
            // Handle file reading exception
            e.printStackTrace();
            return null; // or throw an exception
        }
    }
}