/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfbtrans;

/**
 *
 * @author Administrator
 */
public class MonthToWords {
  public String MonthToWords(int month) {
      //check if the loan expand to next year
  if(month>12){month=month-12;}
  //end of check 
   if(month==1){monthInWords="January";}

else if(month==2){monthInWords="February";}

else if(month==3){monthInWords="March";}

else if(month==4){monthInWords="April";}

else if(month==5){monthInWords="May";}
else if(month==6){monthInWords="June";}
else if(month==7){monthInWords="July";}
else if(month==8){monthInWords="August";}
else if(month==9){monthInWords="September";}

else if(month==10){monthInWords="October";}

else if(month==11){monthInWords="November";}

else if(month==12){monthInWords="December";}


   return monthInWords;   
  } 
  String monthInWords;
}
