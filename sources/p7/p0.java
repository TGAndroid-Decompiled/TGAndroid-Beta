package p7;

import java.util.Comparator;
public final class p0 implements Comparator {
    public static final p0 f53394a;
    public static final p0[] f53395b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f53394a = r02;
        f53395b = new p0[]{r02};
    }

    public static p0[] values() {
        return (p0[]) f53395b.clone();
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i3 = 0; i3 < min; i3++) {
            int i10 = (bArr[i3] & 255) - (bArr2[i3] & 255);
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
