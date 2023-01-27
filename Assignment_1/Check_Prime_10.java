package Assignment_1;
//Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".
//        Input Format
//        Constraints
//        2 < N <= 1000000000
//        Output Format
//        Sample Input
//        3
//        Sample Output
//        Prime
//        Explanation
//        The output is case specific

import java.util.*;

public class Check_Prime_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Not Prime");
        else
            System.out.println("Prime");
    }
}
