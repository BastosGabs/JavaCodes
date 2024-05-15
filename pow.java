import java.util.*;
import java.io.*;


//Perform ^ (pow) operations

class Solution {
  public static void main(String[] argh) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int i = 0; i < t; i++) {
      int a = in.nextInt();
      int b = in.nextInt();
      int n = in.nextInt();
      int resp = 0;

      for (int j = 0; j < n; j++) {
        // System.out.printf(" 2^%d ",j);
        // System.out.printf(" *%d ",b);
        resp = (int) ((Math.pow(2, j)) * b);
        // System.out.printf(" = %d%n ",resp);
        for (int y = 0; y < j; y++) {
          resp = resp + (int) ((Math.pow(2, y)) * b);
          // System.out.printf("New = %d%n ",resp);
        }
        resp = resp + a;
        // System.out.printf(" + a(%d) = %d %n",a,resp);
        System.out.printf("%d ", resp);

      }
      // System.out.printf(" (%d) ",a,resp);
      // resp= resp+a;
      // System.out.printf(" + a(%d) = %d %n",a,resp);

      System.out.println();

    }

    in.close();
  }
}