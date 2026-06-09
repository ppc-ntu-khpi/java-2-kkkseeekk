package test;

import domain.Exercise;

/**
 * @author Kozlova
 */
public class TestResult {

    public static void main(String[] args) {
        int num1 = 228;
        int num2 = 141;
        
        System.out.println("--- Practical Work: Static Methods ---");
        System.out.println("Variant 8: Common dividers for " + num1 + " and " + num2);
        
        String dividers = Exercise.Calculate(num1, num2);
        
        System.out.println("Common dividers: " + dividers);
    }
}