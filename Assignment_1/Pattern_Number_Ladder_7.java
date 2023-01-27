package Assignment_1;

import java.util.*;

public class Pattern_Number_Ladder_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int p = 1;
        int n = sc.nextInt();
        int row = 1;
        int star = 1;

        while (row <= n) {
            // star
            int i = 1;
            while (i <= star) {
                System.out.print(p + " ");
                i = i + 1;
                p++;
            }

            // next row Prep
            star = star + 1;
            row = row + 1;
            System.out.println();

        }

    }

}
