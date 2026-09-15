package v7;
public abstract class z7 {
    public static long[] a(long[]... jArr) {
        boolean z10;
        long j3 = 0;
        for (long[] jArr2 : jArr) {
            j3 += jArr2.length;
        }
        int i10 = (int) j3;
        if (j3 == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.b(j3, "the total number of elements (%s) in the arrays must fit in an int", z10);
        long[] jArr3 = new long[i10];
        int i11 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i11, jArr4.length);
            i11 += jArr4.length;
        }
        return jArr3;
    }

    public static int b(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }
}
