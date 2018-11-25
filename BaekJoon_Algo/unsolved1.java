import java.util.ArrayList;
import java.util.Scanner;

public class unsolved1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> youngwooArr = new ArrayList<>();
        youngwooArr.add(5);
        youngwooArr.add(2);
        youngwooArr.add(3);
        youngwooArr.add(4);
        youngwooArr.add(1);
        for (int i = youngwooArr.size()-1;i>0;i--) {
            for (int j = 0; j < i; j++) {
                if (youngwooArr.get(j) > youngwooArr.get(j + 1))
                    swap(youngwooArr,j,j+1);
            }
        }
        for (int a = 0; a < youngwooArr.size(); a++) {
            System.out.println(youngwooArr.get(a));
        }
    }

    private static void swap(ArrayList<Integer> array,int first, int second) {
        int temp = array.get(first);
        array.set(first,array.get(second));
        array.set(second,temp);
    }
}
