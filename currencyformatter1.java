import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        
        scanner.close();

        // Write your code here.
        //Get currency instance
        NumberFormat nF
            = NumberFormat
                .getCurrencyInstance();
         
         
                //Set currency to:
          String us = nF
          .getCurrencyInstance(Locale.US)
          .format(payment); 
          
                  
        String china = nF
          .getCurrencyInstance(Locale.CHINA)
          .format(payment);
          
          String france = nF
          .getCurrencyInstance(Locale.FRANCE)
          .format(payment);
        
           
          Locale INDIA = new Locale("en","IN");
          
          String india =
         nF.getCurrencyInstance(INDIA)
         .format(payment);
         
            
       System.out.println("US: " + us);
       System.out.println("India: " + india);
       System.out.println("China: " + china);
       System.out.println("France: " + france);
    }
    



}

