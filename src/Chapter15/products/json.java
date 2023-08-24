 package Chapter15.products;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

 public class json {
    public static void main(String[] args) {

        String location = "C:\\Users\\mariam\\IdeaProjects\\untitled\\src\\Chapter15\\products.txt";
        String content = """
              {
              {"name": "mill",
              "price": 50.00,
              "quality": 100,
              "id": 12}
              }""";
        char [] array = new char[content.length()];
        Path path = Path.of(location);
        try{
            Files.write(path, content.getBytes());
        }catch (IOException ex){
        }
      try(BufferedReader reader = Files.newBufferedReader(path)){
          reader.read(array);
          System.out.println(array);
          //System.out.println(Arrays.toString(array));
      }catch (IOException ex){

      }
      String con = """
              {
              {"name": "milk",
              "price": 50,
              "quality": 100,
              "id": 2}
              }""";
     try(FileWriter writer = new FileWriter("C:\\Users\\mariam\\IdeaProjects\\untitled\\src\\Chapter15\\products.txt")){
         writer.append(con);
         writer.flush();
     }catch (IOException ex){

     }
        try(BufferedReader reader = Files.newBufferedReader(path)){
            reader.read(array);
            //System.out.println(Arrays.toString(array));
            System.out.println(array);
        }catch (IOException ex){

        }
        //try(FileDe)
   }
}
