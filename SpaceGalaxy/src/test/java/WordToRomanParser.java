public class WordToRomanParser {

    public Object[] parse(String type1Text) {

        String [] separatedText=type1Text.split(" ");
        CurrencyConverter.baseDictionary.put(separatedText[0],separatedText[2]);
        return new String[]{separatedText[0],separatedText[2]};
    }

}
