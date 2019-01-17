import java.util.Scanner;

public class no_1157 {
    public static void Main(String[] args){
        int maxCnt=0;   //가장 많이 나온 알파벳 수 저장할 변수
        char answer='?';    //정답을 저장할 변수
        int[] numberArr=new int[26];    //알파벳 카운트를 저장할 int 배열
        Scanner input = new Scanner(System.in);
        String word=input.next().toUpperCase();


        //알파벳에 따라 카운트하기
        for(int i=0;i<word.length();i++){   //문자열 길이만큼 반복
            numberArr[word.charAt(i)-65]++; //현재 알파벳을 알파벳카운트 배열 index에 +1한다.
            if(maxCnt<numberArr[word.charAt(i)-65]){//현재 알파벳 수가 max보다 크다면
                answer=word.charAt(i);  //정답에 현재 알파벳을 할당.
                maxCnt = numberArr[word.charAt(i)-65];  //max변수에 현재 알파벳 수 저장
            }
            else if(maxCnt == numberArr[word.charAt(i)-65]) //만약 현재 알파벳 수가 max와 같다면
                answer = '?';   //정답에 '?'을 할당
        }
        System.out.println(answer);
    }
}
