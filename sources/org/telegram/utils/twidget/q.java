package org.telegram.utils.twidget;

import java.io.ByteArrayOutputStream;
import java.util.zip.CRC32;
public abstract class q {
    public static final byte[] f52861a = {-119, 80, 78, 71, 13, 10, 26, 10};

    public static long a(int i7, byte[] bArr) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public static void b(byte[] bArr, int i7, long j3) {
        bArr[i7] = (byte) (j3 >>> 24);
        bArr[i7 + 1] = (byte) (j3 >>> 16);
        bArr[i7 + 2] = (byte) (j3 >>> 8);
        bArr[i7 + 3] = (byte) j3;
    }

    public static boolean c(int i7, String str, byte[] bArr) {
        for (int i10 = 0; i10 < 4; i10++) {
            if (bArr[i7 + i10] != str.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public static void d(ByteArrayOutputStream byteArrayOutputStream, String str, byte[] bArr, CRC32 crc32) {
        byte[] bArr2 = new byte[8];
        b(bArr2, 0, bArr.length);
        for (int i7 = 0; i7 < 4; i7++) {
            bArr2[i7 + 4] = (byte) str.charAt(i7);
        }
        byteArrayOutputStream.write(bArr2, 0, 8);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
        crc32.reset();
        crc32.update(bArr2, 4, 4);
        crc32.update(bArr, 0, bArr.length);
        byte[] bArr3 = new byte[4];
        b(bArr3, 0, crc32.getValue());
        byteArrayOutputStream.write(bArr3, 0, 4);
    }
}
