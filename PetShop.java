package Step1;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countDogFood = Integer.parseInt(scan.nextLine());
        int countCatFood = Integer.parseInt(scan.nextLine());
        double sumDog = 2.50;
        double sumCat = 4.00;

        double neededSum = (countDogFood * sumDog) + (countCatFood * sumCat);
        System.out.printf("%.2f lv.", neededSum);
    }
}
