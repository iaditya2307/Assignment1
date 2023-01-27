package Assignment_1;
//Given a binary number ,help Von Neuman to find out its decimal representation. For eg 000111 in binary is 7 in decimal.
//        Input Format
//        The first line contains N , the number of binary numbers. Next N lines contain N integers each representing binary represenation of number.
//        Constraints
//        N<=1000 Digits in binary representation is <=16.
//        Output Format
//        N lines,each containing a decimal equivalent of the binary number.
//        Sample Input
//        4
//        101
//        1111
//        00110
//        111111
//        Sample Output
//        5
//        15
//        6
//        63
//        Explanation
//        For binary number fedcba , Decimal number = f * 25 + e * 24 + d * 23 + …..+ a * 20.

import java.util.*;

public class Von_Neuman_Loves_Binary_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            int mul = 1;
            while (n > 0) {
                int rem = n % 10;
                ans += rem * mul;
                mul *= 2;
                n /= 10;

            }
            System.out.println(ans);
        }
    }
}
