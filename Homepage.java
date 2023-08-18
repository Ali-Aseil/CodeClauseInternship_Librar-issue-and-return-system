/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.managment.system;

import javax.swing.JFrame;

/**
 *
 * @author ali
 */
public class Homepage extends javax.swing.JFrame {

    /**
     * Creates new form Homepage
     */
    public Homepage() {
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NewStudentbtn = new javax.swing.JButton();
        NewBookbtn = new javax.swing.JButton();
        Issuebtn = new javax.swing.JButton();
        Returnbtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NewStudentbtn.setBackground(new java.awt.Color(255, 255, 255));
        NewStudentbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NewStudentbtn.setForeground(new java.awt.Color(0, 0, 0));
        NewStudentbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/member-add-on-300x300.png"))); // NOI18N
        NewStudentbtn.setText("New Student");
        NewStudentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewStudentbtnActionPerformed(evt);
            }
        });
        getContentPane().add(NewStudentbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        NewBookbtn.setBackground(new java.awt.Color(255, 255, 255));
        NewBookbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NewBookbtn.setForeground(new java.awt.Color(0, 0, 0));
        NewBookbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/New book.png"))); // NOI18N
        NewBookbtn.setText("New Book");
        NewBookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBookbtnActionPerformed(evt);
            }
        });
        getContentPane().add(NewBookbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        Issuebtn.setBackground(new java.awt.Color(255, 255, 255));
        Issuebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Issuebtn.setForeground(new java.awt.Color(0, 0, 0));
        Issuebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/issue.png"))); // NOI18N
        Issuebtn.setText("Issue");
        Issuebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssuebtnActionPerformed(evt);
            }
        });
        getContentPane().add(Issuebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 127, -1));

        Returnbtn.setBackground(new java.awt.Color(255, 255, 255));
        Returnbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Returnbtn.setForeground(new java.awt.Color(0, 0, 0));
        Returnbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return-book-1-560407.png"))); // NOI18N
        Returnbtn.setText("Return");
        Returnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Returnbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, -1));

        logoutbtn.setBackground(new java.awt.Color(255, 255, 255));
        logoutbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(0, 0, 0));
        logoutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        logoutbtn.setText("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Library_Book_532388_1366x768.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewStudentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewStudentbtnActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==NewStudentbtn)
        {
            new NewStudent().setVisible(true);
        }
    }//GEN-LAST:event_NewStudentbtnActionPerformed

    private void IssuebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssuebtnActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==Issuebtn){
            new Issuebook().setVisible(true);
        }
    }//GEN-LAST:event_IssuebtnActionPerformed

    private void NewBookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBookbtnActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==NewBookbtn){
            
            new Newbook().setVisible(true);
            
        }
    }//GEN-LAST:event_NewBookbtnActionPerformed

    private void ReturnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnbtnActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==Returnbtn){
            
            new returnbook();
            
            
        }
    }//GEN-LAST:event_ReturnbtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new loginpage();
    }//GEN-LAST:event_logoutbtnActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Homepage().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Issuebtn;
    private javax.swing.JButton NewBookbtn;
    private javax.swing.JButton NewStudentbtn;
    private javax.swing.JButton Returnbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutbtn;
    // End of variables declaration//GEN-END:variables
}