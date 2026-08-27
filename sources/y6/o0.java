package y6;

import java.util.Comparator;

public final class o0 implements Comparator {

    public static final o0 f49764a;

    public static final o0[] f49765b;

    static {
        o0 o0Var = new o0("INSTANCE", 0);
        f49764a = o0Var;
        f49765b = new o0[]{o0Var};
    }

    public static o0[] values() {
        return (o0[]) f49765b.clone();
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = (bArr[i10] & 255) - (bArr2[i10] & 255);
            if (i11 != 0) {
                return i11;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
