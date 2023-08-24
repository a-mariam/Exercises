package Chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class WritingUserInputIntoAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String location = "C:\\Users\\mariam\\IdeaProjects\\untitled\\src\\Chapter15\\minds.txt";
        System.out.println("Enter you information");
        String in = scanner.nextLine();
        char[] info = new char[in.length()];
        Path path = Path.of(location);
        try {
            Files.write(path, in.getBytes());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
            throw new RuntimeException(ex);
        }

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            reader.read(info);
            System.out.println(Arrays.toString(info));
        } catch (IOException ex) {

        }
    }
}

