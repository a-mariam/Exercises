package FunctionalInterface;
//It's a funtional interface that take something and does not return anything

import java.util.Set;

public class Consumers {
    public static void main(String[] args) {
        Set<Integer> set =  Set.of(12, 3,33, 47, 44);
       // Consumer<String> consumer = (x) -> System.out.println(x);
        set.forEach(Consumers::consume);
        set.forEach(System.out::println);
    }
    public static void consume(Integer integer){
        int i = integer + 1;
    }
}
