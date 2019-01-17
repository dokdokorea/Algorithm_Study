import java.util.Scanner;

public class no_1316 {
    public static void main(String[] args){
//unsolved 1316
        Scanner input = new Scanner(System.in);
        int totalCount = input.nextInt();

        for (int a = 1; a <= totalCount; a++) {
            String[] word = input.next().split("");   //문자끼리

            outerloop:
            for (int i = 1; i < word.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (j != (i - 1) && word[j] == word[i]) {
                        totalCount--;
                        System.out.println("checked");
                        break outerloop;
                    }
                }
            }
        }
        System.out.println("답은 " + totalCount);
    }
}
/*The Answer
Scanner sc=new Scanner(System.in);

        int i=0;
        int n=sc.nextInt();
        int answer=n;

        for(int test_case=0;test_case<n;test_case++){
            String word=sc.next();
            boolean[] checker = new boolean[26];

            for(i=1;i<word.length();i++){
                if(word.charAt(i-1)!=word.charAt(i)){
                    if(checker[word.charAt(i)-97]==true){
                        answer--;
                        break;
                    }
                    checker[word.charAt(i-1)-97]=true;
                }
            }
        }
        System.out.println(answer);
* */