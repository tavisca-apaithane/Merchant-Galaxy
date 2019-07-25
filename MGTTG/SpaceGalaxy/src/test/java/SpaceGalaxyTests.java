import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;


public class SpaceGalaxyTests {

    @Test
    public void canParseWordToRomanNumeralStatement()
    {
        WordToRomanParser wordToRomanParser= new WordToRomanParser();
        assertArrayEquals(new String[]{"glob","I"},wordToRomanParser.parse("glob is I"));
    }


    
    @Test
    public void checkParse2()
    {
        ParseSentenceToCredits p= new ParseSentenceToCredits();
        double ans = p.parse("glob glob Silver is 34 Credits");
        assertEquals(17.0,ans);
    }
    @Test
    public void canGenerateTotalNumericalListValue()
    {
        ParseSentenceToCredits p = new ParseSentenceToCredits();
        ArrayList<Integer> comparingList=new ArrayList<>();
        comparingList.add(1);
        comparingList.add(5);
        comparingList.add(10);
        int finalValue = p.generateTotalNumericalListValue(comparingList);
        assertEquals(6,finalValue);
    }
    @Test
    public void canReduceWordAmountInRupeesArray()
    {
        ParseSentenceToCredits p = new ParseSentenceToCredits();
        int [] newArray=p.reduceWordAmountInRupeesArray(new int[]{1,2,3});
        System.out.println(newArray.length+"here");
        assertArrayEquals(new int[]{1,3},newArray);
    }
    @Test
    public void canGenerateNumberList()
    {
        ParseSentenceToCredits parse2=new ParseSentenceToCredits();
        String[] n=new String[]{"glob","prok","pish"};
        ArrayList newList= parse2.generateNumberList(n);
        ArrayList<Integer> comparingList=new ArrayList<>();
        comparingList.add(1);
        comparingList.add(5);
        comparingList.add(10);
        assertEquals(comparingList,newList);

    }

    @Test
    public void canSentenceParseToCredits()
    {
        ParseSentenceToCredits parseSentenceToCredits= new ParseSentenceToCredits();
        assertEquals("17",parseSentenceToCredits.parse("glob glob Silver is 34 Credits"));

    }
}
