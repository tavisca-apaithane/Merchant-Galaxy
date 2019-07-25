import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CurrencyConverterTests {



    @Test
    public void canParsWordToRomanNumeralStatement()
    {
        WordToRomanParser wordToRomanParser= new WordToRomanParser();
        assertArrayEquals(new String[]{"glob","I"},wordToRomanParser.parse("glob is I"));
    }

}
