package Chapter15.todo.Todo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WritingToList {
    public static void main(String[] args) {
        String c = """
   {
  {"name": "milk",
  "id"  : 1,
  "price": "50",
  "quantity": 10}
  }
           """;
        write(c);
    }
    public static void write(String content){
        String location = "C:\\Users\\mariam\\IdeaProjects\\untitled\\src\\Chapter15\\todo\\Todo\\todo.json";
        Path path = Path.of(location);
        char [] todo = new char[content.length()];
        try(BufferedWriter bufferedWriter = Files.newBufferedWriter(path)){
            bufferedWriter.write(todo);

        }catch (IOException ex){

        }
    }

   String c = """
   {
  {"name": "milk",
  "id"  : 1,
  "price": "50",
  "quantity": 10}
  }
           """;
}
