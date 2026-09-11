import java.util.*;

public class wk1p3 {

    static String getBmiStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    static void printWellnessReport(double[] heights, double[] weights) {
        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);

            System.out.printf("Person %d: Height %.2f m, Weight %.1f kg, BMI %.2f, Status %s%n",
                    i + 1, heights[i], weights[i], bmi, getBmiStatus(bmi));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[3];
        double[] weights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter height (m): ");
            heights[i] = sc.nextDouble();

            System.out.print("Enter weight (kg): ");
            weights[i] = sc.nextDouble();
        }

        printWellnessReport(heights, weights);
    }
}
