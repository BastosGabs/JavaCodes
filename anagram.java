

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Solution {


    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();
        b=b.toLowerCase();
        //System.out.println(a);
       // System.out.println(b);
        String[] aSplit= a.split("");
        String[] bSplit= b.split("");
        
        ArrayList<String> first = new ArrayList<String>(Arrays.asList(aSplit));
        ArrayList<String> second = new ArrayList<String>(Arrays.asList(bSplit));
        ArrayList<String> aux = new ArrayList<String>(Arrays.asList(bSplit));
        ListIterator<String> firstIterator = first.listIterator();
        ListIterator<String> secondIterator = aux.listIterator();
       // second.remove(first.get(0));
        while(firstIterator.hasNext()){
            second.remove(firstIterator.next());
            }
        //first.remove(aux.get(0));
        while(secondIterator.hasNext()){
            first.remove(secondIterator.next());
            }
        
        //second.remove(firstIterator);
      //  System.out.println(first);
     //   System.out.println(second);
        
        if (first.isEmpty() && second.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

