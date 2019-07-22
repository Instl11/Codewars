import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReplaceFruitsStrings {
    public static void main(String[] args) {
    }



    public static String[] removeRotten2(String[] fruitBasket) {
        if (fruitBasket == null) return new String[0];

        for (int i = 0; i < fruitBasket.length; i++){
            fruitBasket[i] = fruitBasket[i].toLowerCase().replaceAll("rotten", "");
        }
        return fruitBasket;
    }

    public static String[] removeRotten(String[] fruitBasket){
        if (fruitBasket == null) return new String[0];

        return Arrays.stream(fruitBasket)
                .map(s -> s = s.toLowerCase().replaceAll("rotten", ""))
                .toArray(String[]::new);
    }
}

