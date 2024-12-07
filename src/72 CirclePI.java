import java.util.Scanner;

class CirclePI {
    double radiusInMm;

    CirclePI(double radiusInMn) {
        this.radiusInMm = radiusInMn;
    }
    double getCircumference() {
        return 2 * radiusInMm * Math.PI;
    }

    double getArea() {
        return Math.PI * Math.pow(radiusInMm, 2);
    }

    @Override
    public String toString() {
        return "Circle Props: Radius in mm: "+ radiusInMm +" , Circumference in mm: "+ getCircumference() +" , Area in mm2: "+ getArea() +" ";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of Circle\n");
        System.out.print("Please enter your radius: ");
        double radius = input.nextDouble();
        CirclePI circle = new CirclePI(radius);
        System.out.println(circle);

    }


}
