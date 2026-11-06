package org.telegram.utils.code.highlight;

import com.google.android.gms.internal.play_billing.s0;
import ni.t;
public final class PrismaHighlighter implements AutoCloseable {
    public long f52701a;
    public final String[] f52702b;
    public final t f52703c;

    public PrismaHighlighter(byte[] bArr) {
        if (bArr != null) {
            long nativeCreate = nativeCreate(bArr);
            this.f52701a = nativeCreate;
            if (nativeCreate != 0) {
                try {
                    String[] nativeGetTokenNames = nativeGetTokenNames(nativeCreate);
                    this.f52702b = nativeGetTokenNames;
                    if (nativeGetTokenNames != null && nativeGetTokenNames.length != 0 && "".equals(nativeGetTokenNames[0])) {
                        this.f52703c = new t(nativeGetTokenNames);
                        return;
                    }
                    throw new IllegalStateException("Invalid native token name table");
                } catch (Error e10) {
                    e = e10;
                    close();
                    throw e;
                } catch (RuntimeException e11) {
                    e = e11;
                    close();
                    throw e;
                }
            }
            throw new IllegalStateException("Native highlighter was not created");
        }
        throw new NullPointerException("grammars");
    }

    public static boolean b(int i7, String str) {
        if (i7 > 0 && i7 < str.length() && Character.isHighSurrogate(str.charAt(i7 - 1)) && Character.isLowSurrogate(str.charAt(i7))) {
            return true;
        }
        return false;
    }

    public static void d(int[] iArr, String str, int i7) {
        if (iArr != null && iArr.length % 5 == 0) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < iArr.length) {
                int i12 = iArr[i10];
                int i13 = iArr[i10 + 1];
                int i14 = iArr[i10 + 2];
                int i15 = iArr[i10 + 3];
                int i16 = iArr[i10 + 4];
                if (i12 >= i11 && i13 > i12 && i13 <= str.length() && i14 >= 0 && i14 < i7 && i15 >= 0 && i15 < i7 && i16 >= -1 && i16 < i10 / 5 && !b(i12, str) && !b(i13, str)) {
                    if (i16 >= 0) {
                        int i17 = i16 * 5;
                        if (i12 < iArr[i17] || i13 > iArr[i17 + 1]) {
                            throw new IllegalStateException("Native token is outside its parent");
                        }
                    }
                    i10 += 5;
                    i11 = i12;
                } else {
                    throw new IllegalStateException("Invalid native token range");
                }
            }
            return;
        }
        throw new IllegalStateException("Invalid native token array");
    }

    private static native long nativeCreate(byte[] bArr);

    private static native void nativeDestroy(long j3);

    private static native String[] nativeGetLanguages(long j3);

    private static native String[] nativeGetTokenNames(long j3);

    private static native int[] nativeHighlight(long j3, String str, String str2);

    public final synchronized String[] a() {
        long j3;
        j3 = this.f52701a;
        if (j3 != 0) {
        } else {
            throw new IllegalStateException("Highlighter is closed");
        }
        return nativeGetLanguages(j3);
    }

    public final synchronized s0 c(String str, String str2) {
        int[] nativeHighlight;
        long j3 = this.f52701a;
        if (j3 != 0) {
            if (str != null) {
                nativeHighlight = nativeHighlight(j3, str, str2);
                d(nativeHighlight, str, this.f52702b.length);
            } else {
                throw new NullPointerException("text");
            }
        } else {
            throw new IllegalStateException("Highlighter is closed");
        }
        return new s0(nativeHighlight, this.f52703c);
    }

    @Override
    public final synchronized void close() {
        long j3 = this.f52701a;
        if (j3 != 0) {
            nativeDestroy(j3);
            this.f52701a = 0L;
        }
    }
}
