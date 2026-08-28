package pb;

import com.google.android.exoplayer2.upstream.w;
import lb.h;
public abstract class a {
    public static final char[] f45508a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static void a(w wVar, StringBuilder sb2, int i9, boolean z10) {
        while (i9 > 1) {
            if (wVar.d() >= 11) {
                int e10 = wVar.e(11);
                sb2.append(f(e10 / 45));
                sb2.append(f(e10 % 45));
                i9 -= 2;
            } else {
                throw kb.c.a();
            }
        }
        if (i9 == 1) {
            if (wVar.d() >= 6) {
                sb2.append(f(wVar.e(6)));
            } else {
                throw kb.c.a();
            }
        }
        if (z10) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i10 = length + 1;
                        if (sb2.charAt(i10) == '%') {
                            sb2.deleteCharAt(i10);
                        }
                    }
                    sb2.setCharAt(length, (char) 29);
                }
            }
        }
    }

    public static void b(com.google.android.exoplayer2.upstream.w r24, java.lang.StringBuilder r25, int r26, lb.c r27, java.util.ArrayList r28) {
        throw new UnsupportedOperationException("Method not decompiled: pb.a.b(com.google.android.exoplayer2.upstream.w, java.lang.StringBuilder, int, lb.c, java.util.ArrayList):void");
    }

    public static void c(w wVar, StringBuilder sb2, int i9) {
        int i10;
        if (h.f16763c != null) {
            if (i9 * 13 <= wVar.d()) {
                byte[] bArr = new byte[i9 * 2];
                int i11 = 0;
                while (i9 > 0) {
                    int e10 = wVar.e(13);
                    int i12 = (e10 % 96) | ((e10 / 96) << 8);
                    if (i12 < 2560) {
                        i10 = 41377;
                    } else {
                        i10 = 42657;
                    }
                    int i13 = i12 + i10;
                    bArr[i11] = (byte) ((i13 >> 8) & 255);
                    bArr[i11 + 1] = (byte) (i13 & 255);
                    i11 += 2;
                    i9--;
                }
                sb2.append(new String(bArr, h.f16763c));
                return;
            }
            throw kb.c.a();
        }
        throw kb.c.a();
    }

    public static void d(w wVar, StringBuilder sb2, int i9) {
        int i10;
        if (h.f16762b != null) {
            if (i9 * 13 <= wVar.d()) {
                byte[] bArr = new byte[i9 * 2];
                int i11 = 0;
                while (i9 > 0) {
                    int e10 = wVar.e(13);
                    int i12 = (e10 % 192) | ((e10 / 192) << 8);
                    if (i12 < 7936) {
                        i10 = 33088;
                    } else {
                        i10 = 49472;
                    }
                    int i13 = i12 + i10;
                    bArr[i11] = (byte) (i13 >> 8);
                    bArr[i11 + 1] = (byte) i13;
                    i11 += 2;
                    i9--;
                }
                sb2.append(new String(bArr, h.f16762b));
                return;
            }
            throw kb.c.a();
        }
        throw kb.c.a();
    }

    public static void e(w wVar, StringBuilder sb2, int i9) {
        while (i9 >= 3) {
            if (wVar.d() >= 10) {
                int e10 = wVar.e(10);
                if (e10 < 1000) {
                    sb2.append(f(e10 / 100));
                    sb2.append(f((e10 / 10) % 10));
                    sb2.append(f(e10 % 10));
                    i9 -= 3;
                } else {
                    throw kb.c.a();
                }
            } else {
                throw kb.c.a();
            }
        }
        if (i9 == 2) {
            if (wVar.d() >= 7) {
                int e11 = wVar.e(7);
                if (e11 < 100) {
                    sb2.append(f(e11 / 10));
                    sb2.append(f(e11 % 10));
                    return;
                }
                throw kb.c.a();
            }
            throw kb.c.a();
        } else if (i9 == 1) {
            if (wVar.d() >= 4) {
                int e12 = wVar.e(4);
                if (e12 < 10) {
                    sb2.append(f(e12));
                    return;
                }
                throw kb.c.a();
            }
            throw kb.c.a();
        }
    }

    public static char f(int i9) {
        char[] cArr = f45508a;
        if (i9 < cArr.length) {
            return cArr[i9];
        }
        throw kb.c.a();
    }
}
