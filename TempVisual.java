   import org.code.theater.*;
import org.code.media.*;


public class TempVisual extends Scene{
public void drawGraph(double[][] data){
  int spacing=0;
  int space=400/data[0].length;
  int scale=1;
  for(int i=0; i<data.length-1;i++){
    drawLine(spacing,(400-(int)data[i][0]*scale)-200, spacing+space,(400-(int)data[i+1][0]*scale)-200);
    drawLine(spacing,(400-(int)data[i][1]*scale)-200,spacing+space,(400-(int)data[i+1][1]*scale)-200);
    spacing+=space;
  }
    drawImage("bird.png",100,200,300);
}
}
