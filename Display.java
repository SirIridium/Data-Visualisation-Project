//remember that this extends the scene. 
public class Display /*extends scene*/{
    private static final int YEAR = 2024;
    private int daysToGoBack; 

    //constructor
    public Display(int yearsToGoBack){
        this.daysToGoBack = yearsToGoBack;
    }

    //returns the yearsToGoBack
    public int getYearsToGoBack(){
        return daysToGoBack; 
    }
    
}