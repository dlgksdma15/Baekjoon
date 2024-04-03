import java.util.Scanner;

public class Main {
    public static void main(String[] arsg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i= 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int min = arr[0];
        for(int i = 0;i < n;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print(min + " " + max);

    }
}