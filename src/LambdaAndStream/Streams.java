package LambdaAndStream;

import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        //Streams-> creating a stream
        Stream<Integer> number = Stream.of(12, 33, 89, 22);
//        number.forEach(System.out::println);

        List<String> names = List.of(
                "mariam",
                "mama",
                "MANY"
                  );
//        names.stream()
//             .forEach((x) -> System.out.println(x));
//
        var stream = Stream.generate(()-> "Youngiduu")
                .limit(2);
        stream.forEach(System.out::println);
    }
}
