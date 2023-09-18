package LambdaAndStream;

import java.util.stream.IntStream;

public class IntStreams {
    public static void main(String[] args) {
       var stream = IntStream.range(1,11);
       stream.filter((number)-> number %2 ==0)
               .forEach(System.out::println);
    }
}
