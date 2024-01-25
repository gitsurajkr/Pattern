import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DiamondPattern {
    public void starPAttern(int num){
        for (int row = 0; row<num; row++){
            for(int space = 0; space<num-row;space++){
                System.out.print(" ");
            }
            for (int column = 0;column<2*row+1;column++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 0; row<num; row++){
            for(int space = 0; space<row+1;space++){
                System.out.print(" ");
            }
            for (int column = 0;column<2*(num-row)-1;column++){
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
        DiamondPattern obj = new DiamondPattern();
        obj.starPAttern(rows);
    }
}