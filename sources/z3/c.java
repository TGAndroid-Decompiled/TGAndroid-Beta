package z3;

import android.util.Pair;
import e2.s0;
import h2.m0;
import h2.x;
import java.nio.charset.StandardCharsets;
public abstract class c {
    public static final byte[] f59594a;

    static {
        String str = m0.f14112a;
        f59594a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(x xVar) {
        int i7 = xVar.f14163b;
        xVar.O(4);
        if (xVar.m() != 1751411826) {
            i7 += 4;
        }
        xVar.N(i7);
    }

    public static void b(h2.x r49, int r50, int r51, int r52, int r53, java.lang.String r54, boolean r55, e2.r r56, h2.j0 r57, int r58) {
        throw new UnsupportedOperationException("Method not decompiled: z3.c.b(h2.x, int, int, int, int, java.lang.String, boolean, e2.r, h2.j0, int):void");
    }

    public static a4.c c(int i7, x xVar) {
        long j3;
        xVar.N(i7 + 12);
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
        String e10 = s0.e(xVar.A());
        if (!"audio/mpeg".equals(e10) && !"audio/vnd.dts".equals(e10) && !"audio/vnd.dts.hd".equals(e10)) {
            xVar.O(4);
            long C = xVar.C();
            long C2 = xVar.C();
            xVar.O(1);
            int d = d(xVar);
            long j10 = C2;
            byte[] bArr = new byte[d];
            xVar.k(0, d, bArr);
            if (j10 <= 0) {
                j10 = -1;
            }
            if (C > 0) {
                j3 = C;
            } else {
                j3 = -1;
            }
            return new a4.c(e10, bArr, j10, j3);
        }
        return new a4.c(e10, null, -1L, -1L);
    }

    public static int d(x xVar) {
        int A = xVar.A();
        int i7 = A & 127;
        while ((A & 128) == 128) {
            A = xVar.A();
            i7 = (i7 << 7) | (A & 127);
        }
        return i7;
    }

    public static int e(int i7) {
        return (i7 >> 24) & 255;
    }

    public static e2.q0 f(i2.c r14) {
        throw new UnsupportedOperationException("Method not decompiled: z3.c.f(i2.c):e2.q0");
    }

    public static i2.f g(x xVar) {
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
        return new i2.f(u10, u11, xVar.C());
    }

    public static Pair h(x xVar, int i7, int i10) {
        boolean z9;
        boolean z10;
        boolean z11;
        Integer num;
        s sVar;
        Pair create;
        int i11;
        int i12;
        Integer num2;
        boolean z12;
        int i13 = xVar.f14163b;
        while (i13 - i7 < i10) {
            xVar.N(i13);
            int m10 = xVar.m();
            boolean z13 = false;
            if (m10 > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            f3.b.b("childAtomSize must be positive", z9);
            if (xVar.m() == 1936289382) {
                int i14 = i13 + 8;
                int i15 = 0;
                int i16 = -1;
                Integer num3 = null;
                String str = null;
                while (i14 - i13 < m10) {
                    xVar.N(i14);
                    int m11 = xVar.m();
                    int m12 = xVar.m();
                    if (m12 == 1718775137) {
                        num3 = Integer.valueOf(xVar.m());
                    } else if (m12 == 1935894637) {
                        xVar.O(4);
                        str = xVar.y(4, StandardCharsets.UTF_8);
                    } else if (m12 == 1935894633) {
                        i16 = i14;
                        i15 = m11;
                    }
                    i14 += m11;
                }
                byte[] bArr = null;
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    create = null;
                } else {
                    if (num3 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    f3.b.b("frma atom is mandatory", z10);
                    if (i16 != -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    f3.b.b("schi atom is mandatory", z11);
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 < i15) {
                            xVar.N(i17);
                            int m13 = xVar.m();
                            if (xVar.m() == 1952804451) {
                                int e10 = e(xVar.m());
                                xVar.O(1);
                                if (e10 == 0) {
                                    xVar.O(1);
                                    i12 = 0;
                                    i11 = 0;
                                } else {
                                    int A = xVar.A();
                                    i11 = A & 15;
                                    i12 = (A & 240) >> 4;
                                }
                                if (xVar.A() == 1) {
                                    num2 = num3;
                                    z12 = true;
                                } else {
                                    num2 = num3;
                                    z12 = false;
                                }
                                int A2 = xVar.A();
                                byte[] bArr2 = new byte[16];
                                xVar.k(0, 16, bArr2);
                                if (z12 && A2 == 0) {
                                    int A3 = xVar.A();
                                    byte[] bArr3 = new byte[A3];
                                    xVar.k(0, A3, bArr3);
                                    bArr = bArr3;
                                }
                                num = num2;
                                sVar = new s(z12, str, A2, bArr2, i12, i11, bArr);
                            } else {
                                i17 += m13;
                            }
                        } else {
                            num = num3;
                            sVar = null;
                            break;
                        }
                    }
                    if (sVar != null) {
                        z13 = true;
                    }
                    f3.b.b("tenc atom is mandatory", z13);
                    String str2 = m0.f14112a;
                    create = Pair.create(num, sVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i13 += m10;
        }
        return null;
    }

    public static java.util.ArrayList i(i2.c r59, f3.w r60, long r61, e2.r r63, boolean r64, boolean r65, g9.k r66, boolean r67) {
        throw new UnsupportedOperationException("Method not decompiled: z3.c.i(i2.c, f3.w, long, e2.r, boolean, boolean, g9.k, boolean):java.util.ArrayList");
    }

    public static e2.q0 j(i2.d r17) {
        throw new UnsupportedOperationException("Method not decompiled: z3.c.j(i2.d):e2.q0");
    }

    public static void k(h2.x r58, int r59, int r60, int r61, int r62, java.lang.String r63, int r64, e2.r r65, h2.j0 r66, int r67) {
        throw new UnsupportedOperationException("Method not decompiled: z3.c.k(h2.x, int, int, int, int, java.lang.String, int, e2.r, h2.j0, int):void");
    }
}
