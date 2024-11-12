public class Point extends Circle {
    public static void point()
    {
        System.out.println("Considering center of the circle as (0,0)");
    }

    public Point(float radius, int center) {
        super(radius, center);
    }
}
