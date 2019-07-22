package encoding;

import java.util.HashMap;
import java.util.Map;

abstract class Encoding {
    public abstract String encode(String source);

    static Map<Character, String> code = new HashMap<>();
    static {
        code.put('a', "4");
        code.put('e', "3");
        code.put('l', "1");
        code.put('m', "/^^\\");
        code.put('o', "0");
        code.put('u', "(_)");
    }

}
