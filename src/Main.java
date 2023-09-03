import shapes.*;

public class Main {


    public static void main(String[] args) {
        Circle circle = new Circle("Коло");
        Oval oval = new Oval("Овал");
        Square square = new Square("Квадрат");
        Rectangle rectangle = new Rectangle("Прямокутник");
        Triangle triangle = new Triangle("Трикутник");

        System.out.println("Circle name: "+ circle.getName());
        System.out.println("Oval name: "+ oval.getName());
        System.out.println("Square name: "+ square.getName());
        System.out.println("Rectangle name: "+ rectangle.getName());
        System.out.println("Triangle name: "+ triangle.getName());
    }
}