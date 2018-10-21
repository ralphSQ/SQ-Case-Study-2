/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.mobileapp;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Ralph
 */
public class forgotPasswordSecondStep extends javax.swing.JFrame {

    private int clientId = 0;

    /**
     * Creates new form resetPasswordSecondStep
     */
    public forgotPasswordSecondStep() {
        initComponents();
    }

    public forgotPasswordSecondStep(int clientId) {
        this.clientId = clientId;
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
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        repeatNewPasswordInput = new javax.swing.JPasswordField();
        newPasswordInput = new javax.swing.JPasswordField();
        cancelButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Forgot Password");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Forgot Password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 400, 70));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/keywords.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 370, 130));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("New Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 280, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Repeat New Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 280, -1));

        errorLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        errorLabel.setForeground(java.awt.Color.red);
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorLabel.setText("label for errors");
        jPanel1.add(errorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 280, 30));

        repeatNewPasswordInput.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        repeatNewPasswordInput.setForeground(java.awt.Color.lightGray);
        repeatNewPasswordInput.setText("1234567890");
        repeatNewPasswordInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                repeatNewPasswordInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                repeatNewPasswordInputFocusLost(evt);
            }
        });
        repeatNewPasswordInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                repeatNewPasswordInputKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                repeatNewPasswordInputKeyTyped(evt);
            }
        });
        jPanel1.add(repeatNewPasswordInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 280, 40));

        newPasswordInput.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        newPasswordInput.setForeground(java.awt.Color.lightGray);
        newPasswordInput.setText("1234567890");
        newPasswordInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newPasswordInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                newPasswordInputFocusLost(evt);
            }
        });
        jPanel1.add(newPasswordInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 280, 40));

        cancelButton.setBackground(java.awt.Color.lightGray);
        cancelButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setToolTipText("");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 90, 40));

        submitButton.setBackground(new java.awt.Color(38, 166, 154));
        submitButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        submitButton.setText("Proceed");
        submitButton.setToolTipText("");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 620, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Changepass_Banner.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 260));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/BG_LandPage.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 420, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String newPassword = new String(newPasswordInput.getPassword());
        String repeatNewPassword = new String(repeatNewPasswordInput.getPassword());
        String encryptedPassword = PasswordHasher.passwordHasher(newPassword);
        int confirm = 0;
        if (newPassword.equals(repeatNewPassword)) {
            System.out.println(newPassword);
            
            confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to change your password?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (confirm == 0) {
                Client.setPassword(encryptedPassword, this.clientId);
                JOptionPane.showMessageDialog(this, "Password changed successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new loginFrame().setVisible(true);
            } else if (confirm == 1) {
            }
        } else {
            errorLabel.setText("New password does not match");
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void newPasswordInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newPasswordInputFocusGained
        if (new String(newPasswordInput.getPassword()).trim().equals("1234567890")) {
            newPasswordInput.setText("");
            newPasswordInput.setForeground(Color.black);
        }
    }//GEN-LAST:event_newPasswordInputFocusGained

    private void newPasswordInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newPasswordInputFocusLost
        if (new String(newPasswordInput.getPassword()).trim().isEmpty()) {
            newPasswordInput.setBorder(BorderFactory.createLineBorder(Color.red));
            errorLabel.setText("Please input new password");
        } else {
            newPasswordInput.setBorder(BorderFactory.createLineBorder(Color.green));
        }
    }//GEN-LAST:event_newPasswordInputFocusLost

    private void repeatNewPasswordInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_repeatNewPasswordInputFocusGained
        if (new String(repeatNewPasswordInput.getPassword()).trim().equals("1234567890")) {
            repeatNewPasswordInput.setText("");
            repeatNewPasswordInput.setForeground(Color.black);
        }
    }//GEN-LAST:event_repeatNewPasswordInputFocusGained

    private void repeatNewPasswordInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_repeatNewPasswordInputFocusLost
        if (new String(repeatNewPasswordInput.getPassword()).trim().isEmpty()) {
            repeatNewPasswordInput.setBorder(BorderFactory.createLineBorder(Color.red));
            errorLabel.setText("Please input new password");
        } else {
            repeatNewPasswordInput.setBorder(BorderFactory.createLineBorder(Color.green));
        }
    }//GEN-LAST:event_repeatNewPasswordInputFocusLost

    private void repeatNewPasswordInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_repeatNewPasswordInputKeyTyped
      
    }//GEN-LAST:event_repeatNewPasswordInputKeyTyped

    private void repeatNewPasswordInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_repeatNewPasswordInputKeyReleased
        String newPassword = new String(newPasswordInput.getPassword());
        String repeatNewPassword = new String(repeatNewPasswordInput.getPassword());
         if (!newPassword.equals(repeatNewPassword)){
             errorLabel.setText("New Password does not match");
             errorLabel.setVisible(true);
         } else {
             errorLabel.setVisible(false);
         }
    }//GEN-LAST:event_repeatNewPasswordInputKeyReleased

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(forgotPasswordSecondStep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgotPasswordSecondStep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgotPasswordSecondStep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgotPasswordSecondStep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgotPasswordSecondStep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField newPasswordInput;
    private javax.swing.JPasswordField repeatNewPasswordInput;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
