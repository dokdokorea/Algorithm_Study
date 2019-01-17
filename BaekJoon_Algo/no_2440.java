import java.util.Scanner;

public class no_2440 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        for(int i=N;i>=1;i--) {
            for (int j = i; j >=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
