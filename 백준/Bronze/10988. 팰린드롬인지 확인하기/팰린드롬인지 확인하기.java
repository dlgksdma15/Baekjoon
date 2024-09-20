import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int ans = 1;
        for(int i = 0; i < len/2;i++){ // level
            if(str.charAt(i) != str.charAt(len-1-i)){
                ans = 0;
            }
        }
        System.out.println(ans);
    }
}
