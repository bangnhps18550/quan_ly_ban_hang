/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien_QuanLy;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Tho
 */
public class B_QuanLyNhanVienFrame extends javax.swing.JFrame {
    JButton go;
    String sourceFolder="";
    String theFile="";
    JFileChooser chooser;
    String choosertitle;
   static final String url="jdbc:sqlserver://localhost;databaseName=QUANLYBANHANG;user=sa;password=123";
    /**
     * Creates new form NewJFrame
     */
    public  B_QuanLyNhanVienFrame() {
        initComponents();
        dongHo();
        setPanel();
        getContentPane().setBackground(new Color(245,245,245));
        loadToTable();
        txtNgaySinh.setDateFormatString("dd-MM-yyyy");
        txtNgayVao.setDateFormatString("dd-MM-yyyy");
        sortTable();
    }

    public void setPanel(){
        JLabel background;
        ImageIcon img=new ImageIcon(getClass().getResource("/Img_Background/NhanVienFrame_PanelThem.png"));
        background =new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,400,1600);
        panelThem.add(background);
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        rdoTimKiem = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        pnltructhuoc = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHoVaTen = new javax.swing.JTextField();
        cboRole = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cboGioiTinh = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtDienThoai = new javax.swing.JTextField();
        txtNgayVao = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtLuong = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        txtNgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        lblIndex = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblLengh = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblDongHo = new javax.swing.JLabel();
        lblNgay = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblAnhDaiDien = new javax.swing.JLabel();
        btnXoaAnh = new javax.swing.JButton();
        txtChooseFile = new javax.swing.JButton();
        panelThem = new javax.swing.JPanel();
        lblAnhAccount = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblAccount = new javax.swing.JLabel();
        btnDangxuat = new javax.swing.JButton();
        btnFullTable = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rdoTheoMa = new javax.swing.JRadioButton();
        rdoTheoTen = new javax.swing.JRadioButton();
        rdoAll = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setTitle("Quản lý nhân sự");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Quản lý nhân sự");

        pnltructhuoc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        pnltructhuoc.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Họ và Tên* :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Role :");

        cboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản lý", "Nhân viên" }));

