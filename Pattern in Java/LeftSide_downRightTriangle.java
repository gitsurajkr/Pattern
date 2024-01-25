import java.util.Scanner;


public class LeftSide_downRightTriangle {
    public void Starpattern(int num){
        for (int row = 0 ; row<num; row++){
            for (int column = 0; column<num-row;column++){
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
        LeftSide_downRightTriangle obj = new LeftSide_downRightTriangle();
        obj.Starpattern(rows);
    }
}