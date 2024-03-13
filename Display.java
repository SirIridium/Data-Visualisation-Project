//remember that this extends the scene. 
public class Display /*extends scene*/{
    private static final int YEAR = 2024;

    //the number of days that the user wants to see back into 
    private static int past = 0; 

    public Display(){
        past = 100; 
    }
    public int getPast(){
        return past; 
    }
}
