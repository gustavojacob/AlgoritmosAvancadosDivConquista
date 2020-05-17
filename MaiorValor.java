//Exercicio 2
//start = System.nanoTime() contabilizar tempo 

public class MaiorValor {
    public static int Iteracao = 0;
    public static void main(String[] args) {
        long inicio = System.nanoTime();
        int[] numbers = new int[32];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (1 + (Math.random() * 32));

        }

       // for (int i = 0; i < numbers.length; i++)

            //System.out.println(numbers[i]);

        maxVal1(numbers, numbers.length);
        long fim = System.nanoTime();
        long tempoTotal = fim - inicio;
        System.out.println("Tempo total: " + tempoTotal);
    }

    public static int maxVal1(int A[], int n) {
        int max = A[0];
        for (int i = 1; i < n; i++) {
            if (A[i] > max)
                max = A[i];
                addIteracao();
        }
        System.out.println("O maior numero é: "+max);

        System.out.println("Numero de iteções: " + Iteracao);
        return max;
    }
    
    public static void addIteracao() {
		Iteracao++;
    }

}
