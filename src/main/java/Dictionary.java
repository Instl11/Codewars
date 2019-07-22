import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private HashMap<String, String> wordsWithDesc = new HashMap<>();
    public Dictionary(){
        // your code
    }

    public void newEntry(String key, String value){
        wordsWithDesc.put(key, value);
    }

    public String look(String key){
        return wordsWithDesc.getOrDefault(key, "Cant find entry for ".concat(key));
    }
}
