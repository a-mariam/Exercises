package Chapter15.products;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class items {
    public static void main(String[] args) {



    }
    public static String readProduct(){
    String location = "C:\\Users\\mariam\\IdeaProjects\\untitled\\src\\Chapter15\\products\\product.json";
    Path path = Path.of(location);
    try(BufferedReader reader = Files.newBufferedReader(path)){
        Stream<String> content = reader.lines();
        String collect = content.collect(Collectors.joining());
        return collect;
    }catch (IOException ex){
        return "ERROR:: " + ex.getMessage();
    }
    }
    public static void updateProduct(int productId, String patch){
        String product = readProduct();
        String [] tokens = product.split("}, ");
        String searchPattern = "\"id\": " + productId;
        for(int index = 0; index < tokens.length; index++){
            if(tokens[index].contains(searchPattern)){
                tokens[index] = patch;
            }
        }
        String updatedProductList = String.join("},", tokens);
        System.out.println(updatedProductList);
        saveProducts(updatedProductList);

    }

    private static void saveProducts(String product) {
        String location = "C:\\Users\\mariam\\IdeaProjects\\untitled\\src\\Chapter15\\products\\product.json";
        Path path = Path.of(location);
        try (OutputStream outputStream = Files.newOutputStream(path)){
            byte [] content = product.getBytes();
            outputStream.write(content);
        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }
    }


}
