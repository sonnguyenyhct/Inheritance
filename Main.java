public class Main {
    public static void main(String[] args) {
        // write your code here
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(5,5,5);
        System.out.println(point3D);
        point3D.setXYZ(6,6,6);
        System.out.println(point3D);
    }
}