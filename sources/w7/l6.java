package w7;

import java.nio.ByteBuffer;
public abstract class l6 {
    public static boolean a(int i10, byte[] bArr) {
        if (((bArr[i10 / 8] >> (7 - (i10 % 8))) & 1) != 0) {
            return true;
        }
        return false;
    }

    public static int b(byte[] bArr, int[] iArr) {
        int i10 = 0;
        if (a(0, bArr) && !a(1, bArr) && !a(2, bArr) && !a(3, bArr) && a(4, bArr) && !a(5, bArr) && !a(6, bArr)) {
            int i11 = 271;
            int i12 = 0;
            while (i10 < 4) {
                i12 = (i12 << 1) | (a(i11, bArr) ? 1 : 0);
                i10++;
                i11++;
            }
            int i13 = (i12 * 8) + i11;
            int i14 = i13 + 1;
            if (a(i13, bArr)) {
                int i15 = i13 + 2;
                if (!a(i14, bArr)) {
                    int i16 = i13 + 3;
                    if (a(i15, bArr)) {
                        i16 = i13 + 8;
                    }
                    int i17 = i16 + 1;
                    if (a(i16, bArr)) {
                        i17 = i16 + 3;
                    }
                    i14 = i17 + 3;
                } else {
                    i14 = i15;
                }
            }
            if (a(i14, bArr) && iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
        }
        return -1;
    }

    public static void c(int i10, byte[] bArr) {
        int i11 = i10 / 8;
        bArr[i11] = (byte) (((byte) (1 << (7 - (i10 % 8)))) | bArr[i11]);
    }

    public static long d(int i10, ByteBuffer byteBuffer) {
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (byteBuffer.get() & 255);
        }
        return j10;
    }
}
