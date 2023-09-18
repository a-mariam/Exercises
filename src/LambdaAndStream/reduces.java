package LambdaAndStream;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reduces {
    //reduce works only on primitive
    public static void main(String[] args) {


        Arrays.stream(new int[]{2, 3, 4, 5, 6, 6, 6})
                .reduce(1, (x,y)->x *y);
    }
}
