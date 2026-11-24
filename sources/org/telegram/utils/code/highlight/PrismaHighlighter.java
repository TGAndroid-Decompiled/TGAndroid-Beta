package org.telegram.utils.code.highlight;
public final class PrismaHighlighter implements AutoCloseable {
    public long a;
    public final String[] b;
    public final kj8 c;

    public PrismaHighlighter(byte[] bArr) {
        if (bArr != null) {
            long nativeCreate = nativeCreate(bArr);
            this.a = nativeCreate;
            if (nativeCreate != 0) {
                try {
                    String[] nativeGetTokenNames = nativeGetTokenNames(nativeCreate);
                    this.b = nativeGetTokenNames;
                    if (nativeGetTokenNames != null && nativeGetTokenNames.length != 0 && "".equals(nativeGetTokenNames[0])) {
                        this.c = new kj8(nativeGetTokenNames);
                        return;
                    }
                    throw new IllegalStateException("Invalid native token name table");
                } catch (Error | RuntimeException e) {
                    close();
                    throw e;
                }
            }
            sc8.j("Native highlighter was not created");
            throw null;
        }
        fvc.f("grammars");
        throw null;
    }

    public static boolean b(int i, String str) {
        if (i > 0 && i < str.length() && Character.isHighSurrogate(str.charAt(i - 1)) && Character.isLowSurrogate(str.charAt(i))) {
            return true;
        }
        return false;
    }

    public static void d(int[] iArr, String str, int i) {
        if (iArr != null && iArr.length % 5 == 0) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < iArr.length) {
                int i4 = iArr[i2];
                int i5 = iArr[i2 + 1];
                int i6 = iArr[i2 + 2];
                int i7 = iArr[i2 + 3];
                int i8 = iArr[i2 + 4];
                if (i4 >= i3 && i5 > i4 && i5 <= str.length() && i6 >= 0 && i6 < i && i7 >= 0 && i7 < i && i8 >= -1 && i8 < i2 / 5 && !b(i4, str) && !b(i5, str)) {
                    if (i8 >= 0) {
                        int i9 = i8 * 5;
                        if (i4 < iArr[i9] || i5 > iArr[i9 + 1]) {
                            sc8.j("Native token is outside its parent");
                            return;
                        }
                    }
                    i2 += 5;
                    i3 = i4;
                } else {
                    sc8.j("Invalid native token range");
                    return;
                }
            }
            return;
        }
        sc8.j("Invalid native token array");
    }

    private static native long nativeCreate(byte[] bArr);

    private static native void nativeDestroy(long j);

    private static native String[] nativeGetLanguages(long j);

    private static native String[] nativeGetTokenNames(long j);

    private static native int[] nativeHighlight(long j, String str, String str2);

    public final synchronized String[] a() {
        long j;
        j = this.a;
        if (j != 0) {
        } else {
            throw new IllegalStateException("Highlighter is closed");
        }
        return nativeGetLanguages(j);
    }

    public final synchronized f06 c(String str, String str2) {
        int[] nativeHighlight;
        long j = this.a;
        if (j != 0) {
            if (str != null) {
                nativeHighlight = nativeHighlight(j, str, str2);
                d(nativeHighlight, str, this.b.length);
            } else {
                throw new NullPointerException("text");
            }
        } else {
            throw new IllegalStateException("Highlighter is closed");
        }
        return new f06(nativeHighlight, this.c);
    }

    @Override
    public final synchronized void close() {
        long j = this.a;
        if (j != 0) {
            nativeDestroy(j);
            this.a = 0L;
        }
    }
}
