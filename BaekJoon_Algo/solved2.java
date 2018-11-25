import java.util.ArrayList;
import java.util.Scanner;

public class solved2 {
    public static void main(String[] args){
        ArrayList<Integer> peopleArr = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            peopleArr.add(input.nextInt());
            if (peopleArr.get(i) < 40) {
                peopleArr.set(i, 40);
            }
        }
        for (int i = 0; i < peopleArr.size(); i++) {
            sum += peopleArr.get(i);
        }
        System.out.println(sum / peopleArr.size());
    }
}
