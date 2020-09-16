public class Cylinder extends Circle2 {
    double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double volume(){
        return this.radius*this.radius*height*3.14;
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(1,"blue",2);
        System.out.println(cylinder.volume());
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", acreage=" + acreage +
                '}';
    }
}
