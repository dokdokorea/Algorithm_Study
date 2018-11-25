import java.util.Scanner;
import java.util.StringTokenizer;

public class solved {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        StringTokenizer strToken = new StringTokenizer(n, " ");
        System.out.println(strToken.countTokens());
    }
}
