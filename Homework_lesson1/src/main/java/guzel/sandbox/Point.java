package guzel.sandbox;

public class Point {
    int X;
    int Y;

    public Point(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public double distance(Point otherPoint) {
        return  Math.sqrt((this.X - otherPoint.X) * (this.X - otherPoint.X) + (otherPoint.Y - this.Y) * (otherPoint.Y - this.Y));
    }
}
