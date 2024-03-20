package FirstStepsInCodingExercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int chicken = Integer.parseInt(scan.nextLine());
        int fish = Integer.parseInt(scan.nextLine());
        int vege = Integer.parseInt(scan.nextLine());

        double priceChicken = 10.35;
        double priceFish = 12.40;
        double priceVege = 8.15;

        double allSum = chicken * priceChicken + fish * priceFish + vege * priceVege;
        double desert = allSum * 0.20;
        double delivery = 2.50;
        double totalSum = allSum + desert + delivery;

        System.out.println(totalSum);


    }
}
