/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfbtrans;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author LAPO MFB
 */
public class AttributiveCellRenderer extends JLabel  implements
TableCellRenderer {
    public AttributiveCellRenderer() {
    setOpaque(true);
  }
    
    public Component getTableCellRendererComponent(JTable table, Object
value,
                 boolean isSelected, boolean hasFocus, int row, int
column) {
       
       if(  column == 2 )
       {
         if (value.toString().startsWith("-")) { 
               
          this.setForeground(Color.red);
          //this.setBackground(Color.blue);
          //JOptionPane.showMessageDialog(this, val);
         }  
           
       }
       else
       {
          //this.setBackground(Color.cyan);
          this.setForeground(Color.darkGray);
       }
        //String aStr = "Row " + row+ "Column"+column;
        //this.setText(aStr);
        if(value==null)
        {value=0;} else {
            this.setText(value.toString());
        }
        if (isSelected && value.toString().isEmpty()) {
        table.changeSelection(0, 0, false, false);
      }else if (isSelected ) {
        setBackground(table.getSelectionBackground());
      }
        else {
        setBackground(table.getBackground());}
        
        
        //stop enter from scrowing next
        table.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "Enter");
    table.getActionMap().put("Enter", new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            //do something on JTable enter pressed
        }
    }); //end of stoping enter
       
    return this;
  }
    
}
