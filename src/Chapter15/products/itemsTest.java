package Chapter15.products;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class itemsTest {
@Test
    public void testThat_Method_Split(){
    String n = "/mam, /mama, /oioi, /oimi, ";
    String u = Arrays.toString(n.split(","));
    System.out.println(u );
    System.out.println(n.charAt(0));
}
String p = items.readProduct();
}