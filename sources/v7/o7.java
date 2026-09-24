package v7;
public abstract class o7 {
    public static long a(double d) {
        if (b(d)) {
            int exponent = Math.getExponent(d);
            long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
            if (exponent == -1023) {
                return doubleToRawLongBits << 1;
            }
            return doubleToRawLongBits | 4503599627370496L;
        }
        throw new IllegalArgumentException("not a normal value");
    }

    public static boolean b(double d) {
        if (Math.getExponent(d) <= 1023) {
            return true;
        }
        return false;
    }
}
