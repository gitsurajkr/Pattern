import java.util.Scanner;
public class Full_Triangle {
    public void starPattern(int num){
        for (int row = 0; row<num;row++){
            for(int space = 0; space<num-row;space++){
                System.out.print(" ");
            }
            for(int column = 0 ; column<2*row+1;column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int rows ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        rows = sc.nextInt();
        Full_Triangle obj = new Full_Triangle();
        obj.starPattern(rows);
    }
}