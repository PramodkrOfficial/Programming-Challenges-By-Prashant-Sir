
class Patterns {
    public static void main(String[] args) {

        RightHalfPyramid();
        System.out.println();
        ReverseRightHalfPyramid();
        System.out.println();
        LeftHalfPyramid();
    }

    public static void RightHalfPyramid() {
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");

    }
    public static void ReverseRightHalfPyramid() {
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }
    public static void LeftHalfPyramid () {
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }
}
