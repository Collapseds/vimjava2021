package com.socket.client;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;
public class DailyAdviceClient{
            String chatToserver;
            Scanner inChat = new Scanner(System.in);
    public void start(){
        try{
            Socket chatSocket = new Socket("120.26.87.64", 1456);

            chatToserver = inChat.nextLine();
            PrintWriter writer = new PrintWriter(chatSocket.getOutputStream());
            writer.println(chatToserver);
            InputStreamReader streamReader = new InputStreamReader(chatSocket.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);

            String advice = reader.readLine();
            reader.close();

            System.out.println(advice);

            chatSocket.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args){
        new DailyAdviceClient().start();
    }
}

