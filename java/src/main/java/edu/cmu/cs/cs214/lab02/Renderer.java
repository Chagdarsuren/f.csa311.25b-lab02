package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;

public class Renderer {
    private Rectangle rectangle;

    public Rectangle getRectangle() {
        return rectangle;
    }
    
    Renderer(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    void draw() {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Renderer.class.getName());
        double area = rectangle.getArea(); // Added this line to calculate the area of the rectangle
        String message = """
                Shape printed
                Its area is %f
                """.formatted(area); // Fixed the undefined variable 'area' by defining it above
        logger.info(message);

        // assume implementation

        System.out.println("Shape printed\n" + "Its area is " + area); // Fixed the undefined variable 'area' by defining it above
    }
}
