package Assignment_1;
//13. Decimal To Octal
//        Take N (number in decimal format). Write a function that converts it to octal format. Print the value returned.
//        Input Format
//        Constraints
//        0 < N <= 1000000000
//        Output Format
//        Sample Input
//        63
//        Sample Output
//        77
//        Explanation
//        Both input and output are integers

import java.util.*;

public class Decimal_to_Octal_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(octal(n));
    }

    public static int octal(int n) {
        int ans = 0;
        int mul = 1;
        while (n > 0) {
            int rem = n % 8;
            ans += mul * rem;
            n /= 8;
            mul *= 10;
        }
        return ans;
    }
}
