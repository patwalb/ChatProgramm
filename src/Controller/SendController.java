package Controller;

import OhmLogger.OhmLogger;
import Transmitter.Transmitter;
import View.ChatView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

public class SendController implements ActionListener
{
  private ChatView view;
  private Transmitter transmitter;
  
  private static Logger lg = OhmLogger.getLogger();
  
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
    String message = view.getTaSend().getText();
    // tell transmitter to send this message
    transmitter.sendNachricht(message);
  }
}
