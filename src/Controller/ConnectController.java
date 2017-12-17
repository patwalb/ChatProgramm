package Controller;

import MyLogger.MyLogger;
import Transmitter.Transmitter;
import View.ChatView;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class ConnectController implements ActionListener
{

    private static Logger lg = MyLogger.getLogger();
    private ChatView view;
    private Transmitter transmitter;
    private static final int PORT = 35000;

    public ConnectController(ChatView view, Transmitter transmitter)
    {
        this.view = view;
        this.transmitter = transmitter;
    }

    public void registerEvents()
    {
        view.getBtnServerMode().addActionListener(this);
        view.getBtnClientMode().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == view.getBtnServerMode())
        {
            view.setTitle("Server");
            view.getBtnServerMode().setBackground(new Color(61, 219, 82));
            view.getBtnServerMode().setEnabled(false);
            view.getBtnClientMode().setEnabled(false);
            view.getTfIP().setEditable(false);

            try
            {
                ServerSocket listener = new ServerSocket(PORT);
                Socket socket = listener.accept();
                transmitter.initSocket(socket);
                transmitter.start();
            }
            catch (IOException ex)
            {
                lg.severe("IO Exception: " + ex.toString());
            }
        }
        else if (e.getSource() == view.getBtnClientMode())
        {
            view.setTitle("Client");
            view.getBtnClientMode().setBackground(new Color(61, 219, 82));
            view.getBtnServerMode().setEnabled(false);
            view.getBtnClientMode().setEnabled(false);
            view.getTfIP().setEditable(false);

            try
            {
                Socket socket = new Socket(view.getTfIP().getText(), PORT);
                transmitter.initSocket(socket);
                transmitter.start();
            }
            catch (IOException ex)
            {
                lg.severe("IO Exception: " + ex.toString());
            }
        }
        else
        {
            lg.severe("Neither client nor server!");
        }
    }
}
