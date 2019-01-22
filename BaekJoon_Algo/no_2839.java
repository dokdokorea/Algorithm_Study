import java.util.Scanner;

public class no_2839 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalWeight = input.nextInt();
        int minY = 0, xCnt = 0;  //봉지 갯수 도출
        int result = 0;
        for (int y = totalWeight/5; y>=0; y--) {
            for (int x = 0; 3 * x + 5 * y <= totalWeight; x++) {
                if (minY <= y && 3 * x + 5 * y == totalWeight) {
                    minY = y;
                    xCnt = x;
                }
            }
        }
        result = minY + xCnt;
        if (5 * minY + 3 * xCnt != totalWeight)
            result = -1;
        System.out.println(result);
    }
}
