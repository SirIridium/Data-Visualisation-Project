import org.code.theater.*;
import org.code.media.*;

public class WaterVisual extends Scene{
   public void drawGraph(double[] wetData, double[] dryData, int month) {
     
        double spacing = 0.0; 
        double space = 400.0 / (double)(dryData.length/25); 
        int scale = 10;
        int shift = 100;
    for(int i=month;i<dryData.length/2-12;i+=12){
      setStrokeColor("blue");
      drawLine((int)spacing, (400 - (int)(wetData[i]+0.5) * scale) - shift, (int)(spacing + space), (400 - (int)(wetData[i+12]+0.5) * scale) - shift);
      setStrokeColor("red");
        drawLine((int)spacing, (400 - (int)(dryData[i]+0.5) * scale) - shift, (int)(spacing + space), (400 - (int)(dryData[i+12]+0.5) * scale) - shift);
            spacing += space;
    }
}
    } 
