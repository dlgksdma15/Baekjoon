
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        String str = br.readLine();

        int sum = 0;
        for(int i = 0; i < str.length();i++){
            char c = str.charAt(i);
            for(int j = 0;j < strArr.length;j++){
                if(strArr[j].indexOf(c) != -1){ //
                    sum += j + 3;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
