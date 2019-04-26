/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRAMES;

import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JRViewer;
import static org.apache.poi.hssf.usermodel.HeaderFooter.file;

/**
 *
 * @author Meow-Meow!
 */
public class MemberDashboard extends javax.swing.JFrame {

    String path = null;
    String pathxls = null;
    String filename;
    static ImageIcon icon;

    public MemberDashboard() {

        initComponents();
        new Thread() {

            public void run() {
                while (true) {
                    Date timenow = new Date();
                    Date datenow = new Date();
                    Date todaysalenow = new Date();
                    SimpleDateFormat sdft = new SimpleDateFormat("hh:mm:ss a");
                    SimpleDateFormat sdfd = new SimpleDateFormat("dd / MM / yyyy");
                    SimpleDateFormat sdftodaysales = new SimpleDateFormat("yyyy-MM-dd");
                    String time = "" + sdft.format(timenow);
                    String date = "" + sdfd.format(datenow);
                    String todaysalesdate = "" + sdftodaysales.format(todaysalenow);
                }
            }

        }.start();
        MemberDashboard.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        MemberDashboard.this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setIcon();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        if ((width == 1024.0 && height == 768.0) || (width == 800.0 && height == 600.0) || (width == 1280.0 && height == 600.0) || (width == 1280.0 && height == 720.0) || (width == 1280.0 && height == 768.0)) {
            forlowresolution.setVisible(true);
            MemberPanel.setVisible(false);
        }
        refreshstocktableinpos();
        generateInvoiceID();

    }

