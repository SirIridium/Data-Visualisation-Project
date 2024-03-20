import org.code.theater.*;
import org.code.media.*;


public class PrecipitationVisual extends Scene{
   public void drawGraph(double[] data, int days) {
        double spacing = 0.0; 
        double space = 400.0 / (double)(days); 
        int scale = 3;
        int shift = 100;
if(days==1){
            setStrokeColor("purple");
             drawLine((int)spacing, (400 - (int)data[0] * scale) - shift, (int)(spacing + space), (400 - (int)data[0] * scale) - shift);
        }
      else{
        
        for (int i = 1; i < days-1; i++) { 
            drawLine((int)spacing, (400 - (int)data[i] * scale) - shift, (int)(spacing + space), (400 - (int)data[i+1] * scale) - shift);
            spacing += space;
        }
      }
   //   setStrokeColor("black");
     // drawLine(0,168,400,168);
      playSound("amongus-sound.wav");
        drawImage("bird.png", 100, 200, 300);
    }
  
}
