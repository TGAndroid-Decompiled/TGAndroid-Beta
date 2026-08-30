package r2;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
public abstract class b {
    public static final char[] f43198a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static int a(byte b10) {
        if (b10 < 0) {
            return b10 + 256;
        }
        return b10;
    }

    public static byte[] b(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        return null;
    }

    public static String c(int i10, byte[] bArr) {
        int i11;
        int length = bArr.length;
        int i12 = length << 1;
        if (i10 > 0) {
            i11 = length / i10;
        } else {
            i11 = 0;
        }
        char[] cArr = new char[i12 + i11];
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            if (i10 > 0 && i14 % i10 == 0 && i13 > 0) {
                cArr[i13] = '-';
                i13++;
            }
            int i15 = i13 + 1;
            byte b10 = bArr[i14];
            char[] cArr2 = f43198a;
            cArr[i13] = cArr2[(b10 & 240) >>> 4];
            i13 += 2;
            cArr[i15] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static String d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static double e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255)) / 1.073741824E9d;
    }

    public static double f(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255)) / 65536.0d;
    }

    public static float g(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        return ((short) (((short) ((bArr[0] << 8) & 65280)) | (bArr[1] & 255))) / 256.0f;
    }

    public static int h(ByteBuffer byteBuffer) {
        return a(byteBuffer.get()) + (a(byteBuffer.get()) << 8);
    }

    public static long i(ByteBuffer byteBuffer) {
        long j10 = byteBuffer.getInt();
        if (j10 < 0) {
            return j10 + 4294967296L;
        }
        return j10;
    }

    public static long j(ByteBuffer byteBuffer) {
        long i10 = i(byteBuffer) << 32;
        if (i10 >= 0) {
            return i(byteBuffer) + i10;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static int k(ByteBuffer byteBuffer) {
        return a(byteBuffer.get());
    }

    public static int l(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8").length;
            } catch (UnsupportedEncodingException unused) {
                throw new RuntimeException();
            }
        }
        return 0;
    }

    public static void m(ByteBuffer byteBuffer, double d) {
        int i10 = (int) (d * 1.073741824E9d);
        byteBuffer.put((byte) (((-16777216) & i10) >> 24));
        byteBuffer.put((byte) ((16711680 & i10) >> 16));
        byteBuffer.put((byte) ((65280 & i10) >> 8));
        byteBuffer.put((byte) (i10 & 255));
    }

    public static void n(ByteBuffer byteBuffer, double d) {
        int i10 = (int) (d * 65536.0d);
        byteBuffer.put((byte) (((-16777216) & i10) >> 24));
        byteBuffer.put((byte) ((16711680 & i10) >> 16));
        byteBuffer.put((byte) ((65280 & i10) >> 8));
        byteBuffer.put((byte) (i10 & 255));
    }

    public static void o(ByteBuffer byteBuffer, double d) {
        short s6 = (short) (d * 256.0d);
        byteBuffer.put((byte) ((65280 & s6) >> 8));
        byteBuffer.put((byte) (s6 & 255));
    }

    public static void p(int i10, ByteBuffer byteBuffer) {
        r((65535 & i10) >> 8, byteBuffer);
        byteBuffer.put((byte) (i10 & 255));
    }

    public static void q(int i10, ByteBuffer byteBuffer) {
        p((16777215 & i10) >> 8, byteBuffer);
        byteBuffer.put((byte) (i10 & 255));
    }

    public static void r(int i10, ByteBuffer byteBuffer) {
        byteBuffer.put((byte) (i10 & 255));
    }
}
