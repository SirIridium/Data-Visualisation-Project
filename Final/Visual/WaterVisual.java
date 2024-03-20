package Final.Visual; 
import org.code.theater.*;
import org.code.media.*;

public class WaterVisual extends Scene{
  /* handles the precipitation class 
   * which has data for the past 136 years per month
   * this is used for the graph once the 2d array is passed in
   * which the rows being the wettest days of the month
   * and the dryest days of the month
   */
  public void drawGraph(double[] wetData, double[] dryData, int month) {
    double spacing = 0.0; 
    double space = 400.0 / (double)(dryData.length/24); 
    int scale = 10;
    int shift = 100;
    
    for(int i=month;i<dryData.length/2-12;i+=12){//Skips 12 months to take 1 month from each year
      setStrokeColor("blue");//Denotes dry 
      drawLine((int)spacing, (400 - (int)(wetData[i]+0.5) * scale) - shift, (int)(spacing + space), (400 - (int)(wetData[i+12]+0.5) * scale) - shift);
      setStrokeColor("red");//Denotes wet
      drawLine((int)spacing, (400 - (int)(dryData[i]+0.5) * scale) - shift, (int)(spacing + space), (400 - (int)(dryData[i+12]+0.5) * scale) - shift);
      spacing += space;
      pause(.1);
    }
    String[] months= {"December","January","February","March","April","May","June","July","August","September","October","November","December"};
    setTextColor("Black");
    drawText("Wet/Dry % for 153yrs \n Month:" + months[month],10,350);
    setTextColor("Red");
    drawText("Red = Dry month",10,375);
    setTextColor("Blue");
    drawText("Blue=wet Month",200,375);
  }
}