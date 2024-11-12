import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PaintSoftwareTest {

    @Test
    public void testCircleArea() {
        Circle circle = new Circle(5.0f, 0);
        assertEquals(78.53981633974483, circle.area(), 0.0001);
    }

    @Test
    public void testCircleCircumference() {
        Circle circle = new Circle(5.0f, 0);
        assertEquals(31.41592653589793, circle.circumference(), 0.0001);
    }

    @Test
    public void testWindowOpenClose() {
        Window window = new Window();
        assertDoesNotThrow(() -> window.open());
        assertDoesNotThrow(() -> window.close());
    }

    @Test
    public void testDrawingContextSizes() {
        DrawingContext context = new DrawingContext();
        assertEquals(100, context.getVerticalSize());
        assertEquals(200, context.getHorizontalSize());
    }

    @Test
    public void testHandleEvent() {
        Window window = new Window();
        Event event = new Event();
        assertDoesNotThrow(() -> window.handleEvent(event));
    }
}
