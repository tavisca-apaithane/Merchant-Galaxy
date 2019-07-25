import java.util.HashMap;

public class CurrencyConverter {
    public static HashMap baseDictionary = new HashMap<String, Integer>() {
        {
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
            put("glob", 1);
            put("prok",5);
            put("pish",10);
        }
    };


}