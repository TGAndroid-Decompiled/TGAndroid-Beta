package y3;

import android.util.Pair;
import d2.u0;
import g2.n0;
import g2.y;
import java.nio.charset.StandardCharsets;
import w2.z0;
public abstract class d {
    public static final byte[] f58910a;

    static {
        String str = n0.f11873a;
        f58910a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(y yVar) {
        int i3 = yVar.f11924b;
        yVar.O(4);
        if (yVar.m() != 1751411826) {
            i3 += 4;
        }
        yVar.N(i3);
    }

    public static void b(g2.y r49, int r50, int r51, int r52, int r53, java.lang.String r54, boolean r55, d2.s r56, g2.k0 r57, int r58) {
        throw new UnsupportedOperationException("Method not decompiled: y3.d.b(g2.y, int, int, int, int, java.lang.String, boolean, d2.s, g2.k0, int):void");
    }

    public static z0 c(int i3, y yVar) {
        long j10;
        yVar.N(i3 + 12);
        yVar.O(1);
        d(yVar);
        yVar.O(2);
        int A = yVar.A();
        if ((A & 128) != 0) {
            yVar.O(2);
        }
        if ((A & 64) != 0) {
            yVar.O(yVar.A());
        }
        if ((A & 32) != 0) {
            yVar.O(2);
        }
        yVar.O(1);
        d(yVar);
        String e10 = u0.e(yVar.A());
        if (!"audio/mpeg".equals(e10) && !"audio/vnd.dts".equals(e10) && !"audio/vnd.dts.hd".equals(e10)) {
            yVar.O(4);
            long C = yVar.C();
            long C2 = yVar.C();
            yVar.O(1);
            int d = d(yVar);
            long j11 = C2;
            byte[] bArr = new byte[d];
            yVar.k(0, d, bArr);
            if (j11 <= 0) {
                j11 = -1;
            }
            if (C > 0) {
                j10 = C;
            } else {
                j10 = -1;
            }
            return new z0(e10, bArr, j11, j10);
        }
        return new z0(e10, null, -1L, -1L);
    }

    public static int d(y yVar) {
        int A = yVar.A();
        int i3 = A & 127;
        while ((A & 128) == 128) {
            A = yVar.A();
            i3 = (i3 << 7) | (A & 127);
        }
        return i3;
    }

    public static int e(int i3) {
        return (i3 >> 24) & 255;
    }

    public static d2.s0 f(h2.c r14) {
        throw new UnsupportedOperationException("Method not decompiled: y3.d.f(h2.c):d2.s0");
    }

    public static h2.f g(y yVar) {
        long u10;
        long u11;
        yVar.N(8);
        if (e(yVar.m()) == 0) {
            u10 = yVar.C();
            u11 = yVar.C();
        } else {
            u10 = yVar.u();
            u11 = yVar.u();
        }
        return new h2.f(u10, u11, yVar.C());
    }

    public static Pair h(y yVar, int i3, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        s sVar;
        Pair create;
        int i11;
        int i12;
        Integer num2;
        boolean z13;
        int i13 = yVar.f11924b;
        while (i13 - i3 < i10) {
            yVar.N(i13);
            int m10 = yVar.m();
            boolean z14 = false;
            if (m10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e3.b.b("childAtomSize must be positive", z10);
            if (yVar.m() == 1936289382) {
                int i14 = i13 + 8;
                int i15 = 0;
                int i16 = -1;
                Integer num3 = null;
                String str = null;
                while (i14 - i13 < m10) {
                    yVar.N(i14);
                    int m11 = yVar.m();
                    int m12 = yVar.m();
                    if (m12 == 1718775137) {
                        num3 = Integer.valueOf(yVar.m());
                    } else if (m12 == 1935894637) {
                        yVar.O(4);
                        str = yVar.y(4, StandardCharsets.UTF_8);
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
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    e3.b.b("frma atom is mandatory", z11);
                    if (i16 != -1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    e3.b.b("schi atom is mandatory", z12);
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 < i15) {
                            yVar.N(i17);
                            int m13 = yVar.m();
                            if (yVar.m() == 1952804451) {
                                int e10 = e(yVar.m());
                                yVar.O(1);
                                if (e10 == 0) {
                                    yVar.O(1);
                                    i12 = 0;
                                    i11 = 0;
                                } else {
                                    int A = yVar.A();
                                    i11 = A & 15;
                                    i12 = (A & 240) >> 4;
                                }
                                if (yVar.A() == 1) {
                                    num2 = num3;
                                    z13 = true;
                                } else {
                                    num2 = num3;
                                    z13 = false;
                                }
                                int A2 = yVar.A();
                                byte[] bArr2 = new byte[16];
                                yVar.k(0, 16, bArr2);
                                if (z13 && A2 == 0) {
                                    int A3 = yVar.A();
                                    byte[] bArr3 = new byte[A3];
                                    yVar.k(0, A3, bArr3);
                                    bArr = bArr3;
                                }
                                num = num2;
                                sVar = new s(z13, str, A2, bArr2, i12, i11, bArr);
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
                        z14 = true;
                    }
                    e3.b.b("tenc atom is mandatory", z14);
                    String str2 = n0.f11873a;
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

    public static java.util.ArrayList i(h2.c r59, e3.w r60, long r61, d2.s r63, boolean r64, boolean r65, f9.k r66, boolean r67) {
        throw new UnsupportedOperationException("Method not decompiled: y3.d.i(h2.c, e3.w, long, d2.s, boolean, boolean, f9.k, boolean):java.util.ArrayList");
    }

    public static d2.s0 j(h2.d r17) {
        throw new UnsupportedOperationException("Method not decompiled: y3.d.j(h2.d):d2.s0");
    }

    public static void k(g2.y r58, int r59, int r60, int r61, int r62, java.lang.String r63, int r64, d2.s r65, g2.k0 r66, int r67) {
        throw new UnsupportedOperationException("Method not decompiled: y3.d.k(g2.y, int, int, int, int, java.lang.String, int, d2.s, g2.k0, int):void");
    }
}
