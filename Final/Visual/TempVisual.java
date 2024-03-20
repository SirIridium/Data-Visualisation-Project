package Final.Visual; 
import org.code.theater.*;
import org.code.media.*;

public class TempVisual extends Scene {
  /* handles the Temp Class
   * uses the 2d array created to create a graph
   * the bottom line is the lowest value of col[i]
   * the top line is the highest number
   */
  
  public void drawGraph(double[][] data, int days) {
    
    double spacing = 0.0; 
    double space = 400.0 / (double)(days); 
    int scale = 3;
    int shift = 0;
    
    drawLine(0,400-32*scale-shift,400,400-32*scale-shift); //Draws freezing point line
    
    if(days==1){ //Draws straight line if days=1
      setStrokeColor("red");
      drawLine((int)spacing, (400 - (int)(data[0][0]+0.5) * scale) - shift, (int)(spacing + space), (400 - (int)(data[0][0]+0.5) * scale) - shift);
      setStrokeColor("blue");
      drawLine((int)spacing, (400 - (int)(data[0][1]+0.5) * scale) - shift, (int)(spacing + space), (400 - (int)(data[0][1]+0.5) * scale) - shift);
    }
    
    if(days==data.length){ //Avoids errors when days is max
      for (int i = 0; i < data.length-1; i++) { 
        setStrokeColor("red");
        drawLine((int)spacing, (400 - (int)(Math.max(data[i][0],data[i][1])+0.5) * scale) - shift, (int)(spacing + space), (400 - (int)(Math.max(data[i+1][0],data[i+1][1])+0.5) * scale) - shift);
        setStrokeColor("blue");
        drawLine((int)spacing, (400 - (int)(Math.min(data[i][0],data[i][1])+0.5) * scale) - shift, (int)(spacing + space), (400 - (int)(Math.min(data[i+1][0],data[i+1][1])+0.5) * scale) - shift);
        spacing += space;
      }
    }

    else{
      for (int i = 0; i < days; i++) { 
        setStrokeColor("red");
        drawLine((int)spacing, (400 - (int)(Math.max(data[i][0],data[i][1])+0.5) * scale) - shift, (int)(spacing + space), (400 - (int)(Math.max(data[i+1][0],data[i+1][1])+0.5) * scale) - shift);
        setStrokeColor("blue");
        drawLine((int)spacing, (400 - (int)(Math.min(data[i][0],data[i][1])+0.5) * scale) - shift, (int)(spacing + space), (400 - (int)(Math.min(data[i+1][0],data[i+1][1])+0.5) * scale) - shift);
        spacing += space;
      }
    }
  }
}
