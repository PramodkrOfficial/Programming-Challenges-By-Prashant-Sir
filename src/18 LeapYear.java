import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to New Year Calculator\n");
        System.out.print("Please enter the year that you want to check: ");
        int year = input.nextInt();

//        <----------------- Professional way of Coding style ------------------->
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Your year is a leap year");
        } else {
            System.out.println("Your year is a not leap year");
        }


//        <----------------- Beginner way of Coding style ------------------->
//        if (year % 400 == 0) {
//            System.out.println("Your year is a leap year");
//        } else if (year % 100 == 0) {
//            System.out.println("Your year is a not leap year");
//        } else if (year % 4 == 0) {
//            System.out.println("Your year is a leap year");
//        } else {
//            System.out.println("Your year is a not leap year");
//        }
    }
}
