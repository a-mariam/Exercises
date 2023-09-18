package LambdaAndStream;

import java.util.List;

public class Intermediate {
    //they take element and transform them into something else
    public static void main(String[] args) {

        List<String> names = List.of(
                "Maram",
                "HARAM",
                "chun",
                "lee "
                );
        names.stream()
                //map -> a transformation operator
             .map((name) -> name.length())
             .forEach(System.out::println);
    }
}
