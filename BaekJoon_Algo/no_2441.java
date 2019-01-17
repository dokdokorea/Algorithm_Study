import java.util.ArrayList;
import java.util.Scanner;

public class no_2441 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int totalCount=input.nextInt();

        ArrayList<String> starArray=new ArrayList<>();
        for(int i=1;i<=totalCount;i++)
            starArray.add("*");
        for(int a=0;a<starArray.size();a++)
            System.out.print(starArray.get(a));
        System.out.println();

        for(int j=0;j<totalCount-1;j++) {
            starArray.set(j," ");
            for(int a=0;a<starArray.size();a++)
                System.out.print(starArray.get(a));
            System.out.println();
        }

    }
}
