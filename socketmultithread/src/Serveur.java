import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {




    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1234);
        while (true) {

            Socket s = null;
            try {
                s = ss.accept();
                System.out.println("New connection estalished to a client");
                InputStream is = s.getInputStream();
                OutputStream os = s.getOutputStream();

                System.out.println("Assigning new thread for this client ");

                Thread t = new requestHandler(s,is,os);
                t.start();


            }catch (Exception Ex){
                s.close();
                Ex.printStackTrace();


            }


        }

    }
}
