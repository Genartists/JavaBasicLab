public class Main {
    public static void main(String[] args) {
        // create an object of LabAssignment
        LabAssignment myAssignment = new LabAssignment(2, 3.5, true, "Hello Mr.Gabriel");
        // call all method
        myAssignment.printVar();
        myAssignment.checkNumber(-2);
        myAssignment.printNumbers(5);

        int[] arr = { 1, 2, 3, 4, 5 };
        myAssignment.calculateAverage(arr);

        System.out.println(myAssignment.isPrime(11));
        System.out.println(myAssignment.isPrime(10));
    }
}