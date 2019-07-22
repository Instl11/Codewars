package encoding;

public class Leetspeak extends Encoding {


    @Override
    public String encode(String source) {
        if (source == null) return source;

        StringBuilder result = new StringBuilder();
        for (char ch : source.toCharArray()){
            result.append(code.getOrDefault(Character.toLowerCase(ch), String.valueOf(ch)));
        }
        return result.toString();
    }
}


