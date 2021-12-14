import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1234);
        //server listening and will accept connection to client when it will be created
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        InputStreamReader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);

        // server send message of "enter your first name "
        PrintWriter writer  = new PrintWriter(os,true);
        writer.println("Enter your first name :");
        //reading message received of first name
        String firstName = br.readLine();
        System.out.println("I have received the first name: "+ firstName);
        // server send message of "enter your last name "
        writer.println("Enter your last name :");
        //reading message received of last name
        String lastName = br.readLine();
        System.out.println("I have received the last name: "+ lastName);
        // sending full name to client as response
        writer.println("your full name is : "+ firstName+" "+lastName);
        System.out.println("full name response sent to client ");













    }
}
