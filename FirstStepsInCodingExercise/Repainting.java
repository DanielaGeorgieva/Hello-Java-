package FirstStepsInCodingExercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int neededNylon = Integer.parseInt(scan.nextLine());
        int neededPaint = Integer.parseInt(scan.nextLine());
        int neededThinner = Integer.parseInt(scan.nextLine());
        int neededHours = Integer.parseInt(scan.nextLine());

       double sumPaint = (neededPaint + neededPaint * 0.1) * 14.50;
       double sumNylon = (neededNylon + 2) * 1.50;
       double sumThinner = neededThinner * 5;
        double sumBag = 0.40;

        double sumMaterials = sumNylon + sumPaint + sumThinner + sumBag;
        double sumWorkers = neededHours * (sumMaterials * 0.3);
        double totalSum = sumMaterials + sumWorkers;
        System.out.println(totalSum);


    }
}
