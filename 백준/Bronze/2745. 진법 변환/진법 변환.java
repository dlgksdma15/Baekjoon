import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken(); // 1101
        int B = Integer.parseInt(st.nextToken()); // 2

        long result = 0;
        int idx = 0; // 0,1,2,3
        int num = 0; // 계산하기 위해 각 자리 숫자를 10진수로 바꿔준다
        for(int i = N.length()-1;i >= 0; i--){ // 5,4,3,2,1
            char c = N.charAt(i); // c = 1,1,0,1
            if(c >= '0' && c <= '9'){
                num = c - '0'; // 0~9 사이는 그대로 출력
            }else{
                num = c - 55; // A~Z는 숫자로 변경 65-55
            }
            result += num * Math.pow(B,idx++); // 1 * 2^0, 1 * 2^2, 1 * 2^3;
        } // 1 + 0 + 4 + 8 = 13
        System.out.println(result);
    }
} // Z - 55 = 35 * 36^1