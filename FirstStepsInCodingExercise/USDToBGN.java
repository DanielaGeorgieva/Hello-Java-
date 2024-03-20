package FirstStepsInCodingExercise;

import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double USD = Double.parseDouble(scan.nextLine());
        double BGN = 1.79549;

        double sum = USD * BGN;
        System.out.println(sum);
    }
}
