/**
 * DrawingAPI is an interface that defines the API for drawing operations.
 */
public interface DrawingAPI {
    /**
     * Draw a rectangle at the specified coordinates with the given width and height.
     *
     * @param x the x-coordinate of the rectangle
     * @param y the y-coordinate of the rectangle
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */
    void drawRectangle(double x, double y, double width, double height);
}
