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
public class AdminDashboard extends javax.swing.JFrame {

    String path = null;
    String pathxls = null;
    String filename;
    static ImageIcon icon;
    String x = "nnn";

    public AdminDashboard() {

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
                    salesday.setText(todaysalesdate);
                    timelbl.setText(time);
                    datelbl.setText(date);
                }
            }

        }.start();
        AdminDashboard.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        AdminDashboard.this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setIcon();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        if ((width == 1024.0 && height == 768.0) || (width == 800.0 && height == 600.0) || (width == 1280.0 && height == 600.0) || (width == 1280.0 && height == 720.0) || (width == 1280.0 && height == 768.0)) {

        }

        setcurrencyunit();
        refreshstocktable();
        refreshstockupdatetable();
        averagestockavailability();
        refreshlogtable();
        lastactivitiesrefresh();
        loggedusersrefresh();
        messagessrefresh();
        averagestockavailability();
        settodaysalestable();
        settodaysalesnumber();
        settodaysalesearned();
        generateGRNID();
        generatenewitemid();
        dateingrn.setText(salesday.getText());
        dateingrn2.setText(salesday.getText());
        selectitemscombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminPanel = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Stock = new javax.swing.JLabel();
        Sales = new javax.swing.JLabel();
        Activity_log = new javax.swing.JLabel();
        Settings = new javax.swing.JLabel();
        Maincardpanel = new javax.swing.JPanel();
        Homepanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        notificationholder = new javax.swing.JPanel();
        nostock = new javax.swing.JLabel();
        lowstock = new javax.swing.JLabel();
        stockavailable = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        todaysaleslbl = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        salesday = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        todaysaledetails = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        todaysales = new javax.swing.JTable();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jPanel41 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel43 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        todayearned = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        currencyinvisible = new javax.swing.JLabel();
        Stockpanel = new javax.swing.JPanel();
        ViewStock = new javax.swing.JLabel();
        PrintStock = new javax.swing.JLabel();
        AddStock = new javax.swing.JLabel();
        PrintGRN = new javax.swing.JLabel();
        stockupdate = new javax.swing.JLabel();
        grnrecordslbl = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Viewstockpanel = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        refresh = new javax.swing.JButton();
        quciksearchviewstock = new javax.swing.JTextField();
        quicksearchitemidlbl = new javax.swing.JLabel();
        detailmodebtn = new javax.swing.JButton();
        exportstocktablebtn = new javax.swing.JButton();
        holder = new javax.swing.JPanel();
        tableview = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewstocktable = new javax.swing.JTable();
        detailmode = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        itemidfield1 = new javax.swing.JTextField();
        quicksearchitemidlbl33 = new javax.swing.JLabel();
        quicksearchitemidlbl34 = new javax.swing.JLabel();
        itemnamefield1 = new javax.swing.JTextField();
        quicksearchitemidlbl35 = new javax.swing.JLabel();
        itemdescriptionfield1 = new javax.swing.JTextField();
        stocknumberfield1 = new javax.swing.JTextField();
        quicksearchitemidlbl36 = new javax.swing.JLabel();
        sellingpricefield1 = new javax.swing.JTextField();
        quicksearchitemidlbl37 = new javax.swing.JLabel();
        stockpricefield1 = new javax.swing.JTextField();
        quicksearchitemidlbl38 = new javax.swing.JLabel();
        quicksearchitemidlbl39 = new javax.swing.JLabel();
        barcodefield1 = new javax.swing.JTextField();
        quicksearchitemidlbl40 = new javax.swing.JLabel();
        supplieridfield1 = new javax.swing.JTextField();
        brandfield1 = new javax.swing.JTextField();
        quicksearchitemidlbl41 = new javax.swing.JLabel();
        quicksearchitemidlbl42 = new javax.swing.JLabel();
        conditionfield1 = new javax.swing.JTextField();
        quicksearchitemidlbl43 = new javax.swing.JLabel();
        quicksearchitemidlbl44 = new javax.swing.JLabel();
        warrantyfield1 = new javax.swing.JTextField();
        quicksearchitemidlbl45 = new javax.swing.JLabel();
        quantityfield1 = new javax.swing.JTextField();
        quicksearchitemidlbl32 = new javax.swing.JLabel();
        deletethisid = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ok = new javax.swing.JButton();
        editdetailmodebtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        quicksearchitemidlbl49 = new javax.swing.JLabel();
        Addstockpanel = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel20 = new javax.swing.JPanel();
        quicksearchitemidlbl1 = new javax.swing.JLabel();
        Addstockbtn = new javax.swing.JButton();
        itemidfield = new javax.swing.JTextField();
        quicksearchitemidlbl4 = new javax.swing.JLabel();
        quicksearchitemidlbl5 = new javax.swing.JLabel();
        itemnamefield = new javax.swing.JTextField();
        quicksearchitemidlbl6 = new javax.swing.JLabel();
        itemdescriptionfield = new javax.swing.JTextField();
        stocknumberfield = new javax.swing.JTextField();
        quicksearchitemidlbl7 = new javax.swing.JLabel();
        sellingpricefield = new javax.swing.JTextField();
        quicksearchitemidlbl8 = new javax.swing.JLabel();
        stockpricefield = new javax.swing.JTextField();
        quicksearchitemidlbl9 = new javax.swing.JLabel();
        quicksearchitemidlbl10 = new javax.swing.JLabel();
        barcodefield = new javax.swing.JTextField();
        quicksearchitemidlbl11 = new javax.swing.JLabel();
        supplieridfield = new javax.swing.JTextField();
        brandfield = new javax.swing.JTextField();
        quicksearchitemidlbl12 = new javax.swing.JLabel();
        quicksearchitemidlbl13 = new javax.swing.JLabel();
        conditionfield = new javax.swing.JTextField();
        quicksearchitemidlbl14 = new javax.swing.JLabel();
        quicksearchitemidlbl15 = new javax.swing.JLabel();
        warrantyfield = new javax.swing.JTextField();
        quicksearchitemidlbl16 = new javax.swing.JLabel();
        quantityfield = new javax.swing.JTextField();
        itemidfieldstate = new javax.swing.JLabel();
        itemnamefieldstate = new javax.swing.JLabel();
        itemdescriptionfieldstate = new javax.swing.JLabel();
        stocknumberfieldstate = new javax.swing.JLabel();
        sellingpricefieldstate = new javax.swing.JLabel();
        stockpricefieldstate = new javax.swing.JLabel();
        quantityfieldstate = new javax.swing.JLabel();
        warrantyfieldstate = new javax.swing.JLabel();
        conditionfieldstate = new javax.swing.JLabel();
        brandfieldstate = new javax.swing.JLabel();
        supplieridfieldstate = new javax.swing.JLabel();
        barcodefieldstate = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        quicksearchitemidlbl46 = new javax.swing.JLabel();
        quicksearchitemidlbl57 = new javax.swing.JLabel();
        suppliergrnfield4 = new javax.swing.JTextField();
        dateingrn1 = new javax.swing.JTextField();
        quicksearchitemidlbl58 = new javax.swing.JLabel();
        invoicenoingrn1 = new javax.swing.JTextField();
        quicksearchitemidlbl60 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        itemstable = new javax.swing.JTable();
        itemaddbtn = new javax.swing.JButton();
        productcodeingrn1 = new javax.swing.JTextField();
        quicksearchitemidlbl68 = new javax.swing.JLabel();
        brandfield2 = new javax.swing.JTextField();
        quicksearchitemidlbl69 = new javax.swing.JLabel();
        conditionfield2 = new javax.swing.JTextField();
        quicksearchitemidlbl70 = new javax.swing.JLabel();
        warrantyfield2 = new javax.swing.JTextField();
        jPanel48 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        quicksearchitemidlbl20 = new javax.swing.JLabel();
        grnnumberfield1 = new javax.swing.JTextField();
        dateingrn2 = new javax.swing.JTextField();
        quicksearchitemidlbl23 = new javax.swing.JLabel();
        quicksearchitemidlbl24 = new javax.swing.JLabel();
        billdateingrn1 = new javax.swing.JTextField();
        invoicenoingrn2 = new javax.swing.JTextField();
        invoiceamountingrn2 = new javax.swing.JTextField();
        quicksearchitemidlbl28 = new javax.swing.JLabel();
        quicksearchitemidlbl29 = new javax.swing.JLabel();
        quicksearchitemidlbl65 = new javax.swing.JLabel();
        quicksearchitemidlbl66 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        grncountingtable1 = new javax.swing.JTable();
        grnaddtotablebtn1 = new javax.swing.JButton();
        quicksearchitemidlbl67 = new javax.swing.JLabel();
        grntotal5 = new javax.swing.JTextField();
        okbtngrn1 = new javax.swing.JButton();
        productquantityingrn1 = new javax.swing.JTextField();
        itemidss = new javax.swing.JComboBox<>();
        billdateingrn2 = new javax.swing.JTextField();
        invoiceamountingrn3 = new javax.swing.JTextField();
        quicksearchitemidlbl59 = new javax.swing.JLabel();
        quicksearchitemidlbl61 = new javax.swing.JLabel();
        printstockpanel = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        printstocktabbed = new javax.swing.JTabbedPane();
        stockupdatepanel = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        stockupdatetable = new javax.swing.JTable();
        jPanel28 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        quicksearchitemidlbl50 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        quicksearchitemidlbl51 = new javax.swing.JLabel();
        updatestockqbtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        quicksearchitemidlbl52 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        quicksearchitemidlbl53 = new javax.swing.JLabel();
        quicksearchitemidlbl54 = new javax.swing.JLabel();
        searchbillbtn = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        quicksearchitemidlbl55 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        quicksearchitemidlbl56 = new javax.swing.JLabel();
        updatestockqbtn1 = new javax.swing.JButton();
        printgrnpanel = new javax.swing.JPanel();
        grntabbed = new javax.swing.JTabbedPane();
        jPanel23 = new javax.swing.JPanel();
        printgrnbtn = new javax.swing.JButton();
        quicksearchitemidlbl17 = new javax.swing.JLabel();
        grnnumberfield = new javax.swing.JTextField();
        quicksearchitemidlbl18 = new javax.swing.JLabel();
        suppliergrnfield = new javax.swing.JTextField();
        dateingrn = new javax.swing.JTextField();
        quicksearchitemidlbl19 = new javax.swing.JLabel();
        quicksearchitemidlbl21 = new javax.swing.JLabel();
        billdateingrn = new javax.swing.JTextField();
        invoicenoingrn = new javax.swing.JTextField();
        invoiceamountingrn = new javax.swing.JTextField();
        quicksearchitemidlbl25 = new javax.swing.JLabel();
        quicksearchitemidlbl26 = new javax.swing.JLabel();
        quicksearchitemidlbl30 = new javax.swing.JLabel();
        productquantityingrn = new javax.swing.JTextField();
        productcodeingrn = new javax.swing.JTextField();
        quicksearchitemidlbl31 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        grncountingtable = new javax.swing.JTable();
        quicksearchitemidlbl47 = new javax.swing.JLabel();
        Productnamegrn = new javax.swing.JTextField();
        grnaddtotablebtn = new javax.swing.JButton();
        quicksearchitemidlbl48 = new javax.swing.JLabel();
        productamountingrn = new javax.swing.JTextField();
        quicksearchitemidlbl27 = new javax.swing.JLabel();
        grntotal = new javax.swing.JTextField();
        okbtngrn = new javax.swing.JButton();
        grnrecordspanel = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        grnrecordstable = new javax.swing.JTable();
        previewgrnrecord = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        grnrecordfield = new javax.swing.JTextField();
        findbtn1 = new javax.swing.JButton();
        grnrecordstab = new javax.swing.JTabbedPane();
        SalesPanel = new javax.swing.JPanel();
        poslbl = new javax.swing.JLabel();
        sellrecordslbl = new javax.swing.JLabel();
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
        ActivityLogpanel = new javax.swing.JPanel();
        Activityloglbl = new javax.swing.JLabel();
        printloglbl = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        activitylogpanel = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        refreshinlogbtn = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        filteruserfield = new javax.swing.JComboBox<>();
        activityfieldcombo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Activitylogtable = new javax.swing.JTable();
        printlogpanel = new javax.swing.JPanel();
        reportholder = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Settingspanel = new javax.swing.JPanel();
        generallbl = new javax.swing.JLabel();
        accountslbl = new javax.swing.JLabel();
        backuprestorelbl = new javax.swing.JLabel();
        aboutlbl = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        generalpanel = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        passwrdchangebtn = new javax.swing.JButton();
        stateofcurrentpasswordadmin = new javax.swing.JLabel();
        admincurrentpasswordinsettings = new javax.swing.JPasswordField();
        newadminpasswordfield = new javax.swing.JPasswordField();
        retypenewadminpasswordfield = new javax.swing.JPasswordField();
        stateofcurrentpasswordadmin1 = new javax.swing.JLabel();
        stateofcurrentpasswordadmin2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        setavgstockbtn = new javax.swing.JButton();
        avgstockfield = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        setcurrency = new javax.swing.JButton();
        currencyfield = new javax.swing.JTextField();
        accountspnl = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        usernamefieldinaccounts = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        passwordfieldinaccounts = new javax.swing.JTextField();
        Searchfieldinaccounts = new javax.swing.JTextField();
        searchbtninaccounts = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        addbtninaccounts = new javax.swing.JButton();
        updatebtninaccounts = new javax.swing.JButton();
        deletebtninaccounts = new javax.swing.JButton();
        refreshbtninaccounts = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        searchbtninaccounts1 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        backuprestorepanel = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        Backupbtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        backuplocationfield = new javax.swing.JTextField();
        browsepathinbackup = new javax.swing.JButton();
        stateofbackuplbl = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        restorebtn = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        restorelocationfield = new javax.swing.JTextField();
        browsepathinrestore = new javax.swing.JButton();
        stateofrestorelbl = new javax.swing.JLabel();
        about = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        datelbl = new javax.swing.JLabel();
        timelbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stockplus App");
        setUndecorated(true);
        setResizable(false);

        AdminPanel.setBackground(new java.awt.Color(244, 248, 255));

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

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(close)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        Home.setBackground(new java.awt.Color(73, 145, 255));
        Home.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Home.setText("Home");
        Home.setOpaque(true);
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });

        Stock.setBackground(new java.awt.Color(163, 199, 255));
        Stock.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Stock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock.setText("Stock");
        Stock.setOpaque(true);
        Stock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StockMouseExited(evt);
            }
        });

        Sales.setBackground(new java.awt.Color(163, 199, 255));
        Sales.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Sales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sales.setText("Sales");
        Sales.setOpaque(true);
        Sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalesMouseExited(evt);
            }
        });

        Activity_log.setBackground(new java.awt.Color(163, 199, 255));
        Activity_log.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Activity_log.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Activity_log.setText("Activity Log");
        Activity_log.setOpaque(true);
        Activity_log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Activity_logMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Activity_logMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Activity_logMouseExited(evt);
            }
        });

        Settings.setBackground(new java.awt.Color(163, 199, 255));
        Settings.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Settings.setText("Settings");
        Settings.setOpaque(true);
        Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SettingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SettingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SettingsMouseExited(evt);
            }
        });

        Maincardpanel.setBackground(new java.awt.Color(244, 248, 255));
        Maincardpanel.setLayout(new java.awt.CardLayout());

        Homepanel.setBackground(new java.awt.Color(244, 248, 255));

        jPanel5.setBackground(new java.awt.Color(73, 145, 255));

        notificationholder.setLayout(new java.awt.CardLayout());

        nostock.setBackground(new java.awt.Color(255, 0, 0));
        nostock.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        nostock.setForeground(new java.awt.Color(255, 255, 255));
        nostock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nostock.setText("NO STOCK");
        nostock.setOpaque(true);
        notificationholder.add(nostock, "card5");

        lowstock.setBackground(new java.awt.Color(255, 204, 0));
        lowstock.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        lowstock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lowstock.setText("LOW STOCK");
        lowstock.setOpaque(true);
        notificationholder.add(lowstock, "card4");

        stockavailable.setBackground(new java.awt.Color(0, 204, 0));
        stockavailable.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        stockavailable.setForeground(new java.awt.Color(255, 255, 255));
        stockavailable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stockavailable.setText("STOCK AVAILABLE");
        stockavailable.setOpaque(true);
        notificationholder.add(stockavailable, "card6");

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Notifications");

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Last Activities");

        jList1.setBackground(new java.awt.Color(51, 51, 51));
        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setFocusable(false);
        jList1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jList1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane9.setViewportView(jList1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notificationholder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(notificationholder, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );

        jPanel6.setBackground(new java.awt.Color(73, 145, 255));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Todays Sales");

        todaysaleslbl.setBackground(new java.awt.Color(51, 51, 51));
        todaysaleslbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        todaysaleslbl.setForeground(new java.awt.Color(255, 255, 255));
        todaysaleslbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        todaysaleslbl.setOpaque(true);

        jLabel40.setBackground(new java.awt.Color(51, 51, 51));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FRAMES/images/shopping-bag.png"))); // NOI18N
        jLabel40.setOpaque(true);

        salesday.setForeground(new java.awt.Color(73, 145, 255));
        salesday.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(todaysaleslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(salesday, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(salesday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(todaysaleslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel29.setBackground(new java.awt.Color(73, 145, 255));

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));

        todaysaledetails.setBackground(new java.awt.Color(73, 145, 255));
        todaysaledetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel41.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Today Sales Details");

        jPanel30.setBackground(new java.awt.Color(51, 51, 51));

        todaysales.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        todaysales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill Number", "Item Ids and Quantities", "Sale Earnings", "Date Time", "Billed By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        todaysales.setGridColor(new java.awt.Color(255, 255, 255));
        todaysales.setRowHeight(20);
        todaysales.setSelectionBackground(new java.awt.Color(73, 145, 255));
        jScrollPane5.setViewportView(todaysales);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout todaysaledetailsLayout = new javax.swing.GroupLayout(todaysaledetails);
        todaysaledetails.setLayout(todaysaledetailsLayout);
        todaysaledetailsLayout.setHorizontalGroup(
            todaysaledetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(todaysaledetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        todaysaledetailsLayout.setVerticalGroup(
            todaysaledetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(todaysaledetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(todaysaledetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(todaysaledetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));

        jPanel38.setBackground(new java.awt.Color(73, 145, 255));
        jPanel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel45.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Messages");

        jList3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jList3.setSelectionBackground(new java.awt.Color(51, 153, 255));
        jScrollPane13.setViewportView(jList3);

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel41.setBackground(new java.awt.Color(73, 145, 255));
        jPanel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jList2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jList2.setSelectionBackground(new java.awt.Color(51, 153, 255));
        jScrollPane12.setViewportView(jList2);

        jLabel43.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Logged Users");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addContainerGap(117, Short.MAX_VALUE))
            .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel42.setBackground(new java.awt.Color(73, 145, 255));
        jPanel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel46.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Total Monthly Sales");

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));
        jPanel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel44.setBackground(new java.awt.Color(73, 145, 255));
        jPanel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel49.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Total Monthly Earning");

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel31.setBackground(new java.awt.Color(73, 145, 255));

        jLabel42.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Today Sales Earning");

        todayearned.setBackground(new java.awt.Color(51, 51, 51));
        todayearned.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        todayearned.setForeground(new java.awt.Color(255, 255, 255));
        todayearned.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        todayearned.setOpaque(true);

        jLabel44.setBackground(new java.awt.Color(51, 51, 51));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FRAMES/images/earnings.png"))); // NOI18N
        jLabel44.setOpaque(true);

        currencyinvisible.setBackground(new java.awt.Color(73, 145, 255));
        currencyinvisible.setForeground(new java.awt.Color(73, 145, 255));
        currencyinvisible.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(todayearned, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(currencyinvisible, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currencyinvisible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(todayearned, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HomepanelLayout = new javax.swing.GroupLayout(Homepanel);
        Homepanel.setLayout(HomepanelLayout);
        HomepanelLayout.setHorizontalGroup(
            HomepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        HomepanelLayout.setVerticalGroup(
            HomepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomepanelLayout.createSequentialGroup()
                .addGroup(HomepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(HomepanelLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Maincardpanel.add(Homepanel, "card2");

        Stockpanel.setBackground(new java.awt.Color(244, 248, 255));

        ViewStock.setBackground(new java.awt.Color(73, 145, 255));
        ViewStock.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        ViewStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewStock.setText("View Stock");
        ViewStock.setOpaque(true);
        ViewStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewStockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ViewStockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ViewStockMouseExited(evt);
            }
        });

        PrintStock.setBackground(new java.awt.Color(153, 204, 255));
        PrintStock.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        PrintStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrintStock.setText("Print Stock");
        PrintStock.setOpaque(true);
        PrintStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintStockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PrintStockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PrintStockMouseExited(evt);
            }
        });

        AddStock.setBackground(new java.awt.Color(153, 204, 255));
        AddStock.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        AddStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddStock.setText("Add New Stock");
        AddStock.setOpaque(true);
        AddStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddStockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddStockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddStockMouseExited(evt);
            }
        });

        PrintGRN.setBackground(new java.awt.Color(153, 204, 255));
        PrintGRN.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        PrintGRN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrintGRN.setText("Print GRN");
        PrintGRN.setOpaque(true);
        PrintGRN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintGRNMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PrintGRNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PrintGRNMouseExited(evt);
            }
        });

        stockupdate.setBackground(new java.awt.Color(153, 204, 255));
        stockupdate.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        stockupdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stockupdate.setText("Stock Update");
        stockupdate.setOpaque(true);
        stockupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockupdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stockupdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stockupdateMouseExited(evt);
            }
        });

        grnrecordslbl.setBackground(new java.awt.Color(153, 204, 255));
        grnrecordslbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        grnrecordslbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grnrecordslbl.setText("GRN Records");
        grnrecordslbl.setOpaque(true);
        grnrecordslbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grnrecordslblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grnrecordslblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                grnrecordslblMouseExited(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(51, 153, 255));
        jPanel7.setLayout(new java.awt.CardLayout());

        Viewstockpanel.setBackground(new java.awt.Color(51, 153, 255));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        refresh.setBackground(new java.awt.Color(51, 153, 255));
        refresh.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("Refresh");
        refresh.setContentAreaFilled(false);
        refresh.setFocusPainted(false);
        refresh.setOpaque(true);
        refresh.setPreferredSize(new java.awt.Dimension(140, 40));
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                refreshMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                refreshMouseReleased(evt);
            }
        });
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        quciksearchviewstock.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quciksearchviewstock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        quciksearchviewstock.setSelectionColor(new java.awt.Color(204, 0, 204));
        quciksearchviewstock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quciksearchviewstockKeyReleased(evt);
            }
        });

        quicksearchitemidlbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl.setText("Quick search Item ID");

        detailmodebtn.setBackground(new java.awt.Color(51, 153, 255));
        detailmodebtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        detailmodebtn.setForeground(new java.awt.Color(255, 255, 255));
        detailmodebtn.setText("Edit Details");
        detailmodebtn.setContentAreaFilled(false);
        detailmodebtn.setFocusPainted(false);
        detailmodebtn.setOpaque(true);
        detailmodebtn.setPreferredSize(new java.awt.Dimension(140, 40));
        detailmodebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                detailmodebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                detailmodebtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                detailmodebtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                detailmodebtnMouseReleased(evt);
            }
        });
        detailmodebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailmodebtnActionPerformed(evt);
            }
        });

        exportstocktablebtn.setBackground(new java.awt.Color(51, 153, 255));
        exportstocktablebtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        exportstocktablebtn.setForeground(new java.awt.Color(255, 255, 255));
        exportstocktablebtn.setText("Export table to xls");
        exportstocktablebtn.setContentAreaFilled(false);
        exportstocktablebtn.setFocusPainted(false);
        exportstocktablebtn.setOpaque(true);
        exportstocktablebtn.setPreferredSize(new java.awt.Dimension(140, 40));
        exportstocktablebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exportstocktablebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exportstocktablebtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exportstocktablebtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exportstocktablebtnMouseReleased(evt);
            }
        });
        exportstocktablebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportstocktablebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quicksearchitemidlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quciksearchviewstock, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailmodebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exportstocktablebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quicksearchitemidlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quciksearchviewstock)
                        .addComponent(detailmodebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exportstocktablebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );

        holder.setBackground(new java.awt.Color(51, 153, 255));
        holder.setLayout(new java.awt.CardLayout());

        tableview.setBackground(new java.awt.Color(255, 255, 255));

        viewstocktable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Id", "Item Name", "Stock Number", "Item Description", "Stock Price", "Selling Price", "Barcode", "Supplier Id", "Brand", "Condition", "Warranty", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewstocktable.setGridColor(new java.awt.Color(255, 255, 255));
        viewstocktable.setRowHeight(22);
        viewstocktable.setSelectionBackground(new java.awt.Color(73, 145, 255));
        viewstocktable.getTableHeader().setReorderingAllowed(false);
        viewstocktable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewstocktableMouseClicked(evt);
            }
        });
        viewstocktable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                viewstocktableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(viewstocktable);
        viewstocktable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (viewstocktable.getColumnModel().getColumnCount() > 0) {
            viewstocktable.getColumnModel().getColumn(0).setHeaderValue("Item Id");
            viewstocktable.getColumnModel().getColumn(1).setHeaderValue("Item Name");
            viewstocktable.getColumnModel().getColumn(2).setHeaderValue("Stock Number");
            viewstocktable.getColumnModel().getColumn(3).setHeaderValue("Item Description");
            viewstocktable.getColumnModel().getColumn(4).setHeaderValue("Stock Price");
            viewstocktable.getColumnModel().getColumn(5).setHeaderValue("Selling Price");
            viewstocktable.getColumnModel().getColumn(6).setHeaderValue("Barcode");
            viewstocktable.getColumnModel().getColumn(7).setHeaderValue("Supplier Id");
            viewstocktable.getColumnModel().getColumn(8).setHeaderValue("Brand");
            viewstocktable.getColumnModel().getColumn(9).setHeaderValue("Condition");
            viewstocktable.getColumnModel().getColumn(10).setHeaderValue("Warranty");
            viewstocktable.getColumnModel().getColumn(11).setHeaderValue("Quantity");
        }

        javax.swing.GroupLayout tableviewLayout = new javax.swing.GroupLayout(tableview);
        tableview.setLayout(tableviewLayout);
        tableviewLayout.setHorizontalGroup(
            tableviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
                .addContainerGap())
        );
        tableviewLayout.setVerticalGroup(
            tableviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
        );

        holder.add(tableview, "card4");

        detailmode.setBackground(new java.awt.Color(255, 255, 255));

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));

        itemidfield1.setEditable(false);
        itemidfield1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        itemidfield1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        itemidfield1.setSelectionColor(new java.awt.Color(204, 0, 204));
        itemidfield1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                itemidfield1FocusLost(evt);
            }
        });
        itemidfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemidfield1ActionPerformed(evt);
            }
        });

        quicksearchitemidlbl33.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl33.setText("Item ID");

        quicksearchitemidlbl34.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl34.setText("Item Name");

        itemnamefield1.setEditable(false);
        itemnamefield1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        itemnamefield1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        itemnamefield1.setSelectionColor(new java.awt.Color(204, 0, 204));
        itemnamefield1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                itemnamefield1FocusLost(evt);
            }
        });
        itemnamefield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemnamefield1ActionPerformed(evt);
            }
        });

        quicksearchitemidlbl35.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl35.setText("Item Description");

        itemdescriptionfield1.setEditable(false);
        itemdescriptionfield1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        itemdescriptionfield1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        itemdescriptionfield1.setSelectionColor(new java.awt.Color(204, 0, 204));
        itemdescriptionfield1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                itemdescriptionfield1FocusLost(evt);
            }
        });
        itemdescriptionfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemdescriptionfield1ActionPerformed(evt);
            }
        });

        stocknumberfield1.setEditable(false);
        stocknumberfield1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        stocknumberfield1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        stocknumberfield1.setSelectionColor(new java.awt.Color(204, 0, 204));
        stocknumberfield1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                stocknumberfield1FocusLost(evt);
            }
        });
        stocknumberfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stocknumberfield1ActionPerformed(evt);
            }
        });

        quicksearchitemidlbl36.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl36.setText("Stock Number");

        sellingpricefield1.setEditable(false);
        sellingpricefield1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        sellingpricefield1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        sellingpricefield1.setSelectionColor(new java.awt.Color(204, 0, 204));
        sellingpricefield1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sellingpricefield1FocusLost(evt);
            }
        });
        sellingpricefield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellingpricefield1ActionPerformed(evt);
            }
        });

        quicksearchitemidlbl37.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl37.setText("Selling Price");

        stockpricefield1.setEditable(false);
        stockpricefield1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        stockpricefield1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        stockpricefield1.setSelectionColor(new java.awt.Color(204, 0, 204));
        stockpricefield1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                stockpricefield1FocusLost(evt);
            }
        });
        stockpricefield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockpricefield1ActionPerformed(evt);
            }
        });

        quicksearchitemidlbl38.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl38.setText("Stock Price");

        quicksearchitemidlbl39.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl39.setText("Barcode");

        barcodefield1.setEditable(false);
        barcodefield1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        barcodefield1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        barcodefield1.setSelectionColor(new java.awt.Color(204, 0, 204));
        barcodefield1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                barcodefield1FocusLost(evt);
            }
        });
        barcodefield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcodefield1ActionPerformed(evt);
            }
        });

        quicksearchitemidlbl40.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl40.setText("Supplier Id");

        supplieridfield1.setEditable(false);
        supplieridfield1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        supplieridfield1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        supplieridfield1.setSelectionColor(new java.awt.Color(204, 0, 204));
        supplieridfield1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                supplieridfield1FocusLost(evt);
            }
        });
        supplieridfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplieridfield1ActionPerformed(evt);
            }
        });

        brandfield1.setEditable(false);
        brandfield1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        brandfield1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        brandfield1.setSelectionColor(new java.awt.Color(204, 0, 204));
        brandfield1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                brandfield1FocusLost(evt);
            }
        });
        brandfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandfield1ActionPerformed(evt);
            }
        });

        quicksearchitemidlbl41.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl41.setText("Brand");

        quicksearchitemidlbl42.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl42.setText("Condition");

        conditionfield1.setEditable(false);
        conditionfield1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        conditionfield1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        conditionfield1.setSelectionColor(new java.awt.Color(204, 0, 204));
        conditionfield1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                conditionfield1FocusLost(evt);
            }
        });
        conditionfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conditionfield1ActionPerformed(evt);
            }
        });

        quicksearchitemidlbl43.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N

        quicksearchitemidlbl44.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl44.setText("Warranty");

        warrantyfield1.setEditable(false);
        warrantyfield1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        warrantyfield1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        warrantyfield1.setSelectionColor(new java.awt.Color(204, 0, 204));
        warrantyfield1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                warrantyfield1FocusLost(evt);
            }
        });
        warrantyfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warrantyfield1ActionPerformed(evt);
            }
        });

        quicksearchitemidlbl45.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl45.setText("Quantity");

        quantityfield1.setEditable(false);
        quantityfield1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quantityfield1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        quantityfield1.setSelectionColor(new java.awt.Color(204, 0, 204));
        quantityfield1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityfield1FocusLost(evt);
            }
        });
        quantityfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityfield1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel35Layout.createSequentialGroup()
                                    .addComponent(quicksearchitemidlbl36)
                                    .addGap(95, 95, 95)
                                    .addComponent(stocknumberfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel35Layout.createSequentialGroup()
                                    .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(quicksearchitemidlbl35)
                                        .addComponent(quicksearchitemidlbl38))
                                    .addGap(79, 79, 79)
                                    .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(stockpricefield1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(itemdescriptionfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sellingpricefield1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel35Layout.createSequentialGroup()
                                    .addComponent(quicksearchitemidlbl34)
                                    .addGap(116, 116, 116)
                                    .addComponent(itemnamefield1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel35Layout.createSequentialGroup()
                                    .addComponent(quicksearchitemidlbl33)
                                    .addGap(141, 141, 141)
                                    .addComponent(itemidfield1))))
                        .addGap(83, 83, 83))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addComponent(quicksearchitemidlbl37)
                        .addGap(21, 21, 21)))
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quicksearchitemidlbl41)
                    .addComponent(quicksearchitemidlbl42)
                    .addComponent(quicksearchitemidlbl44)
                    .addComponent(quicksearchitemidlbl45)
                    .addComponent(quicksearchitemidlbl40)
                    .addComponent(quicksearchitemidlbl39))
                .addGap(65, 65, 65)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(warrantyfield1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(conditionfield1)
                    .addComponent(supplieridfield1)
                    .addComponent(barcodefield1)
                    .addComponent(brandfield1)
                    .addComponent(quantityfield1))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(quicksearchitemidlbl43, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(quicksearchitemidlbl33)
                    .addComponent(itemidfield1)
                    .addComponent(quicksearchitemidlbl39)
                    .addComponent(barcodefield1))
                .addGap(8, 8, 8)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(quicksearchitemidlbl34)
                    .addComponent(itemnamefield1)
                    .addComponent(quicksearchitemidlbl40)
                    .addComponent(supplieridfield1))
                .addGap(8, 8, 8)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(stocknumberfield1)
                    .addComponent(quicksearchitemidlbl36)
                    .addComponent(brandfield1)
                    .addComponent(quicksearchitemidlbl41))
                .addGap(8, 8, 8)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(quicksearchitemidlbl35)
                    .addComponent(itemdescriptionfield1)
                    .addComponent(quicksearchitemidlbl42)
                    .addComponent(conditionfield1))
                .addGap(8, 8, 8)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(stockpricefield1)
                    .addComponent(quicksearchitemidlbl38)
                    .addComponent(quicksearchitemidlbl44)
                    .addComponent(warrantyfield1))
                .addGap(8, 8, 8)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(quicksearchitemidlbl37)
                    .addComponent(sellingpricefield1)
                    .addComponent(quicksearchitemidlbl45)
                    .addComponent(quantityfield1))
                .addGap(20, 20, 20))
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(quicksearchitemidlbl43)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        quicksearchitemidlbl32.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        quicksearchitemidlbl32.setText("Detail Mode");

        deletethisid.setBackground(new java.awt.Color(51, 153, 255));
        deletethisid.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        deletethisid.setForeground(new java.awt.Color(255, 255, 255));
        deletethisid.setText("Delete Item");
        deletethisid.setContentAreaFilled(false);
        deletethisid.setFocusPainted(false);
        deletethisid.setOpaque(true);
        deletethisid.setPreferredSize(new java.awt.Dimension(140, 40));
        deletethisid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deletethisidMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deletethisidMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deletethisidMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deletethisidMouseReleased(evt);
            }
        });
        deletethisid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletethisidActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.CardLayout());

        ok.setBackground(new java.awt.Color(51, 153, 255));
        ok.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        ok.setForeground(new java.awt.Color(255, 255, 255));
        ok.setText("Ok");
        ok.setContentAreaFilled(false);
        ok.setFocusPainted(false);
        ok.setOpaque(true);
        ok.setPreferredSize(new java.awt.Dimension(140, 40));
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                okMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                okMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                okMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                okMouseReleased(evt);
            }
        });
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        jPanel2.add(ok, "card2");

        editdetailmodebtn.setBackground(new java.awt.Color(51, 153, 255));
        editdetailmodebtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        editdetailmodebtn.setForeground(new java.awt.Color(255, 255, 255));
        editdetailmodebtn.setText("Edit Item Details");
        editdetailmodebtn.setContentAreaFilled(false);
        editdetailmodebtn.setFocusPainted(false);
        editdetailmodebtn.setOpaque(true);
        editdetailmodebtn.setPreferredSize(new java.awt.Dimension(140, 40));
        editdetailmodebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editdetailmodebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editdetailmodebtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editdetailmodebtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editdetailmodebtnMouseReleased(evt);
            }
        });
        editdetailmodebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editdetailmodebtnActionPerformed(evt);
            }
        });
        jPanel2.add(editdetailmodebtn, "card2");

        jComboBox1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Reason to Edit", "Stock Price Change", "Selling Price Change", "Item Description Change", "Condition of Item Change", "Barcode Change", "Supplier ID Change", "Brand Change", "Warranty Change" }));

        quicksearchitemidlbl49.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl49.setText("Select");

        javax.swing.GroupLayout detailmodeLayout = new javax.swing.GroupLayout(detailmode);
        detailmode.setLayout(detailmodeLayout);
        detailmodeLayout.setHorizontalGroup(
            detailmodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailmodeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(quicksearchitemidlbl32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(detailmodeLayout.createSequentialGroup()
                .addGroup(detailmodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailmodeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(detailmodeLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(detailmodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detailmodeLayout.createSequentialGroup()
                                .addComponent(quicksearchitemidlbl49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(562, 562, 562))
                            .addGroup(detailmodeLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deletethisid, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)))))
                .addContainerGap())
        );
        detailmodeLayout.setVerticalGroup(
            detailmodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailmodeLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(quicksearchitemidlbl32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailmodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailmodeLayout.createSequentialGroup()
                        .addGroup(detailmodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(quicksearchitemidlbl49)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detailmodeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deletethisid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );

        holder.add(detailmode, "card3");

        javax.swing.GroupLayout ViewstockpanelLayout = new javax.swing.GroupLayout(Viewstockpanel);
        Viewstockpanel.setLayout(ViewstockpanelLayout);
        ViewstockpanelLayout.setHorizontalGroup(
            ViewstockpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewstockpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ViewstockpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(holder, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(ViewstockpanelLayout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ViewstockpanelLayout.setVerticalGroup(
            ViewstockpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewstockpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(holder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.add(Viewstockpanel, "card2");

        Addstockpanel.setBackground(new java.awt.Color(73, 145, 255));

        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        quicksearchitemidlbl1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        quicksearchitemidlbl1.setText("Add New Item");

        Addstockbtn.setBackground(new java.awt.Color(51, 153, 255));
        Addstockbtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        Addstockbtn.setForeground(new java.awt.Color(255, 255, 255));
        Addstockbtn.setText("Add");
        Addstockbtn.setContentAreaFilled(false);
        Addstockbtn.setFocusPainted(false);
        Addstockbtn.setOpaque(true);
        Addstockbtn.setPreferredSize(new java.awt.Dimension(140, 40));
        Addstockbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddstockbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddstockbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AddstockbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AddstockbtnMouseReleased(evt);
            }
        });
        Addstockbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddstockbtnActionPerformed(evt);
            }
        });

        itemidfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        itemidfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        itemidfield.setSelectionColor(new java.awt.Color(204, 0, 204));
        itemidfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemidfieldActionPerformed(evt);
            }
        });

        quicksearchitemidlbl4.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl4.setText("Item ID");

        quicksearchitemidlbl5.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl5.setText("Item Name");

        itemnamefield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        itemnamefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        itemnamefield.setSelectionColor(new java.awt.Color(204, 0, 204));
        itemnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemnamefieldActionPerformed(evt);
            }
        });

        quicksearchitemidlbl6.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl6.setText("Item Description");

        itemdescriptionfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        itemdescriptionfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        itemdescriptionfield.setSelectionColor(new java.awt.Color(204, 0, 204));
        itemdescriptionfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemdescriptionfieldActionPerformed(evt);
            }
        });

        stocknumberfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        stocknumberfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        stocknumberfield.setSelectionColor(new java.awt.Color(204, 0, 204));
        stocknumberfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stocknumberfieldActionPerformed(evt);
            }
        });

        quicksearchitemidlbl7.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl7.setText("Category Number");

        sellingpricefield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        sellingpricefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        sellingpricefield.setSelectionColor(new java.awt.Color(204, 0, 204));
        sellingpricefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellingpricefieldActionPerformed(evt);
            }
        });
        sellingpricefield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sellingpricefieldKeyTyped(evt);
            }
        });

        quicksearchitemidlbl8.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl8.setText("Selling Price");

        stockpricefield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        stockpricefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        stockpricefield.setSelectionColor(new java.awt.Color(204, 0, 204));
        stockpricefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockpricefieldActionPerformed(evt);
            }
        });
        stockpricefield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockpricefieldKeyTyped(evt);
            }
        });

        quicksearchitemidlbl9.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl9.setText("Stock Price");

        quicksearchitemidlbl10.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl10.setText("Barcode");

        barcodefield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        barcodefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        barcodefield.setSelectionColor(new java.awt.Color(204, 0, 204));
        barcodefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcodefieldActionPerformed(evt);
            }
        });

        quicksearchitemidlbl11.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl11.setText("Supplier Id");

        supplieridfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        supplieridfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        supplieridfield.setSelectionColor(new java.awt.Color(204, 0, 204));
        supplieridfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplieridfieldActionPerformed(evt);
            }
        });

        brandfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        brandfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        brandfield.setSelectionColor(new java.awt.Color(204, 0, 204));
        brandfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandfieldActionPerformed(evt);
            }
        });

        quicksearchitemidlbl12.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl12.setText("Brand");

        quicksearchitemidlbl13.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl13.setText("Condition");

        conditionfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        conditionfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        conditionfield.setSelectionColor(new java.awt.Color(204, 0, 204));
        conditionfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conditionfieldActionPerformed(evt);
            }
        });

        quicksearchitemidlbl14.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N

        quicksearchitemidlbl15.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl15.setText("Warranty");

        warrantyfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        warrantyfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        warrantyfield.setSelectionColor(new java.awt.Color(204, 0, 204));
        warrantyfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warrantyfieldActionPerformed(evt);
            }
        });

        quicksearchitemidlbl16.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl16.setText("Quantity");

        quantityfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quantityfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        quantityfield.setSelectionColor(new java.awt.Color(204, 0, 204));
        quantityfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityfieldActionPerformed(evt);
            }
        });
        quantityfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityfieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Addstockbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(quicksearchitemidlbl8)
                                .addGap(108, 108, 108)
                                .addComponent(sellingpricefield, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sellingpricefieldstate, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(quicksearchitemidlbl9)
                                .addGap(118, 118, 118)
                                .addComponent(stockpricefield, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stockpricefieldstate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel20Layout.createSequentialGroup()
                                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel20Layout.createSequentialGroup()
                                                .addComponent(quicksearchitemidlbl6)
                                                .addGap(79, 79, 79)
                                                .addComponent(itemdescriptionfield, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel20Layout.createSequentialGroup()
                                                .addComponent(quicksearchitemidlbl4)
                                                .addGap(141, 141, 141)
                                                .addComponent(itemidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel20Layout.createSequentialGroup()
                                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(quicksearchitemidlbl5)
                                                    .addComponent(quicksearchitemidlbl7))
                                                .addGap(71, 71, 71)
                                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(stocknumberfield, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(itemnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(28, 28, 28))
                                    .addGroup(jPanel20Layout.createSequentialGroup()
                                        .addComponent(quicksearchitemidlbl1)
                                        .addGap(347, 347, 347)))
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(itemidfieldstate, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                    .addComponent(itemnamefieldstate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(stocknumberfieldstate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(itemdescriptionfieldstate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quicksearchitemidlbl12)
                                    .addComponent(quicksearchitemidlbl13)
                                    .addComponent(quicksearchitemidlbl11)
                                    .addComponent(quicksearchitemidlbl10))
                                .addGap(81, 81, 81)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(warrantyfield, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(conditionfield)
                                    .addComponent(brandfield)
                                    .addComponent(supplieridfield)
                                    .addComponent(barcodefield)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quicksearchitemidlbl14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                                        .addComponent(quicksearchitemidlbl15)
                                        .addGap(125, 125, 125)))
                                .addGap(243, 243, 243))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                                .addComponent(quicksearchitemidlbl16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(quantityfield, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(barcodefieldstate, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(supplieridfieldstate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(brandfieldstate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(conditionfieldstate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(warrantyfieldstate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quantityfieldstate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(quicksearchitemidlbl1)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(itemidfieldstate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barcodefield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barcodefieldstate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quicksearchitemidlbl10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(itemnamefieldstate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quicksearchitemidlbl11)
                            .addComponent(supplieridfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(supplieridfieldstate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(quicksearchitemidlbl4)
                            .addComponent(itemidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(quicksearchitemidlbl5)
                            .addComponent(itemnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(stocknumberfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stocknumberfieldstate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quicksearchitemidlbl7)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(brandfieldstate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quicksearchitemidlbl12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brandfield, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))))
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(quicksearchitemidlbl6, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(itemdescriptionfield, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemdescriptionfieldstate, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(conditionfieldstate, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(conditionfield, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quicksearchitemidlbl13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(stockpricefieldstate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(stockpricefield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quicksearchitemidlbl9)
                        .addComponent(quicksearchitemidlbl15)
                        .addComponent(warrantyfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(warrantyfieldstate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(quicksearchitemidlbl14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(sellingpricefieldstate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quantityfieldstate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantityfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quicksearchitemidlbl16))
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sellingpricefield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quicksearchitemidlbl8)))
                .addGap(18, 18, 18)
                .addComponent(Addstockbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Add New Item", jPanel20);

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));

        quicksearchitemidlbl46.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl46.setText("Item Id");

        quicksearchitemidlbl57.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl57.setText("Item Name");

        suppliergrnfield4.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        suppliergrnfield4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        suppliergrnfield4.setSelectionColor(new java.awt.Color(100, 183, 0));
        suppliergrnfield4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliergrnfield4ActionPerformed(evt);
            }
        });

        dateingrn1.setEditable(false);
        dateingrn1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        dateingrn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        dateingrn1.setSelectionColor(new java.awt.Color(100, 183, 0));

        quicksearchitemidlbl58.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl58.setText("Item Barcode");

        invoicenoingrn1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        invoicenoingrn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        invoicenoingrn1.setSelectionColor(new java.awt.Color(100, 183, 0));
        invoicenoingrn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoicenoingrn1ActionPerformed(evt);
            }
        });

        quicksearchitemidlbl60.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl60.setText("Item Description");

        itemstable.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        itemstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Id", "Item Name", "Item Barcode", "Item Description", "Brand", "Condition", "Warranty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemstable.setGridColor(new java.awt.Color(255, 255, 255));
        itemstable.setRowHeight(22);
        itemstable.setSelectionBackground(new java.awt.Color(100, 183, 0));
        itemstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemstableMouseClicked(evt);
            }
        });
        jScrollPane20.setViewportView(itemstable);

        itemaddbtn.setBackground(new java.awt.Color(73, 145, 255));
        itemaddbtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        itemaddbtn.setForeground(new java.awt.Color(255, 255, 255));
        itemaddbtn.setText("Add Item");
        itemaddbtn.setContentAreaFilled(false);
        itemaddbtn.setFocusPainted(false);
        itemaddbtn.setOpaque(true);
        itemaddbtn.setPreferredSize(new java.awt.Dimension(140, 40));
        itemaddbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemaddbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemaddbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                itemaddbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                itemaddbtnMouseReleased(evt);
            }
        });
        itemaddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemaddbtnActionPerformed(evt);
            }
        });

        productcodeingrn1.setEditable(false);
        productcodeingrn1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        productcodeingrn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        productcodeingrn1.setSelectionColor(new java.awt.Color(100, 183, 0));
        productcodeingrn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productcodeingrn1ActionPerformed(evt);
            }
        });

        quicksearchitemidlbl68.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl68.setText("Brand");

        brandfield2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        brandfield2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        brandfield2.setSelectionColor(new java.awt.Color(204, 0, 204));
        brandfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandfield2ActionPerformed(evt);
            }
        });

        quicksearchitemidlbl69.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl69.setText("Condition");

        conditionfield2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        conditionfield2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        conditionfield2.setSelectionColor(new java.awt.Color(204, 0, 204));
        conditionfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conditionfield2ActionPerformed(evt);
            }
        });

        quicksearchitemidlbl70.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl70.setText("Warranty");

        warrantyfield2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        warrantyfield2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        warrantyfield2.setSelectionColor(new java.awt.Color(204, 0, 204));
        warrantyfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warrantyfield2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane20)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quicksearchitemidlbl57)
                            .addComponent(quicksearchitemidlbl58)
                            .addComponent(quicksearchitemidlbl46)
                            .addComponent(quicksearchitemidlbl60))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productcodeingrn1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invoicenoingrn1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateingrn1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suppliergrnfield4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(129, 129, 129)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(itemaddbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel39Layout.createSequentialGroup()
                                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quicksearchitemidlbl68)
                                    .addComponent(quicksearchitemidlbl69)
                                    .addComponent(quicksearchitemidlbl70))
                                .addGap(81, 81, 81)
                                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(warrantyfield2)
                                    .addComponent(conditionfield2)
                                    .addComponent(brandfield2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)))))
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quicksearchitemidlbl46)
                            .addComponent(productcodeingrn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(quicksearchitemidlbl57)
                            .addComponent(suppliergrnfield4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(dateingrn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quicksearchitemidlbl58))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(quicksearchitemidlbl60)
                            .addComponent(invoicenoingrn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quicksearchitemidlbl68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brandfield2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel39Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(conditionfield2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel39Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quicksearchitemidlbl69, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(warrantyfield2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quicksearchitemidlbl70))
                        .addGap(93, 93, 93)
                        .addComponent(itemaddbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Register Items", jPanel47);

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));

        quicksearchitemidlbl20.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl20.setText("GRN Number");

        grnnumberfield1.setEditable(false);
        grnnumberfield1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        grnnumberfield1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        grnnumberfield1.setSelectionColor(new java.awt.Color(100, 183, 0));

        dateingrn2.setEditable(false);
        dateingrn2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        dateingrn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        dateingrn2.setSelectionColor(new java.awt.Color(100, 183, 0));

        quicksearchitemidlbl23.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl23.setText("Date");

        quicksearchitemidlbl24.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl24.setText("Invoice Date");

        billdateingrn1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        billdateingrn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        billdateingrn1.setSelectionColor(new java.awt.Color(100, 183, 0));
        billdateingrn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billdateingrn1ActionPerformed(evt);
            }
        });

        invoicenoingrn2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        invoicenoingrn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        invoicenoingrn2.setSelectionColor(new java.awt.Color(100, 183, 0));
        invoicenoingrn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoicenoingrn2ActionPerformed(evt);
            }
        });

        invoiceamountingrn2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        invoiceamountingrn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        invoiceamountingrn2.setSelectionColor(new java.awt.Color(100, 183, 0));
        invoiceamountingrn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceamountingrn2ActionPerformed(evt);
            }
        });

        quicksearchitemidlbl28.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl28.setText("Invoice Amount");

        quicksearchitemidlbl29.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl29.setText("Invoice No");

        quicksearchitemidlbl65.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl65.setText("Quantity");

        quicksearchitemidlbl66.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl66.setText("Item id");

        grncountingtable1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        grncountingtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Item ID", "Item Name", "Item Description", "Quantity", "Stock Price", "Selling Price", "Total Price", "Description", "Barcode"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grncountingtable1.setGridColor(new java.awt.Color(255, 255, 255));
        grncountingtable1.setRowHeight(22);
        grncountingtable1.setSelectionBackground(new java.awt.Color(100, 183, 0));
        jScrollPane14.setViewportView(grncountingtable1);

        grnaddtotablebtn1.setBackground(new java.awt.Color(73, 145, 255));
        grnaddtotablebtn1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        grnaddtotablebtn1.setForeground(new java.awt.Color(255, 255, 255));
        grnaddtotablebtn1.setText("Add to list");
        grnaddtotablebtn1.setContentAreaFilled(false);
        grnaddtotablebtn1.setFocusPainted(false);
        grnaddtotablebtn1.setOpaque(true);
        grnaddtotablebtn1.setPreferredSize(new java.awt.Dimension(140, 40));
        grnaddtotablebtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grnaddtotablebtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                grnaddtotablebtn1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                grnaddtotablebtn1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                grnaddtotablebtn1MouseReleased(evt);
            }
        });
        grnaddtotablebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grnaddtotablebtn1ActionPerformed(evt);
            }
        });

        quicksearchitemidlbl67.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl67.setText("Generated Total");

        grntotal5.setEditable(false);
        grntotal5.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        grntotal5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        grntotal5.setSelectionColor(new java.awt.Color(100, 183, 0));

        okbtngrn1.setBackground(new java.awt.Color(73, 145, 255));
        okbtngrn1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        okbtngrn1.setForeground(new java.awt.Color(255, 255, 255));
        okbtngrn1.setText("Add to Stock");
        okbtngrn1.setContentAreaFilled(false);
        okbtngrn1.setFocusPainted(false);
        okbtngrn1.setOpaque(true);
        okbtngrn1.setPreferredSize(new java.awt.Dimension(140, 40));
        okbtngrn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                okbtngrn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                okbtngrn1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                okbtngrn1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                okbtngrn1MouseReleased(evt);
            }
        });
        okbtngrn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtngrn1ActionPerformed(evt);
            }
        });

        productquantityingrn1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        productquantityingrn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        productquantityingrn1.setSelectionColor(new java.awt.Color(100, 183, 0));
        productquantityingrn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productquantityingrn1ActionPerformed(evt);
            }
        });

        itemidss.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        itemidss.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                itemidssItemStateChanged(evt);
            }
        });
        itemidss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemidssActionPerformed(evt);
            }
        });

        billdateingrn2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        billdateingrn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        billdateingrn2.setSelectionColor(new java.awt.Color(100, 183, 0));
        billdateingrn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billdateingrn2ActionPerformed(evt);
            }
        });

        invoiceamountingrn3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        invoiceamountingrn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        invoiceamountingrn3.setSelectionColor(new java.awt.Color(100, 183, 0));
        invoiceamountingrn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceamountingrn3ActionPerformed(evt);
            }
        });

        quicksearchitemidlbl59.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl59.setText("Selling Price");

        quicksearchitemidlbl61.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl61.setText("Stock Price");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quicksearchitemidlbl23)
                            .addComponent(quicksearchitemidlbl29)
                            .addComponent(quicksearchitemidlbl24)
                            .addComponent(quicksearchitemidlbl28)
                            .addComponent(quicksearchitemidlbl67)
                            .addComponent(quicksearchitemidlbl20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel46Layout.createSequentialGroup()
                                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(grnnumberfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(invoicenoingrn2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateingrn2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(147, 147, 147)
                                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quicksearchitemidlbl65)
                                    .addComponent(quicksearchitemidlbl66, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quicksearchitemidlbl61)
                                    .addComponent(quicksearchitemidlbl59))
                                .addGap(73, 73, 73)
                                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(productquantityingrn1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(itemidss, 0, 250, Short.MAX_VALUE))
                                    .addComponent(billdateingrn2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(invoiceamountingrn3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel46Layout.createSequentialGroup()
                                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(invoiceamountingrn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(billdateingrn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grntotal5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(okbtngrn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(grnaddtotablebtn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addComponent(jScrollPane14)
                        .addContainerGap())))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addComponent(grnnumberfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateingrn2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(invoicenoingrn2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(billdateingrn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(invoiceamountingrn2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(grntotal5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quicksearchitemidlbl20)
                            .addComponent(quicksearchitemidlbl66)
                            .addComponent(itemidss, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(quicksearchitemidlbl65)
                            .addComponent(productquantityingrn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quicksearchitemidlbl23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(quicksearchitemidlbl29)
                            .addComponent(billdateingrn2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quicksearchitemidlbl61))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(quicksearchitemidlbl24)
                            .addComponent(invoiceamountingrn3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quicksearchitemidlbl59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel46Layout.createSequentialGroup()
                                .addComponent(quicksearchitemidlbl28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20)
                                .addComponent(quicksearchitemidlbl67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(53, 53, 53))
                            .addGroup(jPanel46Layout.createSequentialGroup()
                                .addComponent(grnaddtotablebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(okbtngrn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("GRN", jPanel48);

        javax.swing.GroupLayout AddstockpanelLayout = new javax.swing.GroupLayout(Addstockpanel);
        Addstockpanel.setLayout(AddstockpanelLayout);
        AddstockpanelLayout.setHorizontalGroup(
            AddstockpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddstockpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        AddstockpanelLayout.setVerticalGroup(
            AddstockpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddstockpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(Addstockpanel, "card3");

        printstockpanel.setBackground(new java.awt.Color(73, 145, 255));

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(printstocktabbed, javax.swing.GroupLayout.DEFAULT_SIZE, 1056, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(printstocktabbed, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout printstockpanelLayout = new javax.swing.GroupLayout(printstockpanel);
        printstockpanel.setLayout(printstockpanelLayout);
        printstockpanelLayout.setHorizontalGroup(
            printstockpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, printstockpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        printstockpanelLayout.setVerticalGroup(
            printstockpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, printstockpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.add(printstockpanel, "card6");

        stockupdatepanel.setBackground(new java.awt.Color(51, 153, 255));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        stockupdatetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Id", "Item Name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stockupdatetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockupdatetableMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(stockupdatetable);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel3.setText("Update Quantity of Items");

        quicksearchitemidlbl50.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl50.setText("Select Reason");

        jComboBox2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Supplier Stock", "Customer Returns" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        quicksearchitemidlbl51.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl51.setText("Quantity");

        updatestockqbtn.setBackground(new java.awt.Color(73, 145, 255));
        updatestockqbtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        updatestockqbtn.setForeground(new java.awt.Color(255, 255, 255));
        updatestockqbtn.setText("Update");
        updatestockqbtn.setContentAreaFilled(false);
        updatestockqbtn.setFocusPainted(false);
        updatestockqbtn.setOpaque(true);
        updatestockqbtn.setPreferredSize(new java.awt.Dimension(140, 40));
        updatestockqbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatestockqbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatestockqbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updatestockqbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                updatestockqbtnMouseReleased(evt);
            }
        });
        updatestockqbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatestockqbtnActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        quicksearchitemidlbl52.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl52.setText("Item Id");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updatestockqbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quicksearchitemidlbl51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quicksearchitemidlbl50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quicksearchitemidlbl52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)
                            .addComponent(jComboBox2, 0, 264, Short.MAX_VALUE))))
                .addGap(36, 36, 36))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(41, 41, 41)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quicksearchitemidlbl50)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quicksearchitemidlbl52)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quicksearchitemidlbl51)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updatestockqbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel9.setText("Bill Search");

        jTextField3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jTextField3.setEnabled(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jTextField4.setEnabled(false);

        quicksearchitemidlbl53.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl53.setText("Quantity in invoice");

        quicksearchitemidlbl54.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl54.setText("Search Invoice Id");

        searchbillbtn.setBackground(new java.awt.Color(73, 145, 255));
        searchbillbtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        searchbillbtn.setForeground(new java.awt.Color(255, 255, 255));
        searchbillbtn.setText("Search");
        searchbillbtn.setContentAreaFilled(false);
        searchbillbtn.setFocusPainted(false);
        searchbillbtn.setOpaque(true);
        searchbillbtn.setPreferredSize(new java.awt.Dimension(140, 40));
        searchbillbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchbillbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchbillbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchbillbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchbillbtnMouseReleased(evt);
            }
        });
        searchbillbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbillbtnActionPerformed(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jTextField5.setEnabled(false);

        quicksearchitemidlbl55.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl55.setText("Return Quantity");

        jTextField6.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jTextField6.setEnabled(false);

        quicksearchitemidlbl56.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl56.setText("Item Id");

        updatestockqbtn1.setBackground(new java.awt.Color(73, 145, 255));
        updatestockqbtn1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        updatestockqbtn1.setForeground(new java.awt.Color(255, 255, 255));
        updatestockqbtn1.setText("Return to Stock");
        updatestockqbtn1.setContentAreaFilled(false);
        updatestockqbtn1.setEnabled(false);
        updatestockqbtn1.setFocusPainted(false);
        updatestockqbtn1.setOpaque(true);
        updatestockqbtn1.setPreferredSize(new java.awt.Dimension(140, 40));
        updatestockqbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatestockqbtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatestockqbtn1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updatestockqbtn1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                updatestockqbtn1MouseReleased(evt);
            }
        });
        updatestockqbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatestockqbtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updatestockqbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(quicksearchitemidlbl53)
                                .addGroup(jPanel33Layout.createSequentialGroup()
                                    .addGap(167, 167, 167)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel33Layout.createSequentialGroup()
                                        .addComponent(quicksearchitemidlbl56)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel33Layout.createSequentialGroup()
                                        .addComponent(quicksearchitemidlbl54, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, 0)
                                .addComponent(searchbillbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel33Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(quicksearchitemidlbl55)
                            .addGap(61, 61, 61)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(11, 11, 11)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quicksearchitemidlbl54))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quicksearchitemidlbl56)))
                    .addComponent(searchbillbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quicksearchitemidlbl53))
                .addGap(4, 4, 4)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quicksearchitemidlbl55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updatestockqbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout stockupdatepanelLayout = new javax.swing.GroupLayout(stockupdatepanel);
        stockupdatepanel.setLayout(stockupdatepanelLayout);
        stockupdatepanelLayout.setHorizontalGroup(
            stockupdatepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockupdatepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(stockupdatepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(stockupdatepanelLayout.createSequentialGroup()
                        .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        stockupdatepanelLayout.setVerticalGroup(
            stockupdatepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockupdatepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(stockupdatepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(stockupdatepanel, "card6");

        printgrnpanel.setBackground(new java.awt.Color(51, 153, 255));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        printgrnbtn.setBackground(new java.awt.Color(51, 153, 255));
        printgrnbtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        printgrnbtn.setForeground(new java.awt.Color(255, 255, 255));
        printgrnbtn.setText("Preview");
        printgrnbtn.setContentAreaFilled(false);
        printgrnbtn.setEnabled(false);
        printgrnbtn.setFocusPainted(false);
        printgrnbtn.setOpaque(true);
        printgrnbtn.setPreferredSize(new java.awt.Dimension(140, 40));
        printgrnbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printgrnbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printgrnbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                printgrnbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                printgrnbtnMouseReleased(evt);
            }
        });
        printgrnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printgrnbtnActionPerformed(evt);
            }
        });

        quicksearchitemidlbl17.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl17.setText("GRN Number");

        grnnumberfield.setEditable(false);
        grnnumberfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        grnnumberfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        grnnumberfield.setSelectionColor(new java.awt.Color(204, 0, 204));

        quicksearchitemidlbl18.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl18.setText("Supplier");

        suppliergrnfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        suppliergrnfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        suppliergrnfield.setSelectionColor(new java.awt.Color(204, 0, 204));
        suppliergrnfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliergrnfieldActionPerformed(evt);
            }
        });

        dateingrn.setEditable(false);
        dateingrn.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        dateingrn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        dateingrn.setSelectionColor(new java.awt.Color(204, 0, 204));

        quicksearchitemidlbl19.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl19.setText("Date");

        quicksearchitemidlbl21.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl21.setText("Invoice Date");

        billdateingrn.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        billdateingrn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        billdateingrn.setSelectionColor(new java.awt.Color(204, 0, 204));
        billdateingrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billdateingrnActionPerformed(evt);
            }
        });

        invoicenoingrn.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        invoicenoingrn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        invoicenoingrn.setSelectionColor(new java.awt.Color(204, 0, 204));
        invoicenoingrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoicenoingrnActionPerformed(evt);
            }
        });

        invoiceamountingrn.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        invoiceamountingrn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        invoiceamountingrn.setSelectionColor(new java.awt.Color(204, 0, 204));
        invoiceamountingrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceamountingrnActionPerformed(evt);
            }
        });

        quicksearchitemidlbl25.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl25.setText("Invoice Amount");

        quicksearchitemidlbl26.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl26.setText("Invoice No");

        quicksearchitemidlbl30.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl30.setText("Product Quantity");

        productquantityingrn.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        productquantityingrn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        productquantityingrn.setSelectionColor(new java.awt.Color(204, 0, 204));
        productquantityingrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productquantityingrnActionPerformed(evt);
            }
        });

        productcodeingrn.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        productcodeingrn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        productcodeingrn.setSelectionColor(new java.awt.Color(204, 0, 204));
        productcodeingrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productcodeingrnActionPerformed(evt);
            }
        });

        quicksearchitemidlbl31.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl31.setText("Product Code");

        grncountingtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Product Code", "Product Name", "Product Quantity", "Per Product Amount", "Total Amount"
            }
        ));
        grncountingtable.setGridColor(new java.awt.Color(255, 255, 255));
        grncountingtable.setSelectionBackground(new java.awt.Color(73, 145, 255));
        jScrollPane3.setViewportView(grncountingtable);

        quicksearchitemidlbl47.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl47.setText("Product Name");

        Productnamegrn.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Productnamegrn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Productnamegrn.setSelectionColor(new java.awt.Color(204, 0, 204));
        Productnamegrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductnamegrnActionPerformed(evt);
            }
        });

        grnaddtotablebtn.setBackground(new java.awt.Color(51, 153, 255));
        grnaddtotablebtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        grnaddtotablebtn.setForeground(new java.awt.Color(255, 255, 255));
        grnaddtotablebtn.setText("Add to list");
        grnaddtotablebtn.setContentAreaFilled(false);
        grnaddtotablebtn.setFocusPainted(false);
        grnaddtotablebtn.setOpaque(true);
        grnaddtotablebtn.setPreferredSize(new java.awt.Dimension(140, 40));
        grnaddtotablebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grnaddtotablebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                grnaddtotablebtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                grnaddtotablebtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                grnaddtotablebtnMouseReleased(evt);
            }
        });
        grnaddtotablebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grnaddtotablebtnActionPerformed(evt);
            }
        });

        quicksearchitemidlbl48.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl48.setText("Per Product Amount");

        productamountingrn.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        productamountingrn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        productamountingrn.setSelectionColor(new java.awt.Color(204, 0, 204));
        productamountingrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productamountingrnActionPerformed(evt);
            }
        });

        quicksearchitemidlbl27.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        quicksearchitemidlbl27.setText("Generated Total");

        grntotal.setEditable(false);
        grntotal.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        grntotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        grntotal.setSelectionColor(new java.awt.Color(204, 0, 204));

        okbtngrn.setBackground(new java.awt.Color(51, 153, 255));
        okbtngrn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        okbtngrn.setForeground(new java.awt.Color(255, 255, 255));
        okbtngrn.setText("Ok");
        okbtngrn.setContentAreaFilled(false);
        okbtngrn.setFocusPainted(false);
        okbtngrn.setOpaque(true);
        okbtngrn.setPreferredSize(new java.awt.Dimension(140, 40));
        okbtngrn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                okbtngrnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                okbtngrnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                okbtngrnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                okbtngrnMouseReleased(evt);
            }
        });
        okbtngrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtngrnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(quicksearchitemidlbl27, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(grntotal, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                        .addComponent(quicksearchitemidlbl17, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(grnnumberfield, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                        .addComponent(quicksearchitemidlbl18, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(suppliergrnfield, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel23Layout.createSequentialGroup()
                                            .addComponent(quicksearchitemidlbl25, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(invoiceamountingrn, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel23Layout.createSequentialGroup()
                                            .addComponent(quicksearchitemidlbl19, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dateingrn, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel23Layout.createSequentialGroup()
                                            .addComponent(quicksearchitemidlbl21, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(billdateingrn, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel23Layout.createSequentialGroup()
                                            .addComponent(quicksearchitemidlbl26, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(invoicenoingrn, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(grnaddtotablebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                                    .addComponent(quicksearchitemidlbl31, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(productcodeingrn, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel23Layout.createSequentialGroup()
                                    .addComponent(quicksearchitemidlbl30, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(productquantityingrn, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel23Layout.createSequentialGroup()
                                    .addComponent(quicksearchitemidlbl48, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(productamountingrn, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(quicksearchitemidlbl47, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Productnamegrn, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                        .addGap(572, 572, 572)
                        .addComponent(okbtngrn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(printgrnbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quicksearchitemidlbl17)
                            .addComponent(grnnumberfield))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(suppliergrnfield, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(quicksearchitemidlbl18)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(quicksearchitemidlbl19)
                            .addComponent(dateingrn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(quicksearchitemidlbl26)
                            .addComponent(invoicenoingrn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(billdateingrn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quicksearchitemidlbl21))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoiceamountingrn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quicksearchitemidlbl25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quicksearchitemidlbl27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(grntotal)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quicksearchitemidlbl31)
                            .addComponent(productcodeingrn))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quicksearchitemidlbl47)
                            .addComponent(Productnamegrn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quicksearchitemidlbl30)
                            .addComponent(productquantityingrn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quicksearchitemidlbl48)
                            .addComponent(productamountingrn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(grnaddtotablebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printgrnbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okbtngrn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        grntabbed.addTab("New GRN", jPanel23);

        javax.swing.GroupLayout printgrnpanelLayout = new javax.swing.GroupLayout(printgrnpanel);
        printgrnpanel.setLayout(printgrnpanelLayout);
        printgrnpanelLayout.setHorizontalGroup(
            printgrnpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(printgrnpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(grntabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 1072, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        printgrnpanelLayout.setVerticalGroup(
            printgrnpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(printgrnpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(grntabbed)
                .addContainerGap())
        );

        jPanel7.add(printgrnpanel, "card7");

        grnrecordspanel.setBackground(new java.awt.Color(73, 145, 255));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        grnrecordstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Code", "Product Name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grnrecordstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grnrecordstableMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(grnrecordstable);

        previewgrnrecord.setBackground(new java.awt.Color(73, 145, 255));
        previewgrnrecord.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        previewgrnrecord.setForeground(new java.awt.Color(255, 255, 255));
        previewgrnrecord.setText("Preview GRN");
        previewgrnrecord.setContentAreaFilled(false);
        previewgrnrecord.setFocusPainted(false);
        previewgrnrecord.setOpaque(true);
        previewgrnrecord.setPreferredSize(new java.awt.Dimension(140, 40));
        previewgrnrecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                previewgrnrecordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                previewgrnrecordMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                previewgrnrecordMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                previewgrnrecordMouseReleased(evt);
            }
        });
        previewgrnrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewgrnrecordActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel48.setText("GRN Number");

        grnrecordfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        grnrecordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grnrecordfieldActionPerformed(evt);
            }
        });

        findbtn1.setBackground(new java.awt.Color(73, 145, 255));
        findbtn1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        findbtn1.setForeground(new java.awt.Color(255, 255, 255));
        findbtn1.setText("Find");
        findbtn1.setContentAreaFilled(false);
        findbtn1.setFocusPainted(false);
        findbtn1.setOpaque(true);
        findbtn1.setPreferredSize(new java.awt.Dimension(140, 40));
        findbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                findbtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                findbtn1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                findbtn1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                findbtn1MouseReleased(evt);
            }
        });
        findbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findbtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(previewgrnrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel24Layout.createSequentialGroup()
                            .addComponent(jLabel48)
                            .addGap(157, 157, 157)
                            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(grnrecordfield)
                                .addComponent(findbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(grnrecordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(findbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(previewgrnrecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout grnrecordspanelLayout = new javax.swing.GroupLayout(grnrecordspanel);
        grnrecordspanel.setLayout(grnrecordspanelLayout);
        grnrecordspanelLayout.setHorizontalGroup(
            grnrecordspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grnrecordspanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grnrecordstab, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        grnrecordspanelLayout.setVerticalGroup(
            grnrecordspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grnrecordspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(grnrecordspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(grnrecordstab)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(grnrecordspanel, "card3");

        javax.swing.GroupLayout StockpanelLayout = new javax.swing.GroupLayout(Stockpanel);
        Stockpanel.setLayout(StockpanelLayout);
        StockpanelLayout.setHorizontalGroup(
            StockpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StockpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StockpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrintGRN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddStock, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(PrintStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stockupdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grnrecordslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1096, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        StockpanelLayout.setVerticalGroup(
            StockpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StockpanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(StockpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(StockpanelLayout.createSequentialGroup()
                        .addComponent(ViewStock, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(AddStock, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(stockupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(PrintStock, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(PrintGRN, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(grnrecordslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );

        Maincardpanel.add(Stockpanel, "card3");

        SalesPanel.setBackground(new java.awt.Color(244, 248, 255));

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
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
                .addGroup(pospanelkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pospanelkLayout.createSequentialGroup()
                        .addComponent(Billokbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeitemfromlistbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(additeminpos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pospanelkLayout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sellidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel53)
                        .addGap(53, 53, 53)
                        .addComponent(searchinposfield, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(searchcomboinpos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel54)
                        .addGap(18, 18, 18)
                        .addComponent(quantityinpos, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pospanelkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel55)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel56)))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pospanelkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(additeminpos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeitemfromlistbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Billokbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
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
            .addComponent(invoicetab)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invoiceLayout.createSequentialGroup()
                .addContainerGap(610, Short.MAX_VALUE)
                .addComponent(backtopos, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        invoiceLayout.setVerticalGroup(
            invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoiceLayout.createSequentialGroup()
                .addComponent(invoicetab, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
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
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(printinvoicebtninsellrecords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout sellrecordspanelLayout = new javax.swing.GroupLayout(sellrecordspanel);
        sellrecordspanel.setLayout(sellrecordspanelLayout);
        sellrecordspanelLayout.setHorizontalGroup(
            sellrecordspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellrecordspanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sellrecordstab, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addContainerGap())
        );
        sellrecordspanelLayout.setVerticalGroup(
            sellrecordspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellrecordspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sellrecordspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sellrecordstab)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jPanel10.add(sellrecordspanel, "card3");

        javax.swing.GroupLayout SalesPanelLayout = new javax.swing.GroupLayout(SalesPanel);
        SalesPanel.setLayout(SalesPanelLayout);
        SalesPanelLayout.setHorizontalGroup(
            SalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sellrecordslbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(poslbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SalesPanelLayout.setVerticalGroup(
            SalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalesPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(SalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(SalesPanelLayout.createSequentialGroup()
                        .addComponent(poslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(sellrecordslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Maincardpanel.add(SalesPanel, "card4");

        ActivityLogpanel.setBackground(new java.awt.Color(244, 248, 255));

        Activityloglbl.setBackground(new java.awt.Color(73, 145, 255));
        Activityloglbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Activityloglbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Activityloglbl.setText("Activity Log");
        Activityloglbl.setOpaque(true);
        Activityloglbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActivityloglblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ActivityloglblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ActivityloglblMouseExited(evt);
            }
        });

        printloglbl.setBackground(new java.awt.Color(163, 199, 255));
        printloglbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        printloglbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        printloglbl.setText("Print Log");
        printloglbl.setOpaque(true);
        printloglbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printloglblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printloglblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printloglblMouseExited(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(51, 153, 255));
        jPanel8.setLayout(new java.awt.CardLayout());

        activitylogpanel.setBackground(new java.awt.Color(73, 145, 255));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        jLabel32.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel32.setText("Filter Log");

        refreshinlogbtn.setBackground(new java.awt.Color(73, 145, 255));
        refreshinlogbtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        refreshinlogbtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshinlogbtn.setText("Refresh");
        refreshinlogbtn.setContentAreaFilled(false);
        refreshinlogbtn.setFocusPainted(false);
        refreshinlogbtn.setOpaque(true);
        refreshinlogbtn.setPreferredSize(new java.awt.Dimension(140, 40));
        refreshinlogbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshinlogbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshinlogbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                refreshinlogbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                refreshinlogbtnMouseReleased(evt);
            }
        });
        refreshinlogbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshinlogbtnActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel38.setText("User");

        jLabel39.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel39.setText("Activity");

        filteruserfield.setBackground(new java.awt.Color(0, 153, 255));
        filteruserfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        filteruserfield.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Member", "User" }));
        filteruserfield.setOpaque(false);
        filteruserfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filteruserfieldActionPerformed(evt);
            }
        });

        activityfieldcombo.setBackground(new java.awt.Color(0, 153, 255));
        activityfieldcombo.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        activityfieldcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Login", "Logout", "Password Change", "Stock Add", "System Exit" }));
        activityfieldcombo.setOpaque(false);
        activityfieldcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityfieldcomboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 949, Short.MAX_VALUE))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addGap(121, 121, 121)
                                .addComponent(activityfieldcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(jLabel38)
                                .addGap(117, 117, 117)
                                .addComponent(filteruserfield, 0, 292, Short.MAX_VALUE))))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(refreshinlogbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addGap(46, 46, 46)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel38)
                    .addComponent(filteruserfield, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(activityfieldcombo)
                        .addGroup(jPanel21Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jLabel39)
                            .addGap(9, 9, 9))))
                .addGap(30, 30, 30)
                .addComponent(refreshinlogbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        Activitylogtable.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Activitylogtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date Time", "User", "Activity Type", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Activitylogtable.setGridColor(new java.awt.Color(255, 255, 255));
        Activitylogtable.setRowHeight(22);
        Activitylogtable.setSelectionBackground(new java.awt.Color(73, 145, 255));
        Activitylogtable.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(Activitylogtable);
        Activitylogtable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout activitylogpanelLayout = new javax.swing.GroupLayout(activitylogpanel);
        activitylogpanel.setLayout(activitylogpanelLayout);
        activitylogpanelLayout.setHorizontalGroup(
            activitylogpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, activitylogpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(activitylogpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        activitylogpanelLayout.setVerticalGroup(
            activitylogpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activitylogpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.add(activitylogpanel, "card2");

        printlogpanel.setBackground(new java.awt.Color(73, 145, 255));

        reportholder.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout reportholderLayout = new javax.swing.GroupLayout(reportholder);
        reportholder.setLayout(reportholderLayout);
        reportholderLayout.setHorizontalGroup(
            reportholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportholderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
                .addContainerGap())
        );
        reportholderLayout.setVerticalGroup(
            reportholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportholderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout printlogpanelLayout = new javax.swing.GroupLayout(printlogpanel);
        printlogpanel.setLayout(printlogpanelLayout);
        printlogpanelLayout.setHorizontalGroup(
            printlogpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(printlogpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reportholder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        printlogpanelLayout.setVerticalGroup(
            printlogpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(printlogpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reportholder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.add(printlogpanel, "card3");

        javax.swing.GroupLayout ActivityLogpanelLayout = new javax.swing.GroupLayout(ActivityLogpanel);
        ActivityLogpanel.setLayout(ActivityLogpanelLayout);
        ActivityLogpanelLayout.setHorizontalGroup(
            ActivityLogpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActivityLogpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ActivityLogpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(printloglbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Activityloglbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ActivityLogpanelLayout.setVerticalGroup(
            ActivityLogpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActivityLogpanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(ActivityLogpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ActivityLogpanelLayout.createSequentialGroup()
                        .addComponent(Activityloglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(printloglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Maincardpanel.add(ActivityLogpanel, "card5");

        Settingspanel.setBackground(new java.awt.Color(244, 248, 255));

        generallbl.setBackground(new java.awt.Color(73, 145, 255));
        generallbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        generallbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generallbl.setText("General");
        generallbl.setOpaque(true);
        generallbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generallblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generallblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generallblMouseExited(evt);
            }
        });

        accountslbl.setBackground(new java.awt.Color(163, 199, 255));
        accountslbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        accountslbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountslbl.setText("Accounts");
        accountslbl.setOpaque(true);
        accountslbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountslblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountslblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountslblMouseExited(evt);
            }
        });

        backuprestorelbl.setBackground(new java.awt.Color(163, 199, 255));
        backuprestorelbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        backuprestorelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backuprestorelbl.setText("Backup and Restore");
        backuprestorelbl.setOpaque(true);
        backuprestorelbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backuprestorelblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backuprestorelblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backuprestorelblMouseExited(evt);
            }
        });

        aboutlbl.setBackground(new java.awt.Color(163, 199, 255));
        aboutlbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        aboutlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aboutlbl.setText("About");
        aboutlbl.setOpaque(true);
        aboutlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutlblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutlblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutlblMouseExited(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(51, 153, 255));
        jPanel9.setLayout(new java.awt.CardLayout());

        generalpanel.setBackground(new java.awt.Color(73, 145, 255));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setEnabled(false);

        jLabel23.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel23.setText("Change Admin Password");

        jLabel24.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel24.setText("Current Password");

        jLabel25.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel25.setText("New Password");

        jLabel26.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel26.setText("Re-type New Password");

        passwrdchangebtn.setBackground(new java.awt.Color(73, 145, 255));
        passwrdchangebtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        passwrdchangebtn.setForeground(new java.awt.Color(255, 255, 255));
        passwrdchangebtn.setText("Change");
        passwrdchangebtn.setContentAreaFilled(false);
        passwrdchangebtn.setFocusPainted(false);
        passwrdchangebtn.setOpaque(true);
        passwrdchangebtn.setPreferredSize(new java.awt.Dimension(140, 40));
        passwrdchangebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwrdchangebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwrdchangebtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwrdchangebtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                passwrdchangebtnMouseReleased(evt);
            }
        });
        passwrdchangebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwrdchangebtnActionPerformed(evt);
            }
        });

        admincurrentpasswordinsettings.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        admincurrentpasswordinsettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admincurrentpasswordinsettingsActionPerformed(evt);
            }
        });

        newadminpasswordfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        newadminpasswordfield.setEnabled(false);
        newadminpasswordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newadminpasswordfieldActionPerformed(evt);
            }
        });

        retypenewadminpasswordfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        retypenewadminpasswordfield.setEnabled(false);
        retypenewadminpasswordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retypenewadminpasswordfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addContainerGap(818, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(passwrdchangebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel24)
                                .addGap(55, 55, 55)
                                .addComponent(admincurrentpasswordinsettings, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stateofcurrentpasswordadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(newadminpasswordfield, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                    .addComponent(retypenewadminpasswordfield))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stateofcurrentpasswordadmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stateofcurrentpasswordadmin2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(39, 39, 39))))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24)
                            .addComponent(admincurrentpasswordinsettings, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newadminpasswordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stateofcurrentpasswordadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stateofcurrentpasswordadmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(retypenewadminpasswordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)))
                    .addComponent(stateofcurrentpasswordadmin2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(passwrdchangebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel27.setText("Set average number for stock items");

        jLabel30.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel30.setText("Average Stock items");

        setavgstockbtn.setBackground(new java.awt.Color(73, 145, 255));
        setavgstockbtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        setavgstockbtn.setForeground(new java.awt.Color(255, 255, 255));
        setavgstockbtn.setText("Set");
        setavgstockbtn.setContentAreaFilled(false);
        setavgstockbtn.setFocusPainted(false);
        setavgstockbtn.setOpaque(true);
        setavgstockbtn.setPreferredSize(new java.awt.Dimension(140, 40));
        setavgstockbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setavgstockbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setavgstockbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                setavgstockbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                setavgstockbtnMouseReleased(evt);
            }
        });
        setavgstockbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setavgstockbtnActionPerformed(evt);
            }
        });

        avgstockfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addContainerGap(722, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel30)
                        .addGap(32, 32, 32)
                        .addComponent(avgstockfield, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(setavgstockbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(setavgstockbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(avgstockfield, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel33.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel33.setText("Set Currency Unit");

        jLabel34.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel34.setText("Currency Unit");

        setcurrency.setBackground(new java.awt.Color(73, 145, 255));
        setcurrency.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        setcurrency.setForeground(new java.awt.Color(255, 255, 255));
        setcurrency.setText("Set");
        setcurrency.setContentAreaFilled(false);
        setcurrency.setFocusPainted(false);
        setcurrency.setOpaque(true);
        setcurrency.setPreferredSize(new java.awt.Dimension(140, 40));
        setcurrency.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setcurrencyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setcurrencyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                setcurrencyMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                setcurrencyMouseReleased(evt);
            }
        });
        setcurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setcurrencyActionPerformed(evt);
            }
        });

        currencyfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addContainerGap(875, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel34)
                        .addGap(78, 78, 78)
                        .addComponent(currencyfield, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(setcurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(setcurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(currencyfield, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout generalpanelLayout = new javax.swing.GroupLayout(generalpanel);
        generalpanel.setLayout(generalpanelLayout);
        generalpanelLayout.setHorizontalGroup(
            generalpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(generalpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        generalpanelLayout.setVerticalGroup(
            generalpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, generalpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.add(generalpanel, "card3");

        accountspnl.setBackground(new java.awt.Color(73, 145, 255));

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Username", "Password", "Account Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(20);
        jTable1.setSelectionBackground(new java.awt.Color(73, 145, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(jTable1);

        jLabel35.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel35.setText("Username");

        usernamefieldinaccounts.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        usernamefieldinaccounts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        usernamefieldinaccounts.setSelectionColor(new java.awt.Color(204, 0, 204));

        jLabel36.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel36.setText("Password");

        passwordfieldinaccounts.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        passwordfieldinaccounts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        passwordfieldinaccounts.setSelectionColor(new java.awt.Color(204, 0, 204));

        Searchfieldinaccounts.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Searchfieldinaccounts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Searchfieldinaccounts.setSelectionColor(new java.awt.Color(204, 0, 204));
        Searchfieldinaccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchfieldinaccountsActionPerformed(evt);
            }
        });

        searchbtninaccounts.setBackground(new java.awt.Color(73, 145, 255));
        searchbtninaccounts.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        searchbtninaccounts.setForeground(new java.awt.Color(255, 255, 255));
        searchbtninaccounts.setText("Search");
        searchbtninaccounts.setContentAreaFilled(false);
        searchbtninaccounts.setFocusPainted(false);
        searchbtninaccounts.setOpaque(true);
        searchbtninaccounts.setPreferredSize(new java.awt.Dimension(140, 40));
        searchbtninaccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchbtninaccountsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchbtninaccountsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchbtninaccountsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchbtninaccountsMouseReleased(evt);
            }
        });
        searchbtninaccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtninaccountsActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel37.setText("Id/ Username");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addComponent(jLabel37)
                        .addGap(60, 60, 60)
                        .addComponent(Searchfieldinaccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchbtninaccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usernamefieldinaccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)
                        .addComponent(passwordfieldinaccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane11))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel36)
                    .addComponent(passwordfieldinaccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernamefieldinaccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(Searchfieldinaccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtninaccounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));

        addbtninaccounts.setBackground(new java.awt.Color(73, 145, 255));
        addbtninaccounts.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        addbtninaccounts.setForeground(new java.awt.Color(255, 255, 255));
        addbtninaccounts.setText("Add");
        addbtninaccounts.setContentAreaFilled(false);
        addbtninaccounts.setFocusPainted(false);
        addbtninaccounts.setOpaque(true);
        addbtninaccounts.setPreferredSize(new java.awt.Dimension(140, 40));
        addbtninaccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addbtninaccountsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addbtninaccountsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addbtninaccountsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addbtninaccountsMouseReleased(evt);
            }
        });
        addbtninaccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtninaccountsActionPerformed(evt);
            }
        });

        updatebtninaccounts.setBackground(new java.awt.Color(73, 145, 255));
        updatebtninaccounts.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        updatebtninaccounts.setForeground(new java.awt.Color(255, 255, 255));
        updatebtninaccounts.setText("Update");
        updatebtninaccounts.setContentAreaFilled(false);
        updatebtninaccounts.setFocusPainted(false);
        updatebtninaccounts.setOpaque(true);
        updatebtninaccounts.setPreferredSize(new java.awt.Dimension(140, 40));
        updatebtninaccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatebtninaccountsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatebtninaccountsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updatebtninaccountsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                updatebtninaccountsMouseReleased(evt);
            }
        });
        updatebtninaccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtninaccountsActionPerformed(evt);
            }
        });

        deletebtninaccounts.setBackground(new java.awt.Color(73, 145, 255));
        deletebtninaccounts.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        deletebtninaccounts.setForeground(new java.awt.Color(255, 255, 255));
        deletebtninaccounts.setText("Delete");
        deletebtninaccounts.setContentAreaFilled(false);
        deletebtninaccounts.setFocusPainted(false);
        deletebtninaccounts.setOpaque(true);
        deletebtninaccounts.setPreferredSize(new java.awt.Dimension(140, 40));
        deletebtninaccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deletebtninaccountsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deletebtninaccountsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deletebtninaccountsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deletebtninaccountsMouseReleased(evt);
            }
        });
        deletebtninaccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtninaccountsActionPerformed(evt);
            }
        });

        refreshbtninaccounts.setBackground(new java.awt.Color(73, 145, 255));
        refreshbtninaccounts.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        refreshbtninaccounts.setForeground(new java.awt.Color(255, 255, 255));
        refreshbtninaccounts.setText("Refresh");
        refreshbtninaccounts.setContentAreaFilled(false);
        refreshbtninaccounts.setFocusPainted(false);
        refreshbtninaccounts.setOpaque(true);
        refreshbtninaccounts.setPreferredSize(new java.awt.Dimension(140, 40));
        refreshbtninaccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshbtninaccountsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshbtninaccountsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                refreshbtninaccountsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                refreshbtninaccountsMouseReleased(evt);
            }
        });
        refreshbtninaccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbtninaccountsActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel18.setText("Manage Members");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addbtninaccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshbtninaccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updatebtninaccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletebtninaccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatebtninaccounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshbtninaccounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletebtninaccounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbtninaccounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));

        searchbtninaccounts1.setBackground(new java.awt.Color(73, 145, 255));
        searchbtninaccounts1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        searchbtninaccounts1.setForeground(new java.awt.Color(255, 255, 255));
        searchbtninaccounts1.setText("Force Logout Member");
        searchbtninaccounts1.setContentAreaFilled(false);
        searchbtninaccounts1.setFocusPainted(false);
        searchbtninaccounts1.setOpaque(true);
        searchbtninaccounts1.setPreferredSize(new java.awt.Dimension(140, 40));
        searchbtninaccounts1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchbtninaccounts1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchbtninaccounts1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchbtninaccounts1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchbtninaccounts1MouseReleased(evt);
            }
        });
        searchbtninaccounts1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtninaccounts1ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel50.setText("Force Logout this Member");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchbtninaccounts1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addGap(26, 26, 26)
                .addComponent(searchbtninaccounts1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout accountspnlLayout = new javax.swing.GroupLayout(accountspnl);
        accountspnl.setLayout(accountspnlLayout);
        accountspnlLayout.setHorizontalGroup(
            accountspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountspnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accountspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(accountspnlLayout.createSequentialGroup()
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        accountspnlLayout.setVerticalGroup(
            accountspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountspnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(accountspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel9.add(accountspnl, "card5");

        backuprestorepanel.setBackground(new java.awt.Color(73, 145, 255));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel15.setText("Backup Database");

        Backupbtn.setBackground(new java.awt.Color(73, 145, 255));
        Backupbtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        Backupbtn.setForeground(new java.awt.Color(255, 255, 255));
        Backupbtn.setText("Backup");
        Backupbtn.setContentAreaFilled(false);
        Backupbtn.setFocusPainted(false);
        Backupbtn.setOpaque(true);
        Backupbtn.setPreferredSize(new java.awt.Dimension(140, 40));
        Backupbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackupbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackupbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackupbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BackupbtnMouseReleased(evt);
            }
        });
        Backupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackupbtnActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel16.setText("Select location");

        backuplocationfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        backuplocationfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        backuplocationfield.setSelectionColor(new java.awt.Color(204, 0, 204));

        browsepathinbackup.setBackground(new java.awt.Color(73, 145, 255));
        browsepathinbackup.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        browsepathinbackup.setForeground(new java.awt.Color(255, 255, 255));
        browsepathinbackup.setText("Browse Path");
        browsepathinbackup.setContentAreaFilled(false);
        browsepathinbackup.setFocusPainted(false);
        browsepathinbackup.setOpaque(true);
        browsepathinbackup.setPreferredSize(new java.awt.Dimension(140, 40));
        browsepathinbackup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                browsepathinbackupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                browsepathinbackupMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                browsepathinbackupMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                browsepathinbackupMouseReleased(evt);
            }
        });
        browsepathinbackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsepathinbackupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(backuplocationfield, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(stateofbackuplbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Backupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browsepathinbackup, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(11, 11, 11)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(backuplocationfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(browsepathinbackup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(stateofbackuplbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Backupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jLabel28.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel28.setText("Restore Database");

        restorebtn.setBackground(new java.awt.Color(73, 145, 255));
        restorebtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        restorebtn.setForeground(new java.awt.Color(255, 255, 255));
        restorebtn.setText("Restore");
        restorebtn.setContentAreaFilled(false);
        restorebtn.setFocusPainted(false);
        restorebtn.setOpaque(true);
        restorebtn.setPreferredSize(new java.awt.Dimension(140, 40));
        restorebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                restorebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                restorebtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                restorebtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                restorebtnMouseReleased(evt);
            }
        });
        restorebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restorebtnActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel29.setText("Open location");

        restorelocationfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        restorelocationfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        restorelocationfield.setSelectionColor(new java.awt.Color(204, 0, 204));

        browsepathinrestore.setBackground(new java.awt.Color(73, 145, 255));
        browsepathinrestore.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        browsepathinrestore.setForeground(new java.awt.Color(255, 255, 255));
        browsepathinrestore.setText("Browse Path");
        browsepathinrestore.setContentAreaFilled(false);
        browsepathinrestore.setFocusPainted(false);
        browsepathinrestore.setOpaque(true);
        browsepathinrestore.setPreferredSize(new java.awt.Dimension(140, 40));
        browsepathinrestore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                browsepathinrestoreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                browsepathinrestoreMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                browsepathinrestoreMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                browsepathinrestoreMouseReleased(evt);
            }
        });
        browsepathinrestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsepathinrestoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(restorelocationfield, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(stateofrestorelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(restorebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browsepathinrestore, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addGap(11, 11, 11)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(restorelocationfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(browsepathinrestore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(stateofrestorelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(restorebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backuprestorepanelLayout = new javax.swing.GroupLayout(backuprestorepanel);
        backuprestorepanel.setLayout(backuprestorepanelLayout);
        backuprestorepanelLayout.setHorizontalGroup(
            backuprestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backuprestorepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backuprestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        backuprestorepanelLayout.setVerticalGroup(
            backuprestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backuprestorepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jPanel9.add(backuprestorepanel, "card5");

        about.setBackground(new java.awt.Color(73, 145, 255));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel19.setText("About");
        jPanel15.add(jLabel19);
        jLabel19.setBounds(41, 11, 52, 25);

        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel20.setText("StockPlus ver.1.0");
        jPanel15.add(jLabel20);
        jLabel20.setBounds(810, 100, 109, 20);

        jLabel21.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel21.setText("Retail Management System");
        jPanel15.add(jLabel21);
        jLabel21.setBounds(810, 120, 184, 20);

        jLabel22.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel22.setText("Tweet your feedback @heymeowcat");
        jPanel15.add(jLabel22);
        jLabel22.setBounds(810, 140, 250, 20);

        jLabel31.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel31.setText("by Vidura Dulanjan Fernando");
        jPanel15.add(jLabel31);
        jLabel31.setBounds(810, 160, 198, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FRAMES/images/snowflake.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        jPanel15.add(jLabel2);
        jLabel2.setBounds(40, 72, 140, 140);

        javax.swing.GroupLayout aboutLayout = new javax.swing.GroupLayout(about);
        about.setLayout(aboutLayout);
        aboutLayout.setHorizontalGroup(
            aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
                .addContainerGap())
        );
        aboutLayout.setVerticalGroup(
            aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.add(about, "card6");

        javax.swing.GroupLayout SettingspanelLayout = new javax.swing.GroupLayout(Settingspanel);
        Settingspanel.setLayout(SettingspanelLayout);
        SettingspanelLayout.setHorizontalGroup(
            SettingspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SettingspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backuprestorelbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generallbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aboutlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        SettingspanelLayout.setVerticalGroup(
            SettingspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingspanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(SettingspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SettingspanelLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(SettingspanelLayout.createSequentialGroup()
                        .addComponent(generallbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(accountslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(backuprestorelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(aboutlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225))))
        );

        Maincardpanel.add(Settingspanel, "card6");

        footer.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("@heymeowcat");

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

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel);
        AdminPanel.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Sales, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Activity_log, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Settings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Maincardpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPanelLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sales, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Activity_log, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Maincardpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        String activityloglogout = "INSERT INTO `activitylog`(`user`, `activitytype`, `description`) VALUES ('Admin','Logout','Admin Logged Out')";
        try {
            DB.DB.iud(activityloglogout);
            DB.DB.iud("UPDATE `accounts` SET `status` = '0' WHERE `accounts`.`id` = 1;");
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

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        lastactivitiesrefresh();
        loggedusersrefresh();
        messagessrefresh();
        setcurrencyunit();
        DefaultTableModel dtm = (DefaultTableModel) viewstocktable.getModel();
        dtm.setRowCount(0);
        refreshstocktable();
        DefaultTableModel dtmtodaysales = (DefaultTableModel) todaysales.getModel();
        dtmtodaysales.setRowCount(0);
        settodaysalestable();
        averagestockavailability();
        settodaysalesnumber();
        settodaysalesearned();
        setcolor(Home);
        resetcolor(Sales);
        resetcolor(Activity_log);
        resetcolor(Stock);
        resetcolor(Settings);
        Homepanel.setVisible(true);
        Stockpanel.setVisible(false);
        SalesPanel.setVisible(false);
        ActivityLogpanel.setVisible(false);
        Settingspanel.setVisible(false);
    }//GEN-LAST:event_HomeMouseClicked

    private void StockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StockMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) viewstocktable.getModel();
        dtm.setRowCount(0);
        refreshstocktable();
        DefaultTableModel dtmupdatestk = (DefaultTableModel) stockupdatetable.getModel();
        dtmupdatestk.setRowCount(0);
        refreshstockupdatetable();
        setcolor(Stock);
        resetcolor(Sales);
        resetcolor(Activity_log);
        resetcolor(Home);
        resetcolor(Settings);
        Homepanel.setVisible(false);
        Stockpanel.setVisible(true);
        SalesPanel.setVisible(false);
        ActivityLogpanel.setVisible(false);
        Settingspanel.setVisible(false);
    }//GEN-LAST:event_StockMouseClicked

    private void SalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalesMouseClicked
        generateInvoiceID();
        DefaultTableModel dtmsalesstock = (DefaultTableModel) stocktableinpostable.getModel();
        dtmsalesstock.setRowCount(0);
        refreshstocktableinpos();
        setcolor(Sales);
        resetcolor(Stock);
        resetcolor(Activity_log);
        resetcolor(Home);
        resetcolor(Settings);
        Homepanel.setVisible(false);
        Stockpanel.setVisible(false);
        SalesPanel.setVisible(true);
        ActivityLogpanel.setVisible(false);
        Settingspanel.setVisible(false);
    }//GEN-LAST:event_SalesMouseClicked

    private void Activity_logMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Activity_logMouseClicked
        DefaultTableModel dtmlog = (DefaultTableModel) Activitylogtable.getModel();
        dtmlog.setRowCount(0);
        refreshlogtable();
        setcolor(Activity_log);
        resetcolor(Stock);
        resetcolor(Sales);
        resetcolor(Home);
        resetcolor(Settings);
        Homepanel.setVisible(false);
        Stockpanel.setVisible(false);
        SalesPanel.setVisible(false);
        ActivityLogpanel.setVisible(true);
        Settingspanel.setVisible(false);

    }//GEN-LAST:event_Activity_logMouseClicked

    private void SettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseClicked
        setcolor(Settings);
        resetcolor(Stock);
        resetcolor(Sales);
        resetcolor(Home);
        resetcolor(Activity_log);
        Homepanel.setVisible(false);
        Stockpanel.setVisible(false);
        SalesPanel.setVisible(false);
        ActivityLogpanel.setVisible(false);
        Settingspanel.setVisible(true);

    }//GEN-LAST:event_SettingsMouseClicked

    private void ViewStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewStockMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) viewstocktable.getModel();
        dtm.setRowCount(0);
        refreshstocktable();
        tableview.setVisible(true);
        detailmode.setVisible(false);
        setcolor(ViewStock);
        resetcolor(AddStock);
        resetcolor(grnrecordslbl);
        resetcolor(PrintStock);
        resetcolor(PrintGRN);
        Viewstockpanel.setVisible(true);
        Addstockpanel.setVisible(false);
        grnrecordspanel.setVisible(false);
        stockupdatepanel.setVisible(false);
        printstockpanel.setVisible(false);
        printgrnpanel.setVisible(false);
        resetcolor(stockupdate);

        printstocktabbed.removeAll();
    }//GEN-LAST:event_ViewStockMouseClicked

    private void PrintStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintStockMouseClicked
        printstocktabbed.removeAll();
        try {
            String path = "C:\\JasperReports\\StockReport.jrxml";
            JasperReport compileReport = JasperCompileManager.compileReport(path);
            JasperPrint jp = JasperFillManager.fillReport(compileReport, null, DB.DB.getConnection());
//                JasperViewer.viewReport(jp);
            printstocktabbed.add("report", new JPanel().add(new JRViewer(jp)));
        } catch (Exception e) {
            e.printStackTrace();
        }

        setcolor(PrintStock);
        resetcolor(AddStock);
        resetcolor(ViewStock);
        resetcolor(PrintGRN);
        resetcolor(stockupdate);
        resetcolor(grnrecordslbl);
        Viewstockpanel.setVisible(false);
        Addstockpanel.setVisible(false);
        printstockpanel.setVisible(true);
        grnrecordspanel.setVisible(false);
        printgrnpanel.setVisible(false);
        stockupdatepanel.setVisible(false);
    }//GEN-LAST:event_PrintStockMouseClicked

    private void AddStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStockMouseClicked
        printstocktabbed.removeAll();
        setcolor(AddStock);
        resetcolor(ViewStock);
        resetcolor(grnrecordslbl);
        resetcolor(stockupdate);
        resetcolor(PrintStock);
        resetcolor(PrintGRN);
        Viewstockpanel.setVisible(false);
        Addstockpanel.setVisible(true);
        grnrecordspanel.setVisible(false);
        stockupdatepanel.setVisible(false);
        printstockpanel.setVisible(false);
        printgrnpanel.setVisible(false);
        selectitemscombo();
        DefaultTableModel dtm = (DefaultTableModel) itemstable.getModel();
        dtm.setRowCount(0);
        refreshitemstable();
    }//GEN-LAST:event_AddStockMouseClicked

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


    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
        refresh.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
        refresh.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_refreshMouseExited

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        quciksearchviewstock.setEditable(true);
        tableview.setVisible(true);
        detailmode.setVisible(false);
        DefaultTableModel dtm = (DefaultTableModel) viewstocktable.getModel();
        dtm.setRowCount(0);
        refreshstocktable();
        refreshstocktableinpos();
    }//GEN-LAST:event_refreshActionPerformed

    private void AddstockbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddstockbtnMouseEntered
        Addstockbtn.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_AddstockbtnMouseEntered

    private void AddstockbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddstockbtnMouseExited
        Addstockbtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_AddstockbtnMouseExited


    private void AddstockbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddstockbtnActionPerformed
        if (itemidfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Item Id !");
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            itemidfieldstate.setIcon(itemnamefieldstatus);
        } else if (itemnamefield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Item Name !");
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            itemnamefieldstate.setIcon(itemnamefieldstatus);
        } else if (stocknumberfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Item Stock Number");
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            stocknumberfieldstate.setIcon(itemnamefieldstatus);
        } else if (itemdescriptionfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Item Descriptionr !");
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            itemdescriptionfieldstate.setIcon(itemnamefieldstatus);
        } else if (stockpricefield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Item Stock price !");
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            stockpricefieldstate.setIcon(itemnamefieldstatus);
        } else if (sellingpricefield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Item Selling price !");
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            sellingpricefieldstate.setIcon(itemnamefieldstatus);
        } else if (barcodefield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Item Barcode !");
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            barcodefieldstate.setIcon(itemnamefieldstatus);
        } else if (supplieridfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Item Supplier !");
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            supplieridfieldstate.setIcon(itemnamefieldstatus);
        } else if (brandfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Item Brand !");
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            brandfieldstate.setIcon(itemnamefieldstatus);
        } else if (conditionfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Item Condition !");
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            conditionfieldstate.setIcon(itemnamefieldstatus);
        } else if (warrantyfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Item Warranty !");
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            warrantyfieldstate.setIcon(itemnamefieldstatus);
        } else if (quantityfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Item Quantity !");
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            quantityfieldstate.setIcon(itemnamefieldstatus);
        } else {
            String activitylogadminaddedstock = "INSERT INTO `activitylog`(`user`, `activitytype`, `description`) VALUES ('Admin','Stock Add','Admin Added Item to stock')";
            String sqlstock = "INSERT INTO `stock`(`Item Id`,`Item Name`, `Stock Number`,`Item Description`,`Stock Price`,`Selling Price`,`Barcode`,`Supplier Id`,`Brand`,`Condition of Item`,`Warranty`,`Quantity`) VALUES ('" + itemidfield.getText() + "','" + itemnamefield.getText() + "','" + stocknumberfield.getText() + "','" + itemdescriptionfield.getText() + "','" + stockpricefield.getText() + "','" + sellingpricefield.getText() + "','" + barcodefield.getText() + "','" + supplieridfield.getText() + "','" + brandfield.getText() + "','" + conditionfield.getText() + "','" + warrantyfield.getText() + "','" + quantityfield.getText() + "')";
            try {
                DB.DB.iud(sqlstock);
                DB.DB.iud(activitylogadminaddedstock);
                JOptionPane.showMessageDialog(this, "Item Added to stock");

                itemidfield.setText(null);
                itemnamefield.setText(null);
                stocknumberfield.setText(null);
                itemdescriptionfield.setText(null);
                stockpricefield.setText(null);
                sellingpricefield.setText(null);
                barcodefield.setText(null);
                supplieridfield.setText(null);
                brandfield.setText(null);
                conditionfield.setText(null);
                warrantyfield.setText(null);
                quantityfield.setText(null);
                itemidfieldstate.setIcon(null);
                itemidfieldstate.setIcon(null);
                itemnamefieldstate.setIcon(null);
                stocknumberfieldstate.setIcon(null);
                itemdescriptionfieldstate.setIcon(null);
                stockpricefieldstate.setIcon(null);
                sellingpricefieldstate.setIcon(null);
                barcodefieldstate.setIcon(null);
                supplieridfieldstate.setIcon(null);
                brandfieldstate.setIcon(null);
                conditionfieldstate.setIcon(null);
                warrantyfieldstate.setIcon(null);
                quantityfieldstate.setIcon(null);
                itemidfield.grabFocus();
                refreshstocktable();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Item Not Added");
            }

        }
    }//GEN-LAST:event_AddstockbtnActionPerformed


    private void exportstocktablebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportstocktablebtnMouseEntered
        exportstocktablebtn.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_exportstocktablebtnMouseEntered

    private void exportstocktablebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportstocktablebtnMouseExited
        exportstocktablebtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_exportstocktablebtnMouseExited

    private void exportstocktablebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportstocktablebtnActionPerformed
        JFileChooser f = new JFileChooser();
        f.showSaveDialog(this);
        try {
            File fx = f.getSelectedFile();
            pathxls = fx.getAbsolutePath();
            if (!pathxls.endsWith(".xls")) {
                pathxls += ".xls";
                System.out.println(pathxls);
            }
            pathxls = pathxls.replace('\\', '/');
            exportstocktabletoexel();
            Desktop.getDesktop().open(fx);
        } catch (Exception e) {
        }


    }//GEN-LAST:event_exportstocktablebtnActionPerformed

    private void PrintGRNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintGRNMouseClicked
        printgrnbtn.setEnabled(false);
        printstocktabbed.removeAll();
        setcolor(PrintGRN);
        resetcolor(PrintStock);
        resetcolor(AddStock);
        resetcolor(stockupdate);
        resetcolor(grnrecordslbl);
        resetcolor(ViewStock);
        Viewstockpanel.setVisible(false);
        Addstockpanel.setVisible(false);
        grnrecordspanel.setVisible(false);
        stockupdatepanel.setVisible(false);
        printstockpanel.setVisible(false);
        printgrnpanel.setVisible(true);
    }//GEN-LAST:event_PrintGRNMouseClicked

    private void poslblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poslblMouseClicked
        generateInvoiceID();
        setcolor(poslbl);
        resetcolor(sellrecordslbl);

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

    private void generateGRNID() {
        try {

            ResultSet rs = DB.DB.search("select count(DISTINCT  `grn number`) as x from `grn records` ");
            if (rs.next()) {

                int rowcount = Integer.parseInt(rs.getString("x"));
                rowcount++;
                grnnumberfield.setText("" + rowcount);
                grnnumberfield1.setText("" + rowcount);
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
                    DB.DB.iud("INSERT INTO `sales records` (`Item Ids and Quantities`, `Sale Earnings`, `Bill number`, `Date Time`, `salesatus`,`Billtotal`,`itemname`,`justtoatal`, `discount`, `vat`, `payment`, `balance`,`quantity`, `itemid`,`billedby`) VALUES ('" + ItemIdsandQuantities + "', '" + perprice + "', '" + Sellidfield.getText() + "', CURRENT_TIMESTAMP,  'SUCCESS', '" + nettotalfield.getText() + "', '" + itemname + "', '" + totalinpos.getText() + "', '" + discountfield.getText() + "', '" + vatfield.getText() + "', '" + paymentfield.getText() + "', '" + balancefield.getText() + "', '" + quantitiesn + "', '" + ids + "', 'Admin');");
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

    private void ActivityloglblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActivityloglblMouseClicked

        DefaultTableModel dtmlog = (DefaultTableModel) Activitylogtable.getModel();
        dtmlog.setRowCount(0);
        refreshlogtable();
        jTabbedPane1.removeAll();
        setcolor(Activityloglbl);
        resetcolor(printloglbl);
        activitylogpanel.setVisible(true);
        printlogpanel.setVisible(false);

    }//GEN-LAST:event_ActivityloglblMouseClicked

    private void printloglblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printloglblMouseClicked
        jTabbedPane1.removeAll();
        try {
            String path = "C:\\JasperReports\\ActivityLogReport.jrxml";
            JasperReport compileReport = JasperCompileManager.compileReport(path);
            JasperPrint jp = JasperFillManager.fillReport(compileReport, null, DB.DB.getConnection());
//                JasperViewer.viewReport(jp);
            jTabbedPane1.add("report", new JPanel().add(new JRViewer(jp)));
        } catch (Exception e) {
            e.printStackTrace();
        }

        setcolor(printloglbl);
        resetcolor(Activityloglbl);
        activitylogpanel.setVisible(false);
        printlogpanel.setVisible(true);
    }//GEN-LAST:event_printloglblMouseClicked

    private void refreshinlogbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshinlogbtnMouseEntered
        refreshinlogbtn.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_refreshinlogbtnMouseEntered

    private void refreshinlogbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshinlogbtnMouseExited
        refreshinlogbtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_refreshinlogbtnMouseExited

    private void refreshinlogbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshinlogbtnActionPerformed
        DefaultTableModel dtmlog = (DefaultTableModel) Activitylogtable.getModel();
        dtmlog.setRowCount(0);
        refreshlogtable();
    }//GEN-LAST:event_refreshinlogbtnActionPerformed

    private void generallblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generallblMouseClicked
        setcolor(generallbl);
        resetcolor(accountslbl);
        resetcolor(backuprestorelbl);
        resetcolor(aboutlbl);
        generalpanel.setVisible(true);
        backuprestorepanel.setVisible(false);
        about.setVisible(false);
        accountspnl.setVisible(false);
    }//GEN-LAST:event_generallblMouseClicked

    private void backuprestorelblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backuprestorelblMouseClicked
        resetcolor(accountslbl);
        setcolor(backuprestorelbl);
        resetcolor(generallbl);
        resetcolor(aboutlbl);
        generalpanel.setVisible(false);
        backuprestorepanel.setVisible(true);
        about.setVisible(false);
        accountspnl.setVisible(false);
    }//GEN-LAST:event_backuprestorelblMouseClicked

    private void aboutlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutlblMouseClicked
        AnimationClass AC = new AnimationClass();
        AC.jLabelXRight(40, 380, 10, 1, jLabel2);
        AC.jLabelXLeft(810, 530, 10, 1, jLabel20);
        AC.jLabelXLeft(810, 530, 10, 1, jLabel21);
        AC.jLabelXLeft(810, 530, 10, 1, jLabel22);
        AC.jLabelXLeft(810, 530, 10, 1, jLabel31);
        setcolor(aboutlbl);
        resetcolor(backuprestorelbl);
        resetcolor(accountslbl);
        resetcolor(generallbl);
        generalpanel.setVisible(false);
        backuprestorepanel.setVisible(false);
        about.setVisible(true);
        accountspnl.setVisible(false);
    }//GEN-LAST:event_aboutlblMouseClicked

    private void passwrdchangebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwrdchangebtnMouseEntered
        passwrdchangebtn.setBackground(new java.awt.Color(101, 178, 255));
    }//GEN-LAST:event_passwrdchangebtnMouseEntered

    private void passwrdchangebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwrdchangebtnMouseExited
        passwrdchangebtn.setBackground(new java.awt.Color(51, 153, 255));
    }//GEN-LAST:event_passwrdchangebtnMouseExited

    private void passwrdchangebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwrdchangebtnActionPerformed
        if (newadminpasswordfield.getText().toString().equals(retypenewadminpasswordfield.getText().toString())) {
            ImageIcon statusiconcurrentpassword = new ImageIcon(getClass().getResource("images/success.png"));
            stateofcurrentpasswordadmin1.setIcon(statusiconcurrentpassword);
            try {
                DB.DB.iud("update accounts  set password='" + retypenewadminpasswordfield.getText() + "' where accounttype='Admin'");
                DB.DB.iud("INSERT INTO `activitylog`(`user`, `activitytype`, `description`) VALUES ('Admin','Password Change','Admin Chnaged Password Success')");
                JOptionPane.showMessageDialog(this, "Admin Password Changed !");
                newadminpasswordfield.setEnabled(false);
                retypenewadminpasswordfield.setEnabled(false);
                admincurrentpasswordinsettings.setText(null);
                newadminpasswordfield.setText(null);
                retypenewadminpasswordfield.setText(null);
                admincurrentpasswordinsettings.setEditable(true);
                stateofcurrentpasswordadmin.setIcon(null);
                stateofcurrentpasswordadmin1.setIcon(null);
                stateofcurrentpasswordadmin2.setIcon(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Retype Incorrect !");
            ImageIcon statusiconcurrentpassword = new ImageIcon(getClass().getResource("images/failed.png"));
            stateofcurrentpasswordadmin2.setIcon(statusiconcurrentpassword);
            newadminpasswordfield.setText(null);
            retypenewadminpasswordfield.setText(null);
            admincurrentpasswordinsettings.setEditable(false);
        }


    }//GEN-LAST:event_passwrdchangebtnActionPerformed

    private void BackupbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackupbtnMouseEntered
        Backupbtn.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_BackupbtnMouseEntered

    private void BackupbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackupbtnMouseExited
        Backupbtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_BackupbtnMouseExited

    private void BackupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackupbtnActionPerformed
        Process p = null;
        try {
            Runtime runtime = Runtime.getRuntime();
            p = runtime.exec("C:/xampp/mysql/bin/mysqldump.exe  -uroot  --add-drop-database -B stockplus  -r" + path);
            int processcomplete = p.waitFor();
            if (processcomplete == 0) {
                ImageIcon statusicon = new ImageIcon(getClass().getResource("images/success.png"));
                stateofbackuplbl.setIcon(statusicon);
            } else {
                ImageIcon statusicon = new ImageIcon(getClass().getResource("images/failed.png"));
                stateofbackuplbl.setIcon(statusicon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_BackupbtnActionPerformed

    private void supplieridfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplieridfieldActionPerformed
        if (supplieridfield.getText().isEmpty()) {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            supplieridfieldstate.setIcon(itemnamefieldstatus);
        } else {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/success.png"));
            supplieridfieldstate.setIcon(itemnamefieldstatus);
            brandfield.grabFocus();
        }
    }//GEN-LAST:event_supplieridfieldActionPerformed

    private void itemidfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemidfieldActionPerformed
        try {
            Boolean found = false;
            ResultSet rs = DB.DB.search("select `Item Id` from `stock` where `Item Id` = '" + itemidfield.getText() + "'");
            found = rs.next();
            if (found) {
                if (itemidfield.getText().equalsIgnoreCase(rs.getString(1))) {
                    ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
                    itemidfieldstate.setIcon(itemnamefieldstatus);
                    JOptionPane.showMessageDialog(this, "Item Already Exist !");
                    itemnamefield.setEnabled(false);
                    stocknumberfield.setEnabled(false);
                    itemdescriptionfield.setEnabled(false);
                    stockpricefield.setEnabled(false);
                    sellingpricefield.setEnabled(false);
                    barcodefield.setEnabled(false);
                    supplieridfield.setEnabled(false);
                    brandfield.setEnabled(false);
                    conditionfield.setEnabled(false);
                    warrantyfield.setEnabled(false);
                    quantityfield.setEnabled(false);
                }
            } else {
                ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/success.png"));
                itemidfieldstate.setIcon(itemnamefieldstatus);
                itemnamefield.setEnabled(true);
                stocknumberfield.setEnabled(true);
                itemdescriptionfield.setEnabled(true);
                stockpricefield.setEnabled(true);
                sellingpricefield.setEnabled(true);
                barcodefield.setEnabled(true);
                supplieridfield.setEnabled(true);
                brandfield.setEnabled(true);
                conditionfield.setEnabled(true);
                warrantyfield.setEnabled(true);
                quantityfield.setEnabled(true);
                itemnamefield.grabFocus();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_itemidfieldActionPerformed

    private void itemnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemnamefieldActionPerformed
        if (itemnamefield.getText().isEmpty()) {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            itemnamefieldstate.setIcon(itemnamefieldstatus);
        } else {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/success.png"));
            itemnamefieldstate.setIcon(itemnamefieldstatus);
            stocknumberfield.grabFocus();
        }

    }//GEN-LAST:event_itemnamefieldActionPerformed

    private void stocknumberfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stocknumberfieldActionPerformed
        if (stocknumberfield.getText().isEmpty()) {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            stocknumberfieldstate.setIcon(itemnamefieldstatus);
        } else {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/success.png"));
            stocknumberfieldstate.setIcon(itemnamefieldstatus);
            itemdescriptionfield.grabFocus();
        }
    }//GEN-LAST:event_stocknumberfieldActionPerformed

    private void itemdescriptionfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemdescriptionfieldActionPerformed
        if (itemdescriptionfield.getText().isEmpty()) {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            itemdescriptionfieldstate.setIcon(itemnamefieldstatus);
        } else {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/success.png"));
            itemdescriptionfieldstate.setIcon(itemnamefieldstatus);
            stockpricefield.grabFocus();
        }
    }//GEN-LAST:event_itemdescriptionfieldActionPerformed

    private void stockpricefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockpricefieldActionPerformed
        if (stockpricefield.getText().isEmpty()) {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            stockpricefieldstate.setIcon(itemnamefieldstatus);
        } else {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/success.png"));
            stockpricefieldstate.setIcon(itemnamefieldstatus);
            sellingpricefield.grabFocus();
        }
    }//GEN-LAST:event_stockpricefieldActionPerformed

    private void sellingpricefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellingpricefieldActionPerformed
        if (sellingpricefield.getText().isEmpty()) {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            sellingpricefieldstate.setIcon(itemnamefieldstatus);
        } else {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/success.png"));
            sellingpricefieldstate.setIcon(itemnamefieldstatus);
            barcodefield.grabFocus();
        }
    }//GEN-LAST:event_sellingpricefieldActionPerformed

    private void brandfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandfieldActionPerformed
        if (brandfield.getText().isEmpty()) {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            brandfieldstate.setIcon(itemnamefieldstatus);
        } else {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/success.png"));
            brandfieldstate.setIcon(itemnamefieldstatus);
            conditionfield.grabFocus();
        }
    }//GEN-LAST:event_brandfieldActionPerformed

    private void conditionfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conditionfieldActionPerformed
        if (conditionfield.getText().isEmpty()) {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            conditionfieldstate.setIcon(itemnamefieldstatus);
        } else {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/success.png"));
            conditionfieldstate.setIcon(itemnamefieldstatus);
            warrantyfield.grabFocus();
        }
    }//GEN-LAST:event_conditionfieldActionPerformed

    private void warrantyfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warrantyfieldActionPerformed
        if (warrantyfield.getText().isEmpty()) {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            warrantyfieldstate.setIcon(itemnamefieldstatus);
        } else {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/success.png"));
            warrantyfieldstate.setIcon(itemnamefieldstatus);
            quantityfield.grabFocus();
        }
    }//GEN-LAST:event_warrantyfieldActionPerformed


    private void quantityfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityfieldActionPerformed
        if (quantityfield.getText().isEmpty()) {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            quantityfieldstate.setIcon(itemnamefieldstatus);
        } else {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/success.png"));
            quantityfieldstate.setIcon(itemnamefieldstatus);
        }
    }//GEN-LAST:event_quantityfieldActionPerformed

    private void barcodefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcodefieldActionPerformed
        if (barcodefield.getText().isEmpty()) {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/failed.png"));
            barcodefieldstate.setIcon(itemnamefieldstatus);
        } else {
            ImageIcon itemnamefieldstatus = new ImageIcon(getClass().getResource("images/success.png"));
            barcodefieldstate.setIcon(itemnamefieldstatus);
            supplieridfield.grabFocus();
        }
    }//GEN-LAST:event_barcodefieldActionPerformed

    private void browsepathinbackupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browsepathinbackupMouseEntered
        browsepathinbackup.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_browsepathinbackupMouseEntered

    private void browsepathinbackupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browsepathinbackupMouseExited
        browsepathinbackup.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_browsepathinbackupMouseExited

    private void browsepathinbackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsepathinbackupActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.showSaveDialog(this);
        String datefc = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        try {
            File f = fc.getSelectedFile();
            path = f.getAbsolutePath();
            path = path.replace('\\', '/');
            path = path + "_" + datefc + ".sql";
            backuplocationfield.setText(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_browsepathinbackupActionPerformed

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

    private void admincurrentpasswordinsettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admincurrentpasswordinsettingsActionPerformed

        String admincurrentpassword = String.valueOf(admincurrentpasswordinsettings.getPassword());
        boolean currentpasswordsuccess = false;
        try {
            ResultSet rs = DB.DB.search("SELECT * FROM  `accounts` WHERE  `username` LIKE  'Admin' AND `accounttype` LIKE  'Admin' AND  `password` =  '" + admincurrentpassword + "'");
            if (rs.next()) {

                currentpasswordsuccess = true;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (currentpasswordsuccess) {
            ImageIcon statusiconcurrentpassword = new ImageIcon(getClass().getResource("images/success.png"));
            stateofcurrentpasswordadmin.setIcon(statusiconcurrentpassword);
            newadminpasswordfield.setEnabled(true);

            admincurrentpasswordinsettings.setEditable(false);
            newadminpasswordfield.grabFocus();

        } else {
            ImageIcon statusiconcurrentpassword = new ImageIcon(getClass().getResource("images/failed.png"));
            stateofcurrentpasswordadmin.setIcon(statusiconcurrentpassword);
            try {
                DB.DB.iud("INSERT INTO `activitylog`(`user`, `activitytype`, `description`) VALUES ('Admin','Password Change','Admin Chnaged Password Failed')");
            } catch (Exception ex) {
                Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_admincurrentpasswordinsettingsActionPerformed

    private void restorebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restorebtnMouseEntered
        restorebtn.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_restorebtnMouseEntered

    private void restorebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restorebtnMouseExited
        restorebtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_restorebtnMouseExited

    private void restorebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restorebtnActionPerformed
        String user = "root";
        String pass = "";
        String[] restoreCmd = new String[]{"C:/xampp/mysql/bin/mysql.exe", "--user=" + user, "--password=" + pass, "-e", "source " + path};
        Process process;
        try {
            process = Runtime.getRuntime().exec(restoreCmd);
            int procCom = process.waitFor();
            if (procCom == 0) {
                ImageIcon statusicon = new ImageIcon(getClass().getResource("images/success.png"));
                stateofrestorelbl.setIcon(statusicon);
            } else {
                ImageIcon statusicon = new ImageIcon(getClass().getResource("images/failed.png"));
                stateofrestorelbl.setIcon(statusicon);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_restorebtnActionPerformed

    private void browsepathinrestoreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browsepathinrestoreMouseEntered
        browsepathinrestore.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_browsepathinrestoreMouseEntered

    private void browsepathinrestoreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browsepathinrestoreMouseExited
        browsepathinrestore.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_browsepathinrestoreMouseExited

    private void browsepathinrestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsepathinrestoreActionPerformed
        JFileChooser fcrestore = new JFileChooser();
        fcrestore.showOpenDialog(this);
        try {
            File f = fcrestore.getSelectedFile();
            path = f.getAbsolutePath();
            path = path.replace('\\', '/');
            restorelocationfield.setText(path);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_browsepathinrestoreActionPerformed

    private void newadminpasswordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newadminpasswordfieldActionPerformed
        if (newadminpasswordfield.getText().isEmpty()) {
            ImageIcon statusiconcurrentpassword = new ImageIcon(getClass().getResource("images/failed.png"));
            stateofcurrentpasswordadmin1.setIcon(statusiconcurrentpassword);
        } else {
            ImageIcon statusiconcurrentpassword = new ImageIcon(getClass().getResource("images/success.png"));
            stateofcurrentpasswordadmin1.setIcon(statusiconcurrentpassword);
            retypenewadminpasswordfield.setEnabled(true);
        }
    }//GEN-LAST:event_newadminpasswordfieldActionPerformed

    private void retypenewadminpasswordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retypenewadminpasswordfieldActionPerformed
        if (newadminpasswordfield.getText().toString().equals(retypenewadminpasswordfield.getText().toString())) {
            ImageIcon statusiconcurrentpassword = new ImageIcon(getClass().getResource("images/success.png"));
            stateofcurrentpasswordadmin1.setIcon(statusiconcurrentpassword);
            try {
                DB.DB.iud("update accounts  set password='" + retypenewadminpasswordfield.getText() + "' where accounttype='Admin'");
                DB.DB.iud("INSERT INTO `activitylog`(`user`, `activitytype`, `description`) VALUES ('Admin','Password Change','Admin Chnaged Password Success')");
                JOptionPane.showMessageDialog(this, "Admin Password Changed !");
                newadminpasswordfield.setEnabled(false);
                retypenewadminpasswordfield.setEnabled(false);
                admincurrentpasswordinsettings.setText(null);
                newadminpasswordfield.setText(null);
                retypenewadminpasswordfield.setText(null);
                admincurrentpasswordinsettings.setEditable(true);
                stateofcurrentpasswordadmin.setIcon(null);
                stateofcurrentpasswordadmin1.setIcon(null);
                stateofcurrentpasswordadmin2.setIcon(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Retype Incorrect !");
            ImageIcon statusiconcurrentpassword = new ImageIcon(getClass().getResource("images/failed.png"));
            stateofcurrentpasswordadmin2.setIcon(statusiconcurrentpassword);
            newadminpasswordfield.setText(null);
            retypenewadminpasswordfield.setText(null);
            admincurrentpasswordinsettings.setEditable(false);
        }


    }//GEN-LAST:event_retypenewadminpasswordfieldActionPerformed

    private void filteruserfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filteruserfieldActionPerformed

        try {

            ResultSet rs = DB.DB.search("SELECT * FROM  `activitylog` WHERE  `user` LIKE  '" + filteruserfield.getSelectedItem().toString() + "' AND `activitytype` LIKE  '" + activityfieldcombo.getSelectedItem().toString() + "' ORDER BY `activitylog`.`date/time` DESC");
            DefaultTableModel dtm = (DefaultTableModel) Activitylogtable.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_filteruserfieldActionPerformed

    private void activityfieldcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityfieldcomboActionPerformed

        try {

            ResultSet rs = DB.DB.search("SELECT * FROM  `activitylog` WHERE  `user` LIKE  '" + filteruserfield.getSelectedItem().toString() + "' AND `activitytype` LIKE  '" + activityfieldcombo.getSelectedItem().toString() + "' ORDER BY `activitylog`.`date/time` DESC");
            DefaultTableModel dtm = (DefaultTableModel) Activitylogtable.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_activityfieldcomboActionPerformed

    private void detailmodebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailmodebtnMouseEntered
        detailmodebtn.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_detailmodebtnMouseEntered

    private void detailmodebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailmodebtnMouseExited
        detailmodebtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_detailmodebtnMouseExited

    private void detailmodebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailmodebtnActionPerformed
        if (quciksearchviewstock.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Search or Select an item first !");
        } else {
            String quciksearch = quciksearchviewstock.getText();
            try {
                ResultSet rs = DB.DB.search("SELECT * FROM  `stock` WHERE  `Item Id` LIKE  '" + quciksearch + "' ");
                DefaultTableModel dtm = (DefaultTableModel) viewstocktable.getModel();
                dtm.setRowCount(0);
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString(2));
                    itemidfield1.setText(rs.getString(2));
                    v.add(rs.getString(3));
                    itemnamefield1.setText(rs.getString(3));
                    v.add(rs.getString(4));
                    stocknumberfield1.setText(rs.getString(4));
                    v.add(rs.getString(5));
                    itemdescriptionfield1.setText(rs.getString(5));
                    v.add(rs.getString(6));
                    stockpricefield1.setText(rs.getString(6));
                    v.add(rs.getString(7));
                    sellingpricefield1.setText(rs.getString(7));
                    v.add(rs.getString(8));
                    barcodefield1.setText(rs.getString(8));
                    v.add(rs.getString(9));
                    supplieridfield1.setText(rs.getString(9));
                    v.add(rs.getString(10));
                    brandfield1.setText(rs.getString(10));
                    v.add(rs.getString(11));
                    conditionfield1.setText(rs.getString(11));
                    v.add(rs.getString(12));
                    warrantyfield1.setText(rs.getString(12));
                    v.add(rs.getString(13));
                    quantityfield1.setText(rs.getString(13));
                    dtm.addRow(v);
                }
            } catch (Exception e) {
            }
            quciksearchviewstock.setEditable(false);
            tableview.setVisible(false);
            detailmode.setVisible(true);
            ok.setVisible(false);
            editdetailmodebtn.setVisible(true);
        }
    }//GEN-LAST:event_detailmodebtnActionPerformed

    private void itemidfield1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_itemidfield1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_itemidfield1FocusLost

    private void itemidfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemidfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemidfield1ActionPerformed

    private void itemnamefield1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_itemnamefield1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_itemnamefield1FocusLost

    private void itemnamefield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemnamefield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemnamefield1ActionPerformed

    private void itemdescriptionfield1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_itemdescriptionfield1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_itemdescriptionfield1FocusLost

    private void itemdescriptionfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemdescriptionfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemdescriptionfield1ActionPerformed

    private void stocknumberfield1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stocknumberfield1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_stocknumberfield1FocusLost

    private void stocknumberfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stocknumberfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stocknumberfield1ActionPerformed

    private void sellingpricefield1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sellingpricefield1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_sellingpricefield1FocusLost

    private void sellingpricefield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellingpricefield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellingpricefield1ActionPerformed

    private void stockpricefield1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stockpricefield1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_stockpricefield1FocusLost

    private void stockpricefield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockpricefield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockpricefield1ActionPerformed

    private void barcodefield1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_barcodefield1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_barcodefield1FocusLost

    private void barcodefield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcodefield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barcodefield1ActionPerformed

    private void supplieridfield1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_supplieridfield1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_supplieridfield1FocusLost

    private void supplieridfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplieridfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplieridfield1ActionPerformed

    private void brandfield1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_brandfield1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_brandfield1FocusLost

    private void brandfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandfield1ActionPerformed

    private void conditionfield1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_conditionfield1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_conditionfield1FocusLost

    private void conditionfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conditionfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conditionfield1ActionPerformed

    private void warrantyfield1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_warrantyfield1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_warrantyfield1FocusLost

    private void warrantyfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warrantyfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warrantyfield1ActionPerformed

    private void quantityfield1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityfield1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityfield1FocusLost

    private void quantityfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityfield1ActionPerformed

    private void editdetailmodebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editdetailmodebtnMouseEntered
        editdetailmodebtn.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_editdetailmodebtnMouseEntered

    private void editdetailmodebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editdetailmodebtnMouseExited
        editdetailmodebtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_editdetailmodebtnMouseExited

    private void editdetailmodebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editdetailmodebtnActionPerformed
        if (jComboBox1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Select Reason to Edit");
        } else if (jComboBox1.getSelectedIndex() == 1) {
            stockpricefield1.setEditable(true);
            ok.setVisible(true);
        } else if (jComboBox1.getSelectedIndex() == 2) {
            sellingpricefield1.setEditable(true);
            ok.setVisible(true);
        } else if (jComboBox1.getSelectedIndex() == 3) {
            itemdescriptionfield1.setEditable(true);
            ok.setVisible(true);
        } else if (jComboBox1.getSelectedIndex() == 4) {
            conditionfield1.setEditable(true);
            ok.setVisible(true);
        } else if (jComboBox1.getSelectedIndex() == 5) {
            barcodefield1.setEditable(true);
            ok.setVisible(true);
        } else if (jComboBox1.getSelectedIndex() == 6) {
            supplieridfield1.setEditable(true);
            ok.setVisible(true);
        } else if (jComboBox1.getSelectedIndex() == 7) {
            brandfield1.setEditable(true);
            ok.setVisible(true);
        } else if (jComboBox1.getSelectedIndex() == 8) {
            warrantyfield1.setEditable(true);
            ok.setVisible(true);
        }

    }//GEN-LAST:event_editdetailmodebtnActionPerformed

    private void deletethisidMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletethisidMouseEntered
        deletethisid.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_deletethisidMouseEntered

    private void deletethisidMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletethisidMouseExited
        deletethisid.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_deletethisidMouseExited

    private void deletethisidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletethisidActionPerformed
        int n = JOptionPane.showConfirmDialog(null, "Want to Delete this Item ?", "", JOptionPane.YES_NO_OPTION);
        if (n == 0) {
            String deletingid = quciksearchviewstock.getText();
            try {
                DB.DB.iud("delete from stock where `Item Id`='" + deletingid + "' ");
                String activityloghm = "INSERT INTO `activitylog`(`user`, `activitytype`, `description`) VALUES ('Admin','Stock Item Delete','Item " + deletingid + " deleted by Admin')";
                DB.DB.iud(activityloghm);

                JOptionPane.showMessageDialog(this, "Item Deleted !");
                itemidfield1.setText(null);
                itemnamefield1.setText(null);
                stocknumberfield1.setText(null);
                itemdescriptionfield1.setText(null);
                stockpricefield1.setText(null);
                sellingpricefield1.setText(null);
                barcodefield1.setText(null);
                supplieridfield1.setText(null);
                brandfield1.setText(null);
                conditionfield1.setText(null);
                warrantyfield1.setText(null);
                quantityfield1.setText(null);
                quciksearchviewstock.setText(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_deletethisidActionPerformed

    private void viewstocktableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewstocktableMouseClicked
        int row = viewstocktable.getSelectedRow();
        quciksearchviewstock.setText((String) viewstocktable.getValueAt(row, 0));
    }//GEN-LAST:event_viewstocktableMouseClicked

    private void viewstocktableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_viewstocktableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int row = viewstocktable.getSelectedRow();
            quciksearchviewstock.setText((String) viewstocktable.getValueAt(row, 0));
        }
    }//GEN-LAST:event_viewstocktableKeyPressed

    private void setavgstockbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setavgstockbtnMouseEntered
        setavgstockbtn.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_setavgstockbtnMouseEntered

    private void setavgstockbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setavgstockbtnMouseExited
        setavgstockbtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_setavgstockbtnMouseExited

    private void setavgstockbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setavgstockbtnActionPerformed
        try {
            DB.DB.iud("update avgstock  set avgstock='" + avgstockfield.getText() + "' where id='1'");
            DB.DB.iud("INSERT INTO `activitylog`(`user`, `activitytype`, `description`) VALUES ('Admin','Stock Amount Change','Admin Chnaged Stock Amount')");
            JOptionPane.showMessageDialog(this, "Average Stock Item Amount Changed !");
            avgstockfield.setText(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_setavgstockbtnActionPerformed

    private void okMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseEntered
        ok.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_okMouseEntered

    private void okMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseExited
        ok.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_okMouseExited

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed

        try {
            DB.DB.iud("UPDATE stock SET `Item Name`='" + itemnamefield1.getText() + "', `Stock Number`='" + stocknumberfield1.getText() + "', `Item Description`='" + itemdescriptionfield1.getText() + "', `Stock Price`='" + stockpricefield1.getText() + "', `Selling Price`='" + sellingpricefield1.getText() + "', `Barcode`='" + barcodefield1.getText() + "', `Supplier Id`='" + supplieridfield1.getText() + "', `Brand`='" + brandfield1.getText() + "', `Condition of Item`='" + conditionfield1.getText() + "', `Warranty`='" + warrantyfield1.getText() + "', `Quantity`='" + quantityfield1.getText() + "'  WHERE `Item Id`='" + itemidfield1.getText() + "'");
            String activityloghn = "INSERT INTO `activitylog`(`user`, `activitytype`, `description`) VALUES ('Admin','Stock Edit','" + jComboBox1.getSelectedItem().toString() + "d by Admin')";
            DB.DB.iud(activityloghn);
            JOptionPane.showMessageDialog(null, "Edit Success !");
        } catch (Exception e) {
            e.printStackTrace();
        }
        editdetailmodebtn.setVisible(true);
        ok.setVisible(false);
        itemnamefield1.setEditable(false);
        stocknumberfield1.setEditable(false);
        itemdescriptionfield1.setEditable(false);
        stockpricefield1.setEditable(false);
        sellingpricefield1.setEditable(false);
        barcodefield1.setEditable(false);
        supplieridfield1.setEditable(false);
        brandfield1.setEditable(false);
        conditionfield1.setEditable(false);
        warrantyfield1.setEditable(false);
        quantityfield1.setEditable(false);
    }//GEN-LAST:event_okActionPerformed

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

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        if (Home.getBackground().equals(new Color(73, 145, 255))) {
            mouseenteredclicked(Home);
        }
        if (Home.getBackground().equals(new Color(153, 204, 255))) {
            mouseenterednotclicked(Home);
        }
    }//GEN-LAST:event_HomeMouseEntered

    private void stockupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockupdateMouseClicked
        DefaultTableModel dtmupdatestk = (DefaultTableModel) stockupdatetable.getModel();
        dtmupdatestk.setRowCount(0);
        refreshstockupdatetable();
        jTextField2.setText(null);
        jTextField1.setText(null);
        jTextField3.setText(null);
        jTextField6.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        setcolor(stockupdate);
        resetcolor(PrintGRN);
        resetcolor(PrintStock);
        resetcolor(AddStock);
        resetcolor(ViewStock);
        resetcolor(grnrecordslbl);
        Viewstockpanel.setVisible(false);
        Addstockpanel.setVisible(false);
        grnrecordspanel.setVisible(false);
        stockupdatepanel.setVisible(true);
        printstockpanel.setVisible(false);
        printgrnpanel.setVisible(false);
    }//GEN-LAST:event_stockupdateMouseClicked

    private void printgrnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printgrnbtnActionPerformed

        try {
            String path = "C:\\JasperReports\\GRN.jrxml";
            JasperReport compileReport = JasperCompileManager.compileReport(path);
            HashMap hm = new HashMap();
            hm.put("grnno", grnnumberfield.getText());
            JasperPrint jp = JasperFillManager.fillReport(compileReport, hm, DB.DB.getConnection());
            grntabbed.add("Preview GRN", new JPanel().add(new JRViewer(jp)));
            grntabbed.setSelectedIndex(1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_printgrnbtnActionPerformed

    private void printgrnbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printgrnbtnMouseExited
        printgrnbtn.setBackground(new java.awt.Color(51, 153, 255));
    }//GEN-LAST:event_printgrnbtnMouseExited

    private void printgrnbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printgrnbtnMouseEntered
        printgrnbtn.setBackground(new java.awt.Color(101, 178, 255));
    }//GEN-LAST:event_printgrnbtnMouseEntered

    private void grnaddtotablebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grnaddtotablebtnMouseEntered
        grnaddtotablebtn.setBackground(new java.awt.Color(101, 178, 255));
    }//GEN-LAST:event_grnaddtotablebtnMouseEntered

    private void grnaddtotablebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grnaddtotablebtnMouseExited
        grnaddtotablebtn.setBackground(new java.awt.Color(51, 153, 255));
    }//GEN-LAST:event_grnaddtotablebtnMouseExited

    private void grnaddtotablebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grnaddtotablebtnActionPerformed
        if (productcodeingrn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Product Code !");
        } else if (Productnamegrn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Product Name !");
        } else if (productquantityingrn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Product Quantity !");
        } else if (productamountingrn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Product Amount !");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) grncountingtable.getModel();
            int productqty = Integer.parseInt(productquantityingrn.getText());
            double productamount = Double.parseDouble(productamountingrn.getText());
            int index = grncountingtable.getRowCount();

            index++;
            Vector v = new Vector();
            v.add(index);
            v.add(productcodeingrn.getText());
            v.add(Productnamegrn.getText());
            v.add(productqty);
            v.add(productamount);
            v.add(productqty * productamount);
            dtm.addRow(v);
            int count = grncountingtable.getRowCount();
            double total = 0.0;
            for (int i = 0; i < count; i++) {
                double amount = Double.parseDouble(grncountingtable.getValueAt(i, 5) + "");
//                     total = Double.parseDouble(grncountingtable.getValueAt(i, 5)+"");
                total += amount;
            }
            grntotal.setText(total + "");
        }
    }//GEN-LAST:event_grnaddtotablebtnActionPerformed

    private void productamountingrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productamountingrnActionPerformed
        if (productcodeingrn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Product Code !");
        } else if (Productnamegrn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Product Name !");
        } else if (productquantityingrn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Product Quantity !");
        } else if (productamountingrn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Product Amount !");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) grncountingtable.getModel();
            int productqty = Integer.parseInt(productquantityingrn.getText());
            double productamount = Double.parseDouble(productamountingrn.getText());
            int index = grncountingtable.getRowCount();

            index++;
            Vector v = new Vector();
            v.add(index);
            v.add(productcodeingrn.getText());
            v.add(Productnamegrn.getText());
            v.add(productqty);
            v.add(productamount);
            v.add(productqty * productamount);
            dtm.addRow(v);
            int count = grncountingtable.getRowCount();
            double total = 0.0;
            for (int i = 0; i < count; i++) {
                double amount = Double.parseDouble(grncountingtable.getValueAt(i, 5) + "");
//                     total = Double.parseDouble(grncountingtable.getValueAt(i, 5)+"");
                total += amount;
            }
            grntotal.setText(total + "");
        }
    }//GEN-LAST:event_productamountingrnActionPerformed

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

    private void setcurrencyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setcurrencyMouseEntered
        setcurrency.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_setcurrencyMouseEntered

    private void setcurrencyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setcurrencyMouseExited
        setcurrency.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_setcurrencyMouseExited

    private void setcurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setcurrencyActionPerformed
        try {
            DB.DB.iud("update currencyunit  set currencyunit='" + currencyfield.getText() + "' ");
            DB.DB.iud("INSERT INTO `activitylog`(`user`, `activitytype`, `description`) VALUES ('Admin','Currency Type Change','Admin Chnaged Currency Type')");
            JOptionPane.showMessageDialog(this, "Currency Type Changed Changed !");
            avgstockfield.setText(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_setcurrencyActionPerformed

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

    private void setcurrencyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setcurrencyMousePressed
        setcurrency.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_setcurrencyMousePressed

    private void setcurrencyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setcurrencyMouseReleased
        setcurrency.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_setcurrencyMouseReleased

    private void passwrdchangebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwrdchangebtnMousePressed
        passwrdchangebtn.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_passwrdchangebtnMousePressed

    private void passwrdchangebtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwrdchangebtnMouseReleased
        passwrdchangebtn.setBackground(new Color(51, 153, 255));

    }//GEN-LAST:event_passwrdchangebtnMouseReleased

    private void setavgstockbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setavgstockbtnMousePressed
        setavgstockbtn.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_setavgstockbtnMousePressed

    private void setavgstockbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setavgstockbtnMouseReleased
        setavgstockbtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_setavgstockbtnMouseReleased

    private void browsepathinbackupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browsepathinbackupMousePressed
        browsepathinbackup.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_browsepathinbackupMousePressed

    private void BackupbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackupbtnMousePressed
        Backupbtn.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_BackupbtnMousePressed

    private void browsepathinrestoreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browsepathinrestoreMousePressed
        browsepathinrestore.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_browsepathinrestoreMousePressed

    private void restorebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restorebtnMousePressed
        restorebtn.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_restorebtnMousePressed

    private void browsepathinbackupMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browsepathinbackupMouseReleased
        browsepathinbackup.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_browsepathinbackupMouseReleased

    private void BackupbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackupbtnMouseReleased
        Backupbtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_BackupbtnMouseReleased

    private void browsepathinrestoreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browsepathinrestoreMouseReleased
        browsepathinrestore.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_browsepathinrestoreMouseReleased

    private void restorebtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restorebtnMouseReleased
        restorebtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_restorebtnMouseReleased

    private void refreshinlogbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshinlogbtnMousePressed
        refreshinlogbtn.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_refreshinlogbtnMousePressed

    private void refreshinlogbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshinlogbtnMouseReleased
        refreshinlogbtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_refreshinlogbtnMouseReleased

    private void okbtngrnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okbtngrnMouseEntered
        okbtngrn.setBackground(new java.awt.Color(101, 178, 255));
    }//GEN-LAST:event_okbtngrnMouseEntered

    private void okbtngrnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okbtngrnMouseExited
        okbtngrn.setBackground(new java.awt.Color(51, 153, 255));
    }//GEN-LAST:event_okbtngrnMouseExited

    private void okbtngrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtngrnActionPerformed
        if (suppliergrnfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Supplier !");
        } else if (invoicenoingrn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Invoice Number !");
        } else if (billdateingrn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Invoice Date !");
        } else if (invoiceamountingrn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Invoice Amount !");
        } else {
            int grntablecount = grncountingtable.getRowCount();
            for (int i = 0; i < grntablecount; i++) {
                String ids = grncountingtable.getValueAt(i, 0).toString();
                String productcode = grncountingtable.getValueAt(i, 1).toString();
                String productname = grncountingtable.getValueAt(i, 2).toString();
                String quantitiesn = grncountingtable.getValueAt(i, 3).toString();
                String perprice = grncountingtable.getValueAt(i, 4).toString();
                String rowtotal = grncountingtable.getValueAt(i, 5).toString();

                String grnnumber = grnnumberfield.getText();
                String supp = suppliergrnfield.getText();
                String dategrn = dateingrn.getText();
                String invoicenogrn = invoicenoingrn.getText();
                String billdategrn = billdateingrn.getText();
                String invoiceamountgrn = invoiceamountingrn.getText();
                String fulltotalgrn = grntotal.getText().toString();
                try {
                    DB.DB.iud("INSERT INTO `grn records` (`grn number`, `supplier`, `date`, `invoiceno`, `invoice date`,`invoiceamount`,`listid`,`productcode`, `productname`, `quantity`, `perproduct amount`, `amountxquantity`,`generatedtotal`) VALUES ('" + grnnumber + "', '" + supp + "', '" + dategrn + "', '" + invoicenogrn + "', '" + billdategrn + "', '" + invoiceamountgrn + "', '" + ids + "', '" + productcode + "', '" + productname + "', '" + quantitiesn + "', '" + perprice + "', '" + rowtotal + "', '" + fulltotalgrn + "');");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            printgrnbtn.setEnabled(true);
    }//GEN-LAST:event_okbtngrnActionPerformed
    }
    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased

    }//GEN-LAST:event_jLabel2MouseReleased

    private void okbtngrnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okbtngrnMousePressed
        okbtngrn.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_okbtngrnMousePressed

    private void okbtngrnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okbtngrnMouseReleased
        okbtngrn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_okbtngrnMouseReleased

    private void grnaddtotablebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grnaddtotablebtnMousePressed
        grnaddtotablebtn.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_grnaddtotablebtnMousePressed

    private void grnaddtotablebtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grnaddtotablebtnMouseReleased
        grnaddtotablebtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_grnaddtotablebtnMouseReleased

    private void printgrnbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printgrnbtnMousePressed
        printgrnbtn.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_printgrnbtnMousePressed

    private void printgrnbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printgrnbtnMouseReleased
        printgrnbtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_printgrnbtnMouseReleased

    private void AddstockbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddstockbtnMousePressed
        Addstockbtn.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_AddstockbtnMousePressed

    private void AddstockbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddstockbtnMouseReleased
        Addstockbtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_AddstockbtnMouseReleased

    private void exportstocktablebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportstocktablebtnMousePressed
        exportstocktablebtn.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_exportstocktablebtnMousePressed

    private void exportstocktablebtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportstocktablebtnMouseReleased
        exportstocktablebtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_exportstocktablebtnMouseReleased

    private void refreshMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMousePressed
        refresh.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_refreshMousePressed

    private void refreshMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseReleased
        refresh.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_refreshMouseReleased

    private void detailmodebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailmodebtnMousePressed
        detailmodebtn.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_detailmodebtnMousePressed

    private void detailmodebtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailmodebtnMouseReleased
        detailmodebtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_detailmodebtnMouseReleased

    private void quciksearchviewstockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quciksearchviewstockKeyReleased
        try {
            ResultSet rs = DB.DB.search("SELECT * FROM  `stock` WHERE  `Item Id` LIKE  '" + quciksearchviewstock.getText() + "%' ");
            DefaultTableModel dtm = (DefaultTableModel) viewstocktable.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(13));
                v.add(rs.getString(7));
                dtm.addRow(v);
                viewstocktable.selectAll();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_quciksearchviewstockKeyReleased

    private void ViewStockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewStockMouseEntered
        if (ViewStock.getBackground().equals(new Color(73, 145, 255))) {
            mouseenteredclicked(ViewStock);
        }
        if (ViewStock.getBackground().equals(new Color(153, 204, 255))) {
            mouseenterednotclicked(ViewStock);
        }
    }//GEN-LAST:event_ViewStockMouseEntered

    private void grnrecordstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grnrecordstableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_grnrecordstableMouseClicked

    private void previewgrnrecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previewgrnrecordMouseEntered
        previewgrnrecord.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_previewgrnrecordMouseEntered

    private void previewgrnrecordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previewgrnrecordMouseExited
        previewgrnrecord.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_previewgrnrecordMouseExited

    private void previewgrnrecordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previewgrnrecordMousePressed
        previewgrnrecord.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_previewgrnrecordMousePressed

    private void previewgrnrecordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previewgrnrecordMouseReleased
        previewgrnrecord.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_previewgrnrecordMouseReleased

    private void previewgrnrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previewgrnrecordActionPerformed
        grnrecordstab.removeAll();
        try {
            String path = "C:\\JasperReports\\GRN.jrxml";
            JasperReport compileReport = JasperCompileManager.compileReport(path);
            HashMap hm = new HashMap();
            hm.put("grnno", grnrecordfield.getText());
            JasperPrint jp = JasperFillManager.fillReport(compileReport, hm, DB.DB.getConnection());
            grnrecordstab.add("Preview Invoice", new JPanel().add(new JRViewer(jp)));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_previewgrnrecordActionPerformed

    private void grnrecordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grnrecordfieldActionPerformed
        if (grnrecordfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Search Sell Record First !");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) grnrecordstable.getModel();
            dtm.setRowCount(0);
            refreshgrnrecords();
        }
    }//GEN-LAST:event_grnrecordfieldActionPerformed

    private void findbtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findbtn1MouseEntered
        findbtn1.setBackground(new Color(101, 178, 255));
    }//GEN-LAST:event_findbtn1MouseEntered

    private void findbtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findbtn1MouseExited
        findbtn1.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_findbtn1MouseExited

    private void findbtn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findbtn1MousePressed
        findbtn1.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_findbtn1MousePressed

    private void findbtn1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findbtn1MouseReleased
        findbtn1.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_findbtn1MouseReleased

    private void findbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findbtn1ActionPerformed
        if (grnrecordfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Search Sell Record First !");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) grnrecordstable.getModel();
            dtm.setRowCount(0);
            refreshgrnrecords();
        }
    }//GEN-LAST:event_findbtn1ActionPerformed

    private void grnrecordslblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grnrecordslblMouseClicked
        setcolor(grnrecordslbl);
        resetcolor(PrintGRN);
        resetcolor(PrintStock);
        resetcolor(AddStock);
        resetcolor(stockupdate);
        resetcolor(ViewStock);
        Viewstockpanel.setVisible(false);
        Addstockpanel.setVisible(false);
        grnrecordspanel.setVisible(true);
        stockupdatepanel.setVisible(false);
        printstockpanel.setVisible(false);
        printgrnpanel.setVisible(false);
    }//GEN-LAST:event_grnrecordslblMouseClicked

    private void ViewStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewStockMouseExited
        if (ViewStock.getBackground().equals(new Color(73, 145, 255))) {
            mouseexitedclicked(ViewStock);
        }
        if (ViewStock.getBackground().equals(new Color(183, 219, 255))) {
            mouseexitednotclicked(ViewStock);
        }
    }//GEN-LAST:event_ViewStockMouseExited

    private void AddStockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStockMouseEntered
        if (AddStock.getBackground().equals(new Color(73, 145, 255))) {
            mouseenteredclicked(AddStock);
        }
        if (AddStock.getBackground().equals(new Color(153, 204, 255))) {
            mouseenterednotclicked(AddStock);
        }
    }//GEN-LAST:event_AddStockMouseEntered

    private void AddStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStockMouseExited
        if (AddStock.getBackground().equals(new Color(73, 145, 255))) {
            mouseexitedclicked(AddStock);
        }
        if (AddStock.getBackground().equals(new Color(183, 219, 255))) {
            mouseexitednotclicked(AddStock);
        }
    }//GEN-LAST:event_AddStockMouseExited

    private void stockupdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockupdateMouseEntered
        if (stockupdate.getBackground().equals(new Color(73, 145, 255))) {
            mouseenteredclicked(stockupdate);
        }
        if (stockupdate.getBackground().equals(new Color(153, 204, 255))) {
            mouseenterednotclicked(stockupdate);
        }
    }//GEN-LAST:event_stockupdateMouseEntered

    private void stockupdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockupdateMouseExited
        if (stockupdate.getBackground().equals(new Color(73, 145, 255))) {
            mouseexitedclicked(stockupdate);
        }
        if (stockupdate.getBackground().equals(new Color(183, 219, 255))) {
            mouseexitednotclicked(stockupdate);
        }
    }//GEN-LAST:event_stockupdateMouseExited

    private void PrintStockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintStockMouseEntered
        if (PrintStock.getBackground().equals(new Color(73, 145, 255))) {
            mouseenteredclicked(PrintStock);
        }
        if (PrintStock.getBackground().equals(new Color(153, 204, 255))) {
            mouseenterednotclicked(PrintStock);
        }

    }//GEN-LAST:event_PrintStockMouseEntered

    private void PrintStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintStockMouseExited
        if (PrintStock.getBackground().equals(new Color(73, 145, 255))) {
            mouseexitedclicked(PrintStock);
        }
        if (PrintStock.getBackground().equals(new Color(183, 219, 255))) {
            mouseexitednotclicked(PrintStock);
        }
    }//GEN-LAST:event_PrintStockMouseExited

    private void PrintGRNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintGRNMouseEntered
        if (PrintGRN.getBackground().equals(new Color(73, 145, 255))) {
            mouseenteredclicked(PrintGRN);
        }
        if (PrintGRN.getBackground().equals(new Color(153, 204, 255))) {
            mouseenterednotclicked(PrintGRN);
        }
    }//GEN-LAST:event_PrintGRNMouseEntered

    private void PrintGRNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintGRNMouseExited
        if (PrintGRN.getBackground().equals(new Color(73, 145, 255))) {
            mouseexitedclicked(PrintGRN);
        }
        if (PrintGRN.getBackground().equals(new Color(183, 219, 255))) {
            mouseexitednotclicked(PrintGRN);
        }
    }//GEN-LAST:event_PrintGRNMouseExited

    private void grnrecordslblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grnrecordslblMouseEntered
        if (grnrecordslbl.getBackground().equals(new Color(73, 145, 255))) {
            mouseenteredclicked(grnrecordslbl);
        }
        if (grnrecordslbl.getBackground().equals(new Color(153, 204, 255))) {
            mouseenterednotclicked(grnrecordslbl);
        }
    }//GEN-LAST:event_grnrecordslblMouseEntered

    private void grnrecordslblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grnrecordslblMouseExited
        if (grnrecordslbl.getBackground().equals(new Color(73, 145, 255))) {
            mouseexitedclicked(grnrecordslbl);
        }
        if (grnrecordslbl.getBackground().equals(new Color(183, 219, 255))) {
            mouseexitednotclicked(grnrecordslbl);
        }
    }//GEN-LAST:event_grnrecordslblMouseExited

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

    private void ActivityloglblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActivityloglblMouseEntered
        if (Activityloglbl.getBackground().equals(new Color(73, 145, 255))) {
            mouseenteredclicked(Activityloglbl);
        }
        if (Activityloglbl.getBackground().equals(new Color(153, 204, 255))) {
            mouseenterednotclicked(Activityloglbl);
        }
    }//GEN-LAST:event_ActivityloglblMouseEntered

    private void ActivityloglblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActivityloglblMouseExited
        if (Activityloglbl.getBackground().equals(new Color(73, 145, 255))) {
            mouseexitedclicked(Activityloglbl);
        }
        if (Activityloglbl.getBackground().equals(new Color(183, 219, 255))) {
            mouseexitednotclicked(Activityloglbl);
        }
    }//GEN-LAST:event_ActivityloglblMouseExited

    private void printloglblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printloglblMouseEntered
        if (printloglbl.getBackground().equals(new Color(73, 145, 255))) {
            mouseenteredclicked(printloglbl);
        }
        if (printloglbl.getBackground().equals(new Color(153, 204, 255))) {
            mouseenterednotclicked(printloglbl);
        }
    }//GEN-LAST:event_printloglblMouseEntered

    private void printloglblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printloglblMouseExited
        if (printloglbl.getBackground().equals(new Color(73, 145, 255))) {
            mouseexitedclicked(printloglbl);
        }
        if (printloglbl.getBackground().equals(new Color(183, 219, 255))) {
            mouseexitednotclicked(printloglbl);
        }
    }//GEN-LAST:event_printloglblMouseExited

    private void generallblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generallblMouseEntered
        if (generallbl.getBackground().equals(new Color(73, 145, 255))) {
            mouseenteredclicked(generallbl);
        }
        if (generallbl.getBackground().equals(new Color(153, 204, 255))) {
            mouseenterednotclicked(generallbl);
        }
    }//GEN-LAST:event_generallblMouseEntered

    private void generallblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generallblMouseExited
        if (generallbl.getBackground().equals(new Color(73, 145, 255))) {
            mouseexitedclicked(generallbl);
        }
        if (generallbl.getBackground().equals(new Color(183, 219, 255))) {
            mouseexitednotclicked(generallbl);
        }
    }//GEN-LAST:event_generallblMouseExited

    private void backuprestorelblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backuprestorelblMouseEntered
        if (backuprestorelbl.getBackground().equals(new Color(73, 145, 255))) {
            mouseenteredclicked(backuprestorelbl);
        }
        if (backuprestorelbl.getBackground().equals(new Color(153, 204, 255))) {
            mouseenterednotclicked(backuprestorelbl);
        }
    }//GEN-LAST:event_backuprestorelblMouseEntered

    private void backuprestorelblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backuprestorelblMouseExited
        if (backuprestorelbl.getBackground().equals(new Color(73, 145, 255))) {
            mouseexitedclicked(backuprestorelbl);
        }
        if (backuprestorelbl.getBackground().equals(new Color(183, 219, 255))) {
            mouseexitednotclicked(backuprestorelbl);
        }
    }//GEN-LAST:event_backuprestorelblMouseExited

    private void aboutlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutlblMouseEntered
        if (aboutlbl.getBackground().equals(new Color(73, 145, 255))) {
            mouseenteredclicked(aboutlbl);
        }
        if (aboutlbl.getBackground().equals(new Color(153, 204, 255))) {
            mouseenterednotclicked(aboutlbl);
        }
    }//GEN-LAST:event_aboutlblMouseEntered

    private void aboutlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutlblMouseExited
        if (aboutlbl.getBackground().equals(new Color(73, 145, 255))) {
            mouseexitedclicked(aboutlbl);
        }
        if (aboutlbl.getBackground().equals(new Color(183, 219, 255))) {
            mouseexitednotclicked(aboutlbl);
        }
    }//GEN-LAST:event_aboutlblMouseExited

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        if (Home.getBackground().equals(new Color(73, 145, 255))) {
            mouseexitedclicked(Home);
        }
        if (Home.getBackground().equals(new Color(183, 219, 255))) {
            mouseexitednotclicked(Home);
        }
    }//GEN-LAST:event_HomeMouseExited

    private void StockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StockMouseEntered
        if (Stock.getBackground().equals(new Color(73, 145, 255))) {
            mouseenteredclicked(Stock);
        }
        if (Stock.getBackground().equals(new Color(153, 204, 255))) {
            mouseenterednotclicked(Stock);
        }
    }//GEN-LAST:event_StockMouseEntered

    private void StockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StockMouseExited
        if (Stock.getBackground().equals(new Color(73, 145, 255))) {
            mouseexitedclicked(Stock);
        }
        if (Stock.getBackground().equals(new Color(183, 219, 255))) {
            mouseexitednotclicked(Stock);
        }
    }//GEN-LAST:event_StockMouseExited

    private void SalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalesMouseEntered

        if (Sales.getBackground().equals(new Color(73, 145, 255))) {
            mouseenteredclicked(Sales);
        }
        if (Sales.getBackground().equals(new Color(153, 204, 255))) {
            mouseenterednotclicked(Sales);
        }
    }//GEN-LAST:event_SalesMouseEntered

    private void SalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalesMouseExited
        if (Sales.getBackground().equals(new Color(73, 145, 255))) {
            mouseexitedclicked(Sales);
        }
        if (Sales.getBackground().equals(new Color(183, 219, 255))) {
            mouseexitednotclicked(Sales);
        }
    }//GEN-LAST:event_SalesMouseExited

    private void Activity_logMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Activity_logMouseEntered
        if (Activity_log.getBackground().equals(new Color(73, 145, 255))) {
            mouseenteredclicked(Activity_log);
        }
        if (Activity_log.getBackground().equals(new Color(153, 204, 255))) {
            mouseenterednotclicked(Activity_log);
        }
    }//GEN-LAST:event_Activity_logMouseEntered

    private void Activity_logMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Activity_logMouseExited
        if (Activity_log.getBackground().equals(new Color(73, 145, 255))) {
            mouseexitedclicked(Activity_log);
        }
        if (Activity_log.getBackground().equals(new Color(183, 219, 255))) {
            mouseexitednotclicked(Activity_log);
        }
    }//GEN-LAST:event_Activity_logMouseExited

    private void SettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseEntered
        if (Settings.getBackground().equals(new Color(73, 145, 255))) {
            mouseenteredclicked(Settings);
        }
        if (Settings.getBackground().equals(new Color(153, 204, 255))) {
            mouseenterednotclicked(Settings);
        }
    }//GEN-LAST:event_SettingsMouseEntered

    private void SettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseExited
        if (Settings.getBackground().equals(new Color(73, 145, 255))) {
            mouseexitedclicked(Settings);
        }
        if (Settings.getBackground().equals(new Color(183, 219, 255))) {
            mouseexitednotclicked(Settings);
        }
    }//GEN-LAST:event_SettingsMouseExited

    private void okMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMousePressed
        ok.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_okMousePressed

    private void editdetailmodebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editdetailmodebtnMousePressed
        editdetailmodebtn.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_editdetailmodebtnMousePressed

    private void editdetailmodebtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editdetailmodebtnMouseReleased
        editdetailmodebtn.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_editdetailmodebtnMouseReleased

    private void deletethisidMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletethisidMousePressed
        deletethisid.setBackground(new Color(0, 96, 244));
    }//GEN-LAST:event_deletethisidMousePressed

    private void okMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseReleased
        ok.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_okMouseReleased

    private void deletethisidMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletethisidMouseReleased
        deletethisid.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_deletethisidMouseReleased

    private void updatestockqbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatestockqbtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_updatestockqbtnMouseEntered

    private void updatestockqbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatestockqbtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_updatestockqbtnMouseExited

    private void updatestockqbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatestockqbtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatestockqbtnMousePressed

    private void updatestockqbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatestockqbtnMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_updatestockqbtnMouseReleased

    private void updatestockqbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatestockqbtnActionPerformed
        if (jComboBox2.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Select Reason to Update !");
        } else if (jComboBox2.getSelectedIndex() == 1) {
            if (jTextField2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Select Item !");
            } else if (jTextField2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Select Quantity !");

            } else {
                try {
                    DB.DB.iud("UPDATE stock SET  `Quantity`='" + jTextField1.getText() + "'  WHERE `Item Id`='" + jTextField2.getText() + "'");
                    String activityloghn = "INSERT INTO `activitylog`(`user`, `activitytype`, `description`) VALUES ('Admin','Stock Update','" + jTextField2.getText().toString() + "Updated Stock by Admin')";
                    DB.DB.iud(activityloghn);
                    JOptionPane.showMessageDialog(null, "Update Success !");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_updatestockqbtnActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void updatestockqbtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatestockqbtn1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_updatestockqbtn1MouseEntered

    private void updatestockqbtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatestockqbtn1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_updatestockqbtn1MouseExited

    private void updatestockqbtn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatestockqbtn1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatestockqbtn1MousePressed

    private void updatestockqbtn1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatestockqbtn1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_updatestockqbtn1MouseReleased

    private void updatestockqbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatestockqbtn1ActionPerformed
        if (jTextField3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Return Quantity !");
        } else {
            try {
                int quantityreturn = parseInt(jTextField5.getText().toString());
                int quantityinstock = 0;
                int finalquantity = 0;
                ResultSet rs = DB.DB.search("select `Quantity` from `stock` WHERE `Item Id`='" + jTextField6.getText() + "' ");
                while (rs.next()) {
                    quantityinstock = rs.getInt(1);
                }
                finalquantity = quantityreturn + quantityinstock;
                int quaininvoice = parseInt(jTextField4.getText().toString());
                int invoicereturn = parseInt(jTextField5.getText().toString());
                int finalquatoinvoice = quaininvoice - invoicereturn;
                String ids = jTextField6.getText();
                String ItemIdsandQuantities = ids + "  x  " + finalquatoinvoice;
                DB.DB.iud("UPDATE stock SET  `Quantity`='" + finalquantity + "'  WHERE `Item Id`='" + ids + "'");
                DB.DB.iud("UPDATE `sales records` SET  `quantity`='" + finalquatoinvoice + "', `Item Ids and Quantities`='" + ItemIdsandQuantities + "'  WHERE `itemid`='" + ids + "'");
                String activityloghn = "INSERT INTO `activitylog`(`user`, `activitytype`, `description`) VALUES ('Admin','Customer Return','" + ids + " Item(s) Returned to Stock by Admin')";
                DB.DB.iud(activityloghn);
                JOptionPane.showMessageDialog(null, "Item Returned to Stock Successfully !");
            } catch (Exception e) {
                e.printStackTrace();
            }
            DefaultTableModel dtmupdatestk = (DefaultTableModel) stockupdatetable.getModel();
            dtmupdatestk.setRowCount(0);
            refreshstockupdatetable();
            jTextField3.setText(null);
            jTextField6.setText(null);
            jTextField4.setText(null);
            jTextField5.setText(null);
        }
    }//GEN-LAST:event_updatestockqbtn1ActionPerformed

    private void searchbillbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbillbtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbillbtnMouseEntered

    private void searchbillbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbillbtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbillbtnMouseExited

    private void searchbillbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbillbtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbillbtnMousePressed

    private void searchbillbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbillbtnMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbillbtnMouseReleased

    private void searchbillbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbillbtnActionPerformed
        if (jTextField3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill Inovoice Number !");
        } else if (jTextField6.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill Item Id !");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) stockupdatetable.getModel();
            dtm.setRowCount(0);
            searchbills();
        }
    }//GEN-LAST:event_searchbillbtnActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        if (jComboBox2.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Select Reason to Update");
            jTextField3.setEnabled(false);
            jTextField4.setEnabled(false);
            jTextField5.setEnabled(false);
            searchbillbtn.setEnabled(false);
            jTextField6.setEnabled(false);
            updatestockqbtn1.setEnabled(false);

        } else if (jComboBox2.getSelectedIndex() == 1) {
            jTextField2.setEnabled(true);
            jTextField1.setEnabled(true);
            updatestockqbtn.setEnabled(true);
            jTextField3.setEnabled(false);
            jTextField4.setEnabled(false);
            jTextField5.setEnabled(false);
            searchbillbtn.setEnabled(false);
            updatestockqbtn1.setEnabled(false);
            DefaultTableModel dtmupdatestk = (DefaultTableModel) stockupdatetable.getModel();
            dtmupdatestk.setRowCount(0);
            refreshstockupdatetable();
        } else if (jComboBox2.getSelectedIndex() == 2) {
            jTextField3.setEnabled(true);
            jTextField4.setEnabled(true);
            jTextField5.setEnabled(true);
            searchbillbtn.setEnabled(true);
            jTextField6.setEnabled(true);
            updatestockqbtn1.setEnabled(true);
            jTextField2.setEnabled(false);
            jTextField1.setEnabled(false);
            updatestockqbtn.setEnabled(false);
            DefaultTableModel dtmupdatestk = (DefaultTableModel) stockupdatetable.getModel();
            dtmupdatestk.setRowCount(0);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void stockupdatetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockupdatetableMouseClicked
        if (jComboBox2.getSelectedIndex() == 1) {
            jTextField2.setText((String) stockupdatetable.getValueAt(stockupdatetable.getSelectedRow(), 0));
        } else if (jComboBox2.getSelectedIndex() == 2) {
            jTextField6.setText((String) stockupdatetable.getValueAt(stockupdatetable.getSelectedRow(), 0));
        }
    }//GEN-LAST:event_stockupdatetableMouseClicked

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        try {
            ResultSet rs = DB.DB.search("select * from `sales records` where `Bill number` = '" + jTextField3.getText() + "'");
            DefaultTableModel dtmupdatestk = (DefaultTableModel) stockupdatetable.getModel();
            dtmupdatestk.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(15));
                v.add(rs.getString(8));
                v.add(rs.getString(14));
                dtmupdatestk.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jTextField3KeyReleased

    private void suppliergrnfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliergrnfieldActionPerformed
        invoicenoingrn.grabFocus();
    }//GEN-LAST:event_suppliergrnfieldActionPerformed

    private void invoicenoingrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoicenoingrnActionPerformed
        billdateingrn.grabFocus();
    }//GEN-LAST:event_invoicenoingrnActionPerformed

    private void billdateingrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billdateingrnActionPerformed
        invoiceamountingrn.grabFocus();
    }//GEN-LAST:event_billdateingrnActionPerformed

    private void invoiceamountingrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceamountingrnActionPerformed
        productcodeingrn.grabFocus();
    }//GEN-LAST:event_invoiceamountingrnActionPerformed

    private void productcodeingrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productcodeingrnActionPerformed
        Productnamegrn.grabFocus();
    }//GEN-LAST:event_productcodeingrnActionPerformed

    private void productquantityingrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productquantityingrnActionPerformed
        productamountingrn.grabFocus();
    }//GEN-LAST:event_productquantityingrnActionPerformed

    private void ProductnamegrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductnamegrnActionPerformed
        productquantityingrn.grabFocus();
    }//GEN-LAST:event_ProductnamegrnActionPerformed

    private void stockpricefieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockpricefieldKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_ENTER))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_stockpricefieldKeyTyped

    private void sellingpricefieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellingpricefieldKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_ENTER))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_sellingpricefieldKeyTyped

    private void quantityfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityfieldKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_ENTER))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_quantityfieldKeyTyped

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

    private void accountslblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountslblMouseClicked

        setcolor(accountslbl);
        resetcolor(generallbl);
        resetcolor(aboutlbl);
        resetcolor(backuprestorelbl);
        generalpanel.setVisible(false);
        backuprestorepanel.setVisible(false);
        about.setVisible(false);
        accountspnl.setVisible(true);
        try {

            ResultSet rs = DB.DB.search("SELECT * FROM  `accounts` ");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_accountslblMouseClicked

    private void accountslblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountslblMouseEntered
        if (accountslbl.getBackground().equals(new Color(73, 145, 255))) {
            mouseexitedclicked(accountslbl);
        }
        if (accountslbl.getBackground().equals(new Color(183, 219, 255))) {
            mouseexitednotclicked(accountslbl);
        }
    }//GEN-LAST:event_accountslblMouseEntered

    private void accountslblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountslblMouseExited
        if (accountslbl.getBackground().equals(new Color(73, 145, 255))) {
            mouseexitedclicked(accountslbl);
        }
        if (accountslbl.getBackground().equals(new Color(183, 219, 255))) {
            mouseexitednotclicked(accountslbl);
        }
    }//GEN-LAST:event_accountslblMouseExited

    private void addbtninaccountsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtninaccountsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addbtninaccountsMouseEntered

    private void addbtninaccountsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtninaccountsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addbtninaccountsMouseExited

    private void addbtninaccountsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtninaccountsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_addbtninaccountsMousePressed

    private void addbtninaccountsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtninaccountsMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_addbtninaccountsMouseReleased

    private void addbtninaccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtninaccountsActionPerformed
        if (usernamefieldinaccounts.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill Username Field !");
        } else if (passwordfieldinaccounts.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill Password Field !");
        } else {

            try {
                Boolean found = false;
                ResultSet rs = DB.DB.search("select `username` from `accounts` where `username` = '" + usernamefieldinaccounts.getText() + "'");
                found = rs.next();
                if (found) {
                    if (usernamefieldinaccounts.getText().equalsIgnoreCase(rs.getString(1))) {
                        JOptionPane.showMessageDialog(this, "Username Already Exist !");
                    }
                } else {
                    DB.DB.iud("INSERT INTO `accounts`(`username`, `password`, `accounttype`, `status`) VALUES('" + usernamefieldinaccounts.getText() + "','" + passwordfieldinaccounts.getText() + "','Member','0')");
                    JOptionPane.showMessageDialog(this, "User " + usernamefieldinaccounts.getText() + " added !");

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            try {

                ResultSet rs = DB.DB.search("SELECT * FROM  `accounts` ");
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString(1));
                    v.add(rs.getString(2));
                    v.add(rs.getString(3));
                    v.add(rs.getString(4));
                    dtm.addRow(v);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_addbtninaccountsActionPerformed

    private void updatebtninaccountsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtninaccountsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_updatebtninaccountsMouseEntered

    private void updatebtninaccountsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtninaccountsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_updatebtninaccountsMouseExited

    private void updatebtninaccountsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtninaccountsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatebtninaccountsMousePressed

    private void updatebtninaccountsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtninaccountsMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_updatebtninaccountsMouseReleased

    private void updatebtninaccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtninaccountsActionPerformed
        usernamefieldinaccounts.setEditable(false);
        passwordfieldinaccounts.setEditable(false);
        if (usernamefieldinaccounts.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill Username Field !");
        } else if (passwordfieldinaccounts.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill Password Field !");
        } else {

            try {
                DB.DB.iud("UPDATE `accounts` SET `username`='" + usernamefieldinaccounts.getText() + "' ,`password`='" + passwordfieldinaccounts.getText() + "' where `id` ='" + (jTable1.getValueAt(jTable1.getSelectedRow(), 0)).toString() + "' ");
                JOptionPane.showMessageDialog(this, "User Info Updated !");
                usernamefieldinaccounts.setEditable(true);
                passwordfieldinaccounts.setEditable(true);
                usernamefieldinaccounts.setText(null);
                passwordfieldinaccounts.setText(null);
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Username Already Exist !");
            }

        }
        try {

            ResultSet rs = DB.DB.search("SELECT * FROM  `accounts` ");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_updatebtninaccountsActionPerformed

    private void deletebtninaccountsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtninaccountsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebtninaccountsMouseEntered

    private void deletebtninaccountsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtninaccountsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebtninaccountsMouseExited

    private void deletebtninaccountsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtninaccountsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebtninaccountsMousePressed

    private void deletebtninaccountsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtninaccountsMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebtninaccountsMouseReleased

    private void deletebtninaccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtninaccountsActionPerformed
        usernamefieldinaccounts.setEditable(false);
        passwordfieldinaccounts.setEditable(false);
        if (usernamefieldinaccounts.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill Username Field !");
        } else {
            int n = JOptionPane.showConfirmDialog(null, "Want to Delete this User ?", "", JOptionPane.YES_NO_OPTION);
            if (n == 0) {
                try {
                    DB.DB.iud("DELETE FROM `accounts` WHERE `accounts`. `username` ='" + usernamefieldinaccounts.getText() + "' ");
                    JOptionPane.showMessageDialog(this, "User Deleted !");
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    dtm.setRowCount(0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            try {

                ResultSet rs = DB.DB.search("SELECT * FROM  `accounts` ");
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString(1));
                    v.add(rs.getString(2));
                    v.add(rs.getString(3));
                    v.add(rs.getString(4));
                    dtm.addRow(v);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_deletebtninaccountsActionPerformed

    private void searchbtninaccountsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbtninaccountsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbtninaccountsMouseEntered

    private void searchbtninaccountsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbtninaccountsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbtninaccountsMouseExited

    private void searchbtninaccountsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbtninaccountsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbtninaccountsMousePressed

    private void searchbtninaccountsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbtninaccountsMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbtninaccountsMouseReleased

    private void searchbtninaccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtninaccountsActionPerformed
        try {
            ResultSet rs = DB.DB.search("SELECT * FROM  `accounts` WHERE  `id` LIKE  '" + Searchfieldinaccounts.getText() + "%' OR `username` LIKE  '" + Searchfieldinaccounts.getText() + "%' ");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                usernamefieldinaccounts.setText(rs.getString(2));
                v.add(rs.getString(3));
                passwordfieldinaccounts.setText(rs.getString(3));
                v.add(rs.getString(4));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchbtninaccountsActionPerformed

    private void refreshbtninaccountsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshbtninaccountsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshbtninaccountsMouseEntered

    private void refreshbtninaccountsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshbtninaccountsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshbtninaccountsMouseExited

    private void refreshbtninaccountsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshbtninaccountsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshbtninaccountsMousePressed

    private void refreshbtninaccountsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshbtninaccountsMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshbtninaccountsMouseReleased

    private void refreshbtninaccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbtninaccountsActionPerformed
        Searchfieldinaccounts.setText(null);
        usernamefieldinaccounts.setText(null);
        passwordfieldinaccounts.setText(null);
        try {

            ResultSet rs = DB.DB.search("SELECT * FROM  `accounts` ");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_refreshbtninaccountsActionPerformed

    private void SearchfieldinaccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchfieldinaccountsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchfieldinaccountsActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        usernamefieldinaccounts.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(), 1));
        passwordfieldinaccounts.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(), 2));
        if (jTable1.getSelectedRowCount() == 1) {
            usernamefieldinaccounts.setEditable(true);
            passwordfieldinaccounts.setEditable(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

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

    private void searchbtninaccounts1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbtninaccounts1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbtninaccounts1MouseEntered

    private void searchbtninaccounts1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbtninaccounts1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbtninaccounts1MouseExited

    private void searchbtninaccounts1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbtninaccounts1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbtninaccounts1MousePressed

    private void searchbtninaccounts1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbtninaccounts1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbtninaccounts1MouseReleased

    private void searchbtninaccounts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtninaccounts1ActionPerformed
        usernamefieldinaccounts.setEditable(false);
        passwordfieldinaccounts.setEditable(false);
        if (usernamefieldinaccounts.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill Username Field !");
        } else if (passwordfieldinaccounts.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill Password Field !");
        } else {

            try {
                DB.DB.iud("UPDATE `accounts` SET `status`='0' where `id` ='" + (jTable1.getValueAt(jTable1.getSelectedRow(), 0)).toString() + "' ");
                JOptionPane.showMessageDialog(this, "User Forced Logged Out");
                usernamefieldinaccounts.setEditable(true);
                passwordfieldinaccounts.setEditable(true);
                usernamefieldinaccounts.setText(null);
                passwordfieldinaccounts.setText(null);
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
            } catch (Exception e) {

            }

        }
    }//GEN-LAST:event_searchbtninaccounts1ActionPerformed

    private void suppliergrnfield4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliergrnfield4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suppliergrnfield4ActionPerformed

    private void invoicenoingrn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoicenoingrn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invoicenoingrn1ActionPerformed

    private void itemstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemstableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_itemstableMouseClicked

    private void itemaddbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemaddbtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_itemaddbtnMouseEntered

    private void itemaddbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemaddbtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_itemaddbtnMouseExited

    private void itemaddbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemaddbtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemaddbtnMousePressed

    private void itemaddbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemaddbtnMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_itemaddbtnMouseReleased

    private void itemaddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemaddbtnActionPerformed
        try {
            DB.DB.iud("INSERT INTO `item` (Itemid, `Itemname`, `description`, `barcode`,`itemcondition`,`brand`,`warranty`) VALUES ('" + productcodeingrn1.getText() + "', '" + suppliergrnfield4.getText() + "', '" + invoicenoingrn1.getText() + "', '" + dateingrn1.getText() + "', '" + conditionfield2.getText() + "', '" + brandfield2.getText() + "', '" + warrantyfield2.getText() + "');");
            productcodeingrn.setText(null);
            suppliergrnfield4.setText(null);
            dateingrn1.setText(null);
            invoicenoingrn1.setText(null);
            generatenewitemid();
            DefaultTableModel dtm = (DefaultTableModel) itemstable.getModel();
            dtm.setRowCount(0);
            refreshitemstable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_itemaddbtnActionPerformed

    private void refreshitemstable() {
        try {

            ResultSet rs = DB.DB.search("SELECT * FROM `item` ");
            DefaultTableModel dtm = (DefaultTableModel) itemstable.getModel();
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void generatenewitemid() {
        try {

            ResultSet rs = DB.DB.search("select count(DISTINCT  itemid) as x from `item` ");
            if (rs.next()) {

                int rowcount = Integer.parseInt(rs.getString("x"));
                rowcount++;
                productcodeingrn1.setText("" + rowcount);
                dateingrn1.setText("" + rowcount);
                dateingrn2.setText("" + rowcount);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void productcodeingrn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productcodeingrn1ActionPerformed

    }//GEN-LAST:event_productcodeingrn1ActionPerformed

    private void billdateingrn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billdateingrn1ActionPerformed
        invoiceamountingrn.grabFocus();
    }//GEN-LAST:event_billdateingrn1ActionPerformed

    private void invoicenoingrn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoicenoingrn2ActionPerformed
        billdateingrn.grabFocus();
    }//GEN-LAST:event_invoicenoingrn2ActionPerformed

    private void invoiceamountingrn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceamountingrn2ActionPerformed
        productcodeingrn.grabFocus();
    }//GEN-LAST:event_invoiceamountingrn2ActionPerformed

    private void grnaddtotablebtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grnaddtotablebtn1MouseEntered
        grnaddtotablebtn.setBackground(new java.awt.Color(229, 229, 229));
    }//GEN-LAST:event_grnaddtotablebtn1MouseEntered

    private void grnaddtotablebtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grnaddtotablebtn1MouseExited
        grnaddtotablebtn.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_grnaddtotablebtn1MouseExited

    private void grnaddtotablebtn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grnaddtotablebtn1MousePressed
        grnaddtotablebtn.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_grnaddtotablebtn1MousePressed

    private void grnaddtotablebtn1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grnaddtotablebtn1MouseReleased
        grnaddtotablebtn.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_grnaddtotablebtn1MouseReleased

    private void grnaddtotablebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grnaddtotablebtn1ActionPerformed
        try {
            if (productquantityingrn.getText().isEmpty()) {
            } else {
                DefaultTableModel dtm = (DefaultTableModel) grncountingtable1.getModel();
                int index = grncountingtable1.getRowCount();
                String productname = null;
                String itmescription = null;
                double productamount = 0.0;
                double sellingprice = 0.0;
                int productqty = Integer.parseInt(productquantityingrn.getText());
                ResultSet rs = DB.DB.search("select Itemname,itemdescription from item where itemid='" + itemidss.getSelectedItem().toString() + "'");
                if (rs.next()) {
                    productname = rs.getString(1);
                    itmescription = rs.getString(2);
                    productamount = Double.parseDouble(billdateingrn2.getText());
                    sellingprice = Double.parseDouble(invoiceamountingrn3.getText());
                }
                index++;
                Vector v = new Vector();
                v.add(index);
                v.add(itemidss.getSelectedItem().toString());
                v.add(productname);
                v.add(itmescription);
                v.add(productqty);
                v.add(productamount);
                v.add(sellingprice);
                v.add(productqty * productamount);
                v.add(itemidss.getSelectedItem().toString());
                dtm.addRow(v);
                Object removeindex = itemidss.getSelectedItem();
                itemidss.removeItem(removeindex);
                int count = grncountingtable1.getRowCount();
                double total = 0.0;
                for (int i = 0; i < count; i++) {
                    double amount = Double.parseDouble(grncountingtable1.getValueAt(i, 5) + "");
                    total += amount;
                }
                grntotal.setText(total + "");
                grntotal5.setText(total + "");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_grnaddtotablebtn1ActionPerformed

    private void okbtngrn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okbtngrn1MouseEntered
        okbtngrn.setBackground(new java.awt.Color(229, 229, 229));
    }//GEN-LAST:event_okbtngrn1MouseEntered

    private void okbtngrn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okbtngrn1MouseExited
        okbtngrn.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_okbtngrn1MouseExited

    private void okbtngrn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okbtngrn1MousePressed
        okbtngrn.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_okbtngrn1MousePressed

    private void okbtngrn1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okbtngrn1MouseReleased
        okbtngrn.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_okbtngrn1MouseReleased

    private void okbtngrn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtngrn1ActionPerformed
        if (suppliergrnfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Supplier !");
        } else if (invoicenoingrn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Invoice Number !");
        } else if (billdateingrn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Invoice Date !");
        } else if (invoiceamountingrn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Invoice Amount !");
        } else {
            int grntablecount = grncountingtable.getRowCount();
            for (int i = 0; i < grntablecount; i++) {
                String ids = grncountingtable.getValueAt(i, 0).toString();
                String productcode = grncountingtable.getValueAt(i, 1).toString();
                String productname = grncountingtable.getValueAt(i, 2).toString();
                String quantitiesn = grncountingtable.getValueAt(i, 3).toString();
                String perprice = grncountingtable.getValueAt(i, 4).toString();
                String rowtotal = grncountingtable.getValueAt(i, 5).toString();
                String itmdescription = grncountingtable.getValueAt(i, 6).toString();
                String barcode = grncountingtable.getValueAt(i, 7).toString();
                String grnnumber = grnnumberfield.getText();
                String supp = suppliergrnfield.getText();
                String dategrn = dateingrn.getText();
                String invoicenogrn = invoicenoingrn.getText();
                String billdategrn = billdateingrn.getText();
                String invoiceamountgrn = invoiceamountingrn.getText();
                String fulltotalgrn = grntotal.getText().toString();
                try {
                    DB.DB.iud("INSERT INTO `grn records` (grn number, `supplier`, `date`, `invoiceno`, invoice date,`invoiceamount`,`listindex`,`productcode`, `productname`, `quantity`, perproduct amount, `totalprice`,amountxquantity,`generatedtotal`) VALUES ('" + grnnumber + "', '" + supp + "', '" + dategrn + "', '" + invoicenogrn + "', '" + billdategrn + "', '" + invoiceamountgrn + "', '" + fulltotalgrn + "', '" + ids + "', '" + productcode + "', '" + productname + "', '" + quantitiesn + "', '" + perprice + "', '" + rowtotal + "');");
                    DB.DB.iud("INSERT INTO `stock`(itemid,itemname, itemescription,itembarcode,quantity,perprice,`grnnumber`) VALUES ('" + productcode + "','" + productname + "','" + itmdescription + "','" + barcode + "','" + quantitiesn + "','" + perprice + "','" + grnnumberfield.getText() + "')");
                } catch (Exception e) {
                }
            }

        }
    }//GEN-LAST:event_okbtngrn1ActionPerformed

    private void productquantityingrn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productquantityingrn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productquantityingrn1ActionPerformed

    private void itemidssItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_itemidssItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_itemidssItemStateChanged

    private void itemidssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemidssActionPerformed

    }//GEN-LAST:event_itemidssActionPerformed

    private void brandfield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandfield2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandfield2ActionPerformed

    private void conditionfield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conditionfield2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conditionfield2ActionPerformed

    private void warrantyfield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warrantyfield2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warrantyfield2ActionPerformed

    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseClicked

    }//GEN-LAST:event_jTabbedPane2MouseClicked

    private void billdateingrn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billdateingrn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billdateingrn2ActionPerformed

    private void invoiceamountingrn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceamountingrn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invoiceamountingrn3ActionPerformed
    private void selectitemscombo() {
        try {
            ResultSet rs = DB.DB.search("select  itemid  from `item` ");
            itemidss.removeAllItems();
            while (rs.next()) {
                itemidss.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActivityLogpanel;
    private javax.swing.JLabel Activity_log;
    private javax.swing.JLabel Activityloglbl;
    private javax.swing.JTable Activitylogtable;
    private javax.swing.JLabel AddStock;
    private javax.swing.JButton Addstockbtn;
    private javax.swing.JPanel Addstockpanel;
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JButton Backupbtn;
    private javax.swing.JButton Billokbtn;
    private javax.swing.JLabel Home;
    private javax.swing.JPanel Homepanel;
    private javax.swing.JPanel Maincardpanel;
    private javax.swing.JLabel PrintGRN;
    private javax.swing.JLabel PrintStock;
    private javax.swing.JTextField Productnamegrn;
    private javax.swing.JLabel Sales;
    private javax.swing.JPanel SalesPanel;
    private javax.swing.JTextField Searchfieldinaccounts;
    private javax.swing.JTextField Sellidfield;
    private javax.swing.JLabel Settings;
    private javax.swing.JPanel Settingspanel;
    private javax.swing.JLabel Stock;
    private javax.swing.JPanel Stockpanel;
    private javax.swing.JLabel ViewStock;
    private javax.swing.JPanel Viewstockpanel;
    private javax.swing.JPanel about;
    private javax.swing.JLabel aboutlbl;
    private javax.swing.JLabel accountslbl;
    private javax.swing.JPanel accountspnl;
    private javax.swing.JComboBox<String> activityfieldcombo;
    private javax.swing.JPanel activitylogpanel;
    private javax.swing.JButton addbtninaccounts;
    private javax.swing.JButton additeminpos;
    private javax.swing.JPasswordField admincurrentpasswordinsettings;
    private javax.swing.JTextField avgstockfield;
    private javax.swing.JButton backtopos;
    private javax.swing.JTextField backuplocationfield;
    private javax.swing.JLabel backuprestorelbl;
    private javax.swing.JPanel backuprestorepanel;
    private javax.swing.JTextField balancefield;
    private javax.swing.JTextField barcodefield;
    private javax.swing.JTextField barcodefield1;
    private javax.swing.JLabel barcodefieldstate;
    private javax.swing.JTextField billbumberfieldinsellrecords;
    private javax.swing.JTextField billdateingrn;
    private javax.swing.JTextField billdateingrn1;
    private javax.swing.JTextField billdateingrn2;
    private javax.swing.JTextField brandfield;
    private javax.swing.JTextField brandfield1;
    private javax.swing.JTextField brandfield2;
    private javax.swing.JLabel brandfieldstate;
    private javax.swing.JButton browsepathinbackup;
    private javax.swing.JButton browsepathinrestore;
    private javax.swing.JTable cartlisttable;
    private javax.swing.JLabel close;
    private javax.swing.JTextField conditionfield;
    private javax.swing.JTextField conditionfield1;
    private javax.swing.JTextField conditionfield2;
    private javax.swing.JLabel conditionfieldstate;
    private javax.swing.JTextField currencyfield;
    private javax.swing.JLabel currencyinvisible;
    private javax.swing.JTextField dateingrn;
    private javax.swing.JTextField dateingrn1;
    private javax.swing.JTextField dateingrn2;
    private javax.swing.JLabel datelbl;
    private javax.swing.JButton deletebtninaccounts;
    private javax.swing.JButton deletethisid;
    private javax.swing.JPanel detailmode;
    private javax.swing.JButton detailmodebtn;
    private javax.swing.JTextField discountfield;
    private javax.swing.JButton editdetailmodebtn;
    private javax.swing.JButton exportstocktablebtn;
    private javax.swing.JComboBox<String> filteruserfield;
    private javax.swing.JButton findbtn;
    private javax.swing.JButton findbtn1;
    private javax.swing.JPanel footer;
    private javax.swing.JLabel generallbl;
    private javax.swing.JPanel generalpanel;
    private javax.swing.JButton grnaddtotablebtn;
    private javax.swing.JButton grnaddtotablebtn1;
    private javax.swing.JTable grncountingtable;
    private javax.swing.JTable grncountingtable1;
    private javax.swing.JTextField grnnumberfield;
    private javax.swing.JTextField grnnumberfield1;
    private javax.swing.JTextField grnrecordfield;
    private javax.swing.JLabel grnrecordslbl;
    private javax.swing.JPanel grnrecordspanel;
    private javax.swing.JTabbedPane grnrecordstab;
    private javax.swing.JTable grnrecordstable;
    private javax.swing.JTabbedPane grntabbed;
    private javax.swing.JTextField grntotal;
    private javax.swing.JTextField grntotal5;
    private javax.swing.JPanel header;
    private javax.swing.JPanel holder;
    private javax.swing.JPanel invoice;
    private javax.swing.JTextField invoiceamountingrn;
    private javax.swing.JTextField invoiceamountingrn2;
    private javax.swing.JTextField invoiceamountingrn3;
    private javax.swing.JTextField invoicenoingrn;
    private javax.swing.JTextField invoicenoingrn1;
    private javax.swing.JTextField invoicenoingrn2;
    private javax.swing.JTabbedPane invoicetab;
    private javax.swing.JButton itemaddbtn;
    private javax.swing.JTextField itemdescriptionfield;
    private javax.swing.JTextField itemdescriptionfield1;
    private javax.swing.JLabel itemdescriptionfieldstate;
    private javax.swing.JTextField itemidfield;
    private javax.swing.JTextField itemidfield1;
    private javax.swing.JLabel itemidfieldstate;
    private javax.swing.JComboBox<String> itemidss;
    private javax.swing.JTextField itemnamefield;
    private javax.swing.JTextField itemnamefield1;
    private javax.swing.JLabel itemnamefieldstate;
    private javax.swing.JTable itemstable;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lowstock;
    private javax.swing.JTextField nettotalfield;
    private javax.swing.JPasswordField newadminpasswordfield;
    private javax.swing.JLabel nostock;
    private javax.swing.JPanel notificationholder;
    private javax.swing.JButton ok;
    private javax.swing.JButton okbtngrn;
    private javax.swing.JButton okbtngrn1;
    private javax.swing.JTextField passwordfieldinaccounts;
    private javax.swing.JButton passwrdchangebtn;
    private javax.swing.JTextField paymentfield;
    private javax.swing.JButton poscancelbtn;
    private javax.swing.JLabel poslbl;
    private javax.swing.JPanel pospanel;
    private javax.swing.JPanel pospanelk;
    private javax.swing.JButton previewgrnrecord;
    private javax.swing.JButton printgrnbtn;
    private javax.swing.JPanel printgrnpanel;
    private javax.swing.JButton printinvoicebtn;
    private javax.swing.JButton printinvoicebtninsellrecords;
    private javax.swing.JLabel printloglbl;
    private javax.swing.JPanel printlogpanel;
    private javax.swing.JPanel printstockpanel;
    private javax.swing.JTabbedPane printstocktabbed;
    private javax.swing.JTextField productamountingrn;
    private javax.swing.JTextField productcodeingrn;
    private javax.swing.JTextField productcodeingrn1;
    private javax.swing.JTextField productquantityingrn;
    private javax.swing.JTextField productquantityingrn1;
    private javax.swing.JTextField quantityfield;
    private javax.swing.JTextField quantityfield1;
    private javax.swing.JLabel quantityfieldstate;
    private javax.swing.JTextField quantityinpos;
    private javax.swing.JTextField quciksearchviewstock;
    private javax.swing.JLabel quicksearchitemidlbl;
    private javax.swing.JLabel quicksearchitemidlbl1;
    private javax.swing.JLabel quicksearchitemidlbl10;
    private javax.swing.JLabel quicksearchitemidlbl11;
    private javax.swing.JLabel quicksearchitemidlbl12;
    private javax.swing.JLabel quicksearchitemidlbl13;
    private javax.swing.JLabel quicksearchitemidlbl14;
    private javax.swing.JLabel quicksearchitemidlbl15;
    private javax.swing.JLabel quicksearchitemidlbl16;
    private javax.swing.JLabel quicksearchitemidlbl17;
    private javax.swing.JLabel quicksearchitemidlbl18;
    private javax.swing.JLabel quicksearchitemidlbl19;
    private javax.swing.JLabel quicksearchitemidlbl20;
    private javax.swing.JLabel quicksearchitemidlbl21;
    private javax.swing.JLabel quicksearchitemidlbl23;
    private javax.swing.JLabel quicksearchitemidlbl24;
    private javax.swing.JLabel quicksearchitemidlbl25;
    private javax.swing.JLabel quicksearchitemidlbl26;
    private javax.swing.JLabel quicksearchitemidlbl27;
    private javax.swing.JLabel quicksearchitemidlbl28;
    private javax.swing.JLabel quicksearchitemidlbl29;
    private javax.swing.JLabel quicksearchitemidlbl30;
    private javax.swing.JLabel quicksearchitemidlbl31;
    private javax.swing.JLabel quicksearchitemidlbl32;
    private javax.swing.JLabel quicksearchitemidlbl33;
    private javax.swing.JLabel quicksearchitemidlbl34;
    private javax.swing.JLabel quicksearchitemidlbl35;
    private javax.swing.JLabel quicksearchitemidlbl36;
    private javax.swing.JLabel quicksearchitemidlbl37;
    private javax.swing.JLabel quicksearchitemidlbl38;
    private javax.swing.JLabel quicksearchitemidlbl39;
    private javax.swing.JLabel quicksearchitemidlbl4;
    private javax.swing.JLabel quicksearchitemidlbl40;
    private javax.swing.JLabel quicksearchitemidlbl41;
    private javax.swing.JLabel quicksearchitemidlbl42;
    private javax.swing.JLabel quicksearchitemidlbl43;
    private javax.swing.JLabel quicksearchitemidlbl44;
    private javax.swing.JLabel quicksearchitemidlbl45;
    private javax.swing.JLabel quicksearchitemidlbl46;
    private javax.swing.JLabel quicksearchitemidlbl47;
    private javax.swing.JLabel quicksearchitemidlbl48;
    private javax.swing.JLabel quicksearchitemidlbl49;
    private javax.swing.JLabel quicksearchitemidlbl5;
    private javax.swing.JLabel quicksearchitemidlbl50;
    private javax.swing.JLabel quicksearchitemidlbl51;
    private javax.swing.JLabel quicksearchitemidlbl52;
    private javax.swing.JLabel quicksearchitemidlbl53;
    private javax.swing.JLabel quicksearchitemidlbl54;
    private javax.swing.JLabel quicksearchitemidlbl55;
    private javax.swing.JLabel quicksearchitemidlbl56;
    private javax.swing.JLabel quicksearchitemidlbl57;
    private javax.swing.JLabel quicksearchitemidlbl58;
    private javax.swing.JLabel quicksearchitemidlbl59;
    private javax.swing.JLabel quicksearchitemidlbl6;
    private javax.swing.JLabel quicksearchitemidlbl60;
    private javax.swing.JLabel quicksearchitemidlbl61;
    private javax.swing.JLabel quicksearchitemidlbl65;
    private javax.swing.JLabel quicksearchitemidlbl66;
    private javax.swing.JLabel quicksearchitemidlbl67;
    private javax.swing.JLabel quicksearchitemidlbl68;
    private javax.swing.JLabel quicksearchitemidlbl69;
    private javax.swing.JLabel quicksearchitemidlbl7;
    private javax.swing.JLabel quicksearchitemidlbl70;
    private javax.swing.JLabel quicksearchitemidlbl8;
    private javax.swing.JLabel quicksearchitemidlbl9;
    private javax.swing.JButton refresh;
    private javax.swing.JButton refreshbtninaccounts;
    private javax.swing.JButton refreshinlogbtn;
    private javax.swing.JButton removeitemfromlistbtn;
    private javax.swing.JPanel reportholder;
    private javax.swing.JButton restorebtn;
    private javax.swing.JTextField restorelocationfield;
    private javax.swing.JPasswordField retypenewadminpasswordfield;
    private javax.swing.JLabel salesday;
    private javax.swing.JTable salesrecordstable;
    private javax.swing.JButton searchbillbtn;
    private javax.swing.JButton searchbtninaccounts;
    private javax.swing.JButton searchbtninaccounts1;
    private javax.swing.JComboBox<String> searchcomboinpos;
    private javax.swing.JTextField searchinposfield;
    private javax.swing.JButton sellbtn;
    private javax.swing.JTextField sellingpricefield;
    private javax.swing.JTextField sellingpricefield1;
    private javax.swing.JLabel sellingpricefieldstate;
    private javax.swing.JLabel sellrecordslbl;
    private javax.swing.JPanel sellrecordspanel;
    private javax.swing.JTabbedPane sellrecordstab;
    private javax.swing.JButton setavgstockbtn;
    private javax.swing.JButton setcurrency;
    private javax.swing.JLabel stateofbackuplbl;
    private javax.swing.JLabel stateofcurrentpasswordadmin;
    private javax.swing.JLabel stateofcurrentpasswordadmin1;
    private javax.swing.JLabel stateofcurrentpasswordadmin2;
    private javax.swing.JLabel stateofrestorelbl;
    private javax.swing.JLabel stockavailable;
    private javax.swing.JTextField stocknumberfield;
    private javax.swing.JTextField stocknumberfield1;
    private javax.swing.JLabel stocknumberfieldstate;
    private javax.swing.JTextField stockpricefield;
    private javax.swing.JTextField stockpricefield1;
    private javax.swing.JLabel stockpricefieldstate;
    private javax.swing.JTable stocktableinpostable;
    private javax.swing.JLabel stockupdate;
    private javax.swing.JPanel stockupdatepanel;
    private javax.swing.JTable stockupdatetable;
    private javax.swing.JTextField suppliergrnfield;
    private javax.swing.JTextField suppliergrnfield4;
    private javax.swing.JTextField supplieridfield;
    private javax.swing.JTextField supplieridfield1;
    private javax.swing.JLabel supplieridfieldstate;
    private javax.swing.JPanel tableview;
    private javax.swing.JLabel timelbl;
    private javax.swing.JLabel todayearned;
    private javax.swing.JPanel todaysaledetails;
    private javax.swing.JTable todaysales;
    private javax.swing.JLabel todaysaleslbl;
    private javax.swing.JTextField totalinpos;
    private javax.swing.JButton updatebtninaccounts;
    private javax.swing.JButton updatestockqbtn;
    private javax.swing.JButton updatestockqbtn1;
    private javax.swing.JTextField usernamefieldinaccounts;
    private javax.swing.JTextField vatfield;
    private javax.swing.JTable viewstocktable;
    private javax.swing.JTextField warrantyfield;
    private javax.swing.JTextField warrantyfield1;
    private javax.swing.JTextField warrantyfield2;
    private javax.swing.JLabel warrantyfieldstate;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/mainicon.png")));
    }

    private void refreshstocktable() {
        try {
            ResultSet rs = DB.DB.search("SELECT * FROM `stock` WHERE `Quantity`>0");
            DefaultTableModel dtm = (DefaultTableModel) viewstocktable.getModel();
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(rs.getString(8));
                v.add(rs.getString(9));
                v.add(rs.getString(10));
                v.add(rs.getString(11));
                v.add(rs.getString(12));
                v.add(rs.getString(13));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void refreshstockupdatetable() {
        try {
            ResultSet rs = DB.DB.search("SELECT * FROM `stock` WHERE `Quantity` =0");
            DefaultTableModel dtm = (DefaultTableModel) stockupdatetable.getModel();
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(13));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void settodaysalestable() {

        try {
            ResultSet rs = DB.DB.search("SELECT * FROM `sales records` WHERE cast(`Date Time` as date) = '" + salesday.getText() + "' ");
            DefaultTableModel dtm = (DefaultTableModel) todaysales.getModel();
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(4));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(5));
                v.add(rs.getString(16));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void refreshstocktableinpos() {
        try {
            ResultSet rs = DB.DB.search("SELECT * FROM `stock` WHERE `Quantity`>0");
            DefaultTableModel dtm = (DefaultTableModel) stocktableinpostable.getModel();
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

    private void refreshlogtable() {
        try {
            ResultSet rs = DB.DB.search("SELECT * FROM `activitylog` ORDER BY `activitylog`.`date/time` DESC");
            DefaultTableModel dtm = (DefaultTableModel) Activitylogtable.getModel();
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void lastactivitiesrefresh() {
        try {
            ResultSet rs = DB.DB.search("SELECT cast(`date/time` as TIME),`activitytype` FROM `activitylog` ORDER BY `activitylog`.`date/time` DESC LIMIT 11");
            Vector v = new Vector();
            while (rs.next()) {
                v.add("  " + rs.getString(1) + "-" + rs.getString(2));
            }
            jList1.setListData(v);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loggedusersrefresh() {
        try {
            ResultSet rs = DB.DB.search("SELECT `username` FROM `accounts` WHERE `status`= '1' ORDER BY `accounts`.`accounttype` ASC ");
            Vector v = new Vector();
            while (rs.next()) {
                v.add("  Logged  " + rs.getString(1));
            }
            jList2.setListData(v);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void messagessrefresh() {
        try {
            ResultSet rs = DB.DB.search("SELECT * FROM `messagestoadmin` WHERE cast(`Date/time` as date) = '" + salesday.getText().toString() + "' ");
            Vector v = new Vector();
            while (rs.next()) {
                v.add("  " + rs.getString(2) + "  -  " + rs.getString(3) + "  -  " + rs.getString(4));
            }
            jList3.setListData(v);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setcurrencyunit() {
        try {
            ResultSet rs = DB.DB.search("SELECT * FROM `currencyunit` ");
            if (rs.next()) {
                currencyinvisible.setText(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void averagestockavailability() {
        DefaultTableModel dtm = (DefaultTableModel) viewstocktable.getModel();
        dtm.setRowCount(0);
        refreshstocktable();

        try {
            ResultSet rs = DB.DB.search("SELECT * FROM `avgstock` WHERE `id`='1' ");
            if (rs.next()) {

                int avgstock = rs.getInt(2);
                if (viewstocktable.getRowCount() <= avgstock) {
                    lowstock.setVisible(true);
                    stockavailable.setVisible(false);
                    nostock.setVisible(false);
                } else if (viewstocktable.getRowCount() == 0) {
                    nostock.setVisible(true);
                    lowstock.setVisible(false);
                    stockavailable.setVisible(false);
                } else {
                    nostock.setVisible(false);
                    lowstock.setVisible(false);
                    stockavailable.setVisible(true);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void exportstocktabletoexel() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) viewstocktable.getModel();
            Workbook wb = new HSSFWorkbook();
            CreationHelper createhelper = wb.getCreationHelper();
            Sheet sheet = wb.createSheet("new sheet");
            Row row = null;
            Cell cell = null;
            for (int i = 0; i < dtm.getRowCount(); i++) {
                row = sheet.createRow(i);
                for (int j = 0; j < dtm.getColumnCount(); j++) {

                    cell = row.createCell(j);
                    cell.setCellValue((String) dtm.getValueAt(i, j));
                }

            }

            FileOutputStream out = new FileOutputStream(pathxls);
            wb.write(out);
            out.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void settodaysalesnumber() {
        try {
            ResultSet rs = DB.DB.search("SELECT COUNT(DISTINCT `Bill number`) FROM `sales records` WHERE cast(`Date Time` as date) = '" + salesday.getText() + "' ");
            if (rs.next()) {
                todaysaleslbl.setText(rs.getString(1));
            }
            String month = salesday.getText().toString().substring(0, 7);

            ResultSet rs2 = DB.DB.search("SELECT COUNT(DISTINCT `Bill number`) FROM `sales records` WHERE cast(`Date Time` as date) LIKE '" + month + "%' ");
            if (rs2.next()) {
                jLabel12.setText(rs2.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void settodaysalesearned() {
        try {
            ResultSet rs = DB.DB.search("SELECT SUM(`Sale Earnings`)  FROM `sales records` WHERE cast(`Date Time` as date) = '" + salesday.getText() + "' ");
            if (rs.next()) {
                double todyearn = rs.getDouble(1);
                String currencyunit = currencyinvisible.getText();
                todayearned.setText(currencyunit + " " + todyearn);
            }
            String month = salesday.getText().toString().substring(0, 7);
            ResultSet rs2 = DB.DB.search("SELECT SUM(`Sale Earnings`)  FROM `sales records` WHERE cast(`Date Time` as date) LIKE '" + month + "%' ");
            if (rs2.next()) {
                double todyearn = rs2.getDouble(1);
                String currencyunit = currencyinvisible.getText();
                jLabel10.setText(currencyunit + " " + todyearn);
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

    private void searchbills() {
        try {
            ResultSet rs = DB.DB.search("select `quantity` from `sales records` where `Bill number` = '" + jTextField3.getText() + "' AND `itemid` = '" + jTextField6.getText() + "' ");
            ResultSet rs2 = DB.DB.search("select * from `sales records` where `Bill number` = '" + jTextField3.getText() + "'");

            DefaultTableModel dtm = (DefaultTableModel) stockupdatetable.getModel();
            while (rs2.next()) {
                Vector v = new Vector();
                v.add(rs2.getString(15));
                v.add(rs2.getString(8));
                v.add(rs2.getString(14));
                dtm.addRow(v);
            }
            while (rs.next()) {
                jTextField4.setText(rs.getString(1));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void refreshgrnrecords() {
        try {
            ResultSet rs = DB.DB.search("select * from `grn records` where `grn number` = '" + grnrecordfield.getText() + "'");
            DefaultTableModel dtm = (DefaultTableModel) grnrecordstable.getModel();
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(9));
                v.add(rs.getString(10));
                v.add(rs.getString(11));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
