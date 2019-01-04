import java.util.Scanner;

public class no_10809 {
    final static int ALPAHBETNO = 26;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        //입력 단어의 각 스펠링마다 배열에 삽입
        char[] charArr = str.toCharArray();

        //알파벳 점수 초기화
        int[] alphabet = new int[ALPAHBETNO];
        for (int i = 0; i < ALPAHBETNO; i++)
        {
            alphabet[i] = -1;
        }

        int charToArrayIndex = -1;
        for(int i = 0; i < charArr.length; ++i)
        {
            charToArrayIndex = charArr[i] - 'a';

            if(alphabet[charToArrayIndex] == -1 )
                alphabet[charToArrayIndex] = i;

        }


        for (int j = 0; j < alphabet.length; j++)
        {
            System.out.print(alphabet[j]);
            System.out.print(" ");
        }
    }
}
