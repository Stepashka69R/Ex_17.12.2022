package org.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket server;
        try {
            server = new ServerSocket(6660);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Сервер запущен");

        while (true)
            try (Socket socket = server.accept();
                 BufferedWriter writer = new BufferedWriter(
                         new OutputStreamWriter(
                                 socket.getOutputStream()));
                 BufferedReader reader = new BufferedReader(
                         new InputStreamReader(
                                 socket.getInputStream()))) {

                String request = reader.readLine();
                writer.write("Discriminant_Formula");
                writer.newLine();
                writer.flush();

                System.out.println("Клиент");
                System.out.println(request);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }catch (IOException e) {
            throw new RuntimeException(e);
    }
}