        javax.swing.GroupLayout pnltructhuocLayout = new javax.swing.GroupLayout(pnltructhuoc);
        pnltructhuoc.setLayout(pnltructhuocLayout);
        pnltructhuocLayout.setHorizontalGroup(
            pnltructhuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnltructhuocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnltructhuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(pnltructhuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnltructhuocLayout.createSequentialGroup()
                        .addComponent(cboRole, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtHoVaTen))
                .addContainerGap())
        );
        pnltructhuocLayout.setVerticalGroup(
            pnltructhuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnltructhuocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnltructhuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(pnltructhuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin cá nhân", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Giới tính* :");

        cboGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cboGioiTinh.setMaximumSize(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Ngày vào *:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Điện thoại* :");

        txtDienThoai.setMaximumSize(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboGioiTinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNgayVao, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cboGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtNgayVao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Ngày sinh :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Lương*:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Số CMND* :");

        txtLuong.setMaximumSize(null);

        txtCMND.setMaximumSize(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCMND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Địa chỉ :");

        txtDiaChi.setColumns(20);
        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDiaChi.setRows(5);
        jScrollPane1.setViewportView(txtDiaChi);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnFirst.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_Icon/First.png"))); // NOI18N
        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_Icon/lui.png"))); // NOI18N
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_Icon/tien.png"))); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_Icon/den_cuoi.png"))); // NOI18N
        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel25.setText("Record :");

        lblIndex.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblIndex.setForeground(new java.awt.Color(255, 0, 0));
        lblIndex.setText("  0");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel27.setText("of");

        lblLengh.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblLengh.setForeground(new java.awt.Color(255, 0, 0));
        lblLengh.setText("0");

        tblNhanVien.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Họ và Tên", "Role", "Số diện thoại"
            }
        ));
        tblNhanVien.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblNhanVien);

        btnNew.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_Icon/don_dep.png"))); // NOI18N
        btnNew.setText("  New");
        btnNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewMouseExited(evt);
            }
        });
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_Icon/them.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_Icon/xoa.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_Icon/exit_30px.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblDongHo.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lblDongHo.setForeground(new java.awt.Color(0, 0, 204));
        lblDongHo.setText("Giờ");

        lblNgay.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNgay.setForeground(new java.awt.Color(0, 51, 204));
        lblNgay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNgay.setText("Ngày");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("(*) :bắt buộc ghi ");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUserName.setMinimumSize(new java.awt.Dimension(6, 25));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword.setMinimumSize(new java.awt.Dimension(6, 25));

        lblId.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        lblId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_Icon/profile_50px.png"))); // NOI18N
        lblId.setText("UserName*:");

        lblName.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        lblName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_Icon/female_profile_50px.png"))); // NOI18N
        lblName.setText("Password* :");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblId)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblAnhDaiDien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnXoaAnh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoaAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_Icon/delete1_30px.png"))); // NOI18N
        btnXoaAnh.setText("Xóa ảnh");
        btnXoaAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaAnhActionPerformed(evt);
            }
        });

        txtChooseFile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtChooseFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_Icon/mo_hinh.png"))); // NOI18N
        txtChooseFile.setText("Chọn ảnh");
        txtChooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChooseFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblAnhDaiDien, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoaAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChooseFile))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtChooseFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoaAnh))
                    .addComponent(lblAnhDaiDien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lblAnhAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_Icon/account_120px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Xin chào");

        lblAccount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAccount.setForeground(new java.awt.Color(255, 255, 255));
        lblAccount.setAutoscrolls(true);

        btnDangxuat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_Icon/dang_xuat.png"))); // NOI18N
        btnDangxuat.setText("Đăng xuất");
        btnDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangxuatActionPerformed(evt);
            }
        });

        btnFullTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFullTable.setForeground(new java.awt.Color(0, 0, 255));
        btnFullTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_Icon/phong__to.png"))); // NOI18N
        btnFullTable.setText("Full Table");
        btnFullTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFullTableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFullTableMouseExited(evt);
            }
        });
        btnFullTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFullTableActionPerformed(evt);
            }
        });

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tìm kiếm :");

        rdoTimKiem.add(rdoTheoMa);
        rdoTheoMa.setForeground(new java.awt.Color(255, 255, 255));
        rdoTheoMa.setText("Mã");
        rdoTheoMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoTheoMaActionPerformed(evt);
            }
        });

        rdoTimKiem.add(rdoTheoTen);
        rdoTheoTen.setForeground(new java.awt.Color(255, 255, 255));
        rdoTheoTen.setText("Tên");
        rdoTheoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoTheoTenActionPerformed(evt);
            }
        });

        rdoTimKiem.add(rdoAll);
        rdoAll.setForeground(new java.awt.Color(255, 255, 255));
        rdoAll.setText("Tất cả");
        rdoAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelThemLayout = new javax.swing.GroupLayout(panelThem);
        panelThem.setLayout(panelThemLayout);
        panelThemLayout.setHorizontalGroup(
            panelThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThemLayout.createSequentialGroup()
                .addGroup(panelThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelThemLayout.createSequentialGroup()
                        .addGroup(panelThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelThemLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(panelThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAnhAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelThemLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelThemLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addGap(32, 32, 32))
                    .addGroup(panelThemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTimKiem)
                            .addGroup(panelThemLayout.createSequentialGroup()
                                .addComponent(rdoAll)
                                .addGap(18, 18, 18)
                                .addComponent(rdoTheoMa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoTheoTen)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(panelThemLayout.createSequentialGroup()
                .addGroup(panelThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelThemLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnDangxuat))
                    .addComponent(lblAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelThemLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnFullTable, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelThemLayout.setVerticalGroup(
            panelThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThemLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblAnhAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addComponent(lblAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFullTable)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoTheoMa)
                    .addComponent(rdoTheoTen)
                    .addComponent(rdoAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDangxuat)
                .addGap(22, 22, 22))
        );

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_Icon/return_30px.png"))); // NOI18N
        jButton2.setText("Return");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(440, 440, 440)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(btnNew)
                                .addGap(45, 45, 45)
                                .addComponent(btnSave)
                                .addGap(45, 45, 45)
                                .addComponent(btnDelete)
                                .addGap(45, 45, 45)
                                .addComponent(btnExit))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pnltructhuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel26))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFirst)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPrevious)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblIndex)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLengh)
                                .addGap(18, 18, 18)
                                .addComponent(btnNext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLast)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(293, 293, 293)
                                        .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(lblNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(panelThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addComponent(jButton2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblDongHo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNgay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnltructhuoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnNew)
                                    .addComponent(btnSave)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDelete)
                                    .addComponent(btnExit))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnPrevious)
                                    .addComponent(jLabel25)
                                    .addComponent(lblIndex)
                                    .addComponent(jLabel27)
                                    .addComponent(lblLengh)
                                    .addComponent(btnFirst)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnNext)
                                .addComponent(btnLast)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void resetFill(){
        txtUserName.setText("");
        txtPassword.setText("");
        txtHoVaTen.setText("");
        btnXoaAnhActionPerformed(null);
        txtNgayVao.setDate(null);
        txtDienThoai.setText("");
        txtNgaySinh.setDate(null);
        txtLuong.setText("");
        txtCMND.setText("");
        txtDiaChi.setText("");
    }
  
    

  

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
      resetFill(); 
      setWhile();// TODO add your handling code here:
    }//GEN-LAST:event_btnNewActionPerformed
    public void setWhile(){
        txtUserName.setBackground(Color.white);
        txtPassword.setBackground(Color.white);
        txtHoVaTen.setBackground(Color.white);
        txtNgayVao.setBackground(Color.white);
        txtDienThoai.setBackground(Color.white);
        txtNgaySinh.setBackground(Color.white);
        txtLuong.setBackground(Color.white);
        txtCMND.setBackground(Color.white);
        txtDiaChi.setBackground(Color.white);
    }
    public void setWhite(){
        txtDienThoai.setBackground(Color.white);
        txtNgaySinh.setBackground(Color.white);
        txtCMND.setBackground(Color.white);
    }
     private boolean checkNullFn(){
        String checkNull="";  
        if(txtUserName.getText().equals("")){
            checkNull =checkNull+"-Username";
            txtUserName.setBackground(new Color(255,135,135));
        }
        if(txtPassword.getText().equals("")){
            checkNull =checkNull+"-Password";
            txtPassword.setBackground(new Color(255,135,135));
        }
        if(txtHoVaTen.getText().equals("")){
            checkNull =checkNull+"-Họ và tên";
            txtHoVaTen.setBackground(new Color(255,135,135));
        }
        if(txtNgayVao.getDate()==null){
            checkNull =checkNull+"-Ngày vào làm";
            txtNgayVao.setBackground(new Color(255,135,135));
        }
        if(txtDienThoai.getText().equals("")){
            checkNull =checkNull+"-Số điện thoại";
            txtDienThoai.setBackground(new Color(255,135,135));
        }
        if(txtLuong.getText().equals("")){
            checkNull =checkNull+"-Lương";
            txtLuong.setBackground(new Color(255,135,135));
        }
        if(txtCMND.getText().equals("")){
            checkNull =checkNull+"-CMND ";
            txtCMND.setBackground(new Color(255,135,135));
        }
        if(!checkNull.equals("")){
            JOptionPane.showMessageDialog(this, checkNull +": Không được để trống");
            return false; 
        }
        return true;
     }
    private boolean checkFormatFn(){
        String partternEmail="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        String partternPhone="^0\\d{9}$";
        String partternCMND="\\d{12}";
        String checkFormatString="";
        if(!txtDienThoai.getText().matches(partternPhone)){
            checkFormatString=checkFormatString+"Số điện thoại phải bắt đầu từ số 0 và gốm 10 số \n";
            txtDienThoai.setBackground(new Color(255,135,135));
        }
        if(!txtCMND.getText().matches(partternCMND)){
            checkFormatString=checkFormatString+"CMND phải gồm 12 số\n ";
            txtCMND.setBackground(new Color(255,135,135));
        }
        if(txtNgaySinh.getDate().compareTo(txtNgayVao.getDate())>0){
            checkFormatString=checkFormatString+"Ngày vào làm phải lớn hơn ngày sinh\n ";
        }
        if(!checkFormatString.equals("")){
            JOptionPane.showMessageDialog(this, checkFormatString);
            return false ;
        }
        
        return true;
    }  
    public boolean checkTrungFnInsert(){
        String CheckTrung="";
        Connection cn=null;
        Statement st=null;
        try{
            cn=DriverManager.getConnection(url);
            st=cn.createStatement();
            String query="select manhanvien_username,dienthoai,socmnd from nhanvien";
            ResultSet rs= st.executeQuery(query);
            String sdt,cmnd = null;
            sdt=txtDienThoai.getText();
            cmnd=txtCMND.getText();
            while(rs.next()){
                if( sdt.equals(rs.getString("dienthoai")))
                {
                    CheckTrung=CheckTrung+"Số điện thoại bị trùng\n";
                    txtDienThoai.setBackground(new Color(255,135,135));
                }
                if(cmnd.equals(rs.getString("socmnd")))
                {
                    CheckTrung=CheckTrung+"Số CMND bị trùng\n";
                    txtCMND.setBackground(new Color(255,135,135));
                }
               
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        if(!CheckTrung.equals("")){
            JOptionPane.showMessageDialog(this, CheckTrung);
            return false;
        }
        return true;
    }
    public boolean checkTrungFnUpdate(){
        String CheckTrung="";
        Connection cn=null;
        Statement st=null;
        try{
            cn=DriverManager.getConnection(url);
            st=cn.createStatement();
            String query="select manhanvien_username,dienthoai,socmnd from nhanvien";
            ResultSet rs= st.executeQuery(query);
            String sdt,cmnd,manv = null;
            manv=txtUserName.getText();
            sdt=txtDienThoai.getText();
            cmnd=txtCMND.getText();
            while(rs.next()){
                if(manv.equals(rs.getString("manhanvien_username"))){
                }else{
                    if( sdt.equals(rs.getString("dienthoai")))
                    {
                        CheckTrung=CheckTrung+"Số điện thoại bị trùng\n";
                        txtDienThoai.setBackground(new Color(255,135,135));
                    }
                    if(cmnd.equals(rs.getString("socmnd")))
                    {
                        CheckTrung=CheckTrung+"Số CMND bị trùng\n";
                        txtCMND.setBackground(new Color(255,135,135));
                    }
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        if(!CheckTrung.equals("")){
            JOptionPane.showMessageDialog(this, CheckTrung);
            return false;
        }
        return true;
    }
    private void insertTableNhanVien(){
        Connection cn=null;
        Statement st=null;
        try{
            String hinh="";
            try{
                hinh= lblAnhDaiDien.getIcon().toString();
                hinh= hinh.substring(hinh.lastIndexOf("/")+1, hinh.length());
            }catch(NullPointerException e){}
            cn=DriverManager.getConnection(url);
            String query =" insert nhanvien(manhanvien_username,password,tennhanvien,role,anhdaidien,gioitinh,ngayvaolam,dienthoai,ngaysinh,luong,socmnd,diachi)"
                    + " values(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps=cn.prepareStatement(query);
            ps.setString(1, txtUserName.getText());
            ps.setString(2, txtPassword.getText());
            ps.setString(3, txtHoVaTen.getText());
            ps.setString(4, cboRole.getSelectedItem().toString());
            if(hinh.equals("")){
                ps.setNull(5, Types.NVARCHAR);
            }else{
                ps.setString(5, hinh);
            }
            boolean gioitinhBit=cboGioiTinh.getSelectedItem().toString().equals("Nam");
            ps.setBoolean(6,  gioitinhBit  );
            ps.setDate(7, new java.sql.Date(txtNgayVao.getDate().getTime()) );
            ps.setString(8, txtDienThoai.getText());
            if(txtNgaySinh.getDate()==null){
                ps.setNull(9, Types.DATE);
            }else{
                ps.setDate(9,  new java.sql.Date(txtNgaySinh.getDate().getTime()));
            }
            if(txtLuong.getText().equals("")){
                ps.setNull(10,Types.DOUBLE);
            }else{
                 ps.setDouble(10, Double.parseDouble(txtLuong.getText()));
            }
            ps.setString(11, txtCMND.getText());
            if(txtDiaChi.getText().equals("")){
                ps.setNull(12, Types.NVARCHAR);
            }else{
                ps.setString(12, txtDiaChi.getText());
            }
            
            ps.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    private void updateTableNhanVien(){
        Connection cn=null;
        Statement st=null;
        try{
            String hinh="";
            try{
                hinh= lblAnhDaiDien.getIcon().toString();
                hinh= hinh.substring(hinh.lastIndexOf("/")+1, hinh.length());
            }catch(NullPointerException e){}
            cn=DriverManager.getConnection(url);
            String query =" update nhanvien set password = ? , tennhanvien = ? , role = ? , anhdaidien = ? ,"
                    + "gioitinh = ? ,ngayvaolam = ? , dienthoai =? ,ngaysinh =? , luong =? , socmnd = ?, diachi = ? "
                    + "where manhanvien_username like ?";
            PreparedStatement ps=cn.prepareStatement(query);
            ps.setString(1, txtPassword.getText());
            ps.setString(2, txtHoVaTen.getText());
            ps.setString(3, cboRole.getSelectedItem().toString());
            if(hinh.equals("")){
                ps.setNull(4, Types.NVARCHAR);
            }else{
                ps.setString(4, hinh);
            }
            boolean gioitinhBit=cboGioiTinh.getSelectedItem().toString().equals("Nam");
            ps.setBoolean(5,  gioitinhBit  );
            ps.setDate(6, new java.sql.Date(txtNgayVao.getDate().getTime()) );
            ps.setString(7, txtDienThoai.getText());
            if(txtNgaySinh.getDate()==null){
                ps.setNull(8, Types.DATE);
            }else{
                ps.setDate(8,  new java.sql.Date(txtNgaySinh.getDate().getTime()));
            }
            if(txtLuong.getText().equals("")){
                ps.setNull(9,Types.DOUBLE);
            }else{
                 ps.setDouble(9, Double.parseDouble(txtLuong.getText()));
            }
            ps.setString(10, txtCMND.getText());
            if(txtDiaChi.getText().equals("")){
                ps.setNull(11, Types.NVARCHAR);
            }else{
                ps.setString(11, txtDiaChi.getText());
            }
            ps.setString(12, txtUserName.getText());
            ps.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void loadToTable(){
        Connection connection;
        java.sql.Statement statement;
        ResultSet resultSet ;
            try{
                connection=DriverManager.getConnection(url);
                statement = connection.createStatement();
                String query ="select *from nhanvien";
                resultSet =statement.executeQuery(query);
                DefaultTableModel model=(DefaultTableModel)tblNhanVien.getModel();
                model.setRowCount(0);
                while(resultSet.next()){
                    model.addRow(new Object[]{
                        resultSet.getString("manhanvien_username"),
                        resultSet.getString("tennhanvien"),
                        resultSet.getString("role"),
                        resultSet.getString("dienthoai"),
                    });
                        ;
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
    }
    private boolean checkTrungMaSo(){
        Connection cn=null;
        Statement st=null;
        try{
            cn=DriverManager.getConnection(url);
            st=cn.createStatement();
            String query="select manhanvien_username from nhanvien";
            ResultSet rs= st.executeQuery(query);
            String sdt,cmnd,manv = null;
            manv=txtUserName.getText();
            while(rs.next()){
                if(manv.equals(rs.getString("manhanvien_username")))
                {
                    return false;
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return true;
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        setWhite();
        if(!checkTrungMaSo()){// Trung maso
            if(!checkNullFn()){
                return;
            }
            if(!checkTrungFnUpdate()){
                return;
            }
            if(!checkFormatFn()){
                return;
            }
            updateTableNhanVien();
        }else{//Khon trung 
            if(!checkNullFn()){
            return;
            }
            if(!checkTrungFnInsert()){
                return;
            }
            if(!checkFormatFn()){
                return;
            }
            insertTableNhanVien();
        }
        
        
        loadToTable();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         if(rdoAll.isSelected()){
            rdoAllActionPerformed(null);
        }else if(rdoTheoMa.isSelected()){
            rdoTheoMaActionPerformed(null);
        }else if(rdoTheoTen.isSelected()){
            rdoTheoTenActionPerformed(null);
        }   
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        int soChon=tblNhanVien.getSelectedRow();
        if(soChon==tblNhanVien.getRowCount()-1){
            soChon=-1;
        }
        tblNhanVien.setRowSelectionInterval(soChon+1, soChon+1);
        tblNhanVienMouseClicked(null);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        int soChon=tblNhanVien.getSelectedRow();
        if(soChon==0||soChon==-1){
            soChon=tblNhanVien.getRowCount();
        }
        tblNhanVien.setRowSelectionInterval(soChon-1, soChon-1);
        tblNhanVienMouseClicked(null);
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
       tblNhanVien.setRowSelectionInterval(0, 0);
       tblNhanVienMouseClicked(null);
    }//GEN-LAST:event_btnFirstActionPerformed
    private void sortTable(){
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tblNhanVien.getModel());
        tblNhanVien.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
        sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
    }
    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        tblNhanVien.setRowSelectionInterval(tblNhanVien.getRowCount()-1,tblNhanVien.getRowCount()-1);
        tblNhanVienMouseClicked(null);
    }//GEN-LAST:event_btnLastActionPerformed
    private void fillText(String maso){
        Connection cn=null;
        Statement st=null;
        try{
            cn=DriverManager.getConnection(url);
            st=cn.createStatement();
            String query="select *from nhanvien where manhanvien_username like '"+maso+"'";
            ResultSet rs=st.executeQuery(query);
                while(rs.next()){
                    txtUserName.setText(rs.getString("manhanvien_username"));
                    txtPassword.setText(rs.getString("password"));
                    txtHoVaTen.setText(rs.getString("tennhanvien"));
                    txtDienThoai.setText(rs.getString("dienthoai"));
                    txtLuong.setText(String.valueOf(rs.getString("luong")));
                    txtCMND.setText(rs.getString("socmnd"));
                    txtDiaChi.setText(rs.getString("diachi"));
                    
                    txtNgaySinh.setDate(rs.getDate("ngaysinh"));
                    txtNgayVao.setDate(rs.getDate("ngayvaolam"));
                            
                    cboRole.setSelectedItem(rs.getString("role"));
                    cboGioiTinh.setSelectedItem((rs.getString("gioitinh").equals("0")?"Nam":"Nữ"));
                    
                    try{
                        lblAnhDaiDien.setIcon(new ImageIcon(getClass().getResource("/Img_AnhDaiDien/"+rs.getString("anhdaidien"))));
                    }catch(NullPointerException e){
                        btnXoaAnhActionPerformed(null);
                    }
                    
                }
        }catch(SQLException e){
            e.printStackTrace();
        }
    
    }
    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        fillText((String) tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(), 0));
        setWhite();
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnFullTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFullTableActionPerformed
       
    }//GEN-LAST:event_btnFullTableActionPerformed
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int chose=JOptionPane.showConfirmDialog(this, "Bạn có muốn hoàn tất không ?");
        if(chose==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtChooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChooseFileActionPerformed
     chooser = new JFileChooser(); 
     chooser.setCurrentDirectory(new java.io.File("."));
     chooser.setDialogTitle(choosertitle);
     FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "JPG, PNG & GIF Images", "jpg", "gif", "png");
     chooser.setFileFilter(filter);
     chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    
    
    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
      
         String dirr = "" + chooser.getCurrentDirectory();
         File file = chooser.getSelectedFile();
       
      if(dirr.substring(dirr.length()-1,dirr.length()).equals(".")){
           dirr = dirr.substring(0,dirr.length()-1);
           sourceFolder=""+dirr + "" + file.getName();
        }else{
            
            sourceFolder=""+dirr + "/" + file.getName();
        }

    
      }else {
      }
        lblAnhDaiDien.setIcon(new ImageIcon(sourceFolder));

    }//GEN-LAST:event_txtChooseFileActionPerformed

    private void btnXoaAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaAnhActionPerformed
              lblAnhDaiDien.setIcon(new ImageIcon(getClass().getResource("")));  
    }//GEN-LAST:event_btnXoaAnhActionPerformed
   
    private void btnDangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangxuatActionPerformed
    
    }//GEN-LAST:event_btnDangxuatActionPerformed

    private void btnNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseEntered
        btnNew.setBackground(new Color(255,0,153));
        btnNew.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewMouseEntered

    private void btnNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseExited
           btnNew.setBackground(new Color(240,240,240));
        btnNew.setForeground(Color.black);      // TODO add your handling code here:
    }//GEN-LAST:event_btnNewMouseExited

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setBackground(new Color(255,0,153));
        btnDelete.setForeground(Color.white);    // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
         btnDelete.setBackground(new Color(240,240,240));
        btnDelete.setForeground(Color.black); // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        btnSave.setBackground(new Color(255,0,153));
        btnSave.setForeground(Color.white);          // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
         btnExit.setBackground(new Color(255,0,153));
        btnExit.setForeground(Color.white);   
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        btnSave.setBackground(new Color(240,240,240));
        btnSave.setForeground(Color.black);
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
       btnExit.setBackground(new Color(240,240,240));
        btnExit.setForeground(Color.black); // TODO add your handling code here:
    }//GEN-LAST:event_btnExitMouseExited

    private void btnFullTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFullTableMouseEntered
        btnFullTable.setBackground(new Color(0,51,255));
       btnFullTable.setForeground(Color.white);
    }//GEN-LAST:event_btnFullTableMouseEntered

    private void btnFullTableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFullTableMouseExited
        btnFullTable.setBackground(new Color(240,240,240));
       btnFullTable.setForeground(new Color(0,0,255));// TODO add your handling code here:
    }//GEN-LAST:event_btnFullTableMouseExited
  
    private void txtTimKiemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyTyped
    }//GEN-LAST:event_txtTimKiemKeyTyped

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
       if(rdoAll.isSelected()){
            rdoAllActionPerformed(null);
        }else if(rdoTheoMa.isSelected()){
            rdoTheoMaActionPerformed(null);
        }else if(rdoTheoTen.isSelected()){
            rdoTheoTenActionPerformed(null);
        }
    }//GEN-LAST:event_txtTimKiemKeyPressed

    private void rdoAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoAllActionPerformed
        loadToTable();        // TODO add your handling code here:
    }//GEN-LAST:event_rdoAllActionPerformed

    private void rdoTheoMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoTheoMaActionPerformed
        Connection connection;
        java.sql.Statement statement;
        ResultSet resultSet ;
            try{
                connection=DriverManager.getConnection(url);
                statement = connection.createStatement();
                String query ="select *from nhanvien where manhanvien_username like '%"+txtTimKiem.getText()+"%'";
                resultSet =statement.executeQuery(query);
                DefaultTableModel model=(DefaultTableModel)tblNhanVien.getModel();
                model.setRowCount(0);
                while(resultSet.next()){
                    model.addRow(new Object[]{
                        resultSet.getString("manhanvien_username"),
                        resultSet.getString("tennhanvien"),
                        resultSet.getString("role"),
                        resultSet.getString("dienthoai"),
                    });
                        ;
                }
            }catch(SQLException e){
                e.printStackTrace();
            } 
    }//GEN-LAST:event_rdoTheoMaActionPerformed

    private void rdoTheoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoTheoTenActionPerformed
        Connection connection;
        java.sql.Statement statement;
        ResultSet resultSet ;
            try{
                connection=DriverManager.getConnection(url);
                statement = connection.createStatement();
                String query ="select *from nhanvien where tennhanvien like '%"+txtTimKiem.getText()+"%'";
                resultSet =statement.executeQuery(query);
                DefaultTableModel model=(DefaultTableModel)tblNhanVien.getModel();
                model.setRowCount(0);
                while(resultSet.next()){
                    model.addRow(new Object[]{
                        resultSet.getString("manhanvien_username"),
                        resultSet.getString("tennhanvien"),
                        resultSet.getString("role"),
                        resultSet.getString("dienthoai"),
                    });
                        ;
                }
            }catch(SQLException e){
                e.printStackTrace();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_rdoTheoTenActionPerformed
        public void dongHo(){
        Thread clock;
           clock = new Thread() {
               public void run() {
                   try {
                       while (true) {
                           Calendar cal = new GregorianCalendar();
                           int second = cal.get(Calendar.SECOND);
                           int minute = cal.get(Calendar.MINUTE);
                           int hour = cal.get(Calendar.HOUR_OF_DAY);
                           String thu;
                           int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
                           if (dayOfWeek == 1) {
                               thu = "Chủ nhật";
                           } else {
                               thu = "Thứ " + Integer.toString(dayOfWeek);
                           }
                           int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
                           int month = cal.get(Calendar.MONTH);
                           int year = cal.get(Calendar.YEAR);
                           lblDongHo.setText(hour + ":" + minute + ":" + second);
                           lblNgay.setText(thu + " ngày " + dayOfMonth + " tháng " + (month + 1) + " năm " + year);
                           sleep(1000);
                       }
                   } catch (Exception e) {
                       e.printStackTrace();
                   }
               }
           };
    clock.start();
    }
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
            java.util.logging.Logger.getLogger(B_QuanLyNhanVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(B_QuanLyNhanVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(B_QuanLyNhanVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(B_QuanLyNhanVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new B_QuanLyNhanVienFrame().setVisible(true);
                ImageIcon ig=new ImageIcon(getClass().getResource("/Img_Icon/iconfram.png"));
                B_QuanLyNhanVienFrame nvf=new B_QuanLyNhanVienFrame();
                nvf.setIconImage(ig.getImage());
                nvf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangxuat;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnFullTable;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnXoaAnh;
    private javax.swing.JComboBox<String> cboGioiTinh;
    private javax.swing.JComboBox<String> cboRole;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblAnhAccount;
    private javax.swing.JLabel lblAnhDaiDien;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIndex;
    private javax.swing.JLabel lblLengh;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNgay;
    private javax.swing.JPanel panelThem;
    private javax.swing.JPanel pnltructhuoc;
    private javax.swing.JRadioButton rdoAll;
    private javax.swing.JRadioButton rdoTheoMa;
    private javax.swing.JRadioButton rdoTheoTen;
    private javax.swing.ButtonGroup rdoTimKiem;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JButton txtChooseFile;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JTextField txtLuong;
    private com.toedter.calendar.JDateChooser txtNgaySinh;
    private com.toedter.calendar.JDateChooser txtNgayVao;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

  
  
}
