/**
 * Rectangle is a concrete implementation of the Shape class.
 * It uses a DrawingAPI to draw itself.
 */
public class Rectangle extends Shape {
    private double x, y, width, height;

    /**
     * Constructor for Rectangle.
     *
     * @param x the x-coordinate of the rectangle
     * @param y the y-coordinate of the rectangle
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     * @param drawingAPI the DrawingAPI to use for drawing
     */
    public Rectangle(double x, double y, double width, double height, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Draw the rectangle using the specified DrawingAPI.
     */
    @Override
    public void draw() {
        drawingAPI.drawRectangle(x, y, width, height);
    }
}
