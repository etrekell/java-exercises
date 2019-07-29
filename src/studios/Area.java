package studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a radius: ");

        while (!scanner.hasNextDouble()){
        System.out.println("Invalid, Please enter a radius as a number: ");
        scanner.nextLine();
        }

        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of a circle with a radius of " + radius + " is " + area);
    }
}
