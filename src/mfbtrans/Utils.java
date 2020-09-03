/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfbtrans;

import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author Emmanuel
 */
public class Utils {
  public final static String jpeg="jpeg";  
  public final static String jpg="jpg"; 
  public final static String gif="gif"; 
  public final static String tiff="tiff"; 
  public final static String tif="tif"; 
  public final static String png="png"; 
  //get the extension of file
  public static String  getExtension(File f){
      String ext =null;
      String s=f.getName();
      int i=s.lastIndexOf('.');
      if(i>0 && i<s.length()-1){
          ext=s.substring(i+1).toLowerCase();
      }
      return ext;
  }
  //returns an image icon, or null if the path was invalid
  protected static ImageIcon createImageIcon(String path){
      java.net.URL imgURL=Utils.class.getResource(path);//get the thumbnail
      if(imgURL != null){
      return new ImageIcon(imgURL);
  }
  else{
   System .err.println("Couldn't find file: "+path);
   return null;
  }
}
}
