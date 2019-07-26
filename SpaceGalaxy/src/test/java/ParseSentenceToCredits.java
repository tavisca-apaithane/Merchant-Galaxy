import java.util.ArrayList;

public class ParseSentenceToCredits {

    //done
    public void  parse(String text) throws Exception {

        String[] firstSeparation = text.split("is");
        String[] leftStringTokensWithOneUnknownItem= firstSeparation[0].split(" ");
        String[] rightStringTokens= firstSeparation[1].split(" ");
        String Key =leftStringTokensWithOneUnknownItem[leftStringTokensWithOneUnknownItem.length-1];
        double givenTotalValue =Double.parseDouble(rightStringTokens[0]);
        String[] leftStringTokensWithKnownItems= getLeftStringToekensWithKnownItmes(leftStringTokensWithOneUnknownItem);
        String wordAmountListConvertedToRomanAmountString = Utils.convertWordAmountListToRomanString(leftStringTokensWithKnownItems);
        if(RomanAmountValidator.validate(wordAmountListConvertedToRomanAmountString))
        {
            ArrayList<Integer> decimalAmountList = Utils.generateNumberList(wordAmountListConvertedToRomanAmountString);
            double generatedDecimalValue=Utils.generateNumberStringValue(decimalAmountList);
            double Value =givenTotalValue/generatedDecimalValue;
            CurrencyConverter.baseDictionary.put(Key, Value);
        }
        else
        {
            throw new Exception();
        }

    }


    public String[] getLeftStringToekensWithKnownItmes(String[] leftStringTokensWithUnknownItems) {
        String[] leftStringTokensWithKnownItems=new String[leftStringTokensWithUnknownItems.length-1];
        for(int i=0;i<leftStringTokensWithUnknownItems.length-1;i++)
            leftStringTokensWithKnownItems[i]=leftStringTokensWithUnknownItems[i];
        return leftStringTokensWithKnownItems;
    }















}
