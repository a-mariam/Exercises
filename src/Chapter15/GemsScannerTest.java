package Chapter15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GemsScannerTest {
    @Test
    public void test() {
    GemsScanner scanner = new GemsScanner(System.in);
    var in = scanner.next();
}

}