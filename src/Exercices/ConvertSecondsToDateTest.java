package Exercices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConvertSecondsToDateTest {
@Test
    public void testThat_Convert_Works(){
    long sampleInSeconds = 29030400;
    String Expected = 1+"years and "+12+"months and " +48+ "weeks and "+ 336+"days and "+8064+"hours and "+483840+"minutes and " +sampleInSeconds + "seconds";
    assertEquals(Expected,ConvertSecondsToDate.convert(sampleInSeconds));
}
}