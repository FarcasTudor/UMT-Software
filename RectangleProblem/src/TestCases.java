import org.junit.Test;

import static org.junit.Assert.*;

public class TestCases {

    private void testCase1() {
        Point[] p1 = {new Point(1,1), new Point(1,3), new Point(2,1), new Point(2,3), new Point(3,1), new Point(3,3)};
        Point[] p2 = {new Point(1,1), new Point(1,3), new Point(2,1), new Point(3,1), new Point(3,3)};

        System.out.println("~~~Test Case 1~~~");
        assertEquals(Main.numberOfRectangles(p1), 3);
        System.out.println("Assertion test for first example from PDF passed!");

        assertEquals(Main.numberOfRectangles(p2), 1);
        System.out.println("Assertion test for second example from PDF passed!");



        try{
            assertNotEquals(Main.numberOfRectangles(p1), 3);
        }
        catch (AssertionError e) {
            System.out.println(e.getMessage() + " (Intentionally chosen a wrong assertion)");
        }
        try {
            assertNotEquals(Main.numberOfRectangles(p2), 1);
        } catch (AssertionError e) {
            System.out.println(e.getMessage() + " (Intentionally chosen a wrong assertion)");
        }
    }

    private void testCase2() {
        Point[] p1 = {new Point(0.5,0.5), new Point(0.5,1.5),
                      new Point(1.5,0.5), new Point(1.5,1.5),
                      new Point(2.5,0.5), new Point(2.5,1.5),
                      new Point(3.5,0.5), new Point(3.5,1.5)};
        Point[] p2 = {new Point(0.5,0.5), new Point(0.5,1.5),
                      new Point(2.5,0.5), new Point(2.5,1.5),
                      new Point(3.5,0.5), new Point(3.5,1.5)};

        System.out.println("\n~~~Test Case 2~~~");
        assertEquals(Main.numberOfRectangles(p1) ,6);
        System.out.println("Assertion test for first example chosen passed!");

        assertEquals(Main.numberOfRectangles(p2),3);
        System.out.println("Assertion test for second example chosen passed!");


        try{
            assertNotEquals(Main.numberOfRectangles(p1), 6);
        }
        catch (AssertionError e) {
            System.out.println(e.getMessage() + " (Intentionally chosen a wrong assertion)");
        }
        try{
            assertNotEquals(Main.numberOfRectangles(p2), 3);
        } catch (AssertionError e) {
            System.out.println(e.getMessage() + " (Intentionally chosen a wrong assertion)");
        }
    }

    private void testCase3() {
        Point[] p1 = {new Point(1,1), new Point(1,2), new Point(1,3), new Point(1,4),new Point(1,5),
                      new Point(2,1), new Point(2,2), new Point(2,3), new Point(2,4),new Point(2,5),
                      new Point(3,1), new Point(3,2), new Point(3,3), new Point(3,4),new Point(3,5),
                      new Point(4,1), new Point(4,2), new Point(4,3), new Point(4,4),new Point(4,5),
                      new Point(5,1), new Point(5,2), new Point(5,3), new Point(5,4),new Point(5,5)};

        Point[] p2 = {new Point(1,1), new Point(1,2), new Point(1,3), new Point(1,4),new Point(1,5),
                      new Point(2,1),new Point(2,5),
                      new Point(3,1),new Point(3,5),
                      new Point(4,1),new Point(4,5),
                      new Point(5,1), new Point(5,2), new Point(5,3), new Point(5,4),new Point(5,5)};

        System.out.println("\n~~~Test Case 3~~~");
        assertEquals(Main.numberOfRectangles(p1), 100);
        System.out.println("Assertion test for first example chosen passed!");

        assertEquals(Main.numberOfRectangles(p2), 19);
        System.out.println("Assertion test for second example chosen passed!");

        try{
            assertNotEquals(Main.numberOfRectangles(p1),100);
        }
        catch (AssertionError e) {
            System.out.println(e.getMessage() + " (Intentionally chosen a wrong assertion)");
        }
        try {
            assertNotEquals(Main.numberOfRectangles(p2), 19);
        } catch (AssertionError e) {
            System.out.println(e.getMessage() + " (Intentionally chosen a wrong assertion)");
        }
    }

