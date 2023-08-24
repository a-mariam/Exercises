package Chapter15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.nio.file.Files.newBufferedReader;
import static java.nio.file.Files.newBufferedWriter;

public class PathAndPaths {
    public static void main(String[] args) throws IOException {

        String locationPath = "C:\\Users\\mariam\\Desktop\\Files.txt";
        String content = """
                This is created on the 21t august 2023 
                please understand reading
                and writing into a files ,
                creat array of character""";
        Path path = Path.of(locationPath);
        System.out.println("Path:: " + path);
        char[] chars = new char[content.length()];
        try {
            Files.write(path, content.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);

        }

        try (BufferedReader bufferedReader = newBufferedReader(path)) {
            bufferedReader.read(chars);
            System.out.println(Arrays.toString(chars));
            System.out.println();
        } catch (IOException ex) {

        }

        System.out.println();
        System.out.println("Using readline   ");
        // Read from a file using readline method
        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            String firstLine = bufferedReader.readLine();
            System.out.println(firstLine);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

        System.out.println();
        System.out.println("Using method line, returns a stream");
        // Read from a file using method line which returns a stream of string\
        try(BufferedReader bb = Files.newBufferedReader(path)) {
            Stream<String> contents = bb.lines();
            contents.forEach(System.out::println);
        }catch (IOException ex){

        }
        // Writing to a file

        try(var writer = Files.newBufferedWriter(path)){
            writer.write("Celebrated 000");
            writer.append(content);
            writer.newLine();
        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }

        //Looping through a directory to get stream that point to  each files in a directory
        String directory = "C:\\Users\\mariam\\Desktop\\";
            try(DirectoryStream<Path> paths= Files.newDirectoryStream(Path.of(directory))){
            paths.forEach(System.out::println);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    //Creating a file in a from a path
    String directorys = "C:\\Users\\mariam\\Desktop\\";
    Path path1 = Path.of("C:\\Users\\mariam\\Desktop\\filesLearning");
//    try(DirectoryStream<directorys> pathss = Files.newDirectoryStream(Path.of(directorys))){
//
//    }catch(IOException ex){
//        System.out.println(ex.getMessage());
//    }

    }