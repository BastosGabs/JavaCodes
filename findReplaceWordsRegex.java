package palindrome;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findReplaceWordsRegex {

		    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
		    	 Scanner scan = new Scanner(System.in);
		         //System.out.println("ini");
		          int counter = scan.nextInt();
		        // System.out.println("counter");
		          System.out.println(counter);
		          scan.nextLine();
		          while (scan.hasNextLine()){
		          //    System.out.println("entrou");
		             String phrase = scan.nextLine();
		             phrase = findWord(phrase);
		             // counter=counter--;
		             System.out.println(phrase);
		          }
	        //String phrase = "I love Love to To tO code";
	       // System.out.println(phrase);
	        //phrase = findWord(phrase);
	        //System.out.println(phrase);
	       scan.close();
	    }

				private static String findWord(String phrase) {
				// TODO Auto-generated method stub
				System.out.println(phrase);
				Pattern pattern = Pattern.compile("\\b(\\w+)(?:\\W+\\1\\b)+",Pattern.CASE_INSENSITIVE);
				Matcher match = pattern.matcher(phrase);
				while(match.find()) {
					phrase = phrase.replaceAll(match.group(), match.group(1));
				}
				
				return phrase;
				
			}
	}

