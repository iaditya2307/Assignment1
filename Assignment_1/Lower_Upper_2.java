package Assignment_1;
//2
//Print "lowercase" if user enters a character between 'a-z' , Print "UPPERCASE" is character lies between 'A-Z' and print "Invalid" for all other characters like $,.^# etc.
//        Input Format
//        Single Character .
//        Constraints
//        -
//        Output Format
//        lowercase UPPERCASE Invalid
//        Sample Input
//        $
//        Sample Output
//        Invalid
//        Explanation

import java.util.*;

public class Lower_Upper_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if (c >= 65 && c <= 90) {
            System.out.println("UPPERCASE");
        } else if (c >= 97 && c <= 122) {
            System.out.println("lowercase");
        } else {
            System.out.println("Invalid");
        }
    }

}
