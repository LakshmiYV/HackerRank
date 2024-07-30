import java.io.*;
import java.math.*;
import java.util.*;

class Result {

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Calculate tip and tax
        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;
        
        // Calculate total cost
        double total_cost = meal_cost + tip + tax;
        
        // Round the total cost to the nearest integer
        int rounded_cost = (int) Math.round(total_cost);
        
        // Print the result
        System.out.println(rounded_cost);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());
        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());
        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());
        
        Result.solve(meal_cost, tip_percent, tax_percent);
        
        bufferedReader.close();
    }
}
