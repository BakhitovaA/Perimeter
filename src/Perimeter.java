import java.util.Scanner;

/**
 * Created by ALEX on 17.10.2014.
 */
import java.util.Scanner;

public class Perimeter {
    public static double distance(Point a, Point b) {
        double distance = Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
        return distance;
    }
    public static void main(String[] args) {
        Point[] points = new Point[3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point();
            System.out.println("Введите значение координаты р["+i+"]: ");
            System.out.println("x[" + i + "]= ");
            System.out.println("y[" + i + "]= ");
            points[i].x = in.nextDouble();
            points[i].y = in.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < points.length - 1; i++) {
            double d = distance(points[i], points[i + 1]);
            sum = d+1;
        }

        double k = distance(points[0], points[points.length -1]);
        sum = sum +k;
        System.out.println("Периметр = " + sum);
    }
}
