	import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
	class stringbalanced{

			public static void main(String []argh)
			{

				String input = "{}";
					char[] trys = input.toCharArray();
					System.out.println(isBalanced(trys));
			
			}

			private static boolean isBalanced(char[] trys) {
				Deque<Character> expression = new ArrayDeque<Character>();
				
				for (int i = 0; i < trys.length; i++) {
					char att = trys[i];
					if (att== '(' ||att== '[' || att== '{' ) {
					expression.push(att);
					}else {
						if (expression.isEmpty()){
					return false;
							}
						char top = expression.pop();
						if (att==')'&& top!='(' || att==']'&& top!='[' || att=='}'&& top!='{') {
							return false;
						}
					}
				}
			
				return expression.isEmpty();
			}
				
			}



// 			A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

// Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

// Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

// Given a string, determine if it is balanced or not.

// Input Format

// There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.

// The part of the code that handles input operation is already provided in the editor.

// Output Format

// For each case, print 'true' if the string is balanced, 'false' otherwise.

// Sample Input

// {}()
// ({()})
// {}(
// []
// Sample Output

// true
// true
// false
// true