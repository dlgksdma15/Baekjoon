import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 바구니 개수
        int m = sc.nextInt(); // 몇번 할건지
        int[] arr = new int[n+1];
        for(int i = 0; i < m;i++){ // 싸이클 횟수 4번이며
            int a = sc.nextInt(); // 바구니 시작 번호
            int b = sc.nextInt(); // 바구니 끝 번호
            int c = sc.nextInt(); // 바구니에 넣을 공의 번호
            for(int j = a; j <= b;j++){
                arr[j] = c;
            }
        }
        for(int i = 1; i < n+1;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
