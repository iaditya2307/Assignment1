package Assignment_1;
//3
//Input Format
//        Take N as input.
//        Constraints
//        N is odd number.
//        Output Format
//        Pattern should be printed with a space between every two values.
//        Sample Input
//        7
//        Sample Output
//              1
//          2 1   1 2
//      3 2 1       1 2 3
//  4 3 2 1           1 2 3 4
//      3 2 1       1 2 3
//          2 1   1 2
//              1

import java.util.*;

public class Pattern_Double_Sided_Arrow_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space1 = n - 1;
        int space2 = -1;
        int star = 1;
        int row = 1;
        int val = 1;
        while (row <= n) {

            // space-1
            int i = 1;
            while (i <= space1) {
                System.out.print("  ");
                i++;
            }

            // star-1
            int j = 1;
            int p = val;
            while (j <= star) {
                System.out.print(p + " ");
                p--;
                j++;
            }

            // space-2
            int k = 1;

            while (k <= space2) {
                System.out.print("  ");
                k++;
            }

            // star-2

            j = 1;
            p++;
            if (row == 1 || row == n) {
                j = 2;

            }
            while (j <= star) {
                System.out.print(p + " ");
                j++;
                p++;
            }

            // next row Prep
            if (row <= n / 2) {
                space1 -= 2;
                space2 += 2;
                val++;
                star++;
            } else {
                space1 += 2;
                star--;
                space2 -= 2;
                val--;
            }
            row++;
            System.out.println();

        }

    }

}