    public MemberDashboard(String para) {
        initComponents();
        new Thread() {

            public void run() {
                while (true) {
                    Date timenow = new Date();
                    Date datenow = new Date();
                    Date todaysalenow = new Date();
                    SimpleDateFormat sdft = new SimpleDateFormat("hh:mm:ss a");
                    SimpleDateFormat sdfd = new SimpleDateFormat("dd / MM / yyyy");
                    SimpleDateFormat sdftodaysales = new SimpleDateFormat("yyyy-MM-dd");
                    String time = "" + sdft.format(timenow);
                    String date = "" + sdfd.format(datenow);
                    String todaysalesdate = "" + sdftodaysales.format(todaysalenow);
                    timelbl.setText(time);
                    datelbl.setText(date);
                }
            }

        }.start();
        MemberDashboard.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        MemberDashboard.this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setIcon();
        loggeduser.setText(para);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        if ((width == 1024.0 && height == 768.0) || (width == 800.0 && height == 600.0) || (width == 1280.0 && height == 600.0) || (width == 1280.0 && height == 720.0) || (width == 1280.0 && height == 768.0)) {
            forlowresolution.setVisible(true);
            MemberPanel.setVisible(false);
        }
        refreshstocktableinpos();
        generateInvoiceID();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MemberPanel = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        loggeduser = new javax.swing.JLabel();
        Maincardpanel = new javax.swing.JPanel();
        SalesPanel = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        pospanel = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        printinvoicebtn = new javax.swing.JButton();
        poscancelbtn = new javax.swing.JButton();
        sellbtn = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        paymentfield = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        totalinpos = new javax.swing.JTextField();
        discountfield = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        vatfield = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        nettotalfield = new javax.swing.JTextField();
        balancefield = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel62 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pospanelk = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        cartlisttable = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        stocktableinpostable = new javax.swing.JTable();
        jLabel53 = new javax.swing.JLabel();
        searchinposfield = new javax.swing.JTextField();
        searchcomboinpos = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        quantityinpos = new javax.swing.JTextField();
        additeminpos = new javax.swing.JButton();
        removeitemfromlistbtn = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        Sellidfield = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        Billokbtn = new javax.swing.JButton();
        invoice = new javax.swing.JPanel();
        invoicetab = new javax.swing.JTabbedPane();
        backtopos = new javax.swing.JButton();
        sellrecordspanel = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        salesrecordstable = new javax.swing.JTable();
        printinvoicebtninsellrecords = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        billbumberfieldinsellrecords = new javax.swing.JTextField();
        findbtn = new javax.swing.JButton();
        sellrecordstab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Send = new javax.swing.JButton();
        msg = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        datelbl = new javax.swing.JLabel();
        timelbl = new javax.swing.JLabel();
        poslbl = new javax.swing.JLabel();
        sellrecordslbl = new javax.swing.JLabel();
        forlowresolution = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stockplus App");
        setUndecorated(true);
        setResizable(false);

        MemberPanel.setBackground(new java.awt.Color(244, 248, 255));

        header.setBackground(new java.awt.Color(0, 0, 0));
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headerMouseClicked(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FRAMES/images/log-out-symbol.png"))); // NOI18N
        close.setToolTipText("Logout");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("STOCK PLUS ");

        loggeduser.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        loggeduser.setForeground(new java.awt.Color(255, 255, 255));
        loggeduser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loggeduser, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(close)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, headerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(close))
                    .addComponent(loggeduser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, headerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        Maincardpanel.setBackground(new java.awt.Color(244, 248, 255));
        Maincardpanel.setLayout(new java.awt.CardLayout());

        SalesPanel.setBackground(new java.awt.Color(244, 248, 255));

        jPanel10.setBackground(new java.awt.Color(51, 153, 255));
        jPanel10.setLayout(new java.awt.CardLayout());

        pospanel.setBackground(new java.awt.Color(73, 145, 255));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        printinvoicebtn.setBackground(new java.awt.Color(73, 145, 255));
        printinvoicebtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        printinvoicebtn.setForeground(new java.awt.Color(255, 255, 255));
        printinvoicebtn.setText("Print Invoice");
        printinvoicebtn.setContentAreaFilled(false);
        printinvoicebtn.setFocusPainted(false);
        printinvoicebtn.setOpaque(true);
        printinvoicebtn.setPreferredSize(new java.awt.Dimension(140, 40));
        printinvoicebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printinvoicebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printinvoicebtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                printinvoicebtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                printinvoicebtnMouseReleased(evt);
            }
        });
        printinvoicebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printinvoicebtnActionPerformed(evt);
            }
        });

        poscancelbtn.setBackground(new java.awt.Color(73, 145, 255));
        poscancelbtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        poscancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        poscancelbtn.setText("Cancel/Next");
        poscancelbtn.setContentAreaFilled(false);
        poscancelbtn.setFocusPainted(false);
        poscancelbtn.setOpaque(true);
        poscancelbtn.setPreferredSize(new java.awt.Dimension(140, 40));
        poscancelbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                poscancelbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                poscancelbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                poscancelbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                poscancelbtnMouseReleased(evt);
            }
        });
        poscancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poscancelbtnActionPerformed(evt);
            }
        });

        sellbtn.setBackground(new java.awt.Color(73, 145, 255));
        sellbtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        sellbtn.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn.setText("Sell");
        sellbtn.setContentAreaFilled(false);
        sellbtn.setFocusPainted(false);
        sellbtn.setOpaque(true);
        sellbtn.setPreferredSize(new java.awt.Dimension(140, 40));
        sellbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sellbtnMouseReleased(evt);
            }
        });
        sellbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtnActionPerformed(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel59.setText("Balance");

        paymentfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        paymentfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        paymentfield.setSelectionColor(new java.awt.Color(204, 0, 204));
        paymentfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentfieldActionPerformed(evt);
            }
        });
        paymentfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paymentfieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paymentfieldKeyTyped(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel58.setText("Payment");

        jLabel57.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel57.setText("Total");

        totalinpos.setEditable(false);
        totalinpos.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        totalinpos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        totalinpos.setSelectionColor(new java.awt.Color(204, 0, 204));

        discountfield.setEditable(false);
        discountfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        discountfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        discountfield.setText("0");
        discountfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        discountfield.setSelectionColor(new java.awt.Color(204, 0, 204));
        discountfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountfieldActionPerformed(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel60.setText("-%");

        vatfield.setEditable(false);
        vatfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        vatfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vatfield.setText("0");
        vatfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        vatfield.setSelectionColor(new java.awt.Color(204, 0, 204));
        vatfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vatfieldActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel61.setText("+%");

        nettotalfield.setEditable(false);
        nettotalfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        nettotalfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        nettotalfield.setSelectionColor(new java.awt.Color(204, 0, 204));
        nettotalfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nettotalfieldActionPerformed(evt);
            }
        });

        balancefield.setEditable(false);
        balancefield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        balancefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        balancefield.setSelectionColor(new java.awt.Color(204, 0, 204));
        balancefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balancefieldActionPerformed(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel62.setText("Net Total");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalinpos, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox1)
                        .addGap(0, 0, 0)
                        .addComponent(discountfield, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox2)
                        .addGap(0, 0, 0)
                        .addComponent(vatfield, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(nettotalfield, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(poscancelbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(printinvoicebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sellbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(jLabel59))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(balancefield)
                            .addComponent(paymentfield, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalinpos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(discountfield, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(vatfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(nettotalfield, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(balancefield, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(sellbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(poscancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(printinvoicebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.CardLayout());

        pospanelk.setBackground(new java.awt.Color(255, 255, 255));

        cartlisttable.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        cartlisttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Id", "Item Name", "Per Price", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartlisttable.setGridColor(new java.awt.Color(255, 255, 255));
        cartlisttable.setRowHeight(22);
        cartlisttable.setSelectionBackground(new java.awt.Color(73, 145, 255));
        cartlisttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartlisttableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(cartlisttable);

        stocktableinpostable.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        stocktableinpostable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Id", "Item Name", "Stock Count", "Per Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stocktableinpostable.setGridColor(new java.awt.Color(255, 255, 255));
        stocktableinpostable.setRowHeight(22);
        stocktableinpostable.setSelectionBackground(new java.awt.Color(73, 145, 255));
        stocktableinpostable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stocktableinpostableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(stocktableinpostable);

        jLabel53.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel53.setText("Search");

        searchinposfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        searchinposfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        searchinposfield.setSelectionColor(new java.awt.Color(204, 0, 204));
        searchinposfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchinposfieldActionPerformed(evt);
            }
        });
        searchinposfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchinposfieldKeyReleased(evt);
            }
        });

        searchcomboinpos.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        searchcomboinpos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item Id", "Item Name" }));
        searchcomboinpos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchcomboinposActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel54.setText("Quantity");

        quantityinpos.setEditable(false);
        quantityinpos.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quantityinpos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        quantityinpos.setSelectionColor(new java.awt.Color(204, 0, 204));
        quantityinpos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityinposActionPerformed(evt);
            }
        });
        quantityinpos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityinposKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityinposKeyTyped(evt);
            }
        });

        additeminpos.setBackground(new java.awt.Color(73, 145, 255));
        additeminpos.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        additeminpos.setForeground(new java.awt.Color(255, 255, 255));
        additeminpos.setText("Add Item");
        additeminpos.setContentAreaFilled(false);
        additeminpos.setFocusPainted(false);
        additeminpos.setOpaque(true);
        additeminpos.setPreferredSize(new java.awt.Dimension(140, 40));
        additeminpos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                additeminposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                additeminposMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                additeminposMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                additeminposMouseReleased(evt);
            }
        });
        additeminpos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additeminposActionPerformed(evt);
            }
        });

        removeitemfromlistbtn.setBackground(new java.awt.Color(73, 145, 255));
        removeitemfromlistbtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        removeitemfromlistbtn.setForeground(new java.awt.Color(255, 255, 255));
        removeitemfromlistbtn.setText("Remove Item");
        removeitemfromlistbtn.setContentAreaFilled(false);
        removeitemfromlistbtn.setFocusPainted(false);
        removeitemfromlistbtn.setOpaque(true);
        removeitemfromlistbtn.setPreferredSize(new java.awt.Dimension(140, 40));
        removeitemfromlistbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeitemfromlistbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeitemfromlistbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                removeitemfromlistbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                removeitemfromlistbtnMouseReleased(evt);
            }
        });
        removeitemfromlistbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeitemfromlistbtnActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel55.setText("Producs Available");

        jLabel56.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel56.setText("List");

        Sellidfield.setEditable(false);
        Sellidfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Sellidfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Sellidfield.setSelectionColor(new java.awt.Color(204, 0, 204));
        Sellidfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellidfieldActionPerformed(evt);
            }
        });
        Sellidfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SellidfieldKeyReleased(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel63.setText("Sell/Invoice Id");

        Billokbtn.setBackground(new java.awt.Color(73, 145, 255));
        Billokbtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        Billokbtn.setForeground(new java.awt.Color(255, 255, 255));
        Billokbtn.setText("OK");
        Billokbtn.setContentAreaFilled(false);
        Billokbtn.setFocusPainted(false);
        Billokbtn.setOpaque(true);
        Billokbtn.setPreferredSize(new java.awt.Dimension(140, 40));
        Billokbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BillokbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BillokbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BillokbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BillokbtnMouseReleased(evt);
            }
        });
        Billokbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillokbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pospanelkLayout = new javax.swing.GroupLayout(pospanelk);
        pospanelk.setLayout(pospanelkLayout);
        pospanelkLayout.setHorizontalGroup(
            pospanelkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pospanelkLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pospanelkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pospanelkLayout.createSequentialGroup()
                        .addComponent(Billokbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeitemfromlistbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(additeminpos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pospanelkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pospanelkLayout.createSequentialGroup()
                            .addComponent(jLabel63)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Sellidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel53)
                            .addGap(53, 53, 53)
                            .addComponent(searchinposfield, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(searchcomboinpos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)
                            .addComponent(jLabel54)
                            .addGap(40, 40, 40)
                            .addComponent(quantityinpos, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                        .addComponent(jLabel55)
                        .addComponent(jLabel56)
                        .addComponent(jScrollPane6)
                        .addComponent(jScrollPane4)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pospanelkLayout.setVerticalGroup(
            pospanelkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pospanelkLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pospanelkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(searchcomboinpos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchinposfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityinpos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sellidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addGroup(pospanelkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(additeminpos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeitemfromlistbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Billokbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.add(pospanelk, "card2");

        invoice.setBackground(new java.awt.Color(255, 255, 255));

        backtopos.setBackground(new java.awt.Color(73, 145, 255));
        backtopos.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        backtopos.setForeground(new java.awt.Color(255, 255, 255));
        backtopos.setText("Back");
        backtopos.setContentAreaFilled(false);
        backtopos.setFocusPainted(false);
        backtopos.setOpaque(true);
        backtopos.setPreferredSize(new java.awt.Dimension(140, 40));
        backtopos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backtoposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backtoposMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backtoposMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backtoposMouseReleased(evt);
            }
        });
        backtopos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtoposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout invoiceLayout = new javax.swing.GroupLayout(invoice);
        invoice.setLayout(invoiceLayout);
        invoiceLayout.setHorizontalGroup(
            invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(invoicetab)
                    .addGroup(invoiceLayout.createSequentialGroup()
                        .addGap(0, 850, Short.MAX_VALUE)
                        .addComponent(backtopos, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        invoiceLayout.setVerticalGroup(
            invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(invoicetab, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(backtopos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.add(invoice, "card3");

        javax.swing.GroupLayout pospanelLayout = new javax.swing.GroupLayout(pospanel);
        pospanel.setLayout(pospanelLayout);
        pospanelLayout.setHorizontalGroup(
            pospanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pospanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1083, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pospanelLayout.setVerticalGroup(
            pospanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pospanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pospanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel10.add(pospanel, "card2");

        sellrecordspanel.setBackground(new java.awt.Color(73, 145, 255));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        salesrecordstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Itm Name", "Item Ids and Quantities", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        salesrecordstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesrecordstableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(salesrecordstable);

        printinvoicebtninsellrecords.setBackground(new java.awt.Color(73, 145, 255));
        printinvoicebtninsellrecords.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        printinvoicebtninsellrecords.setForeground(new java.awt.Color(255, 255, 255));
        printinvoicebtninsellrecords.setText("Preview Invoice");
        printinvoicebtninsellrecords.setContentAreaFilled(false);
        printinvoicebtninsellrecords.setFocusPainted(false);
        printinvoicebtninsellrecords.setOpaque(true);
        printinvoicebtninsellrecords.setPreferredSize(new java.awt.Dimension(140, 40));
        printinvoicebtninsellrecords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printinvoicebtninsellrecordsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printinvoicebtninsellrecordsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                printinvoicebtninsellrecordsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                printinvoicebtninsellrecordsMouseReleased(evt);
            }
        });
        printinvoicebtninsellrecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printinvoicebtninsellrecordsActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel47.setText("Bill Number");

        billbumberfieldinsellrecords.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        billbumberfieldinsellrecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billbumberfieldinsellrecordsActionPerformed(evt);
            }
        });

        findbtn.setBackground(new java.awt.Color(73, 145, 255));
        findbtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        findbtn.setForeground(new java.awt.Color(255, 255, 255));
        findbtn.setText("Find");
        findbtn.setContentAreaFilled(false);
        findbtn.setFocusPainted(false);
        findbtn.setOpaque(true);
        findbtn.setPreferredSize(new java.awt.Dimension(140, 40));
        findbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                findbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                findbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                findbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                findbtnMouseReleased(evt);
            }
        });
        findbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(printinvoicebtninsellrecords, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addComponent(jLabel47)
                            .addGap(157, 157, 157)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(billbumberfieldinsellrecords)
                                .addComponent(findbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(billbumberfieldinsellrecords, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(findbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(printinvoicebtninsellrecords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Send.setBackground(new java.awt.Color(73, 145, 255));
        Send.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        Send.setForeground(new java.awt.Color(255, 255, 255));
        Send.setText("Send Notification");
        Send.setContentAreaFilled(false);
        Send.setFocusPainted(false);
        Send.setOpaque(true);
        Send.setPreferredSize(new java.awt.Dimension(140, 40));
        Send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SendMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SendMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SendMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SendMouseReleased(evt);
            }
        });
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });

        msg.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        msg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgActionPerformed(evt);
            }
        });
        msg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                msgKeyTyped(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel48.setText("Send Message to Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Send, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addGap(18, 18, 18)
                .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Send, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout sellrecordspanelLayout = new javax.swing.GroupLayout(sellrecordspanel);
        sellrecordspanel.setLayout(sellrecordspanelLayout);
        sellrecordspanelLayout.setHorizontalGroup(
            sellrecordspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellrecordspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sellrecordspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sellrecordstab, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
                .addContainerGap())
        );
        sellrecordspanelLayout.setVerticalGroup(
            sellrecordspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellrecordspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sellrecordspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sellrecordspanelLayout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(sellrecordspanelLayout.createSequentialGroup()
                        .addComponent(sellrecordstab)
                        .addGap(10, 10, 10))))
        );

        jPanel10.add(sellrecordspanel, "card3");

        javax.swing.GroupLayout SalesPanelLayout = new javax.swing.GroupLayout(SalesPanel);
        SalesPanel.setLayout(SalesPanelLayout);
        SalesPanelLayout.setHorizontalGroup(
            SalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 1345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SalesPanelLayout.setVerticalGroup(
            SalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalesPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Maincardpanel.add(SalesPanel, "card4");

        footer.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("@StudioSnowflake");

        datelbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        datelbl.setForeground(new java.awt.Color(255, 255, 255));
        datelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datelbl.setName("timelbl"); // NOI18N

        timelbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        timelbl.setForeground(new java.awt.Color(255, 255, 255));
        timelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timelbl.setName("timelbl"); // NOI18N

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(datelbl, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(timelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        poslbl.setBackground(new java.awt.Color(73, 145, 255));
        poslbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        poslbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poslbl.setText("POS");
        poslbl.setOpaque(true);
        poslbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poslblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                poslblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                poslblMouseExited(evt);
            }
        });

        sellrecordslbl.setBackground(new java.awt.Color(163, 199, 255));
        sellrecordslbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        sellrecordslbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sellrecordslbl.setText("Sell Records");
        sellrecordslbl.setOpaque(true);
        sellrecordslbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellrecordslblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellrecordslblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellrecordslblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout MemberPanelLayout = new javax.swing.GroupLayout(MemberPanel);
        MemberPanel.setLayout(MemberPanelLayout);
        MemberPanelLayout.setHorizontalGroup(
            MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Maincardpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MemberPanelLayout.createSequentialGroup()
                .addComponent(poslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sellrecordslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MemberPanelLayout.setVerticalGroup(
            MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MemberPanelLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(poslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sellrecordslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Maincardpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel26.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><center>RESOLUTION NOT SUPPORTED<br>Best Resolution(1366,768)</center></html>");
        jLabel1.setOpaque(true);

        close1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FRAMES/images/cancel.png"))); // NOI18N
        close1.setToolTipText("");
        close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(close1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(378, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close1)
                .addGap(282, 282, 282))
        );

        javax.swing.GroupLayout forlowresolutionLayout = new javax.swing.GroupLayout(forlowresolution);
        forlowresolution.setLayout(forlowresolutionLayout);
        forlowresolutionLayout.setHorizontalGroup(
            forlowresolutionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        forlowresolutionLayout.setVerticalGroup(
            forlowresolutionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MemberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(forlowresolution, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MemberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(forlowresolution, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(2, 2, 2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        String activityloglogout = "INSERT INTO `activitylog`(`user`, `activitytype`, `description`) VALUES ('Member','Member Logout','" + loggeduser.getText() + " Logged Out')";
        try {
            DB.DB.iud(activityloglogout);
            DB.DB.iud("UPDATE `accounts` SET `status` = '0' WHERE `accounts`.`username` ='" + loggeduser.getText() + "' ");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Login logn = new Login();
        this.dispose();
        logn.setVisible(true);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        icon = new ImageIcon(getClass().getResource("images/log-out-symbol hover.png"));
        close.setIcon(icon);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        icon = new ImageIcon(getClass().getResource("images/log-out-symbol.png"));
        close.setIcon(icon);
    }//GEN-LAST:event_closeMouseExited

    private void headerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseClicked

    }//GEN-LAST:event_headerMouseClicked

    Color choice1set = new Color(73, 145, 255);
    Color choice1reset = new Color(153, 204, 255);

    public void mouseenterednotclicked(JLabel lbl) {
        lbl.setBackground(new Color(183, 219, 255));
    }

    public void mouseenteredclicked(JLabel lbl) {
        lbl.setBackground(choice1set);
    }

    public void mouseexitednotclicked(JLabel lbl) {
        lbl.setBackground(new Color(153, 204, 255));
    }

    public void mouseexitedclicked(JLabel lbl) {
        lbl.setBackground(choice1set);
    }

    public void setcolor(JLabel lbl) {
        lbl.setBackground(choice1set);

    }

    public void resetcolor(JLabel lbl) {
        lbl.setBackground(choice1reset);

    }


    private void poslblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poslblMouseClicked
        generateInvoiceID();
        setcolor(poslbl);
        resetcolor(sellrecordslbl);
        refreshstocktableinpos();
        pospanel.setVisible(true);
        sellrecordspanel.setVisible(false);

    }//GEN-LAST:event_poslblMouseClicked

    private void sellrecordslblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellrecordslblMouseClicked

        DefaultTableModel dtm = (DefaultTableModel) salesrecordstable.getModel();
        dtm.setRowCount(0);
        refreshsellrecords();

        setcolor(sellrecordslbl);
        resetcolor(poslbl);

        sellrecordspanel.setVisible(true);
        pospanel.setVisible(false);

    }//GEN-LAST:event_sellrecordslblMouseClicked

    private void additeminposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_additeminposMouseEntered
        additeminpos.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_additeminposMouseEntered

    private void additeminposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_additeminposMouseExited
        additeminpos.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_additeminposMouseExited
    private void additeminposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additeminposActionPerformed
        if (searchinposfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Search / Select Item !");
        } else if (quantityinpos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Quntity !");
        } else {
            int quantitytyped = parseInt(quantityinpos.getText());
            String stockcount = stocktableinpostable.getValueAt(stocktableinpostable.getSelectedRow(), 2).toString();
            int stockintii = Integer.parseInt(stockcount);
            if (stockintii < quantitytyped) {
                JOptionPane.showMessageDialog(this, "Enter Quantity less than " + stockintii + " ");
            } else if (quantitytyped == 0) {
                JOptionPane.showMessageDialog(this, "Out of Item Quantity !");
            } else {
                int tostocktableup = stockintii - quantitytyped;
                DefaultTableModel dtm = (DefaultTableModel) stocktableinpostable.getModel();
                dtm.setValueAt(tostocktableup, stocktableinpostable.getSelectedRow(), 2);
                String itemID = searchinposfield.getText().toString();
                String itemName = stocktableinpostable.getValueAt(stocktableinpostable.getSelectedRow(), 1).toString();
                String stock = stocktableinpostable.getValueAt(stocktableinpostable.getSelectedRow(), 2).toString();
                String PerPrice = stocktableinpostable.getValueAt(stocktableinpostable.getSelectedRow(), 3).toString();
                int Perpriceint = Integer.parseInt(PerPrice);
                int quantity = Integer.parseInt(quantityinpos.getText());
                int stockint = Integer.parseInt(stock);
                if (quantityinpos.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Add quantity");
                } else {
                    DefaultTableModel dtml = (DefaultTableModel) cartlisttable.getModel();

                    int count = cartlisttable.getRowCount();

                    boolean flag = true;
                    for (int i = 0; i < count; i++) {
                        String prerow = (String) cartlisttable.getValueAt(i, 0);
                        if (itemID.equals(prerow)) {
                            flag = false;
                            quantity++;
                            int cartquaex = (int) dtml.getValueAt(i, 3);
                            int exisquantity = quantity + cartquaex;
                            dtml.removeRow(i);
                            Vector v = new Vector();
                            v.add(itemID);
                            v.add(itemName);
                            v.add(PerPrice);
                            v.add(exisquantity);
                            v.add(Perpriceint * (exisquantity));
                            dtml.addRow(v);

                        }
                    }
                    if (flag) {
                        Vector v = new Vector();
                        v.add(itemID);
                        v.add(itemName);
                        v.add(PerPrice);
                        v.add(quantity);
                        v.add(Perpriceint * (quantity));
                        dtml.addRow(v);

                    }
                }
            }
        }
    }//GEN-LAST:event_additeminposActionPerformed

    private void removeitemfromlistbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeitemfromlistbtnMouseEntered
        removeitemfromlistbtn.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_removeitemfromlistbtnMouseEntered

    private void removeitemfromlistbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeitemfromlistbtnMouseExited
        removeitemfromlistbtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_removeitemfromlistbtnMouseExited

    private void removeitemfromlistbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeitemfromlistbtnActionPerformed
        if (cartlisttable.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "Select Row to Delete");
        } else {
            if (stocktableinpostable.getSelectedRow() == cartlisttable.getSelectedRow()) {
                String stockcount = stocktableinpostable.getValueAt(stocktableinpostable.getSelectedRow(), 2).toString();
                int stockintii = Integer.parseInt(stockcount);
                String cartcount = cartlisttable.getValueAt(cartlisttable.getSelectedRow(), 3).toString();
                int quantitytyped = Integer.parseInt(cartcount);
                int tostocktableup = stockintii + quantitytyped;
                DefaultTableModel dtm = (DefaultTableModel) stocktableinpostable.getModel();
                dtm.setValueAt(tostocktableup, stocktableinpostable.getSelectedRow(), 2);
                DefaultTableModel dtmremv = (DefaultTableModel) cartlisttable.getModel();
                dtmremv.removeRow(cartlisttable.getSelectedRow());
            }

//        int[] i = cartlisttable.getSelectedRows();
//        DefaultTableModel dtmremv = (DefaultTableModel) cartlisttable.getModel();
//        for (int j = i.length - 1; j >= 0; j--) {
//            dtmremv.removeRow(i[j]);
//        }
        }
    }//GEN-LAST:event_removeitemfromlistbtnActionPerformed

    private void printinvoicebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printinvoicebtnMouseEntered
        printinvoicebtn.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_printinvoicebtnMouseEntered

    private void printinvoicebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printinvoicebtnMouseExited
        printinvoicebtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_printinvoicebtnMouseExited

    private void printinvoicebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printinvoicebtnActionPerformed
        pospanelk.setVisible(false);
        invoice.setVisible(true);
        invoicetab.removeAll();
        try {
            String path = "C:\\JasperReports\\INVOICE.jrxml";
            JasperReport compileReport = JasperCompileManager.compileReport(path);
            HashMap hm = new HashMap();
            hm.put("Sellidfield", Sellidfield.getText());
            JasperPrint jp = JasperFillManager.fillReport(compileReport, hm, DB.DB.getConnection());
            invoicetab.add("Preview Invoice", new JPanel().add(new JRViewer(jp)));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_printinvoicebtnActionPerformed

    private void poscancelbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poscancelbtnMouseEntered
        poscancelbtn.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_poscancelbtnMouseEntered

    private void poscancelbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poscancelbtnMouseExited
        poscancelbtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_poscancelbtnMouseExited

    private void poscancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poscancelbtnActionPerformed
        searchinposfield.setText(null);
        searchinposfield.grabFocus();
        quantityinpos.setText(null);
        searchcomboinpos.setSelectedIndex(0);
        generateInvoiceID();
        DefaultTableModel dtmsalesstock = (DefaultTableModel) stocktableinpostable.getModel();
        dtmsalesstock.setRowCount(0);
        refreshstocktableinpos();
        DefaultTableModel dtmlist = (DefaultTableModel) cartlisttable.getModel();
        dtmlist.setRowCount(0);
        totalinpos.setText(null);
        discountfield.setText(null);
        vatfield.setText(null);
        nettotalfield.setText(null);
        paymentfield.setText(null);
        balancefield.setText(null);
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
    }//GEN-LAST:event_poscancelbtnActionPerformed

    private void sellbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtnMouseEntered
        sellbtn.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_sellbtnMouseEntered

    private void sellbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtnMouseExited
        sellbtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_sellbtnMouseExited

    private void generateInvoiceID() {
        try {

            ResultSet rs = DB.DB.search("select count(DISTINCT `Bill number`) as x from `sales records` ");
            if (rs.next()) {

                int rowcount = Integer.parseInt(rs.getString("x"));
                rowcount++;
                this.Sellidfield.setText("" + rowcount);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void sellbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtnActionPerformed
        if (nettotalfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Plz fill !!!");
        } else if (nettotalfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Plz fill Pyament field !!!");
        } else {
            int newestcount = cartlisttable.getRowCount();
            for (int i = 0; i < newestcount; i++) {
                String ids = cartlisttable.getValueAt(i, 0).toString();
                String quantitiesn = cartlisttable.getValueAt(i, 3).toString();
                String perprice = cartlisttable.getValueAt(i, 4).toString();
                String itemname = cartlisttable.getValueAt(i, 1).toString();
                String ItemIdsandQuantities = ids + "  x  " + quantitiesn;
                try {
                    DB.DB.iud("INSERT INTO `sales records` (`Item Ids and Quantities`, `Sale Earnings`, `Bill number`, `Date Time`, `salesatus`,`Billtotal`,`itemname`,`justtoatal`, `discount`, `vat`, `payment`, `balance`,`quantity`, `itemid`,`billedby`) VALUES ('" + ItemIdsandQuantities + "', '" + perprice + "', '" + Sellidfield.getText() + "', CURRENT_TIMESTAMP,  'SUCCESS', '" + nettotalfield.getText() + "', '" + itemname + "', '" + totalinpos.getText() + "', '" + discountfield.getText() + "', '" + vatfield.getText() + "', '" + paymentfield.getText() + "', '" + balancefield.getText() + "', '" + quantitiesn + "', '" + ids + "', '" + loggeduser.getText() + "');");
                    JOptionPane.showMessageDialog(this, "Success !");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Failed !");
                    JOptionPane.showMessageDialog(this, e);
                }
            }
            int updatedstockcount = stocktableinpostable.getRowCount();
            for (int i = 0; i < updatedstockcount; i++) {
                String ids = stocktableinpostable.getValueAt(i, 0).toString();
                String quantitiesn = stocktableinpostable.getValueAt(i, 2).toString();
                try {
                    DB.DB.iud("UPDATE `stock` SET  `Quantity`='" + quantitiesn + "'  WHERE `Item Id`='" + ids + "' ");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }//GEN-LAST:event_sellbtnActionPerformed


    private void searchinposfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchinposfieldKeyReleased
        if (searchcomboinpos.getSelectedIndex() == 0) {
            try {
                ResultSet rs = DB.DB.search("SELECT * FROM  `stock` WHERE  `Item Id` LIKE  '" + searchinposfield.getText() + "%' AND `Quantity`>0");
                DefaultTableModel dtm = (DefaultTableModel) stocktableinpostable.getModel();
                dtm.setRowCount(0);
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString(2));
                    v.add(rs.getString(3));
                    v.add(rs.getString(13));
                    v.add(rs.getString(7));
                    dtm.addRow(v);
                    stocktableinpostable.selectAll();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (searchcomboinpos.getSelectedIndex() == 1) {
            try {
                ResultSet rs = DB.DB.search("SELECT * FROM  `stock` WHERE  `Item Name` LIKE  '" + searchinposfield.getText() + "%' ");
                DefaultTableModel dtm = (DefaultTableModel) stocktableinpostable.getModel();
                dtm.setRowCount(0);
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString(2));
                    v.add(rs.getString(3));
                    v.add(rs.getString(13));
                    v.add(rs.getString(7));
                    dtm.addRow(v);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_searchinposfieldKeyReleased

    private void searchinposfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchinposfieldActionPerformed
        if (searchinposfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Search / Select Item !");
        } else {
            quantityinpos.setEditable(true);
            quantityinpos.grabFocus();
        }

    }//GEN-LAST:event_searchinposfieldActionPerformed

    private void searchcomboinposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchcomboinposActionPerformed

        try {

            ResultSet rs = DB.DB.search("SELECT * FROM  `stock` WHERE  '" + searchcomboinpos.getSelectedItem().toString() + "' LIKE '" + searchinposfield.getText() + "' ");
            DefaultTableModel dtm = (DefaultTableModel) stocktableinpostable.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(13));
                v.add(rs.getString(7));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchcomboinposActionPerformed

    private void quantityinposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityinposActionPerformed

    }//GEN-LAST:event_quantityinposActionPerformed

    private void stocktableinpostableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stocktableinpostableMouseClicked
        searchinposfield.setText((String) stocktableinpostable.getValueAt(stocktableinpostable.getSelectedRow(), 0));
        quantityinpos.setEnabled(true);
        quantityinpos.setEditable(true);
        quantityinpos.grabFocus();
    }//GEN-LAST:event_stocktableinpostableMouseClicked

    private void nettotalfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nettotalfieldActionPerformed
    }//GEN-LAST:event_nettotalfieldActionPerformed

    private void discountfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountfieldActionPerformed
        double d1 = Double.parseDouble(totalinpos.getText());
        double d2 = Double.parseDouble(discountfield.getText());
        double d3 = d1 * (100 - d2) / 100;
        nettotalfield.setText("" + d3);
        nettotalfield.grabFocus();
    }//GEN-LAST:event_discountfieldActionPerformed

    private void vatfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vatfieldActionPerformed
        double d1 = Double.parseDouble(totalinpos.getText());
        double d2 = Double.parseDouble(vatfield.getText());
        double d3 = d1 * (100 + d2) / 100;
        nettotalfield.setText("" + d3);
        nettotalfield.grabFocus();
    }//GEN-LAST:event_vatfieldActionPerformed

    private void paymentfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentfieldActionPerformed
        double d1 = Double.parseDouble(nettotalfield.getText());
        double d2 = Double.parseDouble(paymentfield.getText());
        double d3 = d2 - d1;
        balancefield.setText("" + d3);
    }//GEN-LAST:event_paymentfieldActionPerformed

    private void balancefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balancefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balancefieldActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        if (jCheckBox1.isSelected()) {
            discountfield.setEditable(true);
            discountfield.grabFocus();
        } else {
            discountfield.setEditable(false);
            discountfield.setText("0");
            nettotalfield.setText(totalinpos.getText());
        }

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()) {
            vatfield.setEditable(true);
            vatfield.grabFocus();
        } else {
            vatfield.setEditable(false);
            vatfield.setText("0");
            nettotalfield.setText(totalinpos.getText());
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void SellidfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellidfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellidfieldActionPerformed

    private void SellidfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SellidfieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_SellidfieldKeyReleased

    private void sellbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtnMousePressed
        sellbtn.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_sellbtnMousePressed

    private void sellbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbtnMouseReleased
        sellbtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_sellbtnMouseReleased

    private void poscancelbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poscancelbtnMousePressed
        poscancelbtn.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_poscancelbtnMousePressed

    private void printinvoicebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printinvoicebtnMousePressed
        printinvoicebtn.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_printinvoicebtnMousePressed

    private void additeminposMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_additeminposMousePressed
        additeminpos.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_additeminposMousePressed

    private void removeitemfromlistbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeitemfromlistbtnMousePressed
        removeitemfromlistbtn.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_removeitemfromlistbtnMousePressed

    private void poscancelbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poscancelbtnMouseReleased
        poscancelbtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_poscancelbtnMouseReleased

    private void printinvoicebtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printinvoicebtnMouseReleased
        printinvoicebtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_printinvoicebtnMouseReleased

    private void removeitemfromlistbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeitemfromlistbtnMouseReleased
        removeitemfromlistbtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_removeitemfromlistbtnMouseReleased

    private void additeminposMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_additeminposMouseReleased
        additeminpos.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_additeminposMouseReleased

    private void backtoposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backtoposMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_backtoposMouseEntered

    private void backtoposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backtoposMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_backtoposMouseExited

    private void backtoposMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backtoposMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_backtoposMousePressed

    private void backtoposMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backtoposMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_backtoposMouseReleased

    private void backtoposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtoposActionPerformed
        pospanelk.setVisible(true);
        invoice.setVisible(false);
    }//GEN-LAST:event_backtoposActionPerformed

    private void billbumberfieldinsellrecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billbumberfieldinsellrecordsActionPerformed
        if (billbumberfieldinsellrecords.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Search Sell Record First !");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) salesrecordstable.getModel();
            dtm.setRowCount(0);
            refreshsellrecords();
        }
    }//GEN-LAST:event_billbumberfieldinsellrecordsActionPerformed

    private void printinvoicebtninsellrecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printinvoicebtninsellrecordsActionPerformed
        sellrecordstab.removeAll();
        try {
            String path = "C:\\JasperReports\\INVOICE.jrxml";
            JasperReport compileReport = JasperCompileManager.compileReport(path);
            HashMap hm = new HashMap();
            hm.put("Sellidfield", billbumberfieldinsellrecords.getText());
            JasperPrint jp = JasperFillManager.fillReport(compileReport, hm, DB.DB.getConnection());
            sellrecordstab.add("Preview Invoice", new JPanel().add(new JRViewer(jp)));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_printinvoicebtninsellrecordsActionPerformed

    private void printinvoicebtninsellrecordsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printinvoicebtninsellrecordsMouseReleased
        printinvoicebtninsellrecords.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_printinvoicebtninsellrecordsMouseReleased

    private void printinvoicebtninsellrecordsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printinvoicebtninsellrecordsMousePressed
        printinvoicebtninsellrecords.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_printinvoicebtninsellrecordsMousePressed

    private void printinvoicebtninsellrecordsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printinvoicebtninsellrecordsMouseExited
        printinvoicebtninsellrecords.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_printinvoicebtninsellrecordsMouseExited

    private void printinvoicebtninsellrecordsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printinvoicebtninsellrecordsMouseEntered
        printinvoicebtninsellrecords.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_printinvoicebtninsellrecordsMouseEntered

    private void salesrecordstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesrecordstableMouseClicked

    }//GEN-LAST:event_salesrecordstableMouseClicked

    private void findbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findbtnMouseEntered
        findbtn.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_findbtnMouseEntered

    private void findbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findbtnMouseExited
        findbtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_findbtnMouseExited

    private void findbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findbtnMousePressed
        findbtn.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_findbtnMousePressed

    private void findbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findbtnMouseReleased
        findbtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_findbtnMouseReleased

    private void findbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findbtnActionPerformed
        if (billbumberfieldinsellrecords.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Search Sell Record First !");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) salesrecordstable.getModel();
            dtm.setRowCount(0);
            refreshsellrecords();
        }
    }//GEN-LAST:event_findbtnActionPerformed

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/mainicon.png")));
    }
    private void poslblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poslblMouseEntered
        if (poslbl.getBackground().equals(new Color(73, 145, 255))) {
            mouseenteredclicked(poslbl);
        }
        if (poslbl.getBackground().equals(new Color(153, 204, 255))) {
            mouseenterednotclicked(poslbl);
        }
    }//GEN-LAST:event_poslblMouseEntered

    private void poslblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poslblMouseExited
        if (poslbl.getBackground().equals(new Color(73, 145, 255))) {
            mouseexitedclicked(poslbl);
        }
        if (poslbl.getBackground().equals(new Color(183, 219, 255))) {
            mouseexitednotclicked(poslbl);
        }
    }//GEN-LAST:event_poslblMouseExited

    private void sellrecordslblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellrecordslblMouseEntered
        if (sellrecordslbl.getBackground().equals(new Color(73, 145, 255))) {
            mouseenteredclicked(sellrecordslbl);
        }
        if (sellrecordslbl.getBackground().equals(new Color(153, 204, 255))) {
            mouseenterednotclicked(sellrecordslbl);
        }
    }//GEN-LAST:event_sellrecordslblMouseEntered

    private void sellrecordslblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellrecordslblMouseExited
        if (sellrecordslbl.getBackground().equals(new Color(73, 145, 255))) {
            mouseexitedclicked(sellrecordslbl);
        }
        if (sellrecordslbl.getBackground().equals(new Color(183, 219, 255))) {
            mouseexitednotclicked(sellrecordslbl);
        }
    }//GEN-LAST:event_sellrecordslblMouseExited

    private void quantityinposKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityinposKeyTyped

        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_ENTER))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_quantityinposKeyTyped

    private void paymentfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paymentfieldKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_ENTER))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_paymentfieldKeyTyped

    private void BillokbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillokbtnMouseEntered
        Billokbtn.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_BillokbtnMouseEntered

    private void BillokbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillokbtnMouseExited
        Billokbtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_BillokbtnMouseExited

    private void BillokbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillokbtnMousePressed
        Billokbtn.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_BillokbtnMousePressed

    private void BillokbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillokbtnMouseReleased
        Billokbtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_BillokbtnMouseReleased

    private void BillokbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillokbtnActionPerformed
        double totcookie = 0;
        int count2 = cartlisttable.getRowCount();
        for (int i = 0; i < count2; i++) {
            totcookie += Double.parseDouble(cartlisttable.getValueAt(i, 4).toString());
        }
        totalinpos.setText("" + totcookie);
        nettotalfield.setText("" + totcookie);
        quantityinpos.setText(null);
        searchinposfield.setText(null);
        searchinposfield.grabFocus();
        paymentfield.grabFocus();
    }//GEN-LAST:event_BillokbtnActionPerformed

    private void quantityinposKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityinposKeyReleased

    }//GEN-LAST:event_quantityinposKeyReleased

    private void cartlisttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartlisttableMouseClicked

    }//GEN-LAST:event_cartlisttableMouseClicked

    private void paymentfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paymentfieldKeyReleased
        double d1 = Double.parseDouble(nettotalfield.getText());
        double d2 = Double.parseDouble(paymentfield.getText());
        double d3 = d2 - d1;
        balancefield.setText("" + d3);
    }//GEN-LAST:event_paymentfieldKeyReleased

    private void SendMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SendMouseEntered

    private void SendMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_SendMouseExited

    private void SendMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_SendMousePressed

    private void SendMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_SendMouseReleased

    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed
        try {
            DB.DB.iud("INSERT INTO `messagestoadmin` (`user`, `reason`) VALUES ('" + loggeduser.getText() + "', '" + msg.getText() + "' )");
            JOptionPane.showMessageDialog(this, "Success !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Failed !");
            e.printStackTrace();
        }
    }//GEN-LAST:event_SendActionPerformed

    private void msgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msgActionPerformed

    private void msgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_msgKeyTyped
        if (msg.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_msgKeyTyped

    private void close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseClicked
        String activityloglogout = "INSERT INTO `activitylog`(`user`, `activitytype`, `description`) VALUES ('Member','Member Logout','" + loggeduser.getText() + " Logged Out')";
        try {
            DB.DB.iud(activityloglogout);
            DB.DB.iud("UPDATE `accounts` SET `status` = '0' WHERE `accounts`.`username` ='" + loggeduser.getText() + "' ");
            String activitylogapplicationexit = "INSERT INTO `activitylog`(`user`, `activitytype`, `description`) VALUES ('User','System Exit','User Closed the App')";
            DB.DB.iud(activitylogapplicationexit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.exit(0);
    }//GEN-LAST:event_close1MouseClicked

    private void close1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseEntered
        icon = new ImageIcon(getClass().getResource("images/cancel hover.png"));
        close.setIcon(icon);
    }//GEN-LAST:event_close1MouseEntered

    private void close1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseExited
        icon = new ImageIcon(getClass().getResource("images/cancel.png"));
        close.setIcon(icon);
    }//GEN-LAST:event_close1MouseExited

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MemberDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Billokbtn;
    private javax.swing.JPanel Maincardpanel;
    private javax.swing.JPanel MemberPanel;
    private javax.swing.JPanel SalesPanel;
    private javax.swing.JTextField Sellidfield;
    private javax.swing.JButton Send;
    private javax.swing.JButton additeminpos;
    private javax.swing.JButton backtopos;
    private javax.swing.JTextField balancefield;
    private javax.swing.JTextField billbumberfieldinsellrecords;
    private javax.swing.JTable cartlisttable;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JLabel datelbl;
    private javax.swing.JTextField discountfield;
    private javax.swing.JButton findbtn;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel forlowresolution;
    private javax.swing.JPanel header;
    private javax.swing.JPanel invoice;
    private javax.swing.JTabbedPane invoicetab;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel loggeduser;
    private javax.swing.JTextField msg;
    private javax.swing.JTextField nettotalfield;
    private javax.swing.JTextField paymentfield;
    private javax.swing.JButton poscancelbtn;
    private javax.swing.JLabel poslbl;
    private javax.swing.JPanel pospanel;
    private javax.swing.JPanel pospanelk;
    private javax.swing.JButton printinvoicebtn;
    private javax.swing.JButton printinvoicebtninsellrecords;
    private javax.swing.JTextField quantityinpos;
    private javax.swing.JButton removeitemfromlistbtn;
    private javax.swing.JTable salesrecordstable;
    private javax.swing.JComboBox<String> searchcomboinpos;
    private javax.swing.JTextField searchinposfield;
    private javax.swing.JButton sellbtn;
    private javax.swing.JLabel sellrecordslbl;
    private javax.swing.JPanel sellrecordspanel;
    private javax.swing.JTabbedPane sellrecordstab;
    private javax.swing.JTable stocktableinpostable;
    private javax.swing.JLabel timelbl;
    private javax.swing.JTextField totalinpos;
    private javax.swing.JTextField vatfield;
    // End of variables declaration//GEN-END:variables

    private void refreshstocktableinpos() {
        try {
            ResultSet rs = DB.DB.search("SELECT * FROM `stock` WHERE `Quantity`>0");
            DefaultTableModel dtm = (DefaultTableModel) stocktableinpostable.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(13));
                v.add(rs.getString(7));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void refreshsellrecords() {
        try {
            ResultSet rs = DB.DB.search("select * from `sales records` where `Bill number` = '" + billbumberfieldinsellrecords.getText() + "'");
            DefaultTableModel dtm = (DefaultTableModel) salesrecordstable.getModel();
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(8));
                v.add(rs.getString(2));
                v.add(rs.getString(7));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