    private void testCase4() {
        Point[] p1 = {new Point(1,1), new Point(1,2), new Point(1,3), new Point(1,4),new Point(1,5), new Point(1,6), new Point(1,7), new Point(1,8), new Point(1,9), new Point(1,10), new Point(1,11), new Point(1,12), new Point(1,13), new Point(1,14), new Point(1,15), new Point(1,16), new Point(1,17), new Point(1,18), new Point(1,19), new Point(1,20),
                      new Point(2,1), new Point(2,2), new Point(2,3), new Point(2,4),new Point(2,5), new Point(2,6), new Point(2,7), new Point(2,8), new Point(2,9), new Point(2,10), new Point(2,11), new Point(2,12), new Point(2,13), new Point(2,14), new Point(2,15), new Point(2,16), new Point(2,17), new Point(2,18), new Point(2,19), new Point(2,20),
                      new Point(3,1), new Point(3,2), new Point(3,3), new Point(3,4),new Point(3,5), new Point(3,6), new Point(3,7), new Point(3,8), new Point(3,9), new Point(3,10), new Point(3,11), new Point(3,12), new Point(3,13), new Point(3,14), new Point(3,15), new Point(3,16), new Point(3,17), new Point(3,18), new Point(3,19), new Point(3,20),
                      new Point(4,1), new Point(4,2), new Point(4,3), new Point(4,4),new Point(4,5), new Point(4,6), new Point(4,7), new Point(4,8), new Point(4,9), new Point(4,10), new Point(4,11), new Point(4,12), new Point(4,13), new Point(4,14), new Point(4,15), new Point(4,16), new Point(4,17), new Point(4,18), new Point(4,19), new Point(4,20),
                      new Point(5,1), new Point(5,2), new Point(5,3), new Point(5,4),new Point(5,5), new Point(5,6), new Point(5,7), new Point(5,8), new Point(5,9), new Point(5,10), new Point(5,11), new Point(5,12), new Point(5,13), new Point(5,14), new Point(5,15), new Point(5,16), new Point(5,17), new Point(5,18), new Point(5,19), new Point(5,20)};

        System.out.println("\n~~~Test Case 4~~~");
        assertEquals(Main.numberOfRectangles(p1), 1900);
        System.out.println("Assertion test for first example chosen passed!");

        try {
            assertNotEquals(Main.numberOfRectangles(p1), 1900);
        } catch (AssertionError e) {
            System.out.println(e.getMessage() + " (Intentionally chosen a wrong assertion)");
        }

    }

    private void testcase5() {
        Point[] p1 = {new Point(-10, 1), new Point(-10, 2), new Point(-10, 3), new Point(-10, 4), new Point(-10, 5), new Point(-10, 6), new Point(-10, 7), new Point(-10, 8), new Point(-10, 9), new Point(-10, 10),
                new Point(-9, 1), new Point(-9, 2), new Point(-9, 3), new Point(-9, 4), new Point(-9, 5), new Point(-9, 6), new Point(-9, 7), new Point(-9, 8), new Point(-9, 9), new Point(-9, 10),
                new Point(-8, 1), new Point(-8, 2), new Point(-8, 3), new Point(-8, 4), new Point(-8, 5), new Point(-8, 6), new Point(-8, 7), new Point(-8, 8), new Point(-8, 9), new Point(-8, 10),
                new Point(-7, 1), new Point(-7, 2), new Point(-7, 3), new Point(-7, 4), new Point(-7, 5), new Point(-7, 6), new Point(-7, 7), new Point(-7, 8), new Point(-7, 9), new Point(-7, 10),
                new Point(-6, 1), new Point(-6, 2), new Point(-6, 3), new Point(-6, 4), new Point(-6, 5), new Point(-6, 6), new Point(-6, 7), new Point(-6, 8), new Point(-6, 9), new Point(-6, 10),
                new Point(-5, 1), new Point(-5, 2), new Point(-5, 3), new Point(-5, 4), new Point(-5, 5), new Point(-5, 6), new Point(-5, 7), new Point(-5, 8), new Point(-5, 9), new Point(-5, 10),
                new Point(-4, 1), new Point(-4, 2), new Point(-4, 3), new Point(-4, 4), new Point(-4, 5), new Point(-4, 6), new Point(-4, 7), new Point(-4, 8), new Point(-4, 9), new Point(-4, 10),
                new Point(-3, 1), new Point(-3, 2), new Point(-3, 3), new Point(-3, 4), new Point(-3, 5), new Point(-3, 6), new Point(-3, 7), new Point(-3, 8), new Point(-3, 9), new Point(-3, 10),
                new Point(-2, 1), new Point(-2, 2), new Point(-2, 3), new Point(-2, 4), new Point(-2, 5), new Point(-2, 6), new Point(-2, 7), new Point(-2, 8), new Point(-2, 9), new Point(-2, 10),
                new Point(-1, 1), new Point(-1, 2), new Point(-1, 3), new Point(-1, 4), new Point(-1, 5), new Point(-1, 6), new Point(-1, 7), new Point(-1, 8), new Point(-1, 9), new Point(-1, 10)};

        System.out.println("\n~~~Test Case 5~~~");
        assertEquals(Main.numberOfRectangles(p1), 2025);
        System.out.println("Assertion test for first example chosen passed!");

        try {
            assertNotEquals(Main.numberOfRectangles(p1), 2025);
        } catch (AssertionError e) {
            System.out.println(e.getMessage() + " (Intentionally chosen a wrong assertion)");
        }

    }

    @Test
    public void testCases() {
        testCase1(); // Test Case for the given example from problem2.pdf
        testCase2();
        testCase3();
        testCase4();
        testcase5();
    }




}
