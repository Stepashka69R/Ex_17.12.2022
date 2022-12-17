package org.example;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try(Socket socket = new Socket("127.0.0.1", 6660);
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(
                            socket.getOutputStream()));
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream()));
        )
        {
            System.out.println("Подключение");
            String request = "Tver";

            writer.write(request);
            writer.newLine();
            writer.flush();

            String responce = reader.readLine();
            System.out.println();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
