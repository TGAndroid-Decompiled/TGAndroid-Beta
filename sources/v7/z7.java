package v7;
public abstract class z7 {
    public static byte a(long j3) {
        boolean z10;
        if ((j3 >> 8) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.b(j3, "out of range: %s", z10);
        return (byte) j3;
    }
}
