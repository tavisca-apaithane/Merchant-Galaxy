import java.util.ArrayList;

public class QuestionHowMuchParser {

    public String parse(String Question) throws Exception
    {
    String[] wordAmountStringArray=getWordAmountStringArray(Question.split(" "));
    String romanString = Utils.convertWordAmountListToRomanString(wordAmountStringArray);
    if(RomanAmountValidator.validate(romanString))
    {
        ArrayList<Integer> decimalAmountList=Utils.generateNumberList(romanString);
        double DeciamlValue = Utils.generateNumberStringValue(decimalAmountList);
        return Utils.getWordString(wordAmountStringArray)+" is "+DeciamlValue+ " Credits";
    }
    else
    {
        throw  new Exception();
    }


    }



    public String[] getWordAmountStringArray(String[] s) {
        String[] result=new String[s.length-4];
        int count=0;
        for(int i=3;i<(s.length-1);i++)
        {
            result[count]=s[i];
            count++;
        }
        return result;
    }

}
