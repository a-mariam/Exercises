package Chapter15;

import java.io.*;
import java.util.Arrays;

public class TypeOfStreams  {
    private static final String DATABASE_LOCATION = "C:\\Users\\mariam\\IdeaProjects\\untitled\\src\\Chapter15\\post.txt";
    public static void main(String[] args) {
        //Byte base Streams
        //Input a byte base anyone that ends with stream is byte base. Old way of reading from a file
       try(FileInputStream readFromAFile = new FileInputStream("C:\\Users\\mariam\\Documents\\New Text Document.json")){
        byte[] content =  readFromAFile.readAllBytes();
           System.out.println(Arrays.toString(content));
           for(byte byt: content){
               System.out.print(Character.toString(byt));
           }
       }catch (IOException ex){
           System.out.println(ex.getMessage());
       }
        System.out.println();

       // Using DataInputStream
        //Making a program write to a file from the console
        try(
                // Creating a input stream that reads from the keyboard(System.in)
                DataInputStream dataInputStream = new DataInputStream(System.in);
                //Creating a output Stream that outputs data to the file pointed to by DATABASE_LOCATION
        FileOutputStream fileOutputStream = new FileOutputStream(DATABASE_LOCATION)){ ;
            //Prompt User to say what's on their mind
           System.out.println("What's on your mind");
           //Using the input stream object (dataInputStream to read 30 bytes of input from the keyboard)
            byte [] userInput = dataInputStream.readNBytes(30);
            //output data read from the keyboard to the terminal
            fileOutputStream.write(userInput);
//            fileOutputStream.flush();
            //write data to the file pointed to by fileOutputStream
            fileOutputStream.write("\n".getBytes());
            System.out.println(Arrays.toString(userInput));
        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}
