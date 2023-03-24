import java.util.Arrays;
import java.util.HashSet;


public class Main {

    public static int numberOfRectangles(Point[] points) {
        //Create a HashSet of points to make searching for points easier
        HashSet<Point> pointHashSet = new HashSet<>(Arrays.asList(points));
        //Count the number of rectangles
        int count = 0;

        //Loop through all possible pairs of points
        for(int i = 0; i < points.length; i++) {
            for(int j = i + 1; j < points.length; j++) {
                Point p1 = points[i];
                Point p2 = points[j];
                if(p1.getX() != p2.getX() && p1.getY() != p2.getY()) {
                    //Check if the other two points are in the HashSet
                    //If they are, then we have found a rectangle
                    Point p3 = new Point(p1.getX(), p2.getY());
                    Point p4 = new Point(p2.getX(), p1.getY());
                    if(pointHashSet.contains(p3) && pointHashSet.contains(p4)) {
                        count++;
                    }
                }
            }
        }
        //Divide by 2 because we counted each rectangle twice
        return count/2;
    }

    public static void main(String[] args) {
        //Run the tests
        TestCases tests = new TestCases();
        tests.testCases();
    }
}