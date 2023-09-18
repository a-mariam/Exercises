package Chapter17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsogramTest {
    @Test
    public void testThat_It_Isogram(){
        Isogram isogram = new Isogram();
        String word = "mulatheee";// FALSE
        String d = "maiid djdj";//FALSE
        String s = "mamu";//TRUE
        String  b = "The qick brwn fx jumps ov lasy d";//TRUE

        assertFalse(isogram.isFirstLetterIsogram(d));
        assertFalse(isogram.isFirstLetterIsogram(word));
        assertTrue(isogram.isFirstLetterIsogram(b));
        assertTrue(isogram.isFirstLetterIsogram(s));
    }

}