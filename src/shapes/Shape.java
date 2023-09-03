package shapes;

public abstract class Shape {
    public final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
