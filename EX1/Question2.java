import java.io.*;
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        double radius = 5.5;
        double area = Math.PI * radius * radius;
        System.out.printf("The area is: %f\n", area);
        double perimeter = 2 * Math.PI * radius;
        System.out.printf("The perimeter is: %f\n", perimeter);
    }
}