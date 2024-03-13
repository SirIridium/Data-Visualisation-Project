import org.code.theater.*;
import org.code.media.*;


public class TempVisual extends Scene{

public void drawGraph(double[][] data){
  int spacing=0;
  for(int i=0; i<data.length-1;i++){
    drawLine(spacing,400-(int)data[i][0], spacing+30,400-(int)data[i+1][0]);
    drawLine(spacing,400-(int)data[i][1],spacing+30,400-(int)data[i+1][1]);
    spacing+=30;
  }
}
  
}
