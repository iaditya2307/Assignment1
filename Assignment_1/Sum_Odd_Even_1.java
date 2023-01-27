package Assignment_1;
//1
//        Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.
//        Input Format
//        Constraints
//        0 < N <= 1000000000
//        Output Format
//        Sample Input
//        2635
//        Sample Output
//        11
//        5
//        Explanation
//        5 is present at 1st position, 3 is present at 2nd position, 6 is present at 3rd position and 2 is present at 4th position.
//        Sum of odd placed digits on first line. 5 and 6 are placed at odd position. Hence odd place sum is 5+6=11
//        Sum of even placed digits on second line. 3 and 2 are placed at even position. Hence even place sum is 3+2=5

import java.util.*;

public class Sum_Odd_Even_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n);
        int odd = 0;
        int even = 0;
        int i = 1;
        while (n > 0) {
            if (i % 2 == 0) {
                even += n % 10;
            } else {
                odd += n % 10;
            }
            n /= 10;
            i++;

        }
        System.out.println(odd);
        System.out.println(even);

    }

    public static int reverse(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n /= 10;

        }
        return sum;
    }

}
