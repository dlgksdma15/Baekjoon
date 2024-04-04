import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextDouble();
        }
        double temp = 0;
        double sum = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length;i++){
            temp = (arr[i] / arr[arr.length-1]) * 100.0;
//            System.out.println(temp);
            sum = sum + temp / arr.length;

        }
        System.out.println(sum);
    }
}