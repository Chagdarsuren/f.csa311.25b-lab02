package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.rendering.Renderer; // Assuming Renderer is in this package

public class Main {
    public static void main(String[] args) {
        // Create a rectangle with width 2 and height 3
        Rectangle rectangle = new Rectangle(2, 3);

        // Create a renderer object to render the rectangle
        Renderer renderer = new Renderer(rectangle);

        // Draw the rectangle using the renderer
        renderer.draw();
    }
}
