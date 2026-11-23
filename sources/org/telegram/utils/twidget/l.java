package org.telegram.utils.twidget;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.util.zip.CRC32;
public abstract class l {
    public static int f54953b;
    public static boolean f54954c;
    public static final Object f54952a = new Object();
    public static final byte[] d = {-119, 80, 78, 71, 13, 10, 26, 10};

    public static long b(int i7, byte[] bArr) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public static void h(byte[] bArr, int i7, long j3) {
        bArr[i7] = (byte) (j3 >>> 24);
        bArr[i7 + 1] = (byte) (j3 >>> 16);
        bArr[i7 + 2] = (byte) (j3 >>> 8);
        bArr[i7 + 3] = (byte) j3;
    }

    public static boolean n(int i7, String str, byte[] bArr) {
        for (int i10 = 0; i10 < 4; i10++) {
            if (bArr[i7 + i10] != str.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, String str, byte[] bArr, CRC32 crc32) {
        byte[] bArr2 = new byte[8];
        h(bArr2, 0, bArr.length);
        for (int i7 = 0; i7 < 4; i7++) {
            bArr2[i7 + 4] = (byte) str.charAt(i7);
        }
        byteArrayOutputStream.write(bArr2, 0, 8);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
        crc32.reset();
        crc32.update(bArr2, 4, 4);
        crc32.update(bArr, 0, bArr.length);
        byte[] bArr3 = new byte[4];
        h(bArr3, 0, crc32.getValue());
        byteArrayOutputStream.write(bArr3, 0, 4);
    }

    public abstract void a(long j3, long j10, int i7, byte[] bArr);

    public abstract long c(Context context, String str, String str2, float f10, float f11, int i7, String str3, String str4, String str5, String str6, boolean z10, WidgetSandboxBackend widgetSandboxBackend);

    public abstract void d(long j3, byte[] bArr);

    public abstract void e(long j3);

    public abstract void f(long j3, int i7, float f10, float f11, int i10);

    public abstract void i(long j3);

    public abstract void j(long j3, byte[] bArr);

    public abstract void k(long j3, byte[] bArr);

    public abstract void l(long j3, float f10, boolean z10, boolean z11, boolean z12);

    public abstract void m(long j3, int i7, float f10, float f11, int i10, boolean z10, boolean z11, int i11, int i12);

    public abstract void o(long j3, boolean z10);

    public abstract void p(long j3, float f10);

    public void g(long j3) {
    }
}
