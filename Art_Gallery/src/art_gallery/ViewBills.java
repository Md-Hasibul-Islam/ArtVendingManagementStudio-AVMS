/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art_gallery;

import dao.BillDao;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Date;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import model.Bill;


/**
 *
 * @author fdipt
 */
public class ViewBills extends javax.swing.JFrame {

    /**
     * Creates new form ViewBills
     */
//    private javax.swing.JButton jButton1;
//    private javax.swing.JComboBox<String> jComboBox1;
//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JLabel jLabel2;
//    private javax.swing.JLabel jLabel3;
//    private javax.swing.JLabel jLabel4;
//    private javax.swing.JScrollPane jScrollPane1;
//    private javax.swing.JTable jTable1;
//    private javax.swing.JTextField jTextField1;
//    public void initComponents(){};
    public ViewBills() {
        initComponents();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        String todayDate = dateFormat.format(date);
        jTextField1.setText(todayDate);

    }

    public void tableDetails(){
        String date = jTextField1.getText();
        String incDec = (String) jComboBox1.getSelectedItem();
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        if(incDec.equals("ASC")){
            ArrayList <Bill> List = BillDao.getAllRecordByAsc(date);
            Iterator <Bill> itr = List.iterator();
            while(itr.hasNext()){
                Bill billObj = itr.next();
                dtm.addRow(new Object[]{billObj.getId(), billObj.getName(), billObj.getMobileNumber(), billObj.getEmail(), billObj.getDate(), billObj.getTotal()});

            }
        }
        else{
            ArrayList <Bill> List = BillDao.getAllRecordByDesc(date);
            Iterator <Bill> itr = List.iterator();
            while(itr.hasNext()){
                Bill billObj = itr.next();
                dtm.addRow(new Object[]{billObj.getId(), billObj.getName(), billObj.getMobileNumber(), billObj.getEmail(), billObj.getDate(), billObj.getTotal()});

            }
        }
    }

        /*
         * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
         */
//        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        public void initComponents() {

            jLabel1 = new javax.swing.JLabel();
            jButton1 = new javax.swing.JButton();
            jTextField1 = new javax.swing.JTextField();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jComboBox1 = new javax.swing.JComboBox<>();
            jScrollPane1 = new javax.swing.JScrollPane();
            jTable1 = new javax.swing.JTable();
            jLabel4 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setMaximumSize(new java.awt.Dimension(1411, 768));
            setMinimumSize(new java.awt.Dimension(1411, 768));
            setUndecorated(true);
            setPreferredSize(new java.awt.Dimension(1411, 768));

            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View Bills & Order Placed Details.png"))); // NOI18N
            jLabel1.setText("View Bills & Order Placed Details");

            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    actionPerformed(evt);
                }
            });

            jTextField1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    actionPerformed(evt);
                }
            });
            jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(KeyEvent evt) {
                    keyReleased(evt);
                }
            });

            jLabel2.setText("Filter by Date: ");

            jLabel3.setText("Change Order by ID: ");

            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ASC", "DSC" }));
            jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    actionPerformed(evt);
                }
            });

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {

                    },
                    new String [] {
                            "ID", "Name", "Mobile Number", "Email", "Date", "Total"
                    }
            ));
            jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    mouseClicked(evt);
                    tableDetails();
                }
            });
            jScrollPane1.setViewportView(jTable1);

            jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel4.setText("Click on row to open bill");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1)
                                    .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(273, 273, 273)
                                    .addComponent(jLabel2)
                                    .addGap(44, 44, 44)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47)
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(505, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane1)
                                    .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addGap(610, 610, 610))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton1)
                                            .addComponent(jLabel1))
                                    .addGap(82, 82, 82)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(44, 44, 44)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4)
                                    .addContainerGap(103, Short.MAX_VALUE))
            );



            pack();
        }// </editor-fold>

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
            setVisible(false);
        }

        private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }

        private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }

        private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {
            // TODO add your handling code here:
            tableDetails();
        }

        private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
            // TODO add your handling code here:
            int index = jTable1.getSelectedRow();
//        TableModel model = jTable1.getModel();
//        String id = model
        }

        private void formComponentShown(java.awt.event.ComponentEvent evt){
            tableDetails();
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
                java.util.logging.Logger.getLogger(ViewBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(ViewBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(ViewBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(ViewBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new ViewBills().setVisible(true);
                }
            });
        }

//         Variables declaration - do not modify
        private javax.swing.JButton jButton1;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable jTable1;
        private javax.swing.JTextField jTextField1;
//         End of variables declaration

//        private void initComponents() {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
    }

