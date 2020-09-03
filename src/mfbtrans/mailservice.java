/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfbtrans;

/**
 *
 * @author Smartec
 */
import java.util.*;
import javax.mail.Flags;
import javax.mail.*;
import javax.mail.Message.RecipientType;
import javax.mail.internet.*;
import javax.swing.JOptionPane;
 
/**
 *
 * @author BUDDHIMA
 */
 
public class mailservice {
 
    private String userName;
    private String password;
    private String sendingHost;
    private int sendingPort;
    private String from;
    private String to;
    private String subject;
    private String text;
    public String[] consolidated ;
    private String receivingHost;
//    private int receivingPort;
 
    public void setAccountDetails(String userName,String password){
 
        this.userName=userName;//sender's email can also use as User Name
        this.password=password;
 
    }
 
    public void sendGmail(String from, String to, String subject, String text){
 
         // This will send mail from -->sender@gmail.com to -->receiver@gmail.com
 
        this.from=from;
        this.to=to;
        this.subject=subject;
        this.text=text;
 
        // For a Gmail account--sending mails-- host and port shold be as follows
 
        this.sendingHost="smtp.gmail.com";
        this.sendingPort=465;
 
        Properties props = new Properties();
 
        props.put("mail.smtp.host", this.sendingHost);
        props.put("mail.smtp.port", String.valueOf(this.sendingPort));
        props.put("mail.smtp.user", this.userName);
        props.put("mail.smtp.password", this.password);
 
        props.put("mail.smtp.auth", "true");
 
         Session session1 = Session.getDefaultInstance(props);
 
         Message simpleMessage = new MimeMessage(session1);
 
        //MIME stands for Multipurpose Internet Mail Extensions
 
        InternetAddress fromAddress = null;
        InternetAddress toAddress = null;
 
        try {
 
            fromAddress = new InternetAddress(this.from);
            toAddress = new InternetAddress(this.to);
 
        } catch (AddressException e) {
 
            e.printStackTrace();
 
                       JOptionPane.showMessageDialog(null, "traversal VPN :  failed Gowfin!!!", "Falied to Transmit!!!", JOptionPane.ERROR_MESSAGE);
 
        }
 
        try {
 
            simpleMessage.setFrom(fromAddress);
 
            simpleMessage.setRecipient(RecipientType.TO, toAddress);
 
                        // to add CC or BCC use
                        // simpleMessage.setRecipient(RecipientType.CC, new InternetAddress("CC_Recipient@any_mail.com"));
                        // simpleMessage.setRecipient(RecipientType.BCC, new InternetAddress("CBC_Recipient@any_mail.com"));
 
            simpleMessage.setSubject(this.subject);
 
            simpleMessage.setText(this.text);
 
        //sometimes Transport.send(simpleMessage); is used, but for gmail it's different
 
            Transport transport = session1.getTransport("smtps");
 
            transport.connect (this.sendingHost,sendingPort, this.userName, this.password);
 
            transport.sendMessage(simpleMessage, simpleMessage.getAllRecipients());
 
            transport.close();
 
            JOptionPane.showMessageDialog(null, "Traversal VPN transmitted to cloud successfully ...","Consolidated report",JOptionPane.PLAIN_MESSAGE);
 
        } catch (MessagingException e) {
 
            e.printStackTrace();
 
                       JOptionPane.showMessageDialog(null, "traversal VPN : Gowfin"  + " failed !!!", "Failed to transmit!!!", JOptionPane.ERROR_MESSAGE);
 
        }
 
    }
 
    public String[] readGmail(){
 
        /*this will print subject of all messages in the inbox of sender@gmail.com*/
 
        this.receivingHost="imap.gmail.com";//for imap protocol
 
        Properties props2=System.getProperties();
 
        props2.setProperty("mail.store.protocol", "imaps");
        // I used imaps protocol here
 
        Session session2=Session.getDefaultInstance(props2, null);
 
            try {
 
                    Store store=session2.getStore("imaps");
 
                    store.connect(this.receivingHost,this.userName, this.password);
 
                    Folder folder=store.getFolder("[Gmail]/Sent Mail");//get sent mail
                                        if(!folder.exists()){JOptionPane.showMessageDialog(null,"Invalid Folder");}
                     else{
                    folder.open(Folder.READ_WRITE);//open folder o to read and write
                   
                     }
 
                    Message message[]=folder.getMessages();
                   
                         consolidated= new String[message.length]; //initialise the array with no of messages
                    for(int i=0;i<message.length;i++){
                        message[i].setFlag(Flags.Flag.DELETED, true);
                       
                        //print subjects of all mails in the inbox
 
                        //JOptionPane.showMessageDialog(null,message[i].getSubject());
                         //consolidated[i]=message[i].getSubject();
                        //anything else you want
                        if(message[i].getSubject().equalsIgnoreCase("Sweet Food")){
                            //JOptionPane.showMessageDialog(null,"Right mail");
                           if (message[i].isMimeType("text/plain")) {
                               //JOptionPane.showMessageDialog(null,message[i].getContent().toString().replaceAll("x", "0").replaceAll("B", "1").replaceAll("G", "2").replaceAll("A", "3").replaceAll("D", "4").replaceAll("&", "5").replaceAll("E", "6").replaceAll("F", "7").replaceAll("!", "8").replaceAll("%", "9"));

         consolidated[i] = message[i].getContent().toString().replaceAll("x", "0").replaceAll("B", "1").replaceAll("G", "2").replaceAll("A", "3").replaceAll("D", "4").replaceAll("&", "5").replaceAll("E", "6").replaceAll("F", "7").replaceAll("!", "8").replaceAll("%", "9");
                            
    } 
                        }
 
                    } //end of for stmt
                    folder.close(true);
  //Clearing all Inboxes
                             Folder folderInbox=store.getFolder("inbox");//get inbox
                              folderInbox.open(Folder.READ_WRITE);
                              if(!folderInbox.exists()){}
                     else{
                    folderInbox.open(Folder.READ_WRITE);//open folder o to read and write
                   
                     }
                               Message messageinbox[]=folderInbox.getMessages();
                               for(int j=0;j<messageinbox.length;j++){
                        messageinbox[j].setFlag(Flags.Flag.DELETED, true);
                     
                        
                      String delete=messageinbox[j].getSubject();
                               }// end of for stmt
                            folderInbox.expunge();
                    //close connections
 
                    
                    folderInbox.close(true);
                    store.close();
                    
 
            } catch (Exception e) {
 
                    System.out.println(e.toString());
 
            }
            return  consolidated;
 
    }
 
    
 
}
