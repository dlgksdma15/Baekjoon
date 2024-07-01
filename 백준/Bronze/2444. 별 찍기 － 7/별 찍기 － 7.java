import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int i = 1; i <= rows; i++){
            for(int j = rows-1; j >= i; j--){ // 4; 4 >= 1; j--
                System.out.print(" ");
            }
            for(int j = 1; j <= i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        rows = rows - 1;
        for(int i = 1; i <= rows;i++){
            for(int j = 1; j <= i;j++){
                System.out.print(" ");
            }
            for(int j = rows*2-1; j >= i*2-1; j--){ // 7; 7 >= 1,3,5,7; j--
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
