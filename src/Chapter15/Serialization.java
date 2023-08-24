package Chapter15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class Serialization {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\mariam\\IdeaProjects\\untitled\\src\\Chapter15\\character.txt";
        char[] contact =  new char[43];
        try (FileReader fileReader = new FileReader(fileLocation)){
            fileReader.read(contact);
        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}
