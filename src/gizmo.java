import java.util.ArrayList;
import java.util.List;

public class gizmo {

    public static int result = 0;

    public static void main(String[] args) {
        problem3();
    }

    public static void problem1() {
        for (int i = 0; i <= 999; i++) {
            if (i % 3 == 0) {
                result += i;
            } else if (i % 5 == 0) {
                result += i;
            }
        }
        System.out.println(result);
    }

    public static void problem2() {
        List<Integer> fibonacciSeries = new ArrayList<>();
        int i = 1;
        int k = 2;
        int fibo = 0;

        fibonacciSeries.add(i);
        fibonacciSeries.add(k);

        for (fibo = 0; fibo < 4000000; ) {
            fibo = i + k;
            fibonacciSeries.add(fibo);

            i = k;
            k = fibo;
        }

        for (int j = 0; j < fibonacciSeries.size(); j++) {
            if (fibonacciSeries.get(j) % 2 == 0) {
                result += fibonacciSeries.get(j);
            }
        }
        System.out.println(result);
    }

    public static void problem3(){
        int currentPrime = 2;
        long numberToFactor = 600851475143L;

        while (numberToFactor > 1)
        {
            if (numberToFactor % currentPrime == 0) {
                numberToFactor = numberToFactor / currentPrime;
            }

            else {
                currentPrime += 1;
            }
        }
          System.out.println(currentPrime);
    }

}