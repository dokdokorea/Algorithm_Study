import java.util.Scanner;

public class no_2438 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Number=input.nextInt();

        for(int i=0;i<Number;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
