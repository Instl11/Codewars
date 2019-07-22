package shapes;

class CustomShape implements Shape {
    private double area;

    public CustomShape(double area) {
        this.area = area;
    }

    @Override
    public double getArea() {
        return area;
    }
}
