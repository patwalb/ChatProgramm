/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author nobody
 */
public class ChatView extends javax.swing.JFrame
{
  /**
   * @return the btnSend
   */
  public javax.swing.JButton getBtnSend()
  {
    return btnSend;
  }

  /**
   * @return the taReceive
   */
  public javax.swing.JTextArea getTaReceive()
  {
    return taReceive;
  }

  /**
   * Creates new form ChatView
   */
  public ChatView()
  {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jToolBar1 = new javax.swing.JToolBar();
        btnServerMode = new javax.swing.JButton();
        btnClientMode = new javax.swing.JButton();
        lblIP = new javax.swing.JLabel();
        tfIP = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        taReceive = new javax.swing.JTextArea();
        sendPanel = new javax.swing.JPanel();
        tfSend = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnServerMode.setText("ServerMode");
        btnServerMode.setFocusable(false);
        btnServerMode.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnServerMode.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnServerMode);

        btnClientMode.setText("ClientMode");
        btnClientMode.setFocusable(false);
        btnClientMode.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClientMode.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnClientMode);

        lblIP.setText("IP-Adresse: ");
        jToolBar1.add(lblIP);

        tfIP.setText("127.0.0.1");
        jToolBar1.add(tfIP);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        taReceive.setColumns(20);
        taReceive.setRows(5);
        jScrollPane3.setViewportView(taReceive);

        getContentPane().add(jScrollPane3, java.awt.BorderLayout.CENTER);

        sendPanel.setLayout(new javax.swing.BoxLayout(sendPanel, javax.swing.BoxLayout.LINE_AXIS));

        tfSend.setColumns(20);
        tfSend.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfSend.setToolTipText("");
        tfSend.setAlignmentX(0.1F);
        sendPanel.add(tfSend);

        btnSend.setText("Send!");
        btnSend.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sendPanel.add(btnSend);

        getContentPane().add(sendPanel, java.awt.BorderLayout.PAGE_END);

        setBounds(0, 0, 422, 355);
    }// </editor-fold>//GEN-END:initComponents

  /**
   * @param args the command line arguments
   */
  public static void main(String args[])
  {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try
    {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
      {
        if ("Nimbus".equals(info.getName()))
        {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }
    catch (ClassNotFoundException ex)
    {
      java.util.logging.Logger.getLogger(ChatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(ChatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(ChatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(ChatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new ChatView().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientMode;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnServerMode;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblIP;
    private javax.swing.JPanel sendPanel;
    private javax.swing.JTextArea taReceive;
    private javax.swing.JTextField tfIP;
    private javax.swing.JTextField tfSend;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the btnClientMode
     */
    public javax.swing.JButton getBtnClientMode()
    {
        return btnClientMode;
    }

    /**
     * @return the btnServerMode
     */
    public javax.swing.JButton getBtnServerMode()
    {
        return btnServerMode;
    }

    /**
     * @return the tfIP
     */
    public javax.swing.JTextField getTfIP()
    {
        return tfIP;
    }

    /**
     * @return the tfSend
     */
    public javax.swing.JTextField getTfSend()
    {
        return tfSend;
    }
}
