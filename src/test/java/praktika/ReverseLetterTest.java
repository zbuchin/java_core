package praktika;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class ReverseLetterTest {
    private ReverseLetter reverse = new ReverseLetter();


    @Test
    public void reverseLetters_shouldReverseString_ifTaskExample(){
       String result = reverse.reverseLetters("J@va the be$t!123");
       Assertions.assertEquals("t@eb eht av$J!123", result);

    }

    @Test
    public void reverseLetters_shouldReturnEmptyString_ifInputIsEmpty() {
        String result = reverse.reverseLetters("");
        Assertions.assertEquals("", result);

    }

    @Test
    public void reverseLetters_shouldKeepSingleLetterUnchanged_ifInputIsSingleLetter() {
         String result = reverse.reverseLetters("a");
         Assertions.assertEquals("a", result);
    }

    @Test
    public void reverseLetters_shouldReturnSameString_ifStringWithoutLetters() {
        String result = reverse.reverseLetters("123 !@#");
        Assertions.assertEquals("123 !@#", result);
    }

    @Test
    public void reverseLetters_shouldReverseString_ifStringContainsOnlyLetters() {
        String result = reverse.reverseLetters("abcd");
        Assertions.assertEquals("dcba", result);
    }

    @Test
    public void reverseLetters_shouldKeepNonLettersInPlace_ifSymbolsInMiddle() {
        String result = reverse.reverseLetters("a!b@c");
        Assertions.assertEquals("c!b@a", result);
    }

    @Test
    public void reverseLetters_shouldKeepEdgeSymbolsInPlace_ifSymbolAtStartAndEnd() {
        String result = reverse.reverseLetters("1a2b3");
        Assertions.assertEquals("1b2a3", result);
    }

    @Test
    public void reverseLetters_shouldMoveCaseTogetherWithLetter_ifMixedCase() {
        String result = reverse.reverseLetters("Ab!d");
        Assertions.assertEquals("db!A", result);
    }

    @Test
    public void reverseLetters_shouldReturnNull_ifInputIsNull() {
        String result = reverse.reverseLetters(null);
        Assertions.assertNull(result);
    }

}
