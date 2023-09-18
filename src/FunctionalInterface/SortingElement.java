package FunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.StreamSupport;

public class SortingElement {
    public static void main(String[] args) {
   Comparator<String> comparator = (first, second)->{
       return second.compareTo(first);
   };
   //Compare is used to define the natural order
   //Immutable list
        List<String>  words = List.of("Hello", "Hey", "Yungidu","Hola");
        List<String> greetings  = new ArrayList<>(words);
        System.out.println("Before :: " + greetings);
        Collections.sort(greetings, comparator);
        System.out.println("After :: "+ greetings);


    }
}
