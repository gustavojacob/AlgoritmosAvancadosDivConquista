import java.util.Random;
import sun.security.util.Length;

//Exercicio 3

public class DivisaoConquista {

    public static int Iteracao = 0;

    public static int maxVal2(int A[], int init, int end) {
        if (end - init <= 1) {
            addIteracao();
            return Math.max(A[init], A[end]);

        } else {
            addIteracao();
            int m = (init + end) / 2;
            int v1 = maxVal2(A, init, m);
            int v2 = maxVal2(A, m + 1, end);
            return Math.max(v1, v2);
        }
    }

    public static void main(String[] args) {

        long inicio = System.nanoTime();

        int init = 0;
        int n = 1048576;
        int numbers[] = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (1 + (Math.random() * n + 1));
            System.out.println(numbers[i]);
        }

        System.out.println("Maior valor é: " + maxVal2(numbers, init, numbers.length - 1));

        long fim = System.nanoTime();
        long tempoTotal = fim - inicio;
        System.out.println("Tempo total: " + tempoTotal);
        System.out.println("Numero de iterações: " + Iteracao);
    }

    public static void addIteracao() {
        Iteracao++;
    }
}