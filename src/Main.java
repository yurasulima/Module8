import shapes.*;

public class Main {


    public static void main(String[] args) {
        Circle circle = new Circle("Коло");
        Oval oval = new Oval("Овал");
        Square square = new Square("Квадрат");
        Rectangle rectangle = new Rectangle("Прямокутник");
        Triangle triangle = new Triangle("Трикутник");


        GetShapeName getShapeName = new GetShapeName();
        System.out.println("Circle name: "+ getShapeName.getName(circle));
        System.out.println("Oval name: "+ getShapeName.getName(oval));
        System.out.println("Square name: "+ getShapeName.getName(square));
        System.out.println("Rectangle name: "+ getShapeName.getName(rectangle));
        System.out.println("Triangle name: "+ getShapeName.getName(triangle));
    }
}