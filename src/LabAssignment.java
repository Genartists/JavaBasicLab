public class LabAssignment {
    private int numb;
    private double decimal;
    private boolean bool;
    private String str;
public LabAssignment(int numb, double decimal, boolean bool, String str)
{
    this.numb = numb;
    this.decimal = decimal;
    this.bool = bool;
    this.str = str;
}
public void printVar(){
    System.out.println(numb);
    System.out.println(decimal);
    System.out.println(bool);
    System.out.println(str);
}
public void checkNumber(int numb){
    if (numb > 0){
        System.out.println("The number is positive");
    }
    else if (numb < 0){
        System.out.println("The number is negative");
    }
    else {
        System.out.println("The number is zero");
    }
}
public void printNumbers(int numb){
    for (int i = 1; i <= numb; i++){
        System.out.println(i);
    }
}
public void calculateAverage(int[] arr){
    double sum = 0;
    for (int i = 0; i < arr.length; i++){
        sum += arr[i];
    }
    double average = sum/arr.length;
    System.out.println(average);
}
public boolean isPrime(int numb){
    for (int i = 2; i < numb; i++){
        if (numb % i == 0){
            return false;
        }
    }
    return true;
}
}
