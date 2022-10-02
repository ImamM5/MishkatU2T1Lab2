import java.util.Scanner;

public class RectangleRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rectangle 1 length: ");
        int rect1Length = input.nextInt();
        System.out.print("Enter rectangle 1 width: ");
        int rect1Width = input.nextInt();
        System.out.print("Enter rectangle 1 height: ");
        double rect1Height = input.nextDouble();
        System.out.print("Enter rectangle 2 length: ");
        int rect2Length = input.nextInt();
        System.out.print("Enter rectangle 2 width: ");
        int rect2Width = input.nextInt();
        System.out.print("Enter rectangle 2 height: ");
        double rect2Height = input.nextDouble();

        Rectangle rect1 = new Rectangle(rect1Length,rect1Width);
        System.out.println("Rectangle 1's Area: "+ rect1.calculateArea()+ ", Box Volume: "+ rect1.calculateBoxVolume(rect1Height));

        Rectangle rect2 = new Rectangle(rect2Length,rect2Width);
        System.out.println("Rectangle 2's Area: "+ rect2.calculateArea()+ ", Box Volume: "+ rect2.calculateBoxVolume(rect2Height));
    }
}

