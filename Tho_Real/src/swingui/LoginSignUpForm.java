/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingui;

import giaodien.gaiodien_xanhla;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import tho_real.taikhoan;

/**
 *
 * @author sushi
 */
public class LoginSignUpForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginSignUpForm
     */
    
    int posX;
    int posY;
    
    public LoginSignUpForm() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setBackground(new Color(255, 255, 255, 0));
        txtUserName.setBackground(new Color(255, 255, 255, 0));
        inpPassword.setBackground(new Color(255, 255, 255, 0));
        chkAgree.setBackground(new Color(255, 255, 255, 0));
        txtUserName.setText("");
        inpPassword.setText("");
        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                posX = e.getX();
                posY = e.getY();
            }
        });
        this.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent evt) {
                //sets frame position when mouse dragged			
                setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);

            }
        });
        lblCancel.setHorizontalTextPosition((int) CENTER_ALIGNMENT);
        btnLogin.setHorizontalTextPosition((int) CENTER_ALIGNMENT);
        System.out.println((int) CENTER_ALIGNMENT);
    }
    public String login(String username, String password) {
        for (taikhoan tk : taikhoan.values()) {
            if (tk.getUsername().equals(username) && tk.getPassword().equals(password)) {
                return tk.getFullname();
            }

        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtUserName = new javax.swing.JTextField();
        inpPassword = new javax.swing.JPasswordField();
        chkAgree = new javax.swing.JCheckBox();
        lblCancel = new javax.swing.JLabel();
        btnLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        leftPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(900, 650));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 650));
        getContentPane().setLayout(null);

        jLabel10.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(520, 310, 150, 30);

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(520, 210, 150, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(520, 390, 320, 20);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(520, 290, 320, 20);

        txtUserName.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(255, 255, 255));
        txtUserName.setBorder(null);
        getContentPane().add(txtUserName);
        txtUserName.setBounds(520, 240, 320, 50);

        inpPassword.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        inpPassword.setForeground(new java.awt.Color(255, 255, 255));
        inpPassword.setText("jPasswordField1");
        inpPassword.setBorder(null);
        getContentPane().add(inpPassword);
        inpPassword.setBounds(520, 340, 320, 50);

        chkAgree.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        chkAgree.setForeground(new java.awt.Color(255, 255, 255));
        chkAgree.setText("Remenber ");
        chkAgree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAgreeActionPerformed(evt);
            }
        });
        getContentPane().add(chkAgree);
        chkAgree.setBounds(520, 440, 310, 31);

        lblCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCancel.setForeground(new java.awt.Color(255, 255, 255));
        lblCancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nut.png"))); // NOI18N
        lblCancel.setText("Cancel");
        lblCancel.setToolTipText("");
        lblCancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelMouseClicked(evt);
            }
        });
        getContentPane().add(lblCancel);
        lblCancel.setBounds(660, 510, 160, 70);

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nut.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(530, 520, 140, 50);

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(520, 100, 320, 60);

        rightPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rightPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rightchinhsua.png"))); // NOI18N
        getContentPane().add(rightPanel);
        rightPanel.setBounds(440, -20, 590, 670);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Come Fly With Us");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 130, 250, 50);

        leftPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leftPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chinhsua.png"))); // NOI18N
        getContentPane().add(leftPanel);
        leftPanel.setBounds(-100, -10, 680, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkAgreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAgreeActionPerformed
  
// TODO add your handling code here:
    }//GEN-LAST:event_chkAgreeActionPerformed

    private void lblCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCancelMouseClicked

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        // TODO add your handling code here:
        String username = txtUserName.getText();
        String password = String.valueOf(inpPassword.getPassword());
        String CurrentUser = login(username, password);
        if (CurrentUser != null) {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
            this.dispose();
            new gaiodien_xanhla(CurrentUser).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Đăng nhập thất bại");
        }
    }//GEN-LAST:event_btnLoginMouseClicked

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
            java.util.logging.Logger.getLogger(LoginSignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginSignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginSignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginSignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginSignUpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnLogin;
    private javax.swing.JCheckBox chkAgree;
    private javax.swing.JPasswordField inpPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCancel;
    private javax.swing.JLabel leftPanel;
    private javax.swing.JLabel rightPanel;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
