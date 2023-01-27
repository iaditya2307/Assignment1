package Assignment_1;
//4
//Take N (number in binary format). Write a function that converts it to decimal format and Print the value returned.
//        Input Format
//        Constraints
//        0 < N <= 1000000000
//        Output Format
//        Sample Input
//        101010
//        Sample Output
//        42
//        Explanation
//        For binary number fedcba , Decimal number = f * 25 + e * 24 + d * 23 + …..+ a * 20.

import java.util.*;

public class Binary_To_Decimal_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 1;
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans += rem * mul;
            mul *= 2;
            n /= 10;
        }
        System.out.println(ans);
    }
}
