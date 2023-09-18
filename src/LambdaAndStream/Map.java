package LambdaAndStream;

import java.util.List;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) {
        //mapToInt
        //mapToLong
        //mapTODouble
        //mapToObj
        //maps takes in function that takes something and return something
        // forEach returns collect a consumer
        List<String> names = List.of(
                "mbappe ojugtcrr",
                "neymar",
                "ronaldo"
        );
        Stream<Integer> number = Stream.of(12, 33, 89, 22);
        names.stream()
                .filter((name) -> name.length() > 10)
                .map((name) -> new Person(name))
                .forEach(System.out::println);

        //mapToDouble
        names.stream()
              .mapToDouble((name)-> name.length() * 1.0)
              .forEach(System.out::println);

        //number.mapMultiToDouble((number) -> number.length)
    }
}
