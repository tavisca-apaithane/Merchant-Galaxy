import java.util.ArrayList;

public class QuestionHowManyParser {
    public String parse(String Question) throws  Exception
    {
        String[] WordAmountStringArray = getWordAmountStringArray(Question);
        String[] splitedQuestionElements = Question.split(" ");
        String multiplyingWordAmount = splitedQuestionElements[splitedQuestionElements.length-2];
        String romanString = Utils.convertWordAmountListToRomanString(WordAmountStringArray);
        if(RomanAmountValidator.validate(romanString)) {
            ArrayList<Integer> numberList = Utils.generateNumberList(romanString);
            double numberStringValue = Utils.generateNumberStringValue(numberList);
            double result = numberStringValue * Double.parseDouble(CurrencyConverter.baseDictionary.get(multiplyingWordAmount).toString());
            return Utils.getWordString(WordAmountStringArray) + " is " + result + " Credits";
        }
        else
            throw new Exception();
    }

    public String[] getWordAmountStringArray(String s) {
        String[] splitedS= s.split(" ");
        String[] result=new String[splitedS.length-5];
        int count=0;
        for(int i=4;i<splitedS.length-2;i++)
        {
            result[count]=splitedS[i];
            count++;
        }
    return result;
    }
}
