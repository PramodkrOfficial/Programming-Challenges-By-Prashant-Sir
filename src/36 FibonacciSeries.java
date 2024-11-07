import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Welcome to FibonacciSeries\n");
        System.out.print("Please enter your number up-to which series has to be printed: ");
        int num = input.nextInt();
        System.out.println("Here your fibonacci series");
        printFibonacci(num);
    }

    public static void printFibonacci(int num) {
        if (num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;
        System.out.print("1 ");

        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
