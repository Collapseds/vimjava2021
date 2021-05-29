import java.io.*;

public class WriteAFile{

  public static void main(String[] args){
    try {
      FileWriter write = new FileWriter("World.txt");
      write.write("hello world!");
      write.close();
    } catch(IOException e){
      e.printStackTrace();
    }
  }
}
