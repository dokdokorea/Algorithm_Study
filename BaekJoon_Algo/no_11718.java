import java.util.Scanner;

public class no_11718 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] strings=new String[100];
        for(int i=0;i<strings.length;i++) {
            strings[i] = input.nextLine();
            System.out.println(strings[i]);
        }
    }
}
