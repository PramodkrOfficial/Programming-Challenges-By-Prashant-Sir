import java.util.Scanner;

class MinimumTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding minimum\n");
        System.out.print("Please enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Now, enter the second number: ");
        int num2 = input.nextInt();
        MinimumTernary ternary = new MinimumTernary();
        int min = ternary.min(num1,num2);
        System.out.println("Minimum number is: " + min);
    }

    public int min(int num1, int num2) {
        return num1 < num2 ? num1 : num2;

    /*
        return Math.max(num1, num2);

        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
     */

    }
}
