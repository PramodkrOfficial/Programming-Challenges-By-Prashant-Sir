package in.kgcoding.challenge83;

public class Circle extends Shape{

    private final double radiusInCms;

    // create constructor
    public Circle (double radiusInCms) {
        this.radiusInCms = radiusInCms;
    }

    // create getter
    public double getRadiusInCms() {
        return radiusInCms;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radiusInCms, 2);     //(Radius = pi.r2)
    }
}
