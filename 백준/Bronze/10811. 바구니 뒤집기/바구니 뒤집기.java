
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1; i <= n; i++){
            arr[i] = i;
        }
        for(int i = 0; i < m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            // 1 4
            // 1 2 3 4 5
            // 4 3 2 1 5
            reverseSwap(arr,a,b);
        }
        for(int i = 1; i <= n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void reverseSwap(int[] arr,int a,int b) {
        // a = 1, b = 4
        while(a < b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
}
