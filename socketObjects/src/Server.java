import java.io.*;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //server listening and will accept connection to client when it will be created
        ServerSocket ss = new ServerSocket(1234);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        InputStreamReader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);
        PrintWriter writer  = new PrintWriter(os,true);
        ObjectInputStream ois = new ObjectInputStream(is);
        //read an object received from client
        System.out.println("object message received");
        Vehicle vehicle = (Vehicle) ois.readObject();
        // extracting fields from object and sending response as a sentence
        String response = "Your vehicle is  a "+vehicle.getManufacturer()+" "+vehicle.getType() +" that has an id of "+ vehicle.getId();
        System.out.println("response sent to client");
        writer.println(response);

    }

}
