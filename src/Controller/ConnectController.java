package Controller;

import MyLogger.MyLogger;
import Transmitter.Transmitter;
import View.ChatView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

public class ConnectController implements ActionListener
{

    private ChatView view;
    private Transmitter transmitter;

    private static Logger lg = MyLogger.getLogger();

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
            //tell transmitter to be Server
            transmitter.setIdentity(true, view.getTfIP().getText());
            view.getBtnServerMode().setEnabled(false);
            view.getBtnClientMode().setEnabled(false);
            view.getTfIP().setEditable(false);
        }
        else if (e.getSource() == view.getBtnClientMode())
        {
            //tell transmitter to be Client
            transmitter.setIdentity(false, view.getTfIP().getText());
            view.getBtnServerMode().setEnabled(false);
            view.getBtnClientMode().setEnabled(false);
            view.getTfIP().setEditable(false);
        }
        else
        {
            lg.warning("Weder Server noch Client gewählt");
        }
    }
}
