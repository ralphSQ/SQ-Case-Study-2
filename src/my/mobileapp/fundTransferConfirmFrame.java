/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.mobileapp;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Ralph
 */
public class fundTransferConfirmFrame extends javax.swing.JFrame {

    private int clientId;
    private String firstName;
    private String fullName;
    private int targetAccountNumber;
    private String targetFullName;
    private double amount;
    
    /**
     * Creates new form fundTransferConfirmFrame
     */
    public fundTransferConfirmFrame() {
        initComponents();
    }
    public fundTransferConfirmFrame(int clientId, String firstName, String fullName, int targetAccountNumber, String targetFullName, double amount){
        this.clientId = clientId;
        this.firstName = firstName;
        this.targetAccountNumber = targetAccountNumber;
        this.fullName = fullName;
        this.targetFullName = targetFullName;
        this.amount = amount;
        initComponents();
        
        targetAccountNo.setText(String.valueOf(this.targetAccountNumber));
        receipientName.setText(this.targetFullName);
        amountLabel.setText(String.valueOf(this.amount));
        double balance =Client.getBalance(clientId);
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        String formattedBalance = format.format(balance);
        balanceLabel.setText(formattedBalance);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        targetAccountNo = new javax.swing.JLabel();
        receipientName = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        labelForAccountNo = new javax.swing.JLabel();
        labelForAmount = new javax.swing.JLabel();
        labelForName = new javax.swing.JLabel();
        labelForBalance = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fund Transfer");
        setResizable(false);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Transaction Successful");
        jLabel17.setToolTipText("");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 370, 50));

        submitButton.setBackground(new java.awt.Color(38, 166, 154));
        submitButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        submitButton.setText("Done");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel3.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, 90, 40));

        targetAccountNo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        targetAccountNo.setForeground(new java.awt.Color(0, 107, 0));
        targetAccountNo.setText("000000000");
        targetAccountNo.setMaximumSize(new java.awt.Dimension(144, 23));
        targetAccountNo.setMinimumSize(new java.awt.Dimension(144, 23));
        targetAccountNo.setPreferredSize(new java.awt.Dimension(144, 23));
        jPanel3.add(targetAccountNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 190, -1));

        receipientName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        receipientName.setForeground(new java.awt.Color(0, 107, 0));
        receipientName.setText("Receipient's Name");
        receipientName.setMaximumSize(new java.awt.Dimension(144, 23));
        receipientName.setMinimumSize(new java.awt.Dimension(144, 23));
        receipientName.setPreferredSize(new java.awt.Dimension(144, 23));
        jPanel3.add(receipientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 190, -1));

        amountLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        amountLabel.setForeground(new java.awt.Color(0, 107, 0));
        amountLabel.setText("Amount");
        amountLabel.setMaximumSize(new java.awt.Dimension(144, 23));
        amountLabel.setMinimumSize(new java.awt.Dimension(144, 23));
        amountLabel.setPreferredSize(new java.awt.Dimension(144, 23));
        jPanel3.add(amountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 190, -1));

        balanceLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        balanceLabel.setForeground(new java.awt.Color(0, 107, 0));
        balanceLabel.setText("Balance");
        balanceLabel.setMaximumSize(new java.awt.Dimension(144, 23));
        balanceLabel.setMinimumSize(new java.awt.Dimension(144, 23));
        balanceLabel.setPreferredSize(new java.awt.Dimension(144, 23));
        jPanel3.add(balanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, 190, -1));

        labelForAccountNo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        labelForAccountNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelForAccountNo.setText("Account Number");
        labelForAccountNo.setMaximumSize(new java.awt.Dimension(144, 23));
        labelForAccountNo.setMinimumSize(new java.awt.Dimension(144, 23));
        labelForAccountNo.setPreferredSize(new java.awt.Dimension(144, 23));
        jPanel3.add(labelForAccountNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 170, -1));

        labelForAmount.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        labelForAmount.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelForAmount.setText("Amount");
        labelForAmount.setMaximumSize(new java.awt.Dimension(144, 23));
        labelForAmount.setMinimumSize(new java.awt.Dimension(144, 23));
        labelForAmount.setPreferredSize(new java.awt.Dimension(144, 23));
        jPanel3.add(labelForAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 170, -1));

        labelForName.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        labelForName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelForName.setText("Receipient's Name");
        labelForName.setMaximumSize(new java.awt.Dimension(144, 23));
        labelForName.setMinimumSize(new java.awt.Dimension(144, 23));
        labelForName.setPreferredSize(new java.awt.Dimension(144, 23));
        jPanel3.add(labelForName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 170, -1));

        labelForBalance.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        labelForBalance.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelForBalance.setText("New Balance");
        labelForBalance.setMaximumSize(new java.awt.Dimension(144, 23));
        labelForBalance.setMinimumSize(new java.awt.Dimension(144, 23));
        labelForBalance.setPreferredSize(new java.awt.Dimension(144, 23));
        jPanel3.add(labelForBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 170, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/checked.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 370, 170));

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Fund Transfer");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 290, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/FundTransfer_Banner.jpg"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 260));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/BG_LandPage.jpg"))); // NOI18N
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 420, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
     this.dispose();
     new homeFrame(this.clientId).setVisible(true);
    }//GEN-LAST:event_submitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(fundTransferConfirmFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fundTransferConfirmFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fundTransferConfirmFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fundTransferConfirmFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fundTransferConfirmFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLabel;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelForAccountNo;
    private javax.swing.JLabel labelForAmount;
    private javax.swing.JLabel labelForBalance;
    private javax.swing.JLabel labelForName;
    private javax.swing.JLabel receipientName;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel targetAccountNo;
    // End of variables declaration//GEN-END:variables
}
