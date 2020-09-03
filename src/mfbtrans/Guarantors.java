/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfbtrans;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Smartec
 */
public class Guarantors extends javax.swing.JFrame {

    /**
     * Creates new form Guarantors
     */
    public Guarantors() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCID = new javax.swing.JTextField();
        jTextFieldLN = new javax.swing.JTextField();
        jTextFieldMN = new javax.swing.JTextField();
        jComboBoxLID = new javax.swing.JComboBox<>();
        jLabelPassport = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldAdd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtonSubmit = new javax.swing.JButton();
        jTextFieldMobile = new javax.swing.JTextField();
        jTextFieldFN = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();
        jLabelProduct = new javax.swing.JLabel();
        jLabelRcount = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabelGID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Guarantor Form");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setText("Customer Num");

        jLabel2.setText("loanID");

        jLabel3.setText("Last Name");

        jLabel4.setText("First Name");

        jTextFieldCID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCIDFocusLost(evt);
            }
        });

        jComboBoxLID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLIDActionPerformed(evt);
            }
        });

        jLabelPassport.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPassport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray, new java.awt.Color(153, 0, 51)));

        jLabel5.setText("Middle Name");

        jLabel8.setText("Address");

        jButtonSubmit.setText("Upload");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jLabel7.setText("Telephone");

        jButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfbtrans/iconsearchsmall.png"))); // NOI18N
        jButtonSearch.setContentAreaFilled(false);
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jLabelProduct.setText("Loan Product:");

        jLabelRcount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelRcount.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldMobile, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextFieldMN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldFN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextFieldLN)
                                                    .addComponent(jTextFieldCID)
                                                    .addComponent(jComboBoxLID, 0, 124, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(32, 32, 32))
                            .addComponent(jLabelProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jButtonSubmit))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelPassport, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelRcount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextFieldCID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jComboBoxLID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelProduct)
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextFieldLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabelRcount, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSubmit)))
                    .addComponent(jLabelPassport, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldMN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMobile, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel7))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabelGID.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabelGID, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelGID)
                .addGap(7, 7, 7)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String query="insert into Guarantors VALUES (?,?,?,?,?,?,?,?)";
PreparedStatement pstmt=null;

