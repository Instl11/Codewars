package total_area;

public class Triangle implements Shape {

    private double triangleBase;
    private double triangleHeight;

    public Triangle(double triangleBase, double triangleHeight) {
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
    }

    @Override
    public double getArea() {
        return (triangleBase/2)*triangleHeight;
    }
}
