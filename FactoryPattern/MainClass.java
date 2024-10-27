package FactoryPattern;

public class MainClass {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape square = shapeFactory.getShape("SQUARE");
        Shape rectangle = shapeFactory.getShape("RECTANGLE");

        square.draw();
        rectangle.draw();
    }
}
