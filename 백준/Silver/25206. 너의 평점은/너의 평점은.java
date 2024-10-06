import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] subject = new String[20];
        Double[] grade = new Double[20];
        String[] credit = new String[20];
        Double totalCredit = 0.0;
        Double totalGrade = 0.0;
        for(int i = 0; i < 20;i++){
            String line = br.readLine();
            String[] parts = line.split(" ");
            subject[i] = parts[0];
            grade[i] = Double.parseDouble(parts[1]);
            credit[i] = parts[2]; // 학점

            if (!credit[i].equals("P")) { // P 등급은 계산에서 제외
                totalGrade += grade[i]; // 총 수강한 학점
                totalCredit += grade[i] * getcreditPoint(credit[i]); // 총 점수
            }
        }
        System.out.println(totalCredit / totalGrade);

    }
    private static double getcreditPoint(String credit) {
        switch (credit) {
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            case "F": return 0.0;
            default: return 0.0;
        }
    }
}
