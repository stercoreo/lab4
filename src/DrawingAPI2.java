/**
 * DrawingAPI2 is a concrete implementation of the DrawingAPI.
 * It provides a specific way to draw rectangles.
 */
public class DrawingAPI2 implements DrawingAPI {
    @Override
    public void drawRectangle(double x, double y, double width, double height) {
        System.out.println("API2.rectangle at " + x + ":" + y + " width " + width + " height " + height);
    }
}
