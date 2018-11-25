import java.util.Scanner;

public class no_1463 {
    public static void main(String[] args) {

    }

}


/*        int i;
        Scanner input = new Scanner(System.in);
        i = input.nextInt();

        System.out.println(f(i));
    }

    private static int f(int x) {
        if (x == 1) {
            return 0;
        }
        int a = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        if (x % 3 == 0) {
            a = f(x / 3) + 1;
            min = min < a ? min : a;
        }
        if (x % 2 == 0) {
            a = f(x / 2) + 1;
            min = min < a ? min : a;
        }
        a = f(x - 1) + 1;
        min = min < a ? min : a;
        return min;
    }*/
