package by.trainig.cycles.ex17;

import java.util.Scanner;

/**
 * double a; int n; calculate a*(a+1)*...*(a+n-1)
 */
public class Ex17 {
    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a(double): ");
            double a = scanner.nextDouble();

            System.out.println("Enter n(int): \n(Enter 0 to exit)");
            int n = scanner.nextInt();

            if(n == 0) {
                break;
            }

            double result = 1;
            for(int i = 0; i < n; i++){
                result *= a + i;
            }

            System.out.println("Result: " + result);
        }
    }
}
