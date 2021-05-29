import java.io.*;
import java.net.Socket;

public class clientSocket{
  public static void main(String[] args){
    try{
    Socket chatSocket = new Socket("120.26.87.64", 5000);
    PrintWriter writer = new PrintWriter(chatSocket.getOutputStream());
    writer.println("message to send");
    writer.print("another message");
    chatSocket.close();
    }catch(IOException ex){
      ex.printStackTrace();
    }
  }
}
