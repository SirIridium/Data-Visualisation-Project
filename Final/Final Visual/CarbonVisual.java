import org.code.theater.*;
import org.code.media.*;
public class CarbonVisual extends Scene{
   public void drawGraph(double[] data, int years) {
        double spacing = 0.0; 
        double space = 400.0 / (double)(years); 
        int scale = 3;
        int shift = 100;
if(years==1){ //Draws straight line if years=1
            setStrokeColor("purple");
             drawLine(0, (400 - (int)(data[0]+0.5) * scale) - shift, 400, (400 - (int)(data[0]+0.5) * scale) - shift);
        }
  if(years==data.length){ //Avoids errors when years is max
    setStrokeColor("purple");
    for(int i=0;i<data.length-1;i++){
      drawLine((int)spacing, (400 - (int)(data[i]+0.5) * scale) - shift, (int)(spacing + space), (400 - (int)(data[i+1]+0.5) * scale) - shift);
            spacing += space;
    }
}
      else{//Normal case
        setStrokeColor("purple");
        for (int i = 0; i < years; i++) { 
            drawLine((int)spacing, (400 - (int)(data[i]+0.5) * scale) - shift, (int)(spacing + space), (400 - (int)(data[i+1]+0.5) * scale) - shift);
            spacing += space;
        }
      }
    } 
}
