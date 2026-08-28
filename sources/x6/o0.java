package x6;

import java.util.Comparator;
public final class o0 implements Comparator {
    public static final o0 f49047a;
    public static final o0[] f49048b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f49047a = r02;
        f49048b = new o0[]{r02};
    }

    public static o0[] values() {
        return (o0[]) f49048b.clone();
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i9 = 0; i9 < min; i9++) {
            int i10 = (bArr[i9] & 255) - (bArr2[i9] & 255);
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
