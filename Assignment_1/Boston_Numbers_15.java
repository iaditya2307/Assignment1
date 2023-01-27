package Assignment_1;
//15. Boston Numbers
//        A Boston number is a composite number, the sum of whose digits is the sum of the digits of its prime factors obtained as a result of prime factorization (excluding 1 ). The first few such numbers are 4,22 ,27 ,58 ,85 ,94 and 121 . For example, 378 = 2 × 3 × 3 × 3 × 7 is a Boston number since 3 + 7 + 8 = 2 + 3 + 3 + 3 + 7. Write a program to check whether a given integer is a Boston number.
//        Input Format
//        There will be only one line of input:N , the number which needs to be checked.
//        Constraints
//        1 < N < 2,147,483,647 (max value of an integer of the size of 4 bytes)
//        Output Format
//        1 if the number is a Boston number. 0 if the number is a not Boston number.
//        Sample Input
//        378
//        Sample Output
//        1

import java.util.*;

public class Boston_Numbers_15 {
    public static void main(String[] args) {
        int n = 378;
        isBostonNumber(n);

    }

    public static void isBostonNumber(int n) {
        int i = 2;
        int psum = 0;
        int num = n;
        while (i <= n) {
            while (n % i == 0) {
                psum = psum + sumofdigit(i);
                n = n / i;
            }
            i++;
        }

        int sum = sumofdigit(num);
        if (sum == psum) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

    public static int sumofdigit(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }

}
