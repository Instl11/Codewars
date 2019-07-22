import java.sql.Date;
import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class BalancedNumber {

    public static void main(String[] args) {
        System.out.println(balancedNum(12323));
    }

    public static String balancedNum(long number) {
        if (String.valueOf(number).length() < 3) return "Balanced";
        String s = String.valueOf(number);
        int numberLength = s.length();
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0, j = numberLength - 1; j > numberLength / 2; i++, j--) {
            sumLeft += Character.getNumericValue(s.charAt(i));
            sumRight += Character.getNumericValue(s.charAt(j));
        }
        return sumLeft == sumRight ? "Balanced" : "Not Balanced";
    }
}
