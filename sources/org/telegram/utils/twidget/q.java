package org.telegram.utils.twidget;

import java.io.ByteArrayOutputStream;
import java.util.zip.CRC32;
public abstract class q {
    public static final byte[] f44452a = {-119, 80, 78, 71, 13, 10, 26, 10};

    public static long a(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static void b(byte[] bArr, int i10, long j10) {
        bArr[i10] = (byte) (j10 >>> 24);
        bArr[i10 + 1] = (byte) (j10 >>> 16);
        bArr[i10 + 2] = (byte) (j10 >>> 8);
        bArr[i10 + 3] = (byte) j10;
    }

    public static boolean c(int i10, String str, byte[] bArr) {
        for (int i11 = 0; i11 < 4; i11++) {
            if (bArr[i10 + i11] != str.charAt(i11)) {
                return false;
            }
        }
        return true;
    }

    public static void d(ByteArrayOutputStream byteArrayOutputStream, String str, byte[] bArr, CRC32 crc32) {
        byte[] bArr2 = new byte[8];
        b(bArr2, 0, bArr.length);
        for (int i10 = 0; i10 < 4; i10++) {
            bArr2[i10 + 4] = (byte) str.charAt(i10);
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
