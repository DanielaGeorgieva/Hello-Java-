package ConditionalStatementsExercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double vacantion = Double.parseDouble(scan.nextLine());
        int puzzle = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int bears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        double pricePuzzle = 2.60;
        double priceDolls = 3;
        double priceBears = 4.10;
        double priceMinions = 8.20;
        double priceTrucks = 2;


        double sumPuzzles = puzzle * pricePuzzle;
        double sumDolls = dolls * priceDolls;
        double sumBears = bears * priceBears;
        double sumMinions = minions * priceMinions;
        double sumTrucks = trucks * priceTrucks;

        double allSum = sumBears + sumDolls + sumPuzzles + sumTrucks + sumMinions;

        double allToys = puzzle + dolls + bears + minions + trucks;

        if (allToys >= 50){
            allSum = allSum - (allSum * 0.25);
        }
        allSum = allSum - (allSum * 0.10);

        if (allSum >= vacantion){
            System.out.printf("Yes! %.2f lv left.", Math.abs(allSum - vacantion));
        }
        else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(allSum - vacantion));
        }

    }
}
