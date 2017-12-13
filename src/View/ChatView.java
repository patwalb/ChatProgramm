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
   * @return the taSend
   */
  public javax.swing.JTextArea getTaSend()
  {
    return taSend;
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
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    tfIP = new javax.swing.JTextField();
    jScrollPane3 = new javax.swing.JScrollPane();
    taReceive = new javax.swing.JTextArea();
    jPanel1 = new javax.swing.JPanel();
    tfInput = new javax.swing.JTextField();
    jButton3 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jToolBar1.setRollover(true);

    jButton1.setText("ServerMode");
    jButton1.setFocusable(false);
    jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jToolBar1.add(jButton1);

    jButton2.setText("ClientMode");
    jButton2.setFocusable(false);
    jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jToolBar1.add(jButton2);

    jLabel1.setText("IP-Adresse");
    jToolBar1.add(jLabel1);

    tfIP.setText("127.0.0.1");
    jToolBar1.add(tfIP);

    getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

    taReceive.setColumns(20);
    taReceive.setRows(5);
    jScrollPane3.setViewportView(taReceive);

    getContentPane().add(jScrollPane3, java.awt.BorderLayout.CENTER);

    tfInput.setColumns(20);
    tfInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    tfInput.setToolTipText("");
    tfInput.setAlignmentX(0.1F);
    jPanel1.add(tfInput);

    jButton3.setText("Send!");
    jButton3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jPanel1.add(jButton3);

    getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

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
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JToolBar jToolBar1;
  private javax.swing.JTextArea taReceive;
  private javax.swing.JTextField tfIP;
  private javax.swing.JTextField tfInput;
  // End of variables declaration//GEN-END:variables
}
