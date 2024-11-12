public class Window extends Event{
    public void open() {
        System.out.println("Opening window");
        event();
    }

    public void close() {
        System.out.println("Closing window");
        event();  
    }

    public void move() {
        System.out.println("Moving window");
        event();
    }

    public void display() {
        System.out.println("Displaying window");
        event();
    }

    public void handleEvent(Event event) {
        System.out.println("Handling event in window");
        event();
    }
}
