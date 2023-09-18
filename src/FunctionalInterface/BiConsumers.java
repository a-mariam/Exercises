package FunctionalInterface;

import java.util.Map;
import java.util.function.BiConsumer;
public class BiConsumers {
    public static void main(String[] args) {
        BiConsumer<String , Integer> biConsumer = (key, value) -> System.out.println(value);
        Map<String , Integer> map = Map.of("ABC", 10, "ASE", 20);
        map.forEach(biConsumer);
        map.forEach((key, value) -> System.out.println(key + value));
    }
}
