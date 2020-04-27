import sun.security.util.Length;

//Exercicio 3

public class DivisaoConquista {

    int maxVal2(int A[], int init, int end) {
        if (end - init <= 1)
            return max(A[init], A[end]);
        else {
            int m = (init + end) / 2;
            int v1 = maxVal2(A, init, m);
            int v2 = maxVal2(A, m + 1, end);
            return max(v1, v2);
        }
    }

    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = (int) (1 + (Math.random() * 100));

        }

        int init = numbers[0];
        int end = numbers[numbers.length - 1];

        maxVal2(numbers, init, end);
    }

}
