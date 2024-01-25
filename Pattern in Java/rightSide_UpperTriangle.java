import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class rightSide_UpperTriangle {
    public void StarPattern(int num){
        for(int row = 0; row<num;row++){
            for (int space = 0; space<num-row;space++){
                System.out.print(" ");
            }
            for(int column = 0; column<row+1;column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        rows = sc.nextInt();
        rightSide_UpperTriangle obj = new rightSide_UpperTriangle();
        obj.StarPattern(rows);
    }
}