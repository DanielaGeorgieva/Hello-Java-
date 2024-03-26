package ConditionalStatementsExercise;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int allMinutes = hour * 60 + minutes + 15;

        hour = allMinutes / 60;
        minutes = allMinutes % 60;

        if (hour > 23){
            hour = 0;
        }
        System.out.printf("%d:%02d", hour, minutes);
    }

}
