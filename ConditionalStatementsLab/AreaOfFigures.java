package ConditionalStatementsLab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String typeFigure = scan.nextLine();
        double area = 0;

        // Проверка каква е фигурата

        if (typeFigure.equals("square")){
            double a = Double.parseDouble(scan.nextLine());
            area = a * a;


        }else if (typeFigure.equals("rectangle")){
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            area = a * b;

        }else if (typeFigure.equals("circle")){
            double r = Double.parseDouble(scan.nextLine());
            area = Math.PI * r * r;

        }else if (typeFigure.equals("triangle")){
            double a = Double.parseDouble(scan.nextLine());
            double h = Double.parseDouble(scan.nextLine());
            area = (a * h) / 2;


        }
        System.out.printf("%.3f", area);
    }
}
