package Chapter17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class exerciseTest {
    @Test
    public void text(){
        exercise ex = new exercise();
        int []  array = {1, 7, 3, 8,4};
      int [] a =  ex.swap(array, 2,1);

    }

}