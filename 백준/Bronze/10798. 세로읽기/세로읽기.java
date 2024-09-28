import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] strArr = new String[5][15];
        int max = 0;
        for(int i = 0; i < 5;i++){
            String[] a = br.readLine().split(""); // abcde
            for(int j = 0; j < a.length; j++){
                strArr[i][j] = a[j]; // strArr[0][1] = a
            }
        }
        for(int i = 0; i < 15;i++) {
            for(int j = 0; j < 5; j++){
                if(strArr[j][i] == null){
                    continue;
                }
                System.out.print(strArr[j][i]);
            }
        }
    }
}
