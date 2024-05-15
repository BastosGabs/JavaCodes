import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scan = new Scanner(System.in);
    
    while (scan.hasNext()){
        System.out.println(MyRegex(scan.nextLine()));
     }
//IP address is a string in the form "A.B.C.D", 
//where the value of A, B, C, and D may range from 0 to 255. 
//Leading zeros are allowed. 
//The length of A, B, C, or D can't be greater than 3.

// String a = "123.123.123.123";
// String b = "666.666.23.23";
// String c = ".213.123.23.32";
// String d = "I.Am.not.an.ip";

// System.out.println(MyRegex(a));
// System.out.println(MyRegex(b));
// System.out.println(MyRegex(c));
// System.out.println(MyRegex(d));

}
private static boolean MyRegex(String text){

 Pattern pattern = Pattern.compile("\\b(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-2]?[0-5][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[01]?[0-9][0-9]?)\\b");
  Matcher matcher = pattern.matcher(text);
   return matcher.matches();
    
}
}