
package mfbtrans;


//Crystal Java Reporting Component (JRC) imports.
import com.crystaldecisions.report.web.viewer.CrystalReportViewer;
import com.crystaldecisions.sdk.occa.report.application.ReportClientDocument;
import com.crystaldecisions.sdk.occa.report.lib.*;


//Java Imports.
import javax.swing.*;
import org.apache.log4j.BasicConfigurator;

public class JRCViewReport{
	public static  String REPORT_NAME = "FieldPrint.rpt";
	
	public static void launchApplication() {
		
		try {
			BasicConfigurator.configure();	//to correct no appenders could be found error	
                        //////////////////////////////////
    




CrystalReportViewer viewer = new CrystalReportViewer();





	/////////////////////////////////
			//Open report.
			ReportClientDocument reportClientDoc = new ReportClientDocument();
                                                 
			reportClientDoc.open(REPORT_NAME, 0);
			//viewer.setReportSource(reportClientDoc);//set doc as report source
                        
                        
   
                          
			//Launch JFrame that contains the report viewer.
                         
                        ReportViewerFrame RVF=new ReportViewerFrame(reportClientDoc);
                        
			
                        RVF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        RVF.setVisible(true);
			
		}
		catch(ReportSDKException ex) {	
			System.out.println(ex);
		}
		catch(Exception ex) {
			System.out.println(ex);			
		}
		
	}
	public static void main(String [] args) {
	
		//Event-dispatching thread to run Swing GUI.  This is good practice for Swing applications
		//to help ensure that events are dispatched in a predicatable order. 
		//For more information on using this method, refer to the SUN site below for more details:
		//http://java.sun.com/products/jfc/tsc/articles/threads/threads1.html
		SwingUtilities.invokeLater(new Runnable() { 
			public void run() {
				//Hand-off to worker function to start application.
				launchApplication();				
			}
		});
					
	}
	
}