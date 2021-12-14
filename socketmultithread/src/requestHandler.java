import java.io.*;
import java.net.Socket;

public class requestHandler extends Thread  {
     final InputStream is;
     final OutputStream os;
     final Socket s;

     public requestHandler(Socket s,InputStream is,OutputStream os){
         this.s=s;
         this.is=is;
         this.os=os;
     }

    @Override
    public void run() {

         while(true){
             try {
                 // asking the client to enter their name
                 PrintWriter writer  = new PrintWriter(os,true);
                 writer.println("What is your name ? ");
                  // receiving the name and printing it
                 InputStreamReader reader = new InputStreamReader(is);
                 BufferedReader br = new BufferedReader(reader);
                 String message = br.readLine();
                 System.out.println("the name of this client is : "+ message);
                  break;
             }catch(Exception e){
                 e.printStackTrace();

             }

         }
    }
}
