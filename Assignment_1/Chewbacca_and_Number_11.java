package Assignment_1;
//Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them.
// Inverting digit t means replacing it with digit 9-t.
// Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits.
// The decimal representation of the final number shouldn't start with a zero.
//Input Format
// The first line contains a single integer x the number that Luke Skywalker gave to Chewbacca.
//  Constraints
// x <= 100000000000000000
//Output Format
//Print the minimum possible positive number that Chewbacca can obtain after inverting some digits.
//The number shouldn't contain leading zeroes.
// Sample Input
//4545
//Sample Output
//4444
//Explanation
//There are many numbers form after inverting the digit. For minimum number, check if inverting digit is less than
//or greater than the original digit. If it is less, then invert it otherwise leave it.

import java.util.*;

public class Chewbacca_and_Number_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        long a = 1;
        while (n > 0) {
            long rem = n % 10;
            if (rem >= 5 && n != 9) {
                sum += (9 - rem) * a;

            } else {
                sum += rem * a;
            }
            n /= 10;
            a *= 10;
        }
        System.out.println(sum);
    }
}
