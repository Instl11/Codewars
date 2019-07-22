package total_area;

public class RunnerCalc {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.getTotalArea(new Rectangle(4, 2), new Rectangle(3, 4),
                new Circle(1), new Square(1), new Triangle(10, 5)));
    }
}
