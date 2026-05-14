public class Array {
    public static void main(String[] args) {

        int[] myArray = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

        for (int n = 0; n < myArray.length; n++) {
            System.out.println("Elemento: " + myArray[n]);
        }

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < myArray.length; counter++) {
            System.out.printf("%4d%7d%n", counter, myArray[counter]);
        }
    }
}
