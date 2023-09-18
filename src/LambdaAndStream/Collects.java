package LambdaAndStream;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collects {
    public static void main(String[] args) {
        List<String> list = List.of(
                "AAA", "BBBS", "EOENEJ", "IWBWHWHHW"
        );
        Function<String , String> keyMapper = (word)-> (word);
        Function<String , Integer> valueMapper = (word)-> (word.length());
        BinaryOperator<Integer> mergeFunction = (first, second) ->(first + second);



        var res = list.stream()
                .peek((x)-> System.out.println(x))
                .collect(Collectors.toMap(keyMapper,valueMapper));


        List<String> lists = List.of(
                "AAA", "BBBS", "EOENEJ", "IWBWHWHHW",
                "AAA", "BBBS", "EOENEJ", "IWBWHWHHW"
        );
        var ress = list.stream()
                .peek((x)-> System.out.println(x))
                .collect(Collectors.toMap(keyMapper,valueMapper,mergeFunction));
        System.out.println(res);
    }
}
