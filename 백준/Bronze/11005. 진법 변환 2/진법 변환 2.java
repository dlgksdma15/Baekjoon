import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        ArrayList<Character> list = new ArrayList<>();

        while(N > 0){
            if(N % B < 10){ // 만약 나누었을 떄 나머지가 10보다 작을 경우
                list.add((char) (N % B + '0'));
            }else{
                list.add((char) (N % B - 10 + 'A'));
            }
            N /= B; // 3926 / 16 = 245, 245 / 16 = 15
        }
        /*Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));*/
        for(int i = list.size() -1; i >= 0; i--){
            System.out.print(list.get(i));
        }
    }
}
