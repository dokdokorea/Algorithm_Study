import java.util.Scanner;

public class no_11720 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int totalInteger=input.nextInt();
        String[] Number=input.next().split("");
        int sum=0;

        for(int i=0;i<totalInteger;i++)
            sum+= Integer.parseInt(Number[i]);

        System.out.println(sum);

    }
}
