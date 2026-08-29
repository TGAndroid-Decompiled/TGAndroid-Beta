package rb;

import com.google.android.exoplayer2.upstream.w;
import nb.h;
public abstract class a {
    public static final char[] f47089a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static void a(w wVar, StringBuilder sb2, int i10, boolean z10) {
        while (i10 > 1) {
            if (wVar.d() >= 11) {
                int e10 = wVar.e(11);
                sb2.append(f(e10 / 45));
                sb2.append(f(e10 % 45));
                i10 -= 2;
            } else {
                throw mb.c.a();
            }
        }
        if (i10 == 1) {
            if (wVar.d() >= 6) {
                sb2.append(f(wVar.e(6)));
            } else {
                throw mb.c.a();
            }
        }
        if (z10) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i11 = length + 1;
                        if (sb2.charAt(i11) == '%') {
                            sb2.deleteCharAt(i11);
                        }
                    }
                    sb2.setCharAt(length, (char) 29);
                }
            }
        }
    }

    public static void b(com.google.android.exoplayer2.upstream.w r24, java.lang.StringBuilder r25, int r26, nb.c r27, java.util.ArrayList r28) {
        throw new UnsupportedOperationException("Method not decompiled: rb.a.b(com.google.android.exoplayer2.upstream.w, java.lang.StringBuilder, int, nb.c, java.util.ArrayList):void");
    }

    public static void c(w wVar, StringBuilder sb2, int i10) {
        int i11;
        if (h.f17230c != null) {
            if (i10 * 13 <= wVar.d()) {
                byte[] bArr = new byte[i10 * 2];
                int i12 = 0;
                while (i10 > 0) {
                    int e10 = wVar.e(13);
                    int i13 = (e10 % 96) | ((e10 / 96) << 8);
                    if (i13 < 2560) {
                        i11 = 41377;
                    } else {
                        i11 = 42657;
                    }
                    int i14 = i13 + i11;
                    bArr[i12] = (byte) ((i14 >> 8) & 255);
                    bArr[i12 + 1] = (byte) (i14 & 255);
                    i12 += 2;
                    i10--;
                }
                sb2.append(new String(bArr, h.f17230c));
                return;
            }
            throw mb.c.a();
        }
        throw mb.c.a();
    }

    public static void d(w wVar, StringBuilder sb2, int i10) {
        int i11;
        if (h.f17229b != null) {
            if (i10 * 13 <= wVar.d()) {
                byte[] bArr = new byte[i10 * 2];
                int i12 = 0;
                while (i10 > 0) {
                    int e10 = wVar.e(13);
                    int i13 = (e10 % 192) | ((e10 / 192) << 8);
                    if (i13 < 7936) {
                        i11 = 33088;
                    } else {
                        i11 = 49472;
                    }
                    int i14 = i13 + i11;
                    bArr[i12] = (byte) (i14 >> 8);
                    bArr[i12 + 1] = (byte) i14;
                    i12 += 2;
                    i10--;
                }
                sb2.append(new String(bArr, h.f17229b));
                return;
            }
            throw mb.c.a();
        }
        throw mb.c.a();
    }

    public static void e(w wVar, StringBuilder sb2, int i10) {
        while (i10 >= 3) {
            if (wVar.d() >= 10) {
                int e10 = wVar.e(10);
                if (e10 < 1000) {
                    sb2.append(f(e10 / 100));
                    sb2.append(f((e10 / 10) % 10));
                    sb2.append(f(e10 % 10));
                    i10 -= 3;
                } else {
                    throw mb.c.a();
                }
            } else {
                throw mb.c.a();
            }
        }
        if (i10 == 2) {
            if (wVar.d() >= 7) {
                int e11 = wVar.e(7);
                if (e11 < 100) {
                    sb2.append(f(e11 / 10));
                    sb2.append(f(e11 % 10));
                    return;
                }
                throw mb.c.a();
            }
            throw mb.c.a();
        } else if (i10 == 1) {
            if (wVar.d() >= 4) {
                int e12 = wVar.e(4);
                if (e12 < 10) {
                    sb2.append(f(e12));
                    return;
                }
                throw mb.c.a();
            }
            throw mb.c.a();
        }
    }

    public static char f(int i10) {
        char[] cArr = f47089a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw mb.c.a();
    }
}
