import java.io.*;
import java.net.*;
import java.util.*;

/*
To kiil server : kill $(ps -ef | grep java | awk '{print $2}')
 */


public class QueueServer {

    public static void main(String[] args){
        int port = 8888;

        try {

        ServerSocket ss = new ServerSocket(port);
            for (;;) {
                Socket client = ss.accept();



                // Get input and output streams to talk to the client
                BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                System.out.println("Request: " + in);

             //   BufferedWriter out = new BufferedWriter(
               //         new OutputStreamWriter(client.getOutputStream()));
               // System.out.println("Response: " +  out);

                PrintStream out = new PrintStream(new BufferedOutputStream(client.getOutputStream()));
                String request = in.readLine();

                System.out.println(request);


                String line;
                while ((line = in.readLine()) != null) {
                    if (line.length() == 0)
                        break;
                  System.out.println(line);
                }
                out.close(); // Flush and close the output stream
                in.close(); // Close the input stream
                client.close(); // Close the socket itself

            }



         //   System.out.println(ss);

        } catch(Exception e){
            System.err.println(e);
            System.err.println("Issue with queueServer:" + port);
        }








    }



}
