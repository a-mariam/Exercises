package RegularExpression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegularExpressionTest {
    @Test
    public void testPattern(){
        String text = "1566";
        String pattern = "\\d+";
        boolean result = RegularExpress.findMatch(text, pattern);
        assertTrue(result);
    }

    @Test
    public void validatePhoneNumber(){
        String phoneNumber = "0704406892";
        boolean result = RegularExpress.validatePhoneNumber(phoneNumber);
        assertTrue(result);
    }
}
