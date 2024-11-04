/**
 * Main class to test the Bridge pattern implementation.
 */
public class Main {
    public static void main(String[] args) {
        Shape rectangle1 = new Rectangle(1, 2, 3, 4, new DrawingAPI1());
        Shape rectangle2 = new Rectangle(5, 6, 7, 8, new DrawingAPI2());

        rectangle1.draw();
        rectangle2.draw();
    }
}
