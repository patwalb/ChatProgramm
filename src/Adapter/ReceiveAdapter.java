package Adapter;

import MyLogger.MyLogger;
import Transmitter.Transmitter;
import View.ChatView;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Logger;

public class ReceiveAdapter implements Observer
{
    private static Logger lg = MyLogger.getLogger();
    
    private ChatView view;
    private Transmitter transmitter;

    public ReceiveAdapter(ChatView view, Transmitter transmitter)
    {
        this.view = view;
        this.transmitter = transmitter;
    }

    @Override
    public void update(Observable o, Object arg)
    {
        //hole nachricht aus transmitter (=model)
        String nachricht = transmitter.getNachricht();
        //zeige Nachricht an
        view.getTaReceive().append(nachricht);
    }
}
