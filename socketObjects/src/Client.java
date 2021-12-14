
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client  {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost" , 1234);
        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your id");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your vehicle type");
        String type = scanner.nextLine();
        System.out.println("Enter your vehicle manufacturer");

        String man = scanner.nextLine();
        //setting data entered from keyboard  into object
        Vehicle vehicle1 = new Vehicle(id,type,man);
        //sending object to client
        oos.writeObject(vehicle1);
        System.out.println("message transmitted");
        InputStreamReader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);
        // receiving the response from server
        String response = br.readLine();
        System.out.println(response);



    }
}
