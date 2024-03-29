/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Uglybear
 */
public class bankUI extends javax.swing.JFrame {

    String currentPin = "", currentName = "", targetPin = "";
    double currentBalance = 0.0;
    Connection connection = null;
    
    /**
     * Creates new form bankUI
     */
    public bankUI() {

        initComponents();
    }

    public void setCustomerPinNumber(String pinNumber)
    {
        this.currentPin = pinNumber;
    }
    
    public void setCustomerName(String name)
    {
        this.currentName = name;
    }
    
    public void setCustomerBalance (double balance)
    {
        this.currentBalance = balance;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonTransfer = new javax.swing.JButton();
        accountLabel = new javax.swing.JLabel();
        balanceFigure = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        pinLabel = new javax.swing.JLabel();
        buttonLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        buttonTransfer.setText("Transfer");
        buttonTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTransferActionPerformed(evt);
            }
        });

        accountLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        accountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountLabel.setText("Account");

        balanceFigure.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        balanceFigure.setText("00.00");

        balanceLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        balanceLabel.setText("Current Balance");

        nameLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("jLabel1");

        pinLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        pinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pinLabel.setText("jLabel1");

        buttonLogout.setText("Logout");
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(balanceLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pinLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(balanceFigure)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(accountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(nameLabel)
                .addGap(18, 18, 18)
                .addComponent(pinLabel)
                .addGap(18, 18, 18)
                .addComponent(balanceLabel)
                .addGap(18, 18, 18)
                .addComponent(balanceFigure)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTransferActionPerformed

        transferUI transferInterface = new transferUI();
        
        transferInterface.setCustomerPinNumber(currentPin);
        transferInterface.setCustomerName(currentName);
        transferInterface.setCustomerBalance(currentBalance);
        
        transferInterface.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_buttonTransferActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      
        // Setup onscreen information
        nameLabel.setText( currentName );
        pinLabel.setText( currentPin );
        balanceFigure.setText(Double.toString( currentBalance ) );
        
    }//GEN-LAST:event_formWindowActivated

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed
        bankLogin loginInterface = new bankLogin();
        
        loginInterface.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bankUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bankUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bankUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bankUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bankUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountLabel;
    private javax.swing.JLabel balanceFigure;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonTransfer;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel pinLabel;
    // End of variables declaration//GEN-END:variables
}
