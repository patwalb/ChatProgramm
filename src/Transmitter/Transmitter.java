package Transmitter;

import MyLogger.MyLogger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Transmitter extends Observable implements Runnable
{

    private static Logger lg = MyLogger.getLogger();
    private BufferedReader in;
    private PrintWriter out;
    private Thread t;

    public Transmitter() throws IOException
    {
        in = null;
        out = null;
    }

    public void getMessage()
    {
        String message = null;
        {
            lg.info("Server: Waiting for message ...");

            try
            {
                message = in.readLine();
            }
            catch (IOException ex)
            {
                lg.severe("IOException: " + ex.toString());
            }
        }
        synchronized (this)
        {
            if (message == null)
            {
                try
                {
                    wait();
                }
                catch (InterruptedException ex)
                {
                    Logger.getLogger(Transmitter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        message = "Stranger: " + message;

        if (countObservers() > 0)
        {
            setChanged();
            notifyObservers(message);
        }

    }

    public void sendMessage(String message) throws IOException
    {
        lg.info("Got message to send: ");
        lg.info("\"" + message + "\"");

        out.println(message);
        out.flush();
        lg.info("message sended");

        if (countObservers() > 0)
        {
            message = "Me: " + message;
            setChanged();
            notifyObservers(message);
        }
    }

    @Override
    public void run()
    {
        System.out.println("Starting Thread ");

        while (true)
        {
            getMessage();
        }
    }

    public void start()
    {
        if (t == null)
        {
            t = new Thread(this);
            t.start();
        }
    }

    public void initSocket(Socket socket)
    {
        try
        {
            InputStream iStream = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(iStream, "UTF-8"); // byte in character strom
            in = new BufferedReader(isr);
            
            OutputStream oStream = socket.getOutputStream();
            OutputStreamWriter osr = new OutputStreamWriter(oStream, "UTF-8");
            out = new PrintWriter(osr);//printwriter hat println und print lf im gegensatz zum buffered writer 
        }
        catch (IOException ex)
        {
            lg.severe("IOException: " + ex.toString());
        }
    }
}
