package Assignment_1;
//        1
//        2 2
//        3 0 3
//        4 0 0 4
//        5 0 0 0 5

import java.util.*;

public class Pattern_With_Zeroes_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        for (int i = 1; i <= n; i++) {
            k++;
            for (int j = 1; j <= i; j++) {
                if (j == i || j == 1) {
                    System.out.print(k + " ");
                } else if (j < i) {
                    System.out.print("0" + " ");
                }

            }
            System.out.println(" ");
        }

    }
}
