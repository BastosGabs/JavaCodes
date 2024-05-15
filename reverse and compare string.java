import java.io.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
       Scanner sc=new Scanner(System.in);
        String sentence=sc.next();
        /* Enter your code here. Print output to STDOUT. */
                 
      String reversed = 
                    Stream.of(sentence)
                    .map(string-> new StringBuilder(string).reverse())
                    .collect(Collectors.joining());
//             System.out.println("Sentence: "+sentence);
//             System.out.println("Reversed: "+reversed);
            if(sentence.equals(reversed)) {
            System.out.println("Yes");
            }else {
                System.out.println("No");
            }
    }
}


