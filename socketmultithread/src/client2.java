import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class client2 {

    public static void main(String[] args) {


        try {
            Scanner scanner = new Scanner(System.in);
            Socket s = new Socket("localhost" , 1234);
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            while (true){
                InputStreamReader reader = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(reader);
                String message = br.readLine();
                System.out.println(message);
                String name = scanner.nextLine();
                PrintWriter writer  = new PrintWriter(os,true);
                writer.println(name);
                break;
            }
            scanner.close();
            is.close();
            os.close();




        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
