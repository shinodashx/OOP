import java.io.*;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        System.out.printf("a\ta^2\ta^3\n");
        for (int i = 1; i <= 4; ++i) {
            for (int j = 1; j <= 3; ++j) {
                System.out.printf("%d\t", (int) Math.pow((double) i, (double) j));
            }
            System.out.printf("\n");
        }
    }
}
