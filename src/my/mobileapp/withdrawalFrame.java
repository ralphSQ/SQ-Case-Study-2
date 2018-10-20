/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.mobileapp;

import java.awt.Color;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Ralph
 */
public class withdrawalFrame extends javax.swing.JFrame {

    private String fullName;
    private int clientId;
    private String firstName;

    /**
     * Creates new form withdrawalFrame
     */
    public withdrawalFrame() {
        initComponents();
    }

    public withdrawalFrame(int accountId, String firstName, String fullName) {
        this.clientId = accountId;
        this.fullName = fullName;
        this.firstName = firstName;
        initComponents();
        errorLabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        pinInput = new javax.swing.JFormattedTextField();
        amountInput = new javax.swing.JFormattedTextField();
        cancelButtton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Request");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(130, 90, 260, 100);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cash Withdrawal");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 60, 350, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/password.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 260, 160, 150);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/payment-method_Banner.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 260, 140, 150);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/right-arrow.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(190, 330, 40, 40);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel7.setText("Input Pin 1");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(290, 410, 70, 30);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Your PIN");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 560, 110, 40);

        errorLabel.setForeground(java.awt.Color.red);
        errorLabel.setText("jLabel12");
        jPanel1.add(errorLabel);
        errorLabel.setBounds(140, 610, 230, 20);

        pinInput.setBorder(null);
        pinInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("######"))));
        pinInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pinInputFocusLost(evt);
            }
        });
        pinInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pinInputKeyReleased(evt);
            }
        });
        jPanel1.add(pinInput);
        pinInput.setBounds(140, 560, 230, 40);

        amountInput.setBorder(null);
        amountInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        amountInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                amountInputFocusLost(evt);
            }
        });
        amountInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountInputKeyTyped(evt);
            }
        });
        jPanel1.add(amountInput);
        amountInput.setBounds(140, 500, 230, 40);

        cancelButtton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cancelButtton.setText("Cancel");
        cancelButtton.setBorder(null);
        cancelButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButttonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelButtton);
        cancelButtton.setBounds(160, 650, 100, 40);

        submitButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        submitButton.setText("Proceed");
        submitButton.setBorder(null);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(submitButton);
        submitButton.setBounds(270, 650, 100, 40);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Amount");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 500, 110, 40);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setText("Input Amount");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 410, 70, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/BG_LandPage.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 220, 420, 500);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/CashWthdrawReq_Banner.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -20, 416, 260);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButttonActionPerformed
        this.dispose();
        new homeFrame(this.clientId).setVisible(true);
    }//GEN-LAST:event_cancelButttonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if (!amountInput.getText().trim().isEmpty() && !pinInput.getText().trim().isEmpty()) {
            double amount = Double.valueOf(amountInput.getText().replace(",", ""));
            double balance = Double.parseDouble(Client.getFormattedBalance(clientId).replaceAll("Php", "").replace(",", ""));
            int pin = Integer.valueOf(pinInput.getText().trim());
            int pin2 = Integer.valueOf(PasswordGenerator.generatePin2());
            int confirm = 0;
            String message = "";
            long requestTime = Instant.now().getEpochSecond();
            LocalDateTime dateTime = LocalDateTime.ofEpochSecond(requestTime, 0, ZoneOffset.of("+8"));
            if (!(balance - 2000 < amount)) {
                if (Client.checkIfPinIsCorrect(pin, this.clientId) || Client.checkIfTemporaryPinIsCorrect(pin, clientId)) {
                    if (Client.checkIfTemporaryPinIsCorrect(pin, clientId)) {
                        JOptionPane.showMessageDialog(this, "You are using your temporary pin assigned to your account.\nChange your PIN as soon as possible to increase your account's security", "Tip", JOptionPane.INFORMATION_MESSAGE);
                    }
                    System.out.println("Amount: " + amount);
                    System.out.println("Pin 1: " + pin);
                    System.out.println("Pin 2: " + pin2);
                    System.out.println("Time Request: " + requestTime);
                    System.out.println("Time Request in format: " + dateTime);
                    message = "Fund Transfer"
                            + "\n------------------------------"
                            + "\nAmount: " + amount
                            + "\nYour PIN: " + pin
                            + "\nPin 2: " + pin2
                            + "\nTime Request:" + requestTime
                            + "\nFormatted time: " + dateTime
                            + "\n------------------------------";
                    confirm = JOptionPane.showConfirmDialog(this, message, "Confirmation", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (confirm == 0) {
                        if (Client.cardlessWithdrawal(clientId, amount, pin, pin2, (int) requestTime)) {
                            this.dispose();
                            new cardlessWithdrawalStep2(clientId, pin2, amount, (int) requestTime).setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(this, "An error occured, please blame the programmer.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    errorLabel.setText("Incorrect PIN");
                    errorLabel.setVisible(true);
                }
            } else {
                errorLabel.setText("Insufficient balance");
                errorLabel.setVisible(true);
            }
        } else if (amountInput.getText().trim().isEmpty()) {
            errorLabel.setText("Please enter amount");
            errorLabel.setVisible(true);
        } else if (pinInput.getText().trim().isEmpty()) {
            errorLabel.setText("Please enter your pin");
            errorLabel.setVisible(true);
        }


    }//GEN-LAST:event_submitButtonActionPerformed

    private void pinInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pinInputFocusLost
        if (pinInput.getText().trim().isEmpty()) {
            pinInput.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            pinInput.setBorder(BorderFactory.createLineBorder(Color.green));
        }
    }//GEN-LAST:event_pinInputFocusLost

    private void amountInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amountInputFocusLost
        if (amountInput.getText().trim().isEmpty()) {
            amountInput.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            amountInput.setBorder(BorderFactory.createLineBorder(Color.green));
        }
    }//GEN-LAST:event_amountInputFocusLost

    private void amountInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountInputKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_amountInputKeyTyped

    private void pinInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinInputKeyReleased
        if (pinInput.getText().length() >= 6) {
            evt.consume();
            pinInput.setBorder(BorderFactory.createLineBorder(Color.green));
        } else {
            pinInput.setBorder(BorderFactory.createLineBorder(Color.red));
        }
    }//GEN-LAST:event_pinInputKeyReleased

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
            java.util.logging.Logger.getLogger(withdrawalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(withdrawalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(withdrawalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(withdrawalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new withdrawalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField amountInput;
    private javax.swing.JButton cancelButtton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField pinInput;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
