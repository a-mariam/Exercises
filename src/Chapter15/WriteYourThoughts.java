package Chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class WriteYourThoughts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String location = "C:\\Users\\mariam\\IdeaProjects\\untitled\\src\\Chapter15\\Thoughts.txt";
        String v = """
                {name: mik,
                """;
        Path path = Path.of(location);
        System.out.println("Enter your thoughts");
        String thought  = scanner.nextLine();
        char [] thoughts = new char[thought.length()];
        try {
            Files.write(path, thought.getBytes());
        }catch (IOException ex){
            throw new RuntimeException(ex);
        }
        try(BufferedReader reader = Files.newBufferedReader(path)){
            reader.read(thoughts);
            System.out.println(Arrays.toString(thoughts));
            System.out.println(thoughts);

        }catch (IOException e){

        }
    }
}
