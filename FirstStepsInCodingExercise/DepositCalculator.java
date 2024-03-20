package FirstStepsInCodingExercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double deposit = Double.parseDouble(scan.nextLine());
        int depositTerm = Integer.parseInt(scan.nextLine());
        double amountPercent = Double.parseDouble(scan.nextLine());

        // сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)

        double allSum = deposit + depositTerm * ((deposit * amountPercent) / 100) / 12;

        System.out.println(allSum);
    }
}
