/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.managment.system;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import librarydatabase.issuedb;
import static librarydatabase.returndb.get_bookissueddata;
import librarydatabase.returndb;
import org.sqlite.SQLiteException;
import java.sql.Statement;
public class returnbook extends javax.swing.JFrame {
public static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:librarydb.db");
    }
    
    public returnbook() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        restuid = new javax.swing.JTextField();
        rebookid = new javax.swing.JTextField();
        returnbtn = new javax.swing.JButton();
        closebtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Student ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Book ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 161, -1, -1));

        restuid.setBackground(new java.awt.Color(255, 255, 255));
        restuid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        restuid.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(restuid, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 118, 115, -1));

        rebookid.setBackground(new java.awt.Color(255, 255, 255));
        rebookid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rebookid.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(rebookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 161, 115, -1));

        returnbtn.setBackground(new java.awt.Color(255, 255, 255));
        returnbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        returnbtn.setForeground(new java.awt.Color(0, 0, 0));
        returnbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return book png.png"))); // NOI18N
        returnbtn.setText("Return");
        returnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbtnActionPerformed(evt);
            }
        });
        getContentPane().add(returnbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 305, -1, -1));

        closebtn.setBackground(new java.awt.Color(255, 255, 255));
        closebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closebtn.setForeground(new java.awt.Color(0, 0, 0));
        closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/red-x-mark-transparent-background-3.png"))); // NOI18N
        closebtn.setText("Close");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        getContentPane().add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 305, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/123456.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbtnActionPerformed
        // TODO add your handling code here:
        
        int z=librarydatabase.returndb.checkifbookissued(Integer.parseInt(restuid.getText()),Integer.parseInt(rebookid.getText()));
        switch(z){
            case 1:
                
                    librarydatabase.returndb.update_returntable(Integer.parseInt(restuid.getText()), Integer.parseInt(rebookid.getText()));
                    JOptionPane.showMessageDialog(null, "book is returned ", "Library", JOptionPane.INFORMATION_MESSAGE);
                    
                    new returnbook();
                break;
            case 2:
                 JOptionPane.showMessageDialog(null, "book is not issued ", "Library", JOptionPane.INFORMATION_MESSAGE);
                  new returnbook().setVisible(true);
                 break;
                 
        }
                
//        String bookid = rebookid.getText();
//        String stuid = restuid.getText();
//        try (
//                 Connection con = connect(); 
//                PreparedStatement st = con.prepareStatement("update issuebook set returnstatus='YES' where student_id='" + restuid + "'and book_id='" + rebookid + "'");) {
//            st.executeUpdate();
//            JOptionPane.showMessageDialog(null, "book is returned ", "Library", JOptionPane.INFORMATION_MESSAGE);
//            setVisible(false);
//            new returnbook().setVisible(true);
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
    }//GEN-LAST:event_returnbtnActionPerformed

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        // TODO add your handling code here:
        new Homepage();
        this.dispose();
    }//GEN-LAST:event_closebtnActionPerformed
    
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
//            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new returnbook().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField rebookid;
    private javax.swing.JTextField restuid;
    private javax.swing.JButton returnbtn;
    // End of variables declaration//GEN-END:variables
}