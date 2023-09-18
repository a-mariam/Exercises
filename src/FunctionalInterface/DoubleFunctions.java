package FunctionalInterface;

import java.util.function.DoubleFunction;

public class DoubleFunctions {
    public static void main(String[] args) {
        DoubleFunction<Boolean> doubleFunction = (x)-> {
          if(x > 20) {
              return true;
          }else {return false;}
        };
        double number = 20.0;
        System.out.println(doubleFunction.apply(number));

    }
}
