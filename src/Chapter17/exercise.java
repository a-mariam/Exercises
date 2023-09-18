package Chapter17;

import java.lang.reflect.Array;
import java.util.Arrays;

public class exercise {
    public int [] swap(int [] array , int index1, int index2){
        if(index1 > array.length ||  index2 > array.length ){
            return null;
        }else {
            //array[index2] = array[index1];
            array[index1] = array[index1] + array[index2];
            array[index2] = array[index1] - array[index2];
            array[index1] = array[index1] - array[index2];
            System.out.println(Arrays.toString(array));
            return array;
        }
    }
}
