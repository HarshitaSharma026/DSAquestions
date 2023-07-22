package StringProblem;

import java.util.Arrays;

public class GoalParser {
    public static void main(String[] args) {
        String str = "G()()()()(al)";
//        System.out.println(interpret(str));
        System.out.println(builderInterpret(str));
    }

    // using String class
    static String interpret(String command) {
        String str = "";
        int i = 0;
        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                str += 'G';
                i++;
            }
            else if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                str += 'o';
                i += 2;
            }
            else {
                str += "al";
                i += 4;
            }
        }
        return str;
    }

    //using StringBuilder class
    static String builderInterpret(String command) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                str.append('G');
                i++;
            }
            else if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                str.append('o');
                i += 2;
            }
            else {
                str.append("al");
                i += 4;
            }
        }
        return str.toString();
    }
}
