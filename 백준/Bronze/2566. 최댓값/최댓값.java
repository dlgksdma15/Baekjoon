import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = arr[0][1];
        int x =1,y =1;
        for(int i =0;i < 9;i++){
            for(int j = 0; j < 9;j++){
                arr[i][j] = sc.nextInt();
                if(max < arr[i][j]){
                    max = arr[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
