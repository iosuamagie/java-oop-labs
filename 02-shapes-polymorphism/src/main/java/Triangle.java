public class Triangle extends Form {
    private float height;
    private float base;

    public Triangle() {
        this.height = 0;
        this.base = 0;
    }

    public Triangle(float height, float base , String color ) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public float getArea() {
        return (float) (base * height) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Triangle height=" + height + ", base=" + base;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle other)) return false;
        return height == other.height
                && base == other.base
                && java.util.Objects.equals(getColor(), other.getColor());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(height, base, getColor());
    }
}
