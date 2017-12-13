package Controller;

import OhmLogger.OhmLogger;
import Transmitter.Transmitter;
import View.ChatView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

public class ConnectController implements ActionListener
{
  private ChatView view;
  private Transmitter transmitter;
  
  private static Logger lg = OhmLogger.getLogger();
  
  public ConnectController(ChatView view, Transmitter transmitter)
  {
    this.view = view;
    this.transmitter = transmitter;

  }
  
  public void registerEvents()
  {
    view.getBtnServer().addActionListener(this);
    view.getBtnClient().addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource() == view.getBtnServer())
    {
      //tell transmitter to be Server
    }
    else if(e.getSource() == view.getBtnClient())
    {
      //tell transmitter to be Client 
    }
    else
    {
      lg.warning("Weder Server noch Client gewählt");
    }
  }
}
