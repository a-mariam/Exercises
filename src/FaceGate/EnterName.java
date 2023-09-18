package FaceGate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EnterName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter your name");
            String name = scanner.nextLine();
            if(scanner.nextLine().equals("")){
                System.out.println("Please enter a name");
                name = scanner.nextLine();
            }
            System.out.println("Hello " +  name);
        }catch (InputMismatchException ex){
            System.out.println("Enter a number");
        }

    }
}
