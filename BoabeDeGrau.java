import java.math.BigInteger;

public class BoabeDeGrau {
    public static void main(String[] args) {
        BigInteger number = new BigInteger("2");
        BigInteger sum = BigInteger.ZERO;

        for(int i=1 ;i<64; i++)
        {
           BigInteger x = number.pow(i);
            sum = sum.add(x);
        }

        System.out.println(sum);
    }
}
