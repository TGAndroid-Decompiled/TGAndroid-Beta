package w3;

import android.util.Pair;
import b2.w0;
import e2.n0;
import e2.x;
import java.nio.charset.StandardCharsets;
import u2.z0;
public abstract class c {
    public static final byte[] f50663a;

    static {
        String str = n0.f9692a;
        f50663a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(x xVar) {
        int i10 = xVar.f9733b;
        xVar.O(4);
        if (xVar.m() != 1751411826) {
            i10 += 4;
        }
        xVar.N(i10);
    }

    public static void b(e2.x r49, int r50, int r51, int r52, int r53, java.lang.String r54, boolean r55, b2.t r56, e2.j0 r57, int r58) {
        throw new UnsupportedOperationException("Method not decompiled: w3.c.b(e2.x, int, int, int, int, java.lang.String, boolean, b2.t, e2.j0, int):void");
    }

    public static z0 c(int i10, x xVar) {
        long j10;
        xVar.N(i10 + 12);
        xVar.O(1);
        d(xVar);
        xVar.O(2);
        int A = xVar.A();
        if ((A & 128) != 0) {
            xVar.O(2);
        }
        if ((A & 64) != 0) {
            xVar.O(xVar.A());
        }
        if ((A & 32) != 0) {
            xVar.O(2);
        }
        xVar.O(1);
        d(xVar);
        String e = w0.e(xVar.A());
        if (!"audio/mpeg".equals(e) && !"audio/vnd.dts".equals(e) && !"audio/vnd.dts.hd".equals(e)) {
            xVar.O(4);
            long C = xVar.C();
            long C2 = xVar.C();
            xVar.O(1);
            int d = d(xVar);
            long j11 = C2;
            byte[] bArr = new byte[d];
            xVar.k(0, d, bArr);
            if (j11 <= 0) {
                j11 = -1;
            }
            if (C > 0) {
                j10 = C;
            } else {
                j10 = -1;
            }
            return new z0(e, bArr, j11, j10);
        }
        return new z0(e, null, -1L, -1L);
    }

    public static int d(x xVar) {
        int A = xVar.A();
        int i10 = A & 127;
        while ((A & 128) == 128) {
            A = xVar.A();
            i10 = (i10 << 7) | (A & 127);
        }
        return i10;
    }

    public static int e(int i10) {
        return (i10 >> 24) & 255;
    }

    public static b2.u0 f(f2.d r14) {
        throw new UnsupportedOperationException("Method not decompiled: w3.c.f(f2.d):b2.u0");
    }

    public static f2.h g(x xVar) {
        long u10;
        long u11;
        xVar.N(8);
        if (e(xVar.m()) == 0) {
            u10 = xVar.C();
            u11 = xVar.C();
        } else {
            u10 = xVar.u();
            u11 = xVar.u();
        }
        return new f2.h(u10, u11, xVar.C());
    }

    public static Pair h(x xVar, int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        r rVar;
        Pair create;
        int i12;
        int i13;
        Integer num2;
        boolean z13;
        int i14 = xVar.f9733b;
        while (i14 - i10 < i11) {
            xVar.N(i14);
            int m10 = xVar.m();
            boolean z14 = false;
            if (m10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c3.b.b("childAtomSize must be positive", z10);
            if (xVar.m() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = 0;
                int i17 = -1;
                Integer num3 = null;
                String str = null;
                while (i15 - i14 < m10) {
                    xVar.N(i15);
                    int m11 = xVar.m();
                    int m12 = xVar.m();
                    if (m12 == 1718775137) {
                        num3 = Integer.valueOf(xVar.m());
                    } else if (m12 == 1935894637) {
                        xVar.O(4);
                        str = xVar.y(4, StandardCharsets.UTF_8);
                    } else if (m12 == 1935894633) {
                        i17 = i15;
                        i16 = m11;
                    }
                    i15 += m11;
                }
                byte[] bArr = null;
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    create = null;
                } else {
                    if (num3 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c3.b.b("frma atom is mandatory", z11);
                    if (i17 != -1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c3.b.b("schi atom is mandatory", z12);
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 < i16) {
                            xVar.N(i18);
                            int m13 = xVar.m();
                            if (xVar.m() == 1952804451) {
                                int e = e(xVar.m());
                                xVar.O(1);
                                if (e == 0) {
                                    xVar.O(1);
                                    i13 = 0;
                                    i12 = 0;
                                } else {
                                    int A = xVar.A();
                                    i12 = A & 15;
                                    i13 = (A & 240) >> 4;
                                }
                                if (xVar.A() == 1) {
                                    num2 = num3;
                                    z13 = true;
                                } else {
                                    num2 = num3;
                                    z13 = false;
                                }
                                int A2 = xVar.A();
                                byte[] bArr2 = new byte[16];
                                xVar.k(0, 16, bArr2);
                                if (z13 && A2 == 0) {
                                    int A3 = xVar.A();
                                    byte[] bArr3 = new byte[A3];
                                    xVar.k(0, A3, bArr3);
                                    bArr = bArr3;
                                }
                                num = num2;
                                rVar = new r(z13, str, A2, bArr2, i13, i12, bArr);
                            } else {
                                i18 += m13;
                            }
                        } else {
                            num = num3;
                            rVar = null;
                            break;
                        }
                    }
                    if (rVar != null) {
                        z14 = true;
                    }
                    c3.b.b("tenc atom is mandatory", z14);
                    String str2 = n0.f9692a;
                    create = Pair.create(num, rVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i14 += m10;
        }
        return null;
    }

    public static java.util.ArrayList i(f2.d r62, c3.w r63, long r64, b2.t r66, boolean r67, boolean r68, e9.k r69, boolean r70) {
        throw new UnsupportedOperationException("Method not decompiled: w3.c.i(f2.d, c3.w, long, b2.t, boolean, boolean, e9.k, boolean):java.util.ArrayList");
    }

    public static b2.u0 j(f2.e r17) {
        throw new UnsupportedOperationException("Method not decompiled: w3.c.j(f2.e):b2.u0");
    }

    public static void k(e2.x r58, int r59, int r60, int r61, int r62, java.lang.String r63, int r64, b2.t r65, e2.j0 r66, int r67) {
        throw new UnsupportedOperationException("Method not decompiled: w3.c.k(e2.x, int, int, int, int, java.lang.String, int, b2.t, e2.j0, int):void");
    }
}
