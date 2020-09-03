/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfbtrans;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.image4j.codec.bmp.BMPDecoder;

/**
 *
 * @author Emmanuel Ikpe
 */
public class CusAcc extends javax.swing.JFrame {

    /**
     * Creates new form GLACC
     */
    public CusAcc() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextFieldAcc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxGLcode = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jProgressBarLoad = new javax.swing.JProgressBar();
        jButton2 = new javax.swing.JButton();
        jLabelStatus = new javax.swing.JLabel();
        jLabelpix = new javax.swing.JLabel();
        jLabelsign = new javax.swing.JLabel();
        jLabeltitle = new javax.swing.JLabel();
        jLabelphone = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSched = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SAVING PRODUCT STATEMENT");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel2FocusGained(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.pink));

        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jDateChooser1.setDoubleBuffered(false);

        jDateChooser2.setDateFormatString("dd/MM/yyyy");

        jLabel1.setText("Date From");

        jLabel2.setText("Date To");

        jLabel3.setText("Branch");

        jLabel4.setText("General ledger Number");

        jTextField1.setEditable(false);
        jTextField1.setText("Ohafia");

        jTextFieldAcc.setText("1");

        jLabel5.setText("Account Number");

        jComboBoxGLcode.setMaximumSize(new java.awt.Dimension(300, 300));
        jComboBoxGLcode.setPreferredSize(new java.awt.Dimension(300, 300));
        jComboBoxGLcode.setPrototypeDisplayValue("short");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Load");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                                .addComponent(jLabel5)
                                .addGap(49, 49, 49)
                                .addComponent(jTextFieldAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(23, 23, 23)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxGLcode, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel2)))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxGLcode, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabelStatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelStatus.setForeground(new java.awt.Color(153, 0, 51));

        jLabelpix.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));

        jLabelsign.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabeltitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabeltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeltitle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelphone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelphone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextAreaSched.setEditable(false);
        jTextAreaSched.setColumns(20);
        jTextAreaSched.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSched);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelphone, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabeltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jButton2))
                            .addComponent(jLabelpix, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBarLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabelsign, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jProgressBarLoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelsign, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelpix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabeltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelphone, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         //get openning Balances:
//String Glcode=jComboBoxGLcode.getSelectedItem().toString().substring(0,6);
BigDecimal LastYrOpenBal=BigDecimal.ZERO;
String sqlaccinfo="select Lastname,middlename,firstname,ref_no,pix,sign,phone,homeaddress,groupid,email,BVN,custno,NUBAN,status from clients " +
" where custno='"+jTextFieldAcc.getText()+"'" ;

 
    
         
         String Heading="",Gap;
              Gap="\t \t \t \t \t \t  ";
             Heading=String.format("%1s","Trx Date")+String.format("%20s","Value Date")+"\t Trx no."+String.format("%35s","  Description")+String.format("%20s","\t Debit")+String.format("%20s","Credit")+String.format("%30s","Balance");
        
        
        conn=glob.getConnect();
        
        //getting Date
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
String dtt= dd.substring(dd.length()-4)+"-"+m+"-"+dd.substring(8,10);
String Cyear=dd.substring(dd.length()-4);
String Cday=dd.substring(8,10);
String Cmonth=m;
if(dtt.length()<10){dtt=dtt.substring(0,5)+"0"+dtt.substring(5);};// to take care of 01/03/2018
//getting second date
 dd=jDateChooser2.getDate().toString();
        String m2="";
        if(dd.contains("Jan")){m2="01";}
        else if(dd.contains("Feb")){m2="02";}
         else if(dd.contains("Mar")){m2="03";}
         else if(dd.contains("Apr")){m2="04";}
         else if(dd.contains("May")){m2="05";}
         else if(dd.contains("Jun")){m2="06";}
        else if(dd.contains("Jul")){m2="07";}
        else if(dd.contains("Aug")){m2="08";}
        else if(dd.contains("Sep")){m2="09";}
        else if(dd.contains("Oct")){m2="10";}
        else if(dd.contains("Nov")){m2="11";}
        else if(dd.contains("Dec")){m2="12";}
String dtt2= dd.substring(dd.length()-4)+"-"+m2+"-"+dd.substring(8,10);
String Glno=jComboBoxGLcode.getSelectedItem().toString().substring(0,5);
//JOptionPane.showMessageDialog(rootPane, Glno);
String Glcode=jTextFieldAcc.getText();
if(dtt2.length()<10){dtt=dtt2.substring(0,5)+"0"+dtt2.substring(5);};// to take care of 01/03/2018

         double bal=0.00,Drbal=0.00,Crbal=0.00;
            String query,line,OpenBalS,RecNoList="1";
            BigDecimal OpenBal;
            line="_______________________________________________________________________________________________________________________________________________";
               String BBF=   "select  CONVERT(Numeric(10,2), case amount when '' then '0' else amount end)  Amt from transactn " +
" where valuedate>='"+Cyear+"-01-01 00:00:00.000'  and    valuedate<'"+Cyear+"-"+Cmonth+"-"+Cday+" 00:00:00.000'  and (CreditGL='"+Glcode+"' or DebitGL='"+Glcode+"')";                   
 
 String sp2="\t \t",sp1="\t";  
      jProgressBarLoad.setVisible(true);
       jProgressBarLoad.setMaximum(35);
        jTextAreaSched.setText(" \t \t \t  "+compshortname+"\n                            \t \t \t Ogoja  \n            \n             \t \t \t     ACCOUNT STATEMENT  \n \n "+" \t \t REPORTING DATE FROM: "+dtt.substring(8)+"/"+dtt.substring(5,7)+"/"+dtt.substring(0,4)+
" TO: "+dtt2.substring(8)+"/"+dtt2.substring(5,7)+"/"+dtt2.substring(0,4)+"\n "
                + "\n PRODUCT: "+ jComboBoxGLcode.getSelectedItem().toString().substring(7));
       // jTextAreaSched.setText(jTextAreaSched.getText());
      
            
  String BVN,title,nuban,accno,status,cusno,addr,ref,phone,Str;
                  try{
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                ResultSet current = stmt.executeQuery(sqlaccinfo);
                 current.next();
                 title=current.getString("lastname")+" "+current.getString("middlename")+" "+current.getString("firstname");
                 cusno=current.getString("custno");
                 BVN=current.getString("BVN");
                accno=current.getString("custno");
                nuban=current.getString("nuban");
                ref=current.getString("ref_no");
                phone=current.getString("phone");
                addr=current.getString("homeaddress");
                status=current.getString("status");
                              
                Str="BANK VERIFICATION NO: "+BVN+"\n ACCOUNT TITLE: "+title+"\n NUBAN Code: "+nuban+"\n ACCOUNT NUMBER: "+accno+"\n ACCOUNT STATUS: "+status+"\n ADDRESS: "+addr+"\n REFERENCE NO: "+ref;
                 jTextAreaSched.setText(jTextAreaSched.getText()+"\n"+Str+"\n"+line+"\n"+Heading);
                 current = stmt.executeQuery(BBF);
                 current.next();
                 OpenBal=BigDecimal.ZERO;
                 if(current.getInt("Amt")>0){
                 current = stmt.executeQuery(BBF);
                
                 current.next();
            OpenBal=current.getBigDecimal("Amt").add(LastYrOpenBal); //where LastYrOpenBal is the last year opening bal 
                             }
                 
             //OpenBalS=thseparate(OpenBal.setScale(2, RoundingMode.HALF_UP))+"";
            if(OpenBal.doubleValue()<0.00){OpenBalS="("+zeroes(thseparate(OpenBal.abs()))+" CR)"; } else{OpenBalS=zeroes(thseparate(OpenBal))+" DR";}
            bal=OpenBal.doubleValue();
          jTextAreaSched.setText(jTextAreaSched.getText()+"\n"+"\t \t \t \t \t \t "+"Balance Brought Forward: \t"+OpenBalS+"\n");
 //JOptionPane.showMessageDialog(rootPane, Glcode+": "+ LastYrOpenBal+" : "+OpenBalS);
                
                int c=0;
                 
this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

                       query="select distinct TranID num,AccountID,CreditGL,CONVERT(Numeric(10,2), case amount when '' then '0' else amount end) amount ,DebitGL,StmtRef,DateProcessing,valuedate,RunningBal from transactn" +
" where dateProcessing>='"+dtt+" 00:00:00.000'  and    dateProcessing<='"+dtt2+" 00:00:00.000'  and (CreditGL like'"+Glno+"%' or DebitGL like'"+Glno+"%') and custno="+cusno;                   

                  current = stmt.executeQuery(query);

 String Balan="";         
                int i=0;
                String DateFmt="",DateFmt2="",textCtr="";
                while(current.next()){
                    
                    
                    jProgressBarLoad.setValue(i);
                    //JOptionPane.showMessageDialog(rootPane, current.getString("text").substring(0,20).trim().length()+","+current.getString("cheque").trim().length());
                   
                  
                    //format the Date 
                  DateFmt=  current.getString("dateProcessing").substring(0,10);
                  DateFmt2=  current.getString("dateProcessing").substring(0,10);

                  DateFmt=DateFmt.substring(8)+"/"+DateFmt.substring(5,7)+"/"+DateFmt.substring(0,4);
                  DateFmt2=DateFmt2.substring(8)+"/"+DateFmt2.substring(5,7)+"/"+DateFmt2.substring(0,4);

                    if(current.getDouble("amount")>0.00){
                        bal=bal+current.getDouble("amount");
                        Crbal=Crbal+Math.abs(current.getDouble("amount"));
                      if(bal>0){
                           Balan=thseparate(BigDecimal.valueOf(Math.abs(bal)).setScale(2, RoundingMode.HALF_UP)); 
                              Balan=zeroes(Balan)+" DR";///adding decimal 00 ending
                        }else{
                           Balan="("+thseparate(BigDecimal.valueOf(Math.abs(bal)).setScale(2, RoundingMode.HALF_UP));
                           Balan=zeroes(Balan)+".00 CR)";///adding decimal 00 ending
                           //Crbal=Crbal+Math.abs(current.getDouble("amount"));
                        } 
                     
                    jTextAreaSched.setText(jTextAreaSched.getText()+"\n"+String.format("%1$10s", DateFmt).trim()+sp1+String.format("%1$10s", DateFmt2).trim()+sp1+String.format("%1$8s",current.getString("num").trim())+sp1+String.format("%1$20s",current.getString("StmtRef"))+sp1+String.format("%1$3s", thseparate(current.getBigDecimal("amount").setScale(2, RoundingMode.HALF_UP).abs())).trim()+sp1+String.format("%1$10s", "0.00").trim()+sp1+Balan+"\n");

                   }else if(current.getDouble("amount")<0.00){
                        bal=bal+current.getDouble("amount");
                        Drbal=Drbal+Math.abs(current.getDouble("amount"));
                        if(bal>0.00){
                           Balan=thseparate(BigDecimal.valueOf(Math.abs(bal)).setScale(2, RoundingMode.HALF_UP)); 
                             if(!Balan.contains(".")){Balan=Balan+".00 DR";}///adding decimal 00 ending
                        }else{
                           Balan="("+thseparate(BigDecimal.valueOf(Math.abs(bal)).setScale(2, RoundingMode.HALF_UP));
                            if(!Balan.contains(".")){Balan=Balan+".00 CR)";}///adding decimal 00 ending
                        }
                                              jTextAreaSched.setText(jTextAreaSched.getText()+"\n"+String.format("%1$10s", DateFmt).trim()+sp1+String.format("%1$10s", DateFmt2).trim()+sp1+String.format("%1$8s",current.getString("num")).trim()+sp1+String.format("%1$20s",textCtr.toUpperCase().trim())+sp1+String.format("%1$3s", "0.00").trim()+sp1+String.format("%1$10s", thseparate(current.getBigDecimal("amount").setScale(2, RoundingMode.HALF_UP).abs())).trim()+sp1+Balan+"\n");

                       
                    }
                  i=i+1;                
 
                }
                String formattedBal="";
               jTextAreaSched.setText(jTextAreaSched.getText()+"\n"+line);
               jTextAreaSched.setText(jTextAreaSched.getText()+"\n"+Gap+zeroes(thseparate(BigDecimal.valueOf(Crbal).setScale(2,RoundingMode.HALF_UP)))+"\t"+zeroes(thseparate(BigDecimal.valueOf(Drbal).setScale(2,RoundingMode.HALF_UP))));
               if(bal<0.00){ 
             formattedBal=zeroes(thseparate(BigDecimal.valueOf(Math.abs(bal)).setScale(2, RoundingMode.HALF_UP)))+" CR";

                   jTextAreaSched.setText(jTextAreaSched.getText()+"\n"+"Total: "+i+"\t \t"+"Balance As At Reporting Date: \t \t"+formattedBal+" \n \n \n");
}
               else{
                                formattedBal=zeroes(thseparate(BigDecimal.valueOf(Math.abs(bal)).setScale(2, RoundingMode.HALF_UP)))+" DR";

               jTextAreaSched.setText(jTextAreaSched.getText()+"\n"+"Total: "+i+"\t \t"+"Balance As At Reporting Date:"+formattedBal+" DR \n \n \n");
               }
               current = stmt.executeQuery("select pix,sign from clients where custno="+cusno);
               current.next();
              // JOptionPane.showMessageDialog(rootPane,current.getString("sign") );
               if(current.getString("sign").startsWith("FFD")){
               
               byte[] fileBytes=current.getBytes("pix");
               ImageIcon pic=new ImageIcon(fileBytes);
     Image resizpic =pic.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
     ImageIcon resizIcon = new ImageIcon(resizpic);
   
    jLabelpix.setIcon(resizIcon);
         byte[] fileBytes2=current.getBytes("sign");
               ImageIcon sign=new ImageIcon(fileBytes2);
     Image resizpic2 =sign.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
     ImageIcon resizIcon2 = new ImageIcon(resizpic2);
           
            jLabelsign.setIcon(resizIcon2);   
               }
               else{
               String pixpath="\\\\Omfbserver\\e\\FinSolutions\\Photos\\"+current.getString("pix");
               String pixpath2="\\\\Omfbserver\\e\\FinSolutions\\Signature\\"+current.getString("sign");
               //checking for extension for signature
               if(pixpath2.contains(".bmp")||pixpath2.contains(".BMP")){
             
             BufferedImage image = BMPDecoder.read(new File(pixpath2));//signature
                    ImageIcon icon = new ImageIcon(image.getScaledInstance(100,100, Image.SCALE_SMOOTH));//signature
                  jLabelsign.setIcon(icon);//signature
                       //JOptionPane.showMessageDialog(this,current.getString("sphoto")+" and "+pixpath);
              }
              else{
               ImageIcon imageIconsign = new ImageIcon(new ImageIcon(pixpath2).getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH));//signature
               jLabelsign.setIcon(imageIconsign);//signature
                   }
              //check for file extension for photo
              if(pixpath.contains(".bmp")||pixpath.contains(".BMP")){
             
             BufferedImage image = BMPDecoder.read(new File(pixpath));//photo
                    ImageIcon icon = new ImageIcon(image.getScaledInstance(100,100, Image.SCALE_SMOOTH));//photo
                  jLabelpix.setIcon(icon);//photo
                       //JOptionPane.showMessageDialog(this,current.getString("sphoto")+" and "+pixpath);
              }
              else{
               ImageIcon imageIcon = new ImageIcon(new ImageIcon(pixpath).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));//photo
               jLabelpix.setIcon(imageIcon);//photo
                   }
               }
               jLabelStatus.setText("Completed");
               jLabeltitle.setText(title.trim()+"["+formattedBal+"]");
                jLabelphone.setText(phone);
               current.close();
                conn.close();
                //jProgressBarLoad.setVisible(false);
                this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                Font font = new Font("Verdana", Font.BOLD, 8);
        this.setFont(font);
        this.pack();
            }
            catch(Exception e){ JOptionPane.showMessageDialog(this,e.getMessage());
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));}
            
        
       
                                           

                                          
      

         
        
   
        
    
              
        
      
     
        
        
         
       

         
          

           // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//jTextAreaSched.setContentType("text/html");
     jProgressBarLoad.setVisible(false);    
