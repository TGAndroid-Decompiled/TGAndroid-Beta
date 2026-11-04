package x7;

import java.io.Serializable;
public abstract class v {
    public static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i3 = 0; i3 < bArr.length; i3++) {
            sb2.append(String.format("%02x", Byte.valueOf(bArr[i3])));
        }
        return sb2.toString();
    }

    public static long[] b(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i3 = 0; i3 < iArr.length; i3++) {
                jArr[i3] = iArr[i3];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }
}
