package tb;

import p2.g;
import pb.h;
public abstract class a {
    public static final char[] f44621a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static void a(g gVar, StringBuilder sb, int i10, boolean z4) {
        while (i10 > 1) {
            if (gVar.d() >= 11) {
                int f10 = gVar.f(11);
                sb.append(f(f10 / 45));
                sb.append(f(f10 % 45));
                i10 -= 2;
            } else {
                throw ob.c.a();
            }
        }
        if (i10 == 1) {
            if (gVar.d() >= 6) {
                sb.append(f(gVar.f(6)));
            } else {
                throw ob.c.a();
            }
        }
        if (z4) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i11 = length + 1;
                        if (sb.charAt(i11) == '%') {
                            sb.deleteCharAt(i11);
                        }
                    }
                    sb.setCharAt(length, (char) 29);
                }
            }
        }
    }

    public static void b(p2.g r24, java.lang.StringBuilder r25, int r26, pb.c r27, java.util.ArrayList r28) {
        throw new UnsupportedOperationException("Method not decompiled: tb.a.b(p2.g, java.lang.StringBuilder, int, pb.c, java.util.ArrayList):void");
    }

    public static void c(g gVar, StringBuilder sb, int i10) {
        int i11;
        if (h.f41121c != null) {
            if (i10 * 13 <= gVar.d()) {
                byte[] bArr = new byte[i10 * 2];
                int i12 = 0;
                while (i10 > 0) {
                    int f10 = gVar.f(13);
                    int i13 = (f10 % 96) | ((f10 / 96) << 8);
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
                sb.append(new String(bArr, h.f41121c));
                return;
            }
            throw ob.c.a();
        }
        throw ob.c.a();
    }

    public static void d(g gVar, StringBuilder sb, int i10) {
        int i11;
        if (h.f41120b != null) {
            if (i10 * 13 <= gVar.d()) {
                byte[] bArr = new byte[i10 * 2];
                int i12 = 0;
                while (i10 > 0) {
                    int f10 = gVar.f(13);
                    int i13 = (f10 % 192) | ((f10 / 192) << 8);
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
                sb.append(new String(bArr, h.f41120b));
                return;
            }
            throw ob.c.a();
        }
        throw ob.c.a();
    }

    public static void e(g gVar, StringBuilder sb, int i10) {
        while (i10 >= 3) {
            if (gVar.d() >= 10) {
                int f10 = gVar.f(10);
                if (f10 < 1000) {
                    sb.append(f(f10 / 100));
                    sb.append(f((f10 / 10) % 10));
                    sb.append(f(f10 % 10));
                    i10 -= 3;
                } else {
                    throw ob.c.a();
                }
            } else {
                throw ob.c.a();
            }
        }
        if (i10 == 2) {
            if (gVar.d() >= 7) {
                int f11 = gVar.f(7);
                if (f11 < 100) {
                    sb.append(f(f11 / 10));
                    sb.append(f(f11 % 10));
                    return;
                }
                throw ob.c.a();
            }
            throw ob.c.a();
        } else if (i10 == 1) {
            if (gVar.d() >= 4) {
                int f12 = gVar.f(4);
                if (f12 < 10) {
                    sb.append(f(f12));
                    return;
                }
                throw ob.c.a();
            }
            throw ob.c.a();
        }
    }

    public static char f(int i10) {
        char[] cArr = f44621a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw ob.c.a();
    }
}
