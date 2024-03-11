//remember that this extends the scene. 
public class Display /*extends scene*/{
    private static final int YEAR = 2024;
    private int yearsToGoBack; 
    
    //constructor
    public Display(int yearsToGoBack){
        this.yearsToGoBack = yearsToGoBack;
    }

    //returns the yearsToGoBack
    public int getYearsToGoBack(){
        return yearsToGoBack; 
    }


}