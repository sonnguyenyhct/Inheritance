public class Circle2 {

    double radius;
    String color;
    double acreage = 3.14*radius*radius;

    public Circle2(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle2{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", acreage=" + acreage +
                '}';
    }
}
