/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfbtrans;

import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Emmanuel Ikpe
 */
public class session extends javax.swing.JFrame {

    /**
     * Creates new form session
     */
    public session() {
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
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabeldt = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabeldt2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBoxproc = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Session");
        setAlwaysOnTop(true);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("End Session"));

        jDateChooser1.setDateFormatString("dd-MM-yyyy");
        jDateChooser1.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jDateChooser1VetoableChange(evt);
            }
        });

        jLabeldt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabeldt.setForeground(new java.awt.Color(51, 0, 153));

        jButton2.setText("verify");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabeldt, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabeldt, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );

        jPanel2.setBackground(new java.awt.Color(204, 0, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Start Session"));

        jDateChooser2.setDateFormatString("dd-MM-yyyy");

        jLabeldt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabeldt2.setForeground(new java.awt.Color(51, 0, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabeldt2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabeldt2, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setText("Run Process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBoxproc.setBackground(new java.awt.Color(102, 0, 102));
        jComboBoxproc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "End/Start Session", "End Session only", "Start Session only" }));
        jComboBoxproc.setBorder(null);
        jComboBoxproc.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBoxproc, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)
                        .addGap(89, 89, 89))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxproc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  String dd=jDateChooser1.getDate().toString();
        String m="";
        if(dd.contains("Jan")){m="01";}
        else if(dd.contains("Feb")){m="02";}
         else if(dd.contains("Mar")){m="03";}
         else if(dd.contains("Apr")){m="04";}
         else if(dd.contains("May")){m="05";}
         else if(dd.contains("Jun")){m="06";}
        else if(dd.contains("Jul")){m="07";}
        else if(dd.contains("Aug")){m="08";}
        else if(dd.contains("Sep")){m="09";}
        else if(dd.contains("Oct")){m="10";}
        else if(dd.contains("Nov")){m="11";}
        else if(dd.contains("Dec")){m="12";}
dt= dd.substring(dd.length()-4)+"-"+m+"-"+dd.substring(8,10);

            
            if(dt.length()<10){dt=dt.substring(0,5)+"0"+dt.substring(5);};// to take care of 01/03/2018
            
  dd=jDateChooser2.getDate().toString();
      
        if(dd.contains("Jan")){m="01";}
        else if(dd.contains("Feb")){m="02";}
         else if(dd.contains("Mar")){m="03";}
         else if(dd.contains("Apr")){m="04";}
         else if(dd.contains("May")){m="05";}
         else if(dd.contains("Jun")){m="06";}
        else if(dd.contains("Jul")){m="07";}
        else if(dd.contains("Aug")){m="08";}
        else if(dd.contains("Sep")){m="09";}
        else if(dd.contains("Oct")){m="10";}
        else if(dd.contains("Nov")){m="11";}
        else if(dd.contains("Dec")){m="12";}
        dt2= dd.substring(dd.length()-4)+"-"+m+"-"+dd.substring(8,10);

            
           // if(dt2.length()<10){dt2=dt2.substring(0,5)+"0"+dt2.substring(5);};// to take care of 01/03/2018
            
       // JOptionPane.showMessageDialog(rootPane, dt +" and "+dt2);
        SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
try{
    Global glob = new Global();
    Connection conn = glob.getConnect();
    PreparedStatement psmst=conn.prepareStatement("update company set Ses_date='"+dt2+"'");
    psmst.executeUpdate();
    
if(jComboBoxproc.getSelectedItem().toString().equalsIgnoreCase("End/Start Session")) {
  ses_date=dt2; 
  String command="cmd /C date "+ses_date;
  //Runtime rt = Runtime.getRuntime();
  SetSystemDate SSD= new SetSystemDate();
  short yr=2019;
  short month=8;
  short day=5;
  
  //SSD.SetLocalTime(yr,month,day);
  try {
     //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       //     String value = "2019-12-12 00:26:14";
         //   Date date = dateFormat.parse(value);
         //   value = dateFormat.format(date);
          //  final Process dateProcess = Runtime.getRuntime().exec("cmd /c date "+value.substring(0, value.lastIndexOf(' ')));
          //  dateProcess.waitFor();
          //  dateProcess.exitValue();
           // Calendar cal = Calendar.getInstance();
//cal.add(Calendar.DATE, 1);
//SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");    
//String strExpectedDate = s.format(new Date(cal.getTimeInMillis()));
//Runtime rt = Runtime.getRuntime();
//Process p=rt.exec("runas /user:Administrator/root cmd /C date " + strExpectedDate);

        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
//rt.exec("elevate.cmd cmd.exe /C date 02-08-2019");
//Runtime.getRuntime().exec("runas /profile /user:local/System.getProperty("user.name") /savecred  cmd /C date " + ses_date); // dd-MM-yyyy
//Runtime.getRuntime().exec("cmd /C time " + strTimeToSet); // hh:mm:sscommand
}
else if(jComboBoxproc.getSelectedItem().toString().equalsIgnoreCase("End Session only")) {
 ses_date=dt2;  
}
else if(jComboBoxproc.getSelectedItem().toString().equalsIgnoreCase("Start Session only")) {
    try {
           Runtime.getRuntime().exec(" cmd CD C:\\WINDOWS\\system32");
            Runtime.getRuntime().exec("runas /profile /user:Administrator /savecred cmd /C date " + ses_date); // dd-MM-yyyy
//Runtime.getRuntime().exec("cmd /C time " + strTimeToSet); // hh:mm:ss
        } catch (IOException ex) {
            JOptionPane.showMessageDialog( this, ex.getMessage());
        }
   ses_date=dt2;
}
   
//jLabeldt.setText(datedesc);
JOptionPane.showMessageDialog(rootPane, "New Session started successfully");
}
catch(HeadlessException |SQLException e){JOptionPane.showMessageDialog(rootPane, e.getMessage());}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jDateChooser1VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jDateChooser1VetoableChange
      // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1VetoableChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new session().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxproc;
    public com.toedter.calendar.JDateChooser jDateChooser1;
    public com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabeldt;
    private javax.swing.JLabel jLabeldt2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
String dt,dt2;
String ses_date,companyname,compshortname;
}
