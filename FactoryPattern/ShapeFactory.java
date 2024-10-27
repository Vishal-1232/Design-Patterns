package FactoryPattern;

public class ShapeFactory {
    Shape getShape(String input){
        switch (input) {
            case "SQUARE":
                return new Square();
            
            case "RECTANGLE":
                return new Rectangle();    
        
            default:
                return null;
        }
    }    
}