Calendar now=Calendar.getInstance();

SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
 // JOptionPane.showMessageDialog(rootPane, now.getTime().toString());
  
        Date dt =new Date(sdf.format(now.getTime()).toString());
        jDateChooser1.setDate(dt);
        jDateChooser2.setDate(dt);
       String query="select glcode,productid from product where producttype='Savings'" +
" order by glcode";
       conn=glob.getConnect();
        try{
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                ResultSet current = stmt.executeQuery(query);

          
            
                while(current.next()){
jComboBoxGLcode.addItem(current.getString("glcode")+"|"+current.getString("productid"));
                  
                }
               
                current.close();
                conn.close();
            }
            catch(Exception e){ JOptionPane.showMessageDialog(this,e.getMessage());}
         
    }//GEN-LAST:event_formWindowOpened

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
if(jLabelStatus.getText().equalsIgnoreCase("Completed")){jLabelStatus.setText("");jProgressBarLoad.setVisible(false);}
else {jLabelStatus.setText("Loading..."); jProgressBarLoad.setVisible(true);jProgressBarLoad.setValue(1);}       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jPanel2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel2FocusGained
jProgressBarLoad.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2FocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           PrinterJob job = PrinterJob.getPrinterJob();
        PageFormat format=job.defaultPage();
        format.setOrientation(PageFormat.PORTRAIT);
        Paper paper =new Paper(); //to set paper margin
        double margin=2.5;
        paper.setImageableArea(margin, margin, paper.getWidth()-margin*1, paper.getHeight()-margin*1);
        format.setPaper(paper);
        Font font = new Font("Verdana", Font.BOLD, 8);
            jTextAreaSched.setFont(font);
            String footer = " Page - {0}";
        job.setPrintable(jTextAreaSched.getPrintable(new MessageFormat("GL Report"), new MessageFormat(footer)),format);
   boolean ok =job.printDialog();
            if(ok){
        try {
            
           job.print();// TODO add your handling code here:
        } catch (PrinterException ex) {
         JOptionPane.showMessageDialog(this, ex.getMessage()); 
        }
            }
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
            java.util.logging.Logger.getLogger(CusAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CusAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CusAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CusAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CusAcc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxGLcode;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelphone;
    private javax.swing.JLabel jLabelpix;
    private javax.swing.JLabel jLabelsign;
    private javax.swing.JLabel jLabeltitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBarLoad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaSched;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldAcc;
    // End of variables declaration//GEN-END:variables
    Global glob = new Global();
     String ses_date,companyname,compshortname;   
   Connection conn=glob.getConnect();
   public String zeroes(String Amount){
   if(!Amount.contains(".")){Amount=Amount+".00";}///adding decimal 00 ending
       return Amount;
   }
 public BigDecimal openbal(String Glcode){
      BigDecimal openbal=BigDecimal.ZERO;
      
  return openbal;   
 }
 public String thseparate(BigDecimal amount){
 DecimalFormat formatter = (DecimalFormat) NumberFormat.getInstance(Locale.US);
DecimalFormatSymbols symbols = formatter.getDecimalFormatSymbols();

symbols.setGroupingSeparator(',');
formatter.setDecimalFormatSymbols(symbols);
return formatter.format((amount));    
 }
}