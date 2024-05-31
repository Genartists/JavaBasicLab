public class Main {
    public static void main(String[] args) {
        LabAssignment myAssignment = new LabAssignment(2, 3.5, true, "Hello Mr.Gabriel");
        myAssignment.printVar();

        myAssignment.checkNumber(-2);
        myAssignment.printNumbers(5);

        int[] arr = {1, 2, 3, 4, 5};
        myAssignment.calculateAverage(arr);

        System.out.println(myAssignment.isPrime(11));
        System.out.println(myAssignment.isPrime(10));
    }
}