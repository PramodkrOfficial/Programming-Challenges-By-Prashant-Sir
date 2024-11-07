import java.util.Scanner;

class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to Array and Sum Average\n");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        double avg = average(numArray);
        System.out.println("Sum of the numbers are: " + sum);
        System.out.println("Average of the numbers are: " + avg);
    }

    public static long sum (int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static double average (int[] numArray) {
        double sum = sum(numArray);
        return (sum / numArray.length);

    }
}

