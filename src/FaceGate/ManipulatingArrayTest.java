package FaceGate;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ManipulatingArrayTest {
@Test
    public void test(){
   int [] sample = {45, 22, 33, 11, 12, 15};
   int [] expected = {22, 45, 11, 33, 15, 12};
   assertEquals(1,ManipulatingArray.checkIfArrayLengthIsEven(sample));
   assertTrue(Arrays.equals(expected, ManipulatingArray.swapArray(sample)));

}
@Test
    public void testCheck2(){
    int [] sample = {45, 22, 33, 11, 12, 15};
    int [] expected = {45, 22, 11, 33, 12, 15};
    assertEquals(1, ManipulatingArray.checkIfArrayLengthIsEven(sample));
    assertTrue(Arrays.equals(expected,ManipulatingArray.check2(sample)));
}

@Test
    public void testDoNotReverse(){
    int [] sample = {45, 22, 33, 11, 12, 15};
    int [] expected = {15, 12, 33, 11, 22, 45};
    assertEquals(1,ManipulatingArray.checkIfArrayLengthIsEven(sample));
    assertTrue(Arrays.equals(expected,ManipulatingArray.doNotReverse(sample)));
    Arrays.equals(sample,expected);
}
}