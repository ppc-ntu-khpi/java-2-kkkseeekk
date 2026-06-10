package domain;

/**
 * @author Kozlova
 */
public class Exercise {

    public static String Calculate(int number1, int number2) {
        StringBuilder resultBuilder = new StringBuilder();
        
        int abs1 = Math.abs(number1);
        int abs2 = Math.abs(number2);
        int maxLimit = Math.min(abs1, abs2);
        
        for (int i = 1; i <= maxLimit; i++) {
            if (abs1 % i == 0 && abs2 % i == 0) {
                if (resultBuilder.length() > 0) {
                    resultBuilder.append(", ");
                }
                resultBuilder.append(i);
            }
        }
        
        return resultBuilder.toString();
    }
}