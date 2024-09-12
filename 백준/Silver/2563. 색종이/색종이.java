import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 색종이 개수
        int[][] arr = new int[101][101];
        for(int i = 0; i < n; i++){
            int a = sc.nextInt(); // x좌표 3 + 10 = (3,13)
            int b = sc.nextInt(); // y좌표 7 + 10 = (7,17)

            for(int j = a; j < a + 10;j++){ // int j = 3; j < 13; j++;
                for(int k = b; k < b + 10;k++){ // int k = 7; k < 17;k++;
                    arr[j][k] = 1; // arr[3][7] = 1
                };
            }
        }
        int count = 0;
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr.length;j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
