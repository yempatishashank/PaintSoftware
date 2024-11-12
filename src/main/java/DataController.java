public class DataController {
    public static void main(String[] args) {
        Window window = new Window();
        window.open();
        Rectangle rectangle=new Rectangle();
        Polygon polygon =new Polygon();
        rectangle.draw();
        polygon.draw();
        Circle circle = new Circle(5.0f,0);
        System.out.printf("Circle area: %.2f sq.mt" ,circle.area());
    }

}
