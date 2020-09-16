import java.util.Scanner;

public class TritangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 3 canh cua tam giac");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println("Nhap vao mau sac ");
        scanner.nextLine();
        String color = scanner.nextLine();

        Tritangle tritangle = new Tritangle(a,b,c);
        tritangle.setColor(color);
        tritangle.setFilled(false);
        System.out.println(tritangle.toString());
    }
}
