import java.util.Scanner;

class SumAverage2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum and Average of 2D Array\n");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sum(numArr);
        double average = average(numArr);
        System.out.println("Your sum of Array is: " + sum);
        System.out.println("Your average of Array is: " + average);

    }

    public static double average(int[][] numArr) {
        if (numArr.length == 0) {
            return 0;
        }

        int rows  = numArr.length;
        int cols = numArr[0].length;
        double size = rows * cols;

        return sum(numArr) / size;

    }

    public static long sum(int[][] numArr) {
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while (j < numArr[i].length) {
                sum += numArr[i][j];
                j++;

            }
            i++;
        }
        return sum;
    }
}
