package FunctionalInterface;

public class ImplementFunctionalInterface {
    public static void main(String[] args) {


        Animal animal = (steps) -> {
            return "i am walking " + steps + " steps";
        };
        animal.move(2);
    }
}
