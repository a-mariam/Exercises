package FaceGate;

import java.util.Arrays;

public class ManipulatingArray {
    public static int checkIfArrayLengthIsEven(int [] array){
        if (array.length % 2 == 0){
            return 1;
        } else {
            return -1;
        }
    }
    public static int[] swapArray(int [] array){
        if (checkIfArrayLengthIsEven(array) == 1) {
            for (int count = 0; count < array.length; count++) {
                if (count % 2 != 0) {
                    int c = array[count];
                    array[count] = array[count -1] ;
                    array[count - 1] = c;

                }
            }
            System.out.println(Arrays.toString(array));
            return array;
        }
            return null;

    }
    public static int [] checkEach(int [] array){
        int [][] arrays = new int[array.length][2];
        if (checkIfArrayLengthIsEven(array) == 1){
            for (int rows = 0; rows < arrays.length; rows++){
               for (int column = 0;column < arrays[rows].length;column++ ){
                   arrays[rows][column] += array[rows];
               }
            }
            System.out.println(Arrays.deepToString(arrays));
            for (int rows = 0; rows < arrays.length; rows++){
                for (int column = 0;column < arrays[rows].length;column++ ){
                    if (column % 2 != 0 && (column + 1) % 2 != 0){
                        int c = arrays[rows][column];
                        arrays[rows][column] = arrays[rows][column + 1];
                        arrays[rows][column] = c;
                    }
                    array[rows] += arrays[rows][column];
                }

            }

        }
        System.out.println(Arrays.toString(array));
        return array;
    }
    public static int []  check2(int [] array){
        if (checkIfArrayLengthIsEven(array) == 1){
            for (int count = 0; count < array.length - 1; count++){
                if (array[count] % 2 != 0 && array[count + 1] % 2 != 0){
                    int c = array[count];
                    array[count] = array[count + 1];
                    array[count + 1] = c;
                }
            }
            System.out.println(Arrays.toString(array));
            return array;
        }
        return null;
    }
    public static int[] doNotReverse(int [] array){
        if (checkIfArrayLengthIsEven(array) == 1){
            //System.out.println(Arrays.toString(array));
           // for (int count = 0; count < array.length; count++){
                int last = array[array.length -1];
                int seLast = array[array.length -2];
                int first = array[0];
                int second = array[1];
                array[0] = last;
                array[1] = seLast;
                array[array.length -1] = first;
                array[array.length -2] = second;
           // }
            System.out.println(Arrays.toString(array));
            return array;
        }
        return null;
    }
}
