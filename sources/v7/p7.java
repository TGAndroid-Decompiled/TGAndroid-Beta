package v7;
public abstract class p7 {
    public static int a(int i10, int i11) {
        boolean z10;
        long j3 = i10 + i11;
        int i12 = (int) j3;
        if (j3 == i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return i12;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i10 + ", " + i11 + ")");
    }
}
