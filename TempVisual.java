import org.code.theater.*;
import org.code.media.*;

public class TempVisual extends Scene {

  public void drawGraph(double[][] data, int days) {
    double spacing = 0.0; 
    double space = 400.0 / (double)(days); 
    int scale = 3;
    int shift = 100;

  if(days==1){
    setStrokeColor("red");
    drawLine((int)spacing, (400 - (int)data[0][0] * scale) - shift, (int)(spacing + space), (400 - (int)data[0][0] * scale) - shift);
    setStrokeColor("blue");
    drawLine((int)spacing, (400 - (int)data[0][1] * scale) - shift, (int)(spacing + space), (400 - (int)data[0][1] * scale) - shift);
    }
    else{
      for (int i = 1; i < days-1; i++) {
        setStrokeColor("red");
        drawLine((int)spacing, (400 - (int)Math.max(data[i][0],data[i][1]) * scale) - shift, (int)(spacing + space), (400 - (int)Math.max(data[i+1][0],data[i+1][1]) * scale) - shift);
        setStrokeColor("blue");
        drawLine((int)spacing, (400 - (int)Math.min(data[i][0],data[i][1]) * scale) - shift, (int)(spacing + space), (400 - (int)Math.min(data[i+1][0],data[i+1][1]) * scale) - shift);
        spacing += space;
      }
    }
  playSound("amongus-sound.wav");
  drawImage("bird.png", 100, 200, 300);

  }
}
