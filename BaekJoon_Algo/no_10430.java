import java.util.Scanner;

public class no_10430 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int A=input.nextInt();
        int B=input.nextInt();
        int C=input.nextInt();

        int result=(A+B)%C;
        System.out.println(result);
        result=(A%C + B%C)%C;
        System.out.println(result);
        result = (A*B)%C;
        System.out.println(result);
        result=(A%C * B%C)%C;
        System.out.println(result);
    }
}
