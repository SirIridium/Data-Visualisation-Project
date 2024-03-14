import org.code.theater.*;
import org.code.media.*;


public class TempVisual extends Scene{

  /* Draws a line on the graph as a function of:
   * the value put in as the High temperature for the first line
   * as the space from the bottom of the graph
   * and the value put in for the second line is low temperature 
   * this generates a line that looks like one of those statisitcal plots 
   */

  public void drawGraph(double[][] data){
    int spacing=0;
    for(int i=0; i<data.length-1;i++){

      drawLine(spacing, 400 - (int)data[i][0], spacing+ 30, 400 - (int) data[i+1][0]);
      drawLine(spacing, 400 - (int)data[i][1], spacing+ 30, 400 - (int) data[i+1][1]);
      
      spacing+=30;
    }
  }
}
