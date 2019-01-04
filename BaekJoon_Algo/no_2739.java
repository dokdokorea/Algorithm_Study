import java.util.Scanner;

public class no_2739 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();  //입력 수
        for (int i = 1; i <= 9; i++)
            System.out.println(N + " * " + i + " = " + N * i);
    }
}
