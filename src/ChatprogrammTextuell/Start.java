package ChatprogrammTextuell;

import Adapter.ReceiveAdapter;
import Controller.ConnectController;
import Controller.SendController;
import MyLogger.MyLogger;
import Transmitter.Transmitter;
import View.ChatView;
import java.io.IOException;
import java.util.logging.Logger;

public class Start
{

    private static Logger lg = MyLogger.getLogger();

    public Start()
    {
        ChatView view = new ChatView();
        view.setVisible(true);
        try
        {
            Transmitter transmitter = new Transmitter();
            ConnectController connectCtrl = new ConnectController(view, transmitter);
            SendController sendCtrl = new SendController(view, transmitter);
            ReceiveAdapter recAdapter = new ReceiveAdapter(view, transmitter);

            transmitter.addObserver(recAdapter);

            connectCtrl.registerEvents(); // im try block, da es von einem Exc. Wurf abhängig ist
            sendCtrl.registerEvents();
        }
        catch (IOException ex)
        {
            lg.severe("IOException: " + ex.toString());
        }
    }

    public static void main(String[] args)
    {
        new Start();
    }
}
