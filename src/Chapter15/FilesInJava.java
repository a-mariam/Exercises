package Chapter15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesInJava {
    public static void main(String[] args) {
        //Path is an interface that java provides. it is used to point to path of an object in the computer
        //Paths => contains methods that helps create method with two versions that helps create object of the interface Path.
//        Paths path = Paths.get(origin);
//        System.out.println(path.getFileSystem());
//        System.out.println(path.normalize());

        String content = """
                Public class Account{
                private String name;
                private BigDecimal balance;
                System.out.println("hello world");
              
                }
               
                """;

        String location = "C:\\Users\\mariam\\Desktop\\filesLearning\\Account.java";
        String destination = "C:\\User\\mariam\\Desktop\\filesLearning\\";
        Path path = Path.of(location);
        try {
        // Path filePath = Files.createFile(path);
        Path filePath =  Files.createFile(path);
        BufferedWriter writer = Files.newBufferedWriter(filePath);
        writer.write(content);
        writer.close();
        }catch (IOException exception){
            exception.printStackTrace();
            System.err.println(exception.getMessage());
        }
    }
}
