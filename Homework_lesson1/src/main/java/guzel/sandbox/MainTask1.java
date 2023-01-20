package guzel.sandbox;

// Cоздать класс Point для представления точек на двумерной плоскости.
// Объекты этого класса должны содержать два атрибута, которые соответствуют координатам точки на плоскости.
public class MainTask1 {

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p1.X - p2.X) * (p1.X - p2.X) + (p2.Y - p1.Y) * (p2.Y - p1.Y));
    }

    public static void main(String[] args) {


        Point point1 = new Point(1, 4);
        Point point2 = new Point(6, 8);

        double distance1 = distance(point1, point2);
        System.out.println(distance1);

        double distance2 = point1.distance(point2);
        System.out.println(distance2);


    }


}
