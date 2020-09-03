/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfbtrans;

/**
 *
 * @author chichi
 */
public class dayth {
public String dayth(int day){

if(day==1||day==21||day==31){th="ST";}
else if (day==2||day==22){th="ND";}
else if (day==3||day==23){th="RD";}
else{th="TH";}
return th;
} 
String th;
}
