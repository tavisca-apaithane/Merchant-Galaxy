import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static String convertWordAmountListToRomanString(String[] leftStringTokensWithKnownItems) {
        String romanString ="";
        for(int i=0;i<leftStringTokensWithKnownItems.length;i++)
        {
            romanString +=CurrencyConverter.nameToRoman.get(leftStringTokensWithKnownItems[i]).toString();
        }
        return romanString;
    }
    public static ArrayList<Integer> generateNumberList(String wordAmountListConvertedToRomanAmountString)
    {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<wordAmountListConvertedToRomanAmountString.length();i++)
        {
            int x=Integer.parseInt( CurrencyConverter.baseDictionary.get(wordAmountListConvertedToRomanAmountString.charAt(i)).toString());
            l.add(x);
        }
        return l;
    }
    public static double generateNumberStringValue(ArrayList<Integer> decimalAmountList) {
        List<Integer> decimalAmountList1= decimalAmountList;
        System.out.println(decimalAmountList.size()+"here");
        while(decimalAmountList1.size()!=1)
            decimalAmountList1= generateNumberStringValueSubOperation(decimalAmountList1);
        return (double)decimalAmountList1.get(0);
    }
    public static List<Integer> generateNumberStringValueSubOperation(List<Integer> decimalAmountList) {
        if(decimalAmountList.get(0)<decimalAmountList.get(1))
        {
            decimalAmountList.set(1,(decimalAmountList.get(1)-decimalAmountList.get(0)));
        }
        else
        {
            decimalAmountList.set(1,(decimalAmountList.get(0)+decimalAmountList.get(1)));
        }
        return decimalAmountList.subList(1,decimalAmountList.size());
    }
    public static String getWordString(String[] s) {
        String newS="";
        int i=0;
        for(i=0;i<s.length-1;i++)
            newS+=s[i]+" ";
        newS+=s[i];
        return newS;
    }
}
