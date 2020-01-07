package by.trainig.cycles.ex7;

import java.util.Scanner;

/**
 * [a,b] y = x {x > 2}; y = -x {x <= 2};
 *
 */
public class Ex7 {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a: ");
            int a = scanner.nextInt();

            System.out.println("Enter b: ");
            int b = scanner.nextInt();
            int y = 0;
            for(int x = a; x <= b; x++){
                if(a > 2){
                    y += x;
                }
                else {
                    y += -x;
                }
            }
            System.out.println("Result: " + y);
        }
    }
}
