/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.mobileapp;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Ralph
 */
public class registerFrame extends javax.swing.JFrame {

    /**
     * Creates new form registerFrame
     */
    public registerFrame() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        accountNo_input = new javax.swing.JFormattedTextField();
        submit_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");

        accountNo_input.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#####"))));

        submit_btn.setText("Submit");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(accountNo_input, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(accountNo_input, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 375, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static String PW_hasher(String password) {
        String digest = "";
        if (password != null || (!password.isEmpty())) {
            MessageDigest m = null;
            try {
                m = MessageDigest.getInstance("MD5");
            } catch (Exception e) {

            }
            m.update(password.getBytes(), 0, password.length());
            digest = String.format("%032x", new BigInteger(1, m.digest()));

        }
        return digest;
    }

    private void sendMail(String receipient, String username, String password) {
        String content = "";
        content = "Thank you for using University Bank!\n"
                + "Here are your account credentials\n"
                + "Username: " + username + "\n"
                + "Temporary Password: " + password + "\n\n"
                + "Please change your password immediately";
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
            msg.setSubject("University Bank Account Registration");
            msg.setSentDate(new Date());
            msg.setText(content);
            msg.setHeader("XPriority", "1");
            Transport.send(msg);
            System.out.println("Mail has been sent successfully");
        } catch (MessagingException mex) {
            System.out.println("Unable to send an email" + mex);
        }
    }

    private String createUsername(int accountNo) {
        String username = "";
        String firstname = "";
        String lastname = "";
        String middlename = "";
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/ca_abs", "ca_abs", "haji12345");
            Statement st = con.createStatement();
            String DBQ = "SELECT * FROM CA_ABS.CLIENT WHERE CLIENT_ACCTNUM=" + accountNo;
            ResultSet rs = st.executeQuery(DBQ);
            if (rs.next()) {
                firstname = rs.getString("CLIENT_FN").toLowerCase();
                lastname = rs.getString("CLIENT_LN").toLowerCase();
                middlename = rs.getString("CLIENT_MN").toLowerCase();
                System.out.println(firstname);
                System.out.println(lastname);
                System.out.println(middlename);
                username = firstname.substring(0, 1).replaceAll("\\s+", "") + middlename.substring(0, 1).replaceAll("\\s+", "") + lastname.replaceAll("\\s+", "");
            }
        } catch (ClassNotFoundException | SQLException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return username;
    }

    private String createPassword(int accountNo) {       
        String password = PasswordGenerator.generatePassword(10);
        return password;
    }
    private void createAccount(String username, String password,int clientId){
        password = PW_hasher(password);
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/ca_abs", "ca_abs", "haji12345");
            Statement st = con.createStatement();
            String DBQ = "UPDATE CA_ABS.CLIENT SET CLIENT_UNAME = '"+username+"', CLIENT_PW='"+password+"' WHERE CLIENT_ID="+clientId;
            int result = st.executeUpdate(DBQ);
            if (result > 0) {
                System.out.println("success");
            } else {
            }
        } catch (ClassNotFoundException | SQLException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    private boolean AccountNumberExists(int accountNo) {
        boolean exists = false;
        System.out.println(accountNo);
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/ca_abs", "ca_abs", "haji12345");
            Statement st = con.createStatement();
            String DBQ = "SELECT * FROM CA_ABS.CLIENT WHERE CLIENT_ACCTNUM=" + accountNo;
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
    private int getId(int accountNo){
         int id = 0;
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/ca_abs", "ca_abs", "haji12345");
            Statement st = con.createStatement();
            String DBQ = "SELECT * FROM CA_ABS.CLIENT WHERE CLIENT_ACCTNUM=" + accountNo;
            ResultSet rs = st.executeQuery(DBQ);
            if (rs.next()) {
                id = rs.getInt("CLIENT_ID");
            }
        } catch (ClassNotFoundException | SQLException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return id;
    }
    private String getEmail(int accountNo) {
        String email = "";
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/ca_abs", "ca_abs", "haji12345");
            Statement st = con.createStatement();
            String DBQ = "SELECT * FROM CA_ABS.CLIENT WHERE CLIENT_ACCTNUM=" + accountNo;
            ResultSet rs = st.executeQuery(DBQ);
            if (rs.next()) {
                email = rs.getString("CLIENT_EMAIL");
            }
        } catch (ClassNotFoundException | SQLException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return email;
    }
    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        this.dispose();
        new loginFrame().setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed

        int accountNo = 0;
        String receipient = "";
        String username = "";
        String password = "";
        try {
            accountNo = Integer.parseInt(accountNo_input.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        if (AccountNumberExists(accountNo)) {
            try {
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/ca_abs", "ca_abs", "haji12345");
                Statement st = con.createStatement();
                String DBQ = "UPDATE CLIENT SET CLIENT_UNAME = ";
                JOptionPane.showMessageDialog(this, "Check your email plz");
                receipient = getEmail(accountNo);
                System.out.println(receipient);
                username = createUsername(accountNo);
                System.out.println(username);
                password = createPassword(accountNo);
                System.out.println(password);
                System.out.println(PW_hasher(password));
                System.out.println(getId(accountNo));
                
                createAccount(username,password,getId(accountNo));
                sendMail(receipient, username, password);
            } catch (Exception e) {

            }
        } else {
            JOptionPane.showMessageDialog(this, "Account number does not exist");
        }
    }//GEN-LAST:event_submit_btnActionPerformed

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
            java.util.logging.Logger.getLogger(registerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField accountNo_input;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton submit_btn;
    // End of variables declaration//GEN-END:variables
}
