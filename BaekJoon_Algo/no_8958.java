import java.util.ArrayList;
import java.util.Scanner;

public class no_8958 {
    static ArrayList<Character> OX = new ArrayList<>(); //OX 점수 받기
    static int[] countArr;   //점수 배열
    static int count = 0;    //연속 수
    static int totalCnt = 0;
    static int arrayList = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalInput = input.nextInt();   //숫자
        countArr = new int[totalInput];

        for (int i = 1; i <= totalInput; i++) {
            String answer = input.next();   //OX 입력
            for (char c : answer.toCharArray())
                OX.add(c);

            for (int j = 0; j < OX.size(); j++) {
                if (OX.get(j) == 'O') {
                    ++count;
                    totalCnt += count;
                } else if (OX.get(j) == 'X') count = 0;
            }
            countArr[arrayList++] = totalCnt;
            totalCnt = 0;
            count = 0;
            OX.clear();
        }
        for (int ab = 0; ab < totalInput; ab++) System.out.println(countArr[ab]);
    }
}
