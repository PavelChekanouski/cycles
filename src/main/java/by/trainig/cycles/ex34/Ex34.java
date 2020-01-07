package by.trainig.cycles.ex34;

public class Ex34 {
    public static void main(String[] args) {
        int min = 1000;
        int max = 9999;

        for (int i = min; i <= max; i++) {
            int sum = 0;
            int x = i;
            while (x > 0) {
                int number = x % 10;
                sum += number;
                x /= 10;
            }
            if(sum == 15) {
                System.out.println(i);
            }
        }
    }
}
