import java.util.Scanner;

public class no_1924 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int date = input.nextInt();
        int totaldate=0;
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        for(int i=0;i<month;i++)
            totaldate += selectMonth(i);
        totaldate+=date;
        int dateCount=(totaldate)%7;
        System.out.println(day[dateCount]);

    }

    private static int selectMonth(int month) {
        int date = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            date = 31;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            date = 30;
        else if (month == 2)
            date = 28;
        return date;
    }
}
