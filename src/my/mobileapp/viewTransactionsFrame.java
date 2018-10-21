/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.mobileapp;

/**
 *
 * @author Ralph
 */
public class viewTransactionsFrame extends javax.swing.JFrame {

    private int clientId;

    /**
     * Creates new form viewTransactionsFrame
     */
    public viewTransactionsFrame() {
        initComponents();
    }

    public viewTransactionsFrame(int clientId) {
        this.clientId = clientId;
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
        withdrawButton = new javax.swing.JButton();
        depositButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        fundTransfersButton = new javax.swing.JButton();
        title1 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        header = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        withdrawButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        withdrawButton.setText("Withdraw Requests");
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });
        jPanel1.add(withdrawButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 200, 40));

        depositButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        depositButton.setText("Deposits");
        jPanel1.add(depositButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 200, 40));

        BackButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 100, 40));

        fundTransfersButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        fundTransfersButton.setText("Fund Transfers");
        fundTransfersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundTransfersButtonActionPerformed(evt);
            }
        });
        jPanel1.add(fundTransfersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 200, 40));

        title1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setText("View Transfer");
        jPanel1.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 350, 70));

        title2.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        title2.setForeground(new java.awt.Color(255, 255, 255));
        title2.setText("History");
        jPanel1.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 260, 100));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/BG_LandPage.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 420, 500));

        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SourceImages/History_Banner.jpg"))); // NOI18N
        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fundTransfersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundTransfersButtonActionPerformed
        this.dispose();
        new viewFundTransfersFrame(this.clientId).setVisible(true);
    }//GEN-LAST:event_fundTransfersButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.dispose();
        new homeFrame(this.clientId).setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        this.dispose();
        new viewWithdrawRequests(this.clientId).setVisible(true);
    }//GEN-LAST:event_withdrawButtonActionPerformed

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
            java.util.logging.Logger.getLogger(viewTransactionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewTransactionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewTransactionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewTransactionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewTransactionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel background;
    private javax.swing.JButton depositButton;
    private javax.swing.JButton fundTransfersButton;
    private javax.swing.JLabel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JButton withdrawButton;
    // End of variables declaration//GEN-END:variables
}
