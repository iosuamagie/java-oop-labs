public class Circle extends Form {
    private float radius;

    public Circle() {
        this.radius = 0;
    }

    public Circle(float radius , String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return super.toString() + " -> Circle [radius=" + radius + "]";
    }

}
