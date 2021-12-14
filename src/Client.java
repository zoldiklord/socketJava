import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost" , 1234);
        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : \n");
        int nb = scanner.nextInt();
        os.write(nb);
        int rep = is.read();
        System.out.println("Le double de "+ nb + " est "+rep);
    }
}
