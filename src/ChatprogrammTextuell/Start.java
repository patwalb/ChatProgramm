package ChatprogrammTextuell;

import Controller.ConnectController;
import Controller.SendController;
import Transmitter.Transmitter;
import View.ChatView;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Start
{

    public Start()
    {
        ChatView view = new ChatView();
        view.setVisible(true);
        try
        {
            Transmitter transmitter = new Transmitter();
            ConnectController connectCtrl = new ConnectController(view, transmitter);
            SendController sendCtrl = new SendController(view, transmitter);
        }
        catch (IOException ex)
        {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void main(String[] args)    
    {
        new Start();
    }
}
