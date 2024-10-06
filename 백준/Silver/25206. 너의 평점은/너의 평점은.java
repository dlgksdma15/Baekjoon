import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] subject = new String[20];
        double[] credit = new double[20];
        String[] grade = new String[20];

        double totalScore = 0.0;
        double totalCredits = 0.0;

        for (int i = 0; i < 20; i++) {
            String line = br.readLine();
            if (line == null || line.isEmpty()) {
                break; // 입력이 더 이상 없을 경우 루프 종료
            }

            String[] parts = line.split(" "); // BruteForce 3.0 F
            /*if (parts.length < 3) {
                continue; // 형식에 맞지 않는 입력은 건너뜀
            }*/
            subject[i] = parts[0]; // subject[0] = BruteForce
            credit[i] = Double.parseDouble(parts[1]); // 3.0
            grade[i] = parts[2]; // F

            if (!grade[i].equals("P")) {
                totalScore += credit[i] * getGradePoint(grade[i]);
                totalCredits += credit[i];
            }
        }

        double average = totalCredits == 0 ? 0 : totalScore / totalCredits;
        System.out.printf("%.6f", average);
    }

    private static double getGradePoint(String grade) {
        switch (grade) {
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
