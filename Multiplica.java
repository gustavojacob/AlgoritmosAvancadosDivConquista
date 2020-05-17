//Exercicio 4

public class Multiplica {
    public static int Iteracao = 0;

    public static void main(String[] args) {

        double inicio = System.nanoTime();

        //System.out.println("Resultado da multiplicação: " + fazMultiplicacao(16, 16, 4));

        //System.out.println("Resultado da multiplicação: " + fazMultiplicacao(12345, 43210, 5));

        //System.out.println("Resultado da multiplicação: " + fazMultiplicacao(65536, 65536, 16));
        System.out.println("Resultado da multiplicação: " + fazMultiplicacao(18446744073709551615D, 18446744073709551615D, 64));


        double fim = System.nanoTime();

        double tempoTotal = fim - inicio;
        System.err.println("Tempo total: " + tempoTotal);
        System.out.println("Numero de interações: " + Iteracao);

    }

    public static double fazMultiplicacao(double x, double y, double n) {

        if (n == 1) {
            addIteracao();
            return x * y;
        } else {
            addIteracao();
            double m = n / 2;
            double a = (double) (x / (Math.pow(2, m)));
            double b = (double) (x % ((Math.pow(2, m))));
            double c = (double) (y / ((Math.pow(2, m))));
            double d = (double) (y % ((Math.pow(2, m))));
            double e = fazMultiplicacao(a, c, m);
            double f = fazMultiplicacao(b, d, m);
            double g = fazMultiplicacao(b, c, m);
            double h = fazMultiplicacao(a, d, m);
            return (double) Math.pow(2, (2 * m)) * e + (double) (Math.pow(2, m)) * (g + h) + f;
        }
    }

    public static void addIteracao() {
        Iteracao++;
    }

}