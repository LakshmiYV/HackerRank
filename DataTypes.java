import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        Scanner scanner = new Scanner(System.in);
        
        int inputInt = scanner.nextInt();
        
        double inputDouble = scanner.nextDouble();
        
        scanner.nextLine();
        
        String inputString = scanner.nextLine();
        
        System.out.println(i + inputInt);
        
        System.out.printf("%.1f%n", d + inputDouble);
        
        System.out.println(s + inputString);
        
        scanner.close();
    }
}
