
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputstr = reader.readLine(); // baekjoon
        String str = "abcdefghijklmnopqrstuvwxyz";
        int[] arr = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        for(int i = 0; i < inputstr.length();i++){
            for(int j = 0; j < str.length();j++){
                if(inputstr.charAt(i) == str.charAt(j) && arr[j] == -1){ // b == b
                    arr[j] = i;
                }
            }
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
