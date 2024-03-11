public class Temp extends Display {
    //this is the class that will represent the COTwo per year
    private int daysToGoBack;
    private double[] temp = new double[daysToGoBack];



    //the tons array will be made with the text file of all the tons.
    public Temp(int yearsToGoBack, double[] temp){
        super(yearsToGoBack);
        this.temp = temp;
    }

    public double[] createTemp(){
        double[] temps = new double[100]; 
        
        return temps; 
    }

}
