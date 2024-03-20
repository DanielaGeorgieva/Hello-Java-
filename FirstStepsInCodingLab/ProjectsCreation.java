package FirstStepsInCodingLab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());

        int timeForProject = 3;
        int allTime = count * timeForProject;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, allTime, count);
    }
}
