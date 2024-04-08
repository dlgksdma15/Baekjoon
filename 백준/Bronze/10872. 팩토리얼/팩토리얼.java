import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = fac(n);
        System.out.println(sum);
    }
    public static int fac(int n){
        if(n <= 1){
            return 1;
        }
        return n * fac(n-1);
    }
}
