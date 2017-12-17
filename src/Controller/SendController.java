package Controller;

import MyLogger.MyLogger;
import Transmitter.Transmitter;
import View.ChatView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Logger;

public class SendController implements ActionListener
{

    private static Logger lg = MyLogger.getLogger();
    private ChatView view;
    private Transmitter transmitter;

    public SendController(ChatView view, Transmitter transmitter)
    {
        this.view = view;
        this.transmitter = transmitter;
    }

    public void registerEvents()
    {
        view.getBtnSend().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            transmitter.sendMessage(view.getTfSend().getText());
            view.getTfSend().setText("");
            view.getTfSend().requestFocus();
        }
        catch (IOException ex)
        {
            lg.severe("IOException: " + ex.toString());
        }
    }
}
