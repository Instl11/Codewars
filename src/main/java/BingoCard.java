import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class BingoCard {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getCard()));
    }

    public static String[] getCard() {
        char[] bingo = "BINGO".toCharArray();
        String[] result = new String[25];
        Random rd = new Random();

        for (int i = 0, j = 0, start = 1, end = 16; i < result.length; ) {
            int[] ints = rd.ints(start, end).distinct().limit(5).toArray();
            for (int k = 0; k < 5; k++, i++) {
                result[i] = "" + bingo[j] + ints[k];
            }
            start += 15;
            end += 15;
            j++;
        }
        String[] out = Arrays.copyOf(result, result.length - 1);
        System.arraycopy(result, 13, out, 12, result.length - 13);
        return out;
    }
}
