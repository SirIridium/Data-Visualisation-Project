public class COTwo extends Display {
    //this is the class that will represent the COTwo per year
    private int yearsToGoBack;
    private double[] tons = new double[yearsToGoBack];



    //the tons array will be made with the text file of all the tons.
    public COTwo(int yearsToGoBack, double[] tons){
        super(yearsToGoBack);
        this.tons = tons;
    }

    //public 

}
