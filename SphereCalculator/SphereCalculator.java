import java.util.Scanner;

public class SphereCalculator {
    public static void main(String [] args) {
        Scanner scnr = new Scanner (System.in);
        double radius;
        double volume;
        double surfaceArea;
        
        System.out.print("Enter the sphere's radius: ");
        radius = scnr.nextDouble();
        volume = 4 * Math.PI * Math.pow(radius, 3.0) / 3;
        surfaceArea = 4 * Math.PI * Math.pow(radius, 2.0);
        System.out.printf("Volume: %.4f\nSurface area: %.4f\n", volume, surfaceArea);
    }
}
