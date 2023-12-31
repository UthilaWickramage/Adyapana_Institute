package gui;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.MySQL;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Uthila Wickramage
 */
public class StudentEnrollment extends javax.swing.JFrame {

    /**
     * Creates new form StudentPayment
     */
    public StudentEnrollment() {
        initComponents();
        loadMonths();
        jLabel12.setText(Signin.userName);
    }
    
    public void resetFields() {
        try {
            jButton1.setEnabled(true);
            jButton1.setText("Select Student");
            jButton1.setEnabled(true);
            jButton1.setText("Select Class");
            jLabel4.setText("None");
            jLabel5.setText("None");
            jLabel8.setText("None");
            jLabel9.setText("None");
            jLabel15.setText("None");
            jLabel19.setText("None");
            jLabel21.setText("None");
            jLabel23.setText("None");
            jLabel34.setText("None");
            jLabel25.setText("None");
            jLabel27.setText("None");
            jLabel29.setText("None");
            jLabel31.setText("None");
            jTextField1.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
   public void loadMonths() {
        try {
            ResultSet rs = MySQL.search("SELECT * FROM `month`");

            Vector v = new Vector();
            v.add("Select");

            while (rs.next()) {
                v.add(rs.getString("name"));
            }

            DefaultComboBoxModel dcm = new DefaultComboBoxModel(v);
            jComboBox1.setModel(dcm);
        } catch (Exception e) {

            e.printStackTrace();
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Enrollment");
        setPreferredSize(new java.awt.Dimension(1650, 840));

        jLabel1.setFont(new java.awt.Font("Noto Serif", 2, 36)); // NOI18N
        jLabel1.setText("Enroll Students For Classes");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/user (1).png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel12.setText("Uthila");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1036, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back-button.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel16.setText("BACK");

        jLabel2.setFont(new java.awt.Font("Rubik", 1, 20)); // NOI18N
        jLabel2.setText("Student Details");

        jButton1.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N
        jButton1.setText("Select Student");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N
        jLabel3.setText("Student Id:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel4.setText("None");

        jLabel6.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N
        jLabel6.setText("Student Name:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel5.setText("None");

        jLabel7.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N
        jLabel7.setText("Date of Birth:");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel8.setText("None");

        jLabel10.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N
        jLabel10.setText("City:");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel9.setText("None");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Rubik", 1, 20)); // NOI18N
        jLabel13.setText("Class Details");

        jLabel14.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N
        jLabel14.setText("Class Id:");

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel15.setText("None");

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel19.setText("None");

        jLabel18.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N
        jLabel18.setText("Day:");

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel21.setText("None");

        jLabel20.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N
        jLabel20.setText("Start Time:");

        jLabel22.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N
        jLabel22.setText("End Time:");

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel23.setText("None");

        jLabel24.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N
        jLabel24.setText("Subject Id");

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel25.setText("None");

        jLabel26.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N
        jLabel26.setText("Description:");

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel27.setText("None");

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel29.setText("None");

        jLabel28.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N
        jLabel28.setText("Teacher Id:");

        jLabel30.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N
        jLabel30.setText("Teacher Name:");

        jLabel31.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel31.setText("None");

        jButton2.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N
        jButton2.setText("Select Class");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel31))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15))
                    .addComponent(jLabel13)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel29))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel13)
                .addGap(14, 14, 14)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addGap(58, 58, 58))
        );

        jLabel35.setFont(new java.awt.Font("Rubik", 1, 20)); // NOI18N
        jLabel35.setText("Payment Details");

        jLabel33.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N
        jLabel33.setText("Price:");

        jLabel34.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel34.setText("None");

        jLabel32.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N
        jLabel32.setText("Payment:");

        jTextField1.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N
        jLabel36.setText("Enrollment Month:");

        jComboBox1.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N

        jButton4.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N
        jButton4.setText("Print & Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel36))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel34)
                                    .addComponent(jComboBox1, 0, 193, Short.MAX_VALUE)
                                    .addComponent(jTextField1))))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel35)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(55, 55, 55)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        Home h = new Home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StudentRegistration sr = new StudentRegistration(this);
        sr.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ClassRegistration cr = new ClassRegistration(this);
        cr.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        resetFields();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String student_id = jLabel4.getText();
        String class_id = jLabel15.getText();
        int month_id = jComboBox1.getSelectedIndex();
        String month = jComboBox1.getSelectedItem().toString();
        String value = jTextField1.getText();
        String subno = jLabel25.getText();
        String tno = jLabel29.getText();
        Date dDate = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String tDate = sdf2.format(dDate);
        
        if (student_id.equals("None")) {
            JOptionPane.showMessageDialog(this, "Please Select Student", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (class_id.equals("None")) {
            JOptionPane.showMessageDialog(this, "Please select Class", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (0 == month_id) {
            JOptionPane.showMessageDialog(this, "Please select Enroll Month", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (!Pattern.compile("([0]|[1-9][0-9]*)|([0][.]([0]*[1-9][0-9]*))|([1-9][0-9]*[.][0-9]+)").matcher(value).matches()) {
            JOptionPane.showMessageDialog(this, "Invalid payment input", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            MySQL.iud("INSERT INTO `invoice` (`month_id`,`value`,`subno`,`sno`,`teacher_tno`,`user_id`) VALUES ('"+month_id+"','"+value+"','"+subno+"','"+student_id+"','"+tno+"',"+Signin.userId+")");
        
            try {
                    String path = "src//reports//student_enrolment_invoice.jrxml";
                    JasperReport jr = JasperCompileManager.compileReport(path);
                    
                   

                    HashMap map = new HashMap();
                    map.put("Parameter1", class_id);
                    map.put("Parameter2", month);
                    map.put("Parameter3", student_id);
                    map.put("Parameter4", jLabel5.getText());
                    map.put("Parameter5", jLabel31.getText());
                    map.put("Parameter6", jLabel27.getText());
                    map.put("Parameter7", jLabel34.getText());
                    map.put("Parameter8", value + ".00");
                    map.put("Parameter9", tDate);
                    
                    JREmptyDataSource bean = new JREmptyDataSource();
                    JasperPrint jp = JasperFillManager.fillReport(jr, map, bean);
                    JasperViewer.viewReport(jp, false);
                    
                    }catch(Exception e){
                        e.printStackTrace();
                    }
            
                   

                    
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentEnrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentEnrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentEnrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentEnrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentEnrollment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    public javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    public javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    public javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    public javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
