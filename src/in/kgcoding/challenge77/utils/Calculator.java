package in.kgcoding.challenge77.utils;

import in.kgcoding.challenge77.geometry.Circle;
import in.kgcoding.challenge77.geometry.Rectangle;


public class Calculator {

    public static void main(String[] args) {
        Circle cir = new Circle(6.5);
        Rectangle rect = new Rectangle(5,4);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double rectArea = rect.width * rect.length;

        System.out.printf("Area of the circle is: %s, Area of the rectangle is: %s", cirArea,rectArea);
        System.out.println();
        System.out.printf("Area of the circle is: %f, Area of the rectangle is: %f", cirArea,rectArea);

    }
}
