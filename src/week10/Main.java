package week10;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public GeometricObject captureTriangle()
    {
        System.out.println("Enter the color of a triangle (e.g. \"red\"): ");

        Scanner sin = null;
        String color = sin.nextLine();

        System.out.println("Is the triangle filled (y or n): ");
        String filled = sin.nextLine();

        System.out.println("Enter the lengths of the three sides of the triangle: ");

        Triangle result = new Triangle(sin.nextDouble(), sin.nextDouble(), sin.nextDouble());
        result.setColor(color);
        result.setFilled(filled.charAt(0) == 'y');
        sin.nextLine();

        return result;
    }

    private static DecimalFormat formatted = new DecimalFormat("#.##");

    public void executeTask()
    {
        System.out.println("This program gets input for three triangles from the user.\n" +
                "It then creates three Triangle objects and displays the\n" +
                "description of each.");

        ArrayList<GeometricObject> arrayList = new ArrayList();

        for (int i = 1; i <= 3; i++) {
            arrayList.add(captureTriangle());
        }

        arrayList.forEach((item)->System.out.println(item+"\nArea: "+formatted.format(item.getArea())+"\n"));

        System.out.println("Goodbye...");
    }
}