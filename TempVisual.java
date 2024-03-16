import org.code.theater.*;
import org.code.media.*;

public class TempVisual extends Scene {
    public void drawGraph(double[][] data, int days) {
        double spacing = 0.0; 
        double space = 400.0 / (double)(days); 
        int scale = 3;
        int shift = 100;
//amongus
        for (int i = 0; i < days; i++) {
            drawLine((int)spacing, (400 - (int)data[i][0] * scale) - shift, (int)(spacing + space), (400 - (int)data[i + 1][0] * scale) - shift);
            drawLine((int)spacing, (400 - (int)data[i][1] * scale) - shift, (int)(spacing + space), (400 - (int)data[i + 1][1] * scale) - shift);
            spacing += space;
        }
        drawImage("bird.png", 100, 200, 300);
    }
}
