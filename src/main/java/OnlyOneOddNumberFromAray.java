import encoding.Leetspeak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class OnlyOneOddNumberFromAray {

    public static void main(String[] args) {
        //System.out.println(findIt(new int[]{20, 1, -1, -2, 1, 20, -1, -2, 5}));




    }

    public static int findIt(int[] a) {
        boolean[] arr = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            if (!arr[i]) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        arr[j] = true;
                        count++;
                    }
                }
                if (count % 2 == 0) return a[i];
            }
        }
        return 0;
    }

    public static int findIt2(int[] a) {
        return Arrays.stream(a).reduce(0, (x, y) -> x ^ y);    //это xor, соединяет в A^B^A^B^D^E^D = E -> убирает все совпадения, A xor A = 0
    }

}
