import java.util.HashMap;

public class CurrencyConverter {
    public static HashMap dictionary = new HashMap<String, String>() {
        {
            put("I", "1");
            put("V", "5");
            put("X", "10");
            put("L", "50");
            put("C", "100");
            put("D", "500");
            put("M", "1000");
        }
    };


}