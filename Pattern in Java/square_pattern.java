import java.util.Scanner;

public class square_pattern {

    public void pattern(int num) {
        for (int row = 0; row < num; row++) {
            for (int column = 0; column < num; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        System.out.print("Enter the number of Rows: ");
        rows = sc.nextInt();
        square_pattern obj = new square_pattern();
        obj.pattern(rows);
    }
}