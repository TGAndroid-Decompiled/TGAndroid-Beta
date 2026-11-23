package q7;
public abstract class f0 {
    public static final char[] f56040a = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (obj instanceof f0) {
            byte[] bArr = ((e0) this).f56035b;
            int length = bArr.length * 8;
            byte[] bArr2 = ((e0) ((f0) obj)).f56035b;
            if (length == bArr2.length * 8) {
                if (bArr.length == bArr2.length) {
                    z10 = true;
                    for (int i7 = 0; i7 < bArr.length; i7++) {
                        if (bArr[i7] == bArr2[i7]) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z10 &= z11;
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((e0) this).f56035b;
        if (bArr.length * 8 >= 32) {
            int length = bArr.length;
            if (length >= 4) {
                return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
            }
            throw new IllegalStateException(a.c("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i7 = bArr[0] & 255;
        for (int i10 = 1; i10 < bArr.length; i10++) {
            i7 |= (bArr[i10] & 255) << (i10 * 8);
        }
        return i7;
    }

    public final String toString() {
        byte[] bArr = ((e0) this).f56035b;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            char[] cArr = f56040a;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }
}
