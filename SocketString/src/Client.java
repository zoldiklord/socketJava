import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        // create client and establish the connection to server which is local in our case
        Socket s = new Socket("localhost" , 1234);
        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();
        InputStreamReader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);
        String message = br.readLine();
        // receive the message of "Enter your first name " from server and printing it
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();


        // send first name to server
        PrintWriter writer = new PrintWriter(os,true);
        writer.println(firstName);
        // receive the message of "Enter your last name " from server and printing it
        message = br.readLine();
        System.out.println(message);

        String lastName = scanner.nextLine();
        // send last name to server
        writer.println(lastName);
        // receiving the full name from server
        String response = br.readLine();
        System.out.println(response);
        scanner.close();
        writer.close();


    }
}
