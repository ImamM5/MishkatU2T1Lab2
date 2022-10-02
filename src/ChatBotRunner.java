import java.util.Scanner;

public class ChatBotRunner
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);

        ChatBot debbie = new ChatBot("Debbie",25);

        System.out.print("Your brith year: ");
        int age = input.nextInt();
        debbie.calculateAge(age);

        System.out.print("Your height in centimeters: ");
        Double height = input.nextDouble();
        System.out.println(debbie.printHeight(height));

    }
}
