// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class leftSide_UpperTriangle {
    public void pattern(int num) {
        for (int row = 0; row < num; row++) {
            for (int column = 0; column < row + 1; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows:");
        rows = sc.nextInt();
        leftSide_UpperTriangle obj = new leftSide_UpperTriangle();
        obj.pattern(rows);

    }
}