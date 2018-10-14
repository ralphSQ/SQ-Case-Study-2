/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.mobileapp;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Ralph
 */
public class resetPasswordFrame extends javax.swing.JFrame {

    /**
     * Creates new form resetPasswordFrame
     */
    private String email = "";

    public resetPasswordFrame() {
        initComponents();
    }

    private boolean emailExists(String email) {
        boolean exists = false;
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/ca_abs", "ca_abs", "haji12345");
            Statement st = con.createStatement();
            String DBQ = "SELECT * FROM CA_ABS.CLIENT WHERE CLIENT_EMAIL='" + email + "'";
            ResultSet rs = st.executeQuery(DBQ);
            if (rs.next()) {
                exists = true;
            } else {
                exists = false;
            }
        } catch (ClassNotFoundException | SQLException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return exists;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        success = new javax.swing.JPanel();
        emailInput = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        success.setLayout(null);

        emailInput.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        emailInput.setForeground(java.awt.Color.lightGray);
        emailInput.setText("example@gmail.com");
        emailInput.setToolTipText("");
        emailInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailInputFocusLost(evt);
            }
        });
        success.add(emailInput);
        emailInput.setBounds(30, 420, 350, 60);

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        success.add(cancelBtn);
        cancelBtn.setBounds(200, 500, 140, 50);

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        success.add(submitBtn);
        submitBtn.setBounds(60, 500, 140, 50);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Reset Password");
        success.add(jLabel10);
        jLabel10.setBounds(0, 0, 420, 230);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter E-Mail Address ");
        success.add(jLabel2);
        jLabel2.setBounds(20, 290, 370, 100);
        success.add(jLabel9);
        jLabel9.setBounds(40, 430, 70, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/BG_LandPage.jpg"))); // NOI18N
        success.add(jLabel5);
        jLabel5.setBounds(0, 220, 420, 530);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/Changepass_Banner.jpg"))); // NOI18N
        success.add(jLabel1);
        jLabel1.setBounds(0, -20, 416, 260);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(success, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(success, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
        new loginFrame().setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void emailInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailInputFocusGained
        if (emailInput.getText().equals("example@gmail.com")) {
            emailInput.setText("");
            emailInput.setForeground(Color.black);
        }
    }//GEN-LAST:event_emailInputFocusGained

    private void emailInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailInputFocusLost
        if (emailInput.getText().equals("")) {
            emailInput.setText("example@gmail.com");
            emailInput.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_emailInputFocusLost
    private void sendMail(String receipient, String code) {
        String content = "";
        content = "Thank you for using University Bank!\n"
                + "Here is your password reset code\n"
                + "Code: " + code + "\n\n"
                + "If you didn't request for a password reset, please ignore this email.";
        //Setting up configurations for the email connection to the Google SMTP server using TLS
        Properties props = new Properties();
        props.put("mail.smtp.host", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        //Establishing a session with required user details
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("csspec6.n491@gmail.com", "haji12345");
            }
        });
        try {
            //Creating a Message object to set the email content
            MimeMessage msg = new MimeMessage(session);
            //Storing the comma seperated values to email addresses
            String to = receipient;
            /*Parsing the String with defualt delimiter as a comma by marking the boolean as true and storing the email
            addresses in an array of InternetAddress objects*/
            InternetAddress[] address = InternetAddress.parse(to, true);
            //Setting the recepients from the address variable
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject("University Bank Password Reset");
            msg.setSentDate(new Date());
            msg.setText(content);
            msg.setHeader("XPriority", "1");
            Transport.send(msg);
            System.out.println("Mail has been sent successfully");
        } catch (MessagingException mex) {
            System.out.println("Unable to send an email" + mex);
        }
    }

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed

        if (emailExists(emailInput.getText())) {
            try {
                String resetCode = PasswordGenerator.generateResetPasswordCode(6);
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/ca_abs", "ca_abs", "haji12345");
                Statement st = con.createStatement();
                String DBQ = "UPDATE CA_ABS.CLIENT SET RESET_PW_CODE='" + resetCode + "' WHERE CLIENT_EMAIL='" + emailInput.getText() + "'";
                int result = st.executeUpdate(DBQ);
                if (result > 0) {
                    sendMail(emailInput.getText(), resetCode);
                    JOptionPane.showMessageDialog(this, "Password reset code has been sent to your email");
                    this.email = emailInput.getText();
                    this.dispose();
                    new inputResetPasswordCode(this.email).setVisible(true);
                }
            } catch (ClassNotFoundException | SQLException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Email address not found");
        }
    }//GEN-LAST:event_submitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(resetPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resetPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resetPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resetPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resetPasswordFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton submitBtn;
    private javax.swing.JPanel success;
    // End of variables declaration//GEN-END:variables
}