try{
  
pstmt=conn.prepareStatement(query);
pstmt.setString(1,jTextFieldCID.getText());
pstmt.setString(2,jComboBoxLID.getSelectedItem().toString());
pstmt.setString(3,jTextFieldLN.getText()+" "+jTextFieldMN.getText()+" "+jTextFieldFN.getText());
pstmt.setString(4,jTextFieldAdd.getText());
pstmt.setString(5,jTextFieldMobile.getText());
File file=new File(pixpath);
FileInputStream fis=new FileInputStream(file);
int len =(int)file.length();
pstmt.setBinaryStream(6,fis,len);
int GID=0;

   GID=Integer.parseInt(jLabelGID.getText());
   GID=GID+1;



pstmt.setString(7,Branchcode+GID+"");

Calendar now=Calendar.getInstance();
        now.getTime();
        int year=now.get(Calendar.YEAR);
        String Smonth,Sday;
        int Omonth=now.get(Calendar.MONTH);//opening as january=0 not 1
        int day=now.get(Calendar.DAY_OF_MONTH);
         int month=Omonth+1;//note month start with january=0 in java
        Smonth=month+"";
        Sday=day+"";
       if(month<10){Smonth="0"+month;}// let it appear as two digit e.g 02
        if(day<10){Sday="0"+day;}
pstmt.setString(8,year+"-"+Smonth+"-"+Sday+" 00:00:00.000");


pstmt.executeUpdate();//end of saving guarantors

 JOptionPane.showMessageDialog(this,"Done Boss");
 jLabelGID.setText(Integer.parseInt(jLabelGID.getText())+1+"");
 jTextFieldCID.setText("");
jComboBoxLID.setSelectedItem("");
jTextFieldLN.setText("");
jTextFieldMN.setText("");
jTextFieldFN.setText("");
jTextFieldAdd.setText("");
jTextFieldMobile.setText("");
jLabelPassport.setIcon(null);
}
catch(Exception e){
   JOptionPane.showMessageDialog(this,e.getMessage());
  
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
try
{
   Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
         //get last client id   
         String query="Select count(GID) as GID from guarantors";
         String query2="Select Max(GID) as GID from guarantors";
         String query3="Select * from BranchCode";
         ResultSet current = stmt.executeQuery(query3);
                  current.next();
                  Branchcode=current.getString("BranchCode");
          current = stmt.executeQuery(query);
            current.next();
            if(!current.getString("GID").equalsIgnoreCase("0")){
                 current = stmt.executeQuery(query2);
                 current.next();
               jLabelGID.setText(current.getString("GID").substring(2));  
            }else{
               
                
            jLabelGID.setText(current.getString("GID"));
            
            }
           current.close();
}
catch(Exception e){
 JOptionPane.showMessageDialog(this,e.getMessage());
}

            // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
JFileChooser fc= new JFileChooser() ;
File picfile = new File("C:/Users/LAPO MFB/Documents");
fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
fc.setFileFilter(new Mp3filter());
fc.setCurrentDirectory(picfile);
//fc.showOpenDialog(fc);
 DefaultListModel lm=new DefaultListModel();
 
 
fc.setMultiSelectionEnabled(false);
fc .setFileView(new ImageFileView());
fc.setAccessory(new ImagePreview(fc));
int returnval=fc.showDialog(fc,"Load Picture");
if(returnval==JFileChooser.APPROVE_OPTION){
pixpath=fc.getSelectedFile().toString();
//java.net.URL picUrl =getClass().getResource(path);
ImageIcon pic=new ImageIcon(pixpath);


     Image resizpic =pic.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
     ImageIcon resizIcon = new ImageIcon(resizpic);
repaint();
pack();

if (pixpath==null){
       JOptionPane.showMessageDialog(this, "Not a valid picture");
}
else { 
    
  
jLabelPassport.setText("");
jLabelPassport.setIcon(resizIcon);
 jButtonSubmit.setEnabled(true);
 
}

}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        if(jTextFieldCID.getText().equalsIgnoreCase("")){
            
        }else{
        //  Global glob = new Global();

//Connection conn=glob.getConnect();

String SQL="Select count(loanID) as num from Guarantors where custno='"+jTextFieldCID.getText()+"'";
String SQL2="Select *  from Guarantors where custno='"+jTextFieldCID.getText()+"'";
 String SQL3="Select loanID from loans where custno='"+jTextFieldCID.getText()+"'";      

try{
    if(count==0){
Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
       current = stmt.executeQuery(SQL);
            current.next();
        count=current.getInt("num");
        current = stmt.executeQuery(SQL3);
        while(current.next()){
         jComboBoxLID.addItem(current.getString("loanid"));   
        }
        current = stmt.executeQuery(SQL2);
    }
       //JOptionPane.showMessageDialog(rootPane,count);
       //keep repeating the next rows
         if(count>0){ 
  
            current.next();
            //jComboBoxLID.addItem(current.getString("loanid"));
          jLabelRcount.setText(current.getRow()+"");
  String[] names=current.getString("name").split("\\s+");
jTextFieldLN.setText(names[0]);
jTextFieldMN.setText(names[1]);
jTextFieldFN.setText(names[2]);
jTextFieldMobile.setText(current.getString("telephone"));
jTextFieldAdd.setText(current.getString("Address"));


byte[] fileBytes =current.getBytes("pix");
ImageIcon pic=new ImageIcon(fileBytes);
     Image resizpic =pic.getImage().getScaledInstance(120,100,Image.SCALE_SMOOTH);
     ImageIcon resizIcon = new ImageIcon(resizpic);  
jLabelPassport.setIcon(resizIcon);
   count=count-1;
   if(count==1){JOptionPane.showMessageDialog(rootPane,"Last Guarantor reached \n next click Starts from Beginning");
                 count=0; 
               }
     
         }
         
}
catch(Exception e){ JOptionPane.showMessageDialog(this,e.getMessage());}
  
                
                
            
        }
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jComboBoxLIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLIDActionPerformed
        Global glob = new Global();
            Connection conn=glob.getConnect();
            byte[] fileBytes;
            String SQL="Select LoanProduct,outstandingBal,disbursedDate from loans where loanid='"+jComboBoxLID.getSelectedItem().toString()+"'";
            try{
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                ResultSet current = stmt.executeQuery(SQL);
            current.next();

                jLabelProduct.setText("ProductID:"+current.getString("LoanProduct")+" With Bal= ("+current.getBigDecimal("outstandingBal").setScale(2, ICONIFIED).negate()+")-"+current.getString("disbursedDate"));
              
                current.close();
                conn.close();
                
            }
            catch(Exception e){ JOptionPane.showMessageDialog(this,e.getMessage());}
 // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLIDActionPerformed

    private void jTextFieldCIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCIDFocusLost
 jComboBoxLID.removeAllItems();
    }//GEN-LAST:event_jTextFieldCIDFocusLost

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
            java.util.logging.Logger.getLogger(Guarantors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guarantors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guarantors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guarantors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guarantors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonSubmit;
    public javax.swing.JComboBox<String> jComboBoxLID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelGID;
    private javax.swing.JLabel jLabelPassport;
    private javax.swing.JLabel jLabelProduct;
    private javax.swing.JLabel jLabelRcount;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAdd;
    public javax.swing.JTextField jTextFieldCID;
    private javax.swing.JTextField jTextFieldFN;
    private javax.swing.JTextField jTextFieldLN;
    private javax.swing.JTextField jTextFieldMN;
    private javax.swing.JTextField jTextFieldMobile;
    // End of variables declaration//GEN-END:variables

String pixpath,Branchcode;
Global glob= new Global();
Connection conn=glob.getConnect();
int count=0;
ResultSet  current;
String ses_date,companyname,compshortname;
}