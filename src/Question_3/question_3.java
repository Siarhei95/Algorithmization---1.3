package Question_3;

import java.util.Arrays;
import java.util.Scanner;

public class question_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        System.out.print("Enter the numbers of cells n: ");
        int n = scanner.nextInt();
        double [] array = new double[n];
        for(int i=0; i<n; i++) {
            System.out.print("Enter the value of array "+i+": ");
            array[i] = scanner.nextInt();
            if (array[i]>0) {
                a = a + 1;
            }
            else if(array[i]<0) {
                b = b + 1;
            }
            else {
                c = c + 1;
            }
        }
        System.out.println("The resulting array: " + Arrays.toString(array));
        System.out.println("Number of positive: " + a);
        System.out.println("Number of negative: " + b);
        System.out.println("Number with 0: " + c);
    }
}
