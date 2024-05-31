public class LabAssignment {
    // instance variables
    private int numb;
    private double decimal;
    private boolean bool;
    private String str;
    // constructor
    public LabAssignment(int numb, double decimal, boolean bool, String str) {
        this.numb = numb;
        this.decimal = decimal;
        this.bool = bool;
        this.str = str;
    }
    // print the variables
    public void printVar() {
        System.out.println(numb);
        System.out.println(decimal);
        System.out.println(bool);
        System.out.println(str);
    }
    // check if the number is positive, negative or zero
    public void checkNumber(int numb) {
        if (numb > 0) {
            System.out.println("The number is positive");
        } else if (numb < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
    // print numbers from 1 to numb
    public void printNumbers(int numb) {
        for (int i = 1; i <= numb; i++) {
            System.out.println(i);
        }
    }
    // calculate the average of an array of integers
    public void calculateAverage(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / arr.length;
        System.out.println(average);
    }
    // check if a number is prime
    public boolean isPrime(int numb) {
        for (int i = 2; i < numb; i++) {
            if (numb % i == 0) {
                return false;
            }
        }
        return true;
    }
}
