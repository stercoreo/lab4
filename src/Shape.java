/**
 * Shape is an abstract class that uses a DrawingAPI to draw shapes.
 */
public abstract class Shape {
    protected DrawingAPI drawingAPI;

    /**
     * Constructor for Shape.
     *
     * @param drawingAPI the DrawingAPI to use for drawing
     */
    protected Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    /**
     * Draw the shape using the specified DrawingAPI.
     */
    public abstract void draw();
}
