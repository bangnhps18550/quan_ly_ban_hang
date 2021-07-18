package GiaoDien_DangNhap;

/*test_tiep cai_demo*/


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author sushi
 */
public class DangNhapFrame extends javax.swing.JFrame {

        static final String url="jdbc:sqlserver://localhost;databaseName=QUANLYBANHANG;user=sa;password=123";
    /**
     * Creates new form DangNhapFrame
     */
    
    int posX;
    int posY;
    
    public DangNhapFrame() {
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
        //jkujjjghjghjgjghjghj
        //ghjghjghjghjghj
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
        lblLoi = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtUserName = new javax.swing.JTextField();
        inpPassword = new javax.swing.JPasswordField();
        chkAgree = new javax.swing.JCheckBox();
        lblCancel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblChangePassWord = new javax.swing.JLabel();
        btnLogin = new javax.swing.JLabel();
        rightPanel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        leftPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 150, 30));

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 150, 30));

        lblLoi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblLoi.setForeground(new java.awt.Color(238, 118, 118));
        lblLoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_Icon/warning.png"))); // NOI18N
        lblLoi.setText("Các ô không được để trống");
        getContentPane().add(lblLoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 320, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 320, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 320, 20));

        txtUserName.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(255, 255, 255));
        txtUserName.setBorder(null);
        getContentPane().add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 320, 50));

        inpPassword.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        inpPassword.setForeground(new java.awt.Color(255, 255, 255));
        inpPassword.setText("jPasswordField1");
        inpPassword.setBorder(null);
        getContentPane().add(inpPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 320, 50));

        chkAgree.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        chkAgree.setForeground(new java.awt.Color(255, 255, 255));
        chkAgree.setText("Remenber ");
        chkAgree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAgreeActionPerformed(evt);
            }
        });
        getContentPane().add(chkAgree, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 310, -1));

        lblCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCancel.setForeground(new java.awt.Color(255, 255, 255));
        lblCancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_GiaoDienChinh/nut.png"))); // NOI18N
        lblCancel.setText("Cancel");
        lblCancel.setToolTipText("");
        lblCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelMouseClicked(evt);
            }
        });
        getContentPane().add(lblCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 160, 70));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 320, 60));

        lblChangePassWord.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChangePassWord.setForeground(new java.awt.Color(255, 255, 255));
        lblChangePassWord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_GiaoDienChinh/DangXuat.png"))); // NOI18N
        lblChangePassWord.setText("Change Password");
        lblChangePassWord.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblChangePassWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChangePassWordMouseClicked(evt);
            }
        });
        getContentPane().add(lblChangePassWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 190, 40));

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_GiaoDienChinh/nut.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 140, 50));

        rightPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rightPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_GiaoDienChinh/right_panel.png"))); // NOI18N
        getContentPane().add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, -10, 740, 670));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Come Fly With Us");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 250, 50));

        leftPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leftPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_GiaoDienChinh/left_panel.png"))); // NOI18N
        getContentPane().add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 680, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkAgreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAgreeActionPerformed
  
// TODO add your handling code here:
    }//GEN-LAST:event_chkAgreeActionPerformed

    private void lblCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelMouseClicked
        int chose=JOptionPane.showConfirmDialog(this, "Bạn có muốn hoàn tất không ?");
        if(chose==0){
            System.exit(0);
        }
    }//GEN-LAST:event_lblCancelMouseClicked

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
       try{
           Connection cn=DriverManager.getConnection(url);
           Statement st=cn.createStatement();
           String query="select manhanvien_username from nhanvien";
           ResultSet rs= st.executeQuery(query);
           while(rs.next()){
               System.out.println(rs.getString("manhanvien_username"));
           }
       }catch(SQLException e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_btnLoginMouseClicked

    private void lblChangePassWordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChangePassWordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblChangePassWordMouseClicked

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
            java.util.logging.Logger.getLogger(DangNhapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhapFrame().setVisible(true);
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
    private javax.swing.JLabel lblChangePassWord;
    private javax.swing.JLabel lblLoi;
    private javax.swing.JLabel leftPanel;
    private javax.swing.JLabel rightPanel;
    public javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
