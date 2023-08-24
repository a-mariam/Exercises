package Chapter15;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GemsScanner {
private final InputStream inputStream;
public GemsScanner(InputStream inputStream){
    this.inputStream = inputStream;
}
public  String  next(){
    List<Integer> content = new ArrayList<>();
    try {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        int c = bufferedReader.read();

        //32 is code of whiteSpace
        while (c != 32){
          //  c=(char)bufferedReader.read();
            if(content.isEmpty())content.add(c);

            c=bufferedReader.read();
            // 10 is the code for newLine character
            if(c==10)break;
            content.add(c);
        }
        return parseContent(content);
    }catch (Exception ex){
        throw new RuntimeException(ex);
    }

}

    private String parseContent(List<Integer> content) {
    StringBuilder result = new StringBuilder();
    for (Integer token: content){
        result.append(Character.toString(token));
    }
    return result.toString();
    }
    public String nextLine(){
    try{
        return new BufferedReader(new InputStreamReader(inputStream))
                .readLine();
    }catch (Exception ex){
        throw new RuntimeException(ex);
    }
    }
    public int nextInt(){
    return Integer.parseInt(next());
    }

}
