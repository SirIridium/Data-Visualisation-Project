import org.code.theater.*;
import org.code.media.*;

amongus
public class TempVisual extends Scene{

public void drawGraph(double[][] data){
  int spacing=0;
  int space=400/data[0].length;
  for(int i=0; i<data.length-1;i++){
    drawLine(spacing,(400-(int)data[i][0]*2)-100, spacing+space,(400-(int)data[i+1][0]*2)-100);
    drawLine(spacing,(400-(int)data[i][1]*2)-100,spacing+space,(400-(int)data[i+1][1]*2)-100);
    spacing+=space;
  }
}
  
}
