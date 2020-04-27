//Exercicio 2


public class MaiorValor {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = (int) (1 + (Math.random() * 100));

        }

        for (int i = 0; i < 9; i++)

            System.out.println(numbers[i]);

        maxVal1(numbers, numbers.length);

    }

    public static int maxVal1(int A[], int n) {
        int max = A[0];
        for (int i = 1; i < n; i++) {
            if (A[i] > max)
                max = A[i];
        }
        System.out.println("O maior numero é: "+max);
        return max;
    }

}
