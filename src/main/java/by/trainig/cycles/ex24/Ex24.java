package by.trainig.cycles.ex24;

import java.util.Scanner;

/**
 * There is a number. Find reversed number and sum of even numbers.
 */
public class Ex24 {
    public static void main(String[] args) {
        while(true){
            System.out.println("Enter int n: ");

            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            if(n == 0) break;

            for(int a=n; a>0; a/=10){
                System.out.print(a%10);
            }

            System.out.println();

            int sum = 0;
            while(n>0) {
                int number = n%10;
                if(number % 2 == 0) {
                    sum += number;
                }
                n = n / 10;
            }
            System.out.println("Sum of even numbers: " + sum);
        }
    }
}
