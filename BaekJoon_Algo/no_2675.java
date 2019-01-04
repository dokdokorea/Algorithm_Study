import java.util.Scanner;

public class no_2675 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //테스트 케이스의 개수
        int testCase=input.nextInt();

        for(int i=0;i<testCase;i++){
            //반복 횟수
            int rotationCnt=input.nextInt();
            String word=input.next();
            char[] wordToChar=word.toCharArray();   //스펠링화

            for(int a=0;a<wordToChar.length;a++)
                for (int b = 0; b < rotationCnt; b++) {
                    System.out.print(wordToChar[a]);
                }
            System.out.println(" ");
        }

    }
}
