package Transmitter;

import OhmLogger.OhmLogger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Logger;

public class Transmitter extends Observable implements Runnable
{

    private static Logger lg = OhmLogger.getLogger();
    private static final int PORT = 35000;
    private String ipAddress;
    private boolean isServer;

    public Transmitter() throws IOException
    {
//    //Empfänger
//    
//    Socket s = new Socket(IP_ADRESSE, PORT); // Achtung blockiert
//    lg.info("Client: Verbindung hergestellt");
//    
//    out.println("Hallo Du Server: Du ich bin der Client");
//    out.flush(); //wirklich absenden
//    
//    //ende empfänger änderungen 
//    
//    ServerSocket sSocket = new ServerSocket(PORT);
//    lg.info("Server: Warte auf Verbindung");
// //   Socket s = sSocket.accept(); // Achtung blockiert; sollte in Thread
//    lg.info("Server: Verbindung akkzeptiert");
//    InputStream iStream = s.getInputStream();
//    OutputStream oStream = s.getOutputStream();
//    
//    InputStreamReader isr = new InputStreamReader(iStream, "UTF-8");
//    OutputStreamWriter osr = new OutputStreamWriter(oStream, "UTF-8");
//    
//    BufferedReader in = new BufferedReader(isr);
//    PrintWriter out = new PrintWriter(osr);
//    lg.info("Server: Stream initialisiert");
//    lg.info("Server: Warte auf Nachricht");
//    
//    String nachricht = in.readLine(); //Achtung blockiert
//    lg.info("Server: Nachricht empfangen");
//    
//    System.out.println("Server: Nachricht empfangen:" + nachricht);
//    
//    out.println("Server: ich habe die Nachricht erhalten");
//    lg.info("Server: Quittung versendet");
//    out.flush(); //wirklich absenden
//    out.close();
//    in.close();
    }

    @Override
    public void run()
    {
    }

    public String getNachricht()
    {
        return "";
    }

    public void sendNachricht(String message)
    {

    }
    
    public void setIdentity(boolean isServer, String ipAdress)
    {
        this.isServer = isServer;
        this.ipAddress = ipAdress;
        lg.info("I am a Server :" + isServer +" I want to communicate with: " + ipAdress);
    }

}
