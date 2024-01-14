public class proje8FibonacciSerisi {
    public static void main(String[] args) {
        int n = 20;

        int[] fibonaci = new int[n];
        fibonaci[0] = 0;
        fibonaci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonaci[i] = fibonaci[i - 1] + fibonaci[i - 2];
        }

        System.out.println("Fibonaci Serisi ilk 20 sayı:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonaci[i] + " ");
        }
    }
}
