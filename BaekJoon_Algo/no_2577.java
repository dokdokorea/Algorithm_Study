import java.util.ArrayList;
import java.util.Scanner;

public class no_2577 {
    static int[] count = new int[10];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        String Ab = Integer.toString(A * B * C);
        ArrayList<Integer> resultArr = new ArrayList<>();
        for (int i = 0; i < Ab.length(); i++) {
            resultArr.add(Ab.charAt(i) - '0');
            switchingFunc(resultArr.get(i));
        }

        for (int i = 0; i < 10; i++)
            System.out.println(count[i]);


    }

    static void switchingFunc(int a) {

        switch (a) {
            case 0:
                count[0]++;
                break;
            case 1:
                count[1]++;
                break;
            case 2:
                count[2]++;
                break;
            case 3:
                count[3]++;
                break;
            case 4:
                count[4]++;
                break;
            case 5:
                count[5]++;
                break;
            case 6:
                count[6]++;
                break;
            case 7:
                count[7]++;
                break;
            case 8:
                count[8]++;
                break;
            case 9:
                count[9]++;
                break;
        }
    }
}