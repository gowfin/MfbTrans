/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfbtrans;

import java.io.File;

/**
 *
 * @author Emma
 */
public class Mp3filter extends javax.swing.filechooser.FileFilter{

    @Override
    public boolean accept(File file) {
       return file.isDirectory()||file.getAbsolutePath().endsWith(".jpg")||file.getAbsolutePath().endsWith(".JPG")||file.getAbsolutePath().endsWith(".png"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescription() {
        return "Picture Files(*.jpg,*.png)"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
