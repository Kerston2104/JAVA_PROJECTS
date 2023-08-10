// Write a program that replaces two or more consecutive blanks in a string by a single
// blank. For example, if the input is
// Welcome to Java Programming !!
// the output should be
// Welcome to Java Programming !!

//procedure;
// 1. Ask for a string from the user and store it in 'input'.
// 2. Create an empty string called 'output'.
// 3. For each character 'ch' in 'input':
// 4. If 'ch' is not a blank or the last character is not a blank, add 'ch' to 'output'.
// 5. Display the 'output' string, which contains consecutive blanks replaced by a single blank.


package java_projects_3;

import java.util.Scanner;

public class EX_NO6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string:");
        String input = scanner.nextLine();

        String result = replaceConsecutiveBlanks(input);
        System.out.println("Output: " + result);
    }

    public static String replaceConsecutiveBlanks(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ' || (i > 0 && input.charAt(i - 1) != ' ')) {
                output.append(ch);
            }
        }
        return output.toString();
    }
}