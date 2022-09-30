public class RectangleRunner
{
    public static void main (String [] args)
    {
        Rectangle rec1 = new Rectangle(10,20);
        int area = rec1.calculateArea();
        double volume = rec1.calculateBoxVolume(25);

        System.out.println("This rectangle has an area of "+ area + "and a volume of "+ volume+ ".");

    }
}
