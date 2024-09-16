import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int loc = sc.nextInt();
        int[] arr = new int[num];
        int temp = 0;
        for(int i = 1; i <= num;i++){
            if(num % i == 0){
                arr[temp] = i; //
                temp++;
            }
        }
        System.out.println(arr[loc-1]);
    }
}
