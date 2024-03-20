package FirstStepsInCodingExercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int packagesPen = Integer.parseInt(scan.nextLine());
        int packagesMarkers = Integer.parseInt(scan.nextLine());
        int litres = Integer.parseInt(scan.nextLine());
        int percentDiscount = Integer.parseInt(scan.nextLine());

        double pricePen = 5.80;
        double priceMarcers = 7.20;
        double priceLitre = 1.20;

        double neededSum = (packagesPen * pricePen + packagesMarkers * priceMarcers + litres * priceLitre);
        double discount = neededSum - neededSum * percentDiscount / 100;
        System.out.println(discount);
    }
}
