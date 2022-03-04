import java.io.InputStreamReader;
import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        Scanner cin = new Scanner(new InputStreamReader(System.in));
        System.out.printf("Enter a weight in kilogram: ");
        double n = cin.nextDouble();
        int pounds = (int) (n / 0.454);
        double ounces = n * 35.274 % 16;
        System.out.printf("Equivalent imperial weight is %d lb %.1f oz", pounds, ounces);
        cin.close();
    }
}