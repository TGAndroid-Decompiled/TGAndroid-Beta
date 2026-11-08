package q7;

import java.util.Comparator;
public final class o0 implements Comparator {
    public static final o0 f54012a;
    public static final o0[] f54013b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f54012a = r02;
        f54013b = new o0[]{r02};
    }

    public static o0[] values() {
        return (o0[]) f54013b.clone();
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i7 = 0; i7 < min; i7++) {
            int i10 = (bArr[i7] & 255) - (bArr2[i7] & 255);
            if (i10 != 0) {
                return i10;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
