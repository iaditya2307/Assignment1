package Assignment_1;
//14. Conversion(Any To Any)
//        Take sb (source number system base), db (destination number system base) and sn (number in source format). Write a function that converts sn to its counterpart in destination number system. Print the value returned.
//        Input Format
//        Constraints
//        0 < N <= 1000000000
//        Output Format
//        Sample Input
//        8
//        2
//        33
//        Sample Output
//        11011
//        Explanation
//        All input output is as integers and in separate lines.

import java.util.*;

public class Any_to_Any_14 {
    static int conversion(int b, int n) {
        int sum = 0;
        int nul = 1;
        while (n > 0) {
            int rem = n % b;
            sum = sum + rem * nul;
            n = n / b;
            nul = nul * 10;
        }
        return sum;
    }

    static int decimal(int num, int base) {
        int n = 0, p = 0, i = 0;
        while (num != 0) {
            p = num % 10;
            n += (p * Math.pow(base, i));
            i++;
            num /= 10;
        }
        // System.out.println(n);
        return n;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int cur_base = sc.nextInt();
        int f_base = sc.nextInt();
        int num = sc.nextInt();
        num = decimal(num, cur_base);
        System.out.println(conversion(f_base, num));

    }
}

