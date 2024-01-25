import java.util.Scanner;

public class Rev_fullTriangle {
    public void starPatter(int num){
        for (int row = 0; row<num; row++){
            for(int space = 0; space<row; space++){
                System.out.print(" ");
            }
            for (int column = 0; column<2*(num-row)-1; column++){
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
        Rev_fullTriangle obj = new Rev_fullTriangle();
        obj.starPatter(rows);

    }
}