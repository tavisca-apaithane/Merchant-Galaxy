import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;


public class SpaceGalaxyTests {

    @Test
    public void checkGetWordAmountStringArray()
    {
        QuestionHowMuchParser q = new QuestionHowMuchParser();
        String[] actual = q.getWordAmountStringArray(new String[]{"How", "much", "is", "pish", "prok" ,"glob","?"});
        assertArrayEquals(new String[]{"pish","prok","glob"},actual);
    }
    @Test
    public void checkGetWordString()
    {
        QuestionHowMuchParser q= new QuestionHowMuchParser();
        String s= q.getWordString(new String[]{"pish","prok","glob"});
        System.out.println(s);
        assertEquals(s,"pish prok glob");
    }
    public void print(String [] s)
    {
        for(String item: s)
            System.out.println(item);
    }
    @Test
    public void canParseWordToRomanNumeralStatement()
    {
        WordToRomanParser wordToRomanParser= new WordToRomanParser();
        assertArrayEquals(new String[]{"glob","I"},wordToRomanParser.parse("glob is I"));
    }

    @Test
    public void checkGetLeftStringWithKnownItems()
    {
        ParseSentenceToCredits p = new ParseSentenceToCredits();
        String[] here=p.getLeftStringToekensWithKnownItmes(new String[]{"glob","glob","Silver"});
        assertArrayEquals(here,new String[]{"glob","glob"});
    }

@Test
public void checkAnotherGetWordAmountStringArray()
{
    QuestionHowManyParser q = new QuestionHowManyParser();
    print(q.getWordAmountStringArray("How many Credits is pish prok Silver ?"));
    assertArrayEquals(q.getWordAmountStringArray("How many Credits is pish prok Silver ?"),new String[]{"pish","prok","Silver"});
}



    @Test
    public void checkGenerateValue()
    {
        ParseSentenceToCredits p= new ParseSentenceToCredits();
        ArrayList<Integer> x= new ArrayList<>();
        x.add(23);
        x.add(50);
        x.add(2);
        double  l= Utils.generateNumberStringValue(x);
        assertEquals(1,1);
        System.out.println(l);
    }

    @Test
    public void checkSub()
    {
        String s="abhishek";
        assertEquals(true,s.contains("ap"));
    }
    @Test
    public void checkConvertWordAmountListToRomanString()
    {
        ParseSentenceToCredits p = new ParseSentenceToCredits();
        String ans=Utils.convertWordAmountListToRomanString(new String[]{"glob","glob","pish"});
        assertEquals("IIX",ans);
    }

}
