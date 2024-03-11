public class Temp extends Display {
    //this is the class that will represent the COTwo per year
    private int daysToGoBack;
    private double[] temp = new double[daysToGoBack];



    //the tons array will be made with the text file of all the tons.
    public Temp(int daysToGoBack, double[] temp){
        super(daysToGoBack);
        this.temp = temp;
    }

    public double[] createTemp(){
        double[] temps = new double[/*fgure this out */100]; 

        return temps; 
    }

}
