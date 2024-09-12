import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 바구니 n번까지
        int m = sc.nextInt(); // 바구나 m번
        int[] arr = new int[n+1];
        // 바구니를 먼저 1번부터 n번까지 채워야함
        for(int i = 1; i <= n;i++){ // 1부터 5까지 채움
            arr[i] = i;
        }
        for(int i = 0; i < m; i++){
            int a = sc.nextInt(); // 바꿀 번호
            int b = sc.nextInt(); // 바꿀 번호
            int temp;
            temp = arr[a]; // temp = arr[1]
            arr[a] = arr[b]; // arr[1] = arr[2]
            arr[b] = temp; // arr[2] = arr[1]
        }
        for(int i = 1; i < n+1;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
