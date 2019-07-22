import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfNumbersRecursion {
    public static void main(String[] args) {
        System.out.println(showSequenceBuilder(-5));
    }

    public static String showSequenceBuilder(int value){
        if (value <=0) return (value ==0) ? "0=0" : String.valueOf(value).concat("<0");

        StringBuilder s = new StringBuilder("0");
        int i = 1;
        int sum = 0;

        while (i <= value){
            s = s.append("+").append(i);
            sum += i;
            i++;
        }
        return s.append(" = ").append(sum).toString();
    }

    public static String showSequenceStream(int value) {
        if (value < 0)
            return String.format("%d<0", value);
        else if (value == 0)
            return "0=0";
        String expr = IntStream.rangeClosed(0, value).mapToObj(Integer::toString)
                .collect(Collectors.joining("+"));
        long sum = (long)value * (value + 1) / 2;
        return String.format("%s = %d", expr, sum);
    }

    public static String showSequenceSimplePlus(int value){
        String ans = "";
        if (value < 0) return "" + value + "<0";
        if (value == 0) return "0=0";
        for (int i = 0; i <= value; i++) ans += "" + i + "+";
        return ans.substring(0,ans.length() - 1) + " = " + (value * (value + 1) /2);
    }
}
