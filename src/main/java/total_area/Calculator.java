package total_area;

import java.util.Arrays;

public class Calculator {

    public double getTotalArea(Shape... shapes) {
        return Math.round(Arrays.stream(shapes).mapToDouble(Shape::getArea).sum() * 100.0) / 100.0;
    }
}
