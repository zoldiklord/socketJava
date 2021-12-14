import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(1234);
        System.out.println("Listening to port 1234");
        Socket s = ss.accept();
        System.out.println("I have accepted the connection");
        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();
        int nb = is.read();
        System.out.println("I received the number : "+ nb);
        int rep = nb * 2;
        os.write(rep);



    }


}
