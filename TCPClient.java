import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 5000;

        try (Socket socket = new Socket(host, port);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                Scanner sc = new Scanner(System.in)) {

            System.out.println("Connected to server.");

            String message;
            do {
                System.out.print("Enter message (type 'exit' to quit): ");
                message = sc.nextLine();
                out.println(message); // send to server
                System.out.println("Server response: " + in.readLine()); // read from server
            } while (!message.equalsIgnoreCase("exit"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

