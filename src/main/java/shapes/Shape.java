package shapes;

public interface Shape extends Comparable<Shape> {

    double getArea();

    @Override
    default int compareTo(Shape o){
        return Double.compare(this.getArea(), o.getArea());
    }
}
