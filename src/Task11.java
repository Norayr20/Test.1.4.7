import java.math.BigInteger;
public class Task11 {
    public static void main(String[] args) {

        System.out.println(factorial(1));

    }

    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;

        for (int a = 1; a < value; a++) {
            result = result.multiply(BigInteger.valueOf(a));

            return result;
        }
        return result;
    }
}