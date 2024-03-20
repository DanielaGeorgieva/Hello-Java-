package FirstStepsInCodingExercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pages = Integer.parseInt(scan.nextLine());
        int readPagesForHour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        
        int neededTime = pages / readPagesForHour;
        int neededHours = neededTime / days;
        System.out.println(neededHours);


    }
}
