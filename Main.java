import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <= 30; i++)
        {
            System.out.println(i);}

        for (int i = 0; i <= 30; i++)
        {
            System.out.println(30-i);}

        for (int i = 3; i <= 18; i = i+3)
        {
            System.out.println(i);}

        for (int i = 10; i >= 0; i = i-2)
        {
            System.out.println(i);}

        for (int i = 0; i <= 4; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");

            }
            System.out.println("");}

        for (int i = 0; i <= 4; i++)
        {
            for (int j = 4; j >= i; j--)
            {
                System.out.print("*");}
            System.out.println("");}

        for (int i = 0; i <= 4; i++)
        {
            System.out.println("*****");}


        String trash = "";
        double temp = 0;
        double far = 0;
        boolean done = false;
        do {
            System.out.println("enter the temperature in celsius: ");

            if (in.hasNextDouble()) {
                temp = in.nextDouble();
                in.nextLine();
                far = (temp * 1.8) + 32;
                System.out.println("Temperature in Fahrenheit is " + far);

                done = true;
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not valid number");
            }
        } while (!done);








    }
}