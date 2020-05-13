//Exercicio 4

public class Multiplica {

    
    public static void main(String[] args) {
        
       // System.out.println(fazMultiplicacao(1244, 4321, 4));

        //System.out.println(fazMultiplicacao(12345, 43210, 5));

        System.out.println(fazMultiplicacao(9934567890L,9876543210L, 10));


    }
    
    
    public static long fazMultiplicacao(long x, long y, long n) {

        if (n == 1) {
            return x * y;
        } else {
            long m = n / 2;
            long a = (long) (x / (Math.pow(2, m)));
            long b = (long) (x % ((Math.pow(2, m))));
            long c = (long) (y / ((Math.pow(2, m))));
            long d = (long) (y % ((Math.pow(2, m))));
            long e = fazMultiplicacao(a, c, m);
            long f = fazMultiplicacao(b, d, m);
            long g = fazMultiplicacao(b, c, m);
            long h = fazMultiplicacao(a, d, m);
            return (long) Math.pow(2, (2 * m)) * e + (long) (Math.pow(2, m)) * (g + h) + f;
        }
    }
}