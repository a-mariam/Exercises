package LambdaAndStream;

import java.util.Comparator;
import java.util.List;

public class Sorts {
    public static void main(String[] args) {
        List<Integer> num = List.of(23,-3,3,11,0,33,-3);

            List<Integer> LIS = num.stream()
                                  .sorted(Comparator.reverseOrder())
                                  .toList();

        System.out.println(LIS);
    }
}
