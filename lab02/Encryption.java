import java.math.BigInteger;

public class Encryption {
    public static void main(String[] args) {

        if(args.length != 0) {
            // Generowanie kluczy
            int p = 397;
            int q = 103;
            int n = p * q;
            int phi = (p-1)*(q-1);
            int e = 3;
            while(public_key(e, phi) != 1) {
                e += 2;
            }
            int d = (int) private_key((double)e,(double) phi);

            // Kododwanie
            BigInteger big_e = BigInteger.valueOf(e);
            BigInteger big_n = BigInteger.valueOf(n);

            int len = args[0].length();
            byte[] arr = new byte[len];
            arr = args[0].getBytes();

            
            BigInteger[] code = new BigInteger[len];
            for(int i = 0; i < len; i++) {
                BigInteger tmp = new BigInteger(""+arr[i]);
                code[i] = tmp.modPow(big_e, big_n);
//                 System.out.println(code[i]);
            }
            
            // Decodowanie
            BigInteger big_d = BigInteger.valueOf(d);

            char[] final_arr = new char[len];
            for(int i = 0; i < len; i++) {
                BigInteger tmp = new BigInteger(""+code[i]);
                final_arr[i] = (char) tmp.modPow(big_d, big_n).intValue();            
                System.out.print(final_arr[i]);
            }    
            
            System.out.println("");


            // Quiz
//            int[] coded = {24422, 39378, 9444, 24168, 11618, 39378, 9444, 40411, 25802};
        }
        else
            System.out.println("Error");
    }

    public static int public_key(int a, int b) {
        int tmp = 0;
        while(b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static double private_key(double a, double b) {
        double x_0 = 1;
        double x = 0;
        double b_0 = b;
        double q = 0;
        double temp = 0;

        while(b!=0) {
            q = Math.floor(a/b);
            temp = x;
            x = x_0 - q*x;
            x_0 = temp;
            temp = a % b;
            a = b;
            b = temp;
        }
        if(x_0 < 0)
            x_0 = x_0 + b_0;
        return x_0;
    }
}
