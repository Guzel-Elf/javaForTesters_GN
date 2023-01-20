package guzel.sandbox;


import org.testng.Assert;
import org.testng.annotations.Test;

public class PointDistanceTest {
    @Test
    public void testDistance() {

        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);

        double actualResult = p1.distance(p2);

        Assert.assertEquals(actualResult, 2.8284271247461903);
    }
}
