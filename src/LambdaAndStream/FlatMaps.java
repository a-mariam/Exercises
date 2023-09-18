package LambdaAndStream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class FlatMaps {
    // FlatMap returns all eleme
    public static void main(String[] args) {
        List<List<Integer>> containers = List.of(
                List.of(12, 34, 45, 67),
                List.of(34, 87, 90, 56),
                List.of(34, 67, 67)
        );
        String b = "";


        int sum = containers.stream()
                .flatMap(Collection::stream)//flatMap((container)->container.stream())
                .reduce(0, (num, num2) -> num + num2);

        System.out.println(sum);
        Set<String> words = Set.of(
                "aydbu",
                "aygy",
                "uwuiwi"
        );
        int summ = containers.stream()
                           .flatMapToInt((container)->container.stream().mapToInt(x->x))
                .sum();
      var letter =  words.stream()
             .flatMap((word)-> Arrays.stream(word.split("")))
             .count();

        System.out.println(letter);
    }
}