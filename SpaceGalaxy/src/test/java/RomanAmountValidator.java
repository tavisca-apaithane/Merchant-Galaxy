public class RomanAmountValidator {
    public static String[] badAmountConditions= new String[]{"IL","IC","ID","IM","XD","XM","VX","VL","VC","VD","VM",
            "LC","LD","LM","DM","DD","LL","VV","III","XXX","CCC","MMM"};

    public static boolean validate(String wordAmountListConvertedToRomanAmountString)
    {
        for(String item: badAmountConditions)
        {
            if(wordAmountListConvertedToRomanAmountString.contains(item))
                return false;
        }
        return true;
    }
}
