package z3;

import android.util.Pair;
import h5.d0;
import h5.w;
import k7.t6;
public abstract class e {
    public static final byte[] f47286a;

    static {
        int i10 = d0.f6937a;
        f47286a = "OpusHead".getBytes(r8.d.f43389c);
    }

    public static a4.c a(int i10, w wVar) {
        wVar.F(i10 + 12);
        wVar.G(1);
        b(wVar);
        wVar.G(2);
        int u10 = wVar.u();
        if ((u10 & 128) != 0) {
            wVar.G(2);
        }
        if ((u10 & 64) != 0) {
            wVar.G(wVar.u());
        }
        if ((u10 & 32) != 0) {
            wVar.G(2);
        }
        wVar.G(1);
        b(wVar);
        String d = h5.o.d(wVar.u());
        if (!"audio/mpeg".equals(d) && !"audio/vnd.dts".equals(d) && !"audio/vnd.dts.hd".equals(d)) {
            wVar.G(4);
            long v = wVar.v();
            long v10 = wVar.v();
            wVar.G(1);
            int b10 = b(wVar);
            long j10 = v10;
            byte[] bArr = new byte[b10];
            wVar.e(0, b10, bArr);
            long j11 = -1;
            if (j10 <= 0) {
                j10 = -1;
            }
            if (v > 0) {
                j11 = v;
            }
            return new a4.c(d, bArr, j10, j11);
        }
        return new a4.c(d, null, -1L, -1L);
    }

    public static int b(w wVar) {
        int u10 = wVar.u();
        int i10 = u10 & 127;
        while ((u10 & 128) == 128) {
            u10 = wVar.u();
            i10 = (i10 << 7) | (u10 & 127);
        }
        return i10;
    }

    public static f2.c c(w wVar) {
        long j10;
        wVar.F(8);
        if (n3.a.f(wVar.g()) == 0) {
            j10 = wVar.v();
            wVar.G(4);
        } else {
            long o10 = wVar.o();
            wVar.G(8);
            j10 = o10;
        }
        return new f2.c(new e4.c(new m3.a((j10 - 2082844800) * 1000)), wVar.v(), 13);
    }

    public static Pair d(w wVar, int i10, int i11) {
        boolean z4;
        boolean z10;
        boolean z11;
        Integer num;
        q qVar;
        Pair create;
        int i12;
        int i13;
        Integer num2;
        boolean z12;
        int i14 = wVar.f7001b;
        while (i14 - i10 < i11) {
            wVar.F(i14);
            int g10 = wVar.g();
            boolean z13 = false;
            if (g10 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            t6.a("childAtomSize must be positive", z4);
            if (wVar.g() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = -1;
                Integer num3 = null;
                String str = null;
                int i17 = 0;
                while (i15 - i14 < g10) {
                    wVar.F(i15);
                    int g11 = wVar.g();
                    int g12 = wVar.g();
                    if (g12 == 1718775137) {
                        num3 = Integer.valueOf(wVar.g());
                    } else if (g12 == 1935894637) {
                        wVar.G(4);
                        str = wVar.s(4, r8.d.f43389c);
                    } else if (g12 == 1935894633) {
                        i16 = i15;
                        i17 = g11;
                    }
                    i15 += g11;
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
                    t6.a("frma atom is mandatory", z10);
                    if (i16 != -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    t6.a("schi atom is mandatory", z11);
                    int i18 = i16 + 8;
                    while (true) {
                        if (i18 - i16 < i17) {
                            wVar.F(i18);
                            int g13 = wVar.g();
                            if (wVar.g() == 1952804451) {
                                int f10 = n3.a.f(wVar.g());
                                wVar.G(1);
                                if (f10 == 0) {
                                    wVar.G(1);
                                    i13 = 0;
                                    i12 = 0;
                                } else {
                                    int u10 = wVar.u();
                                    i12 = u10 & 15;
                                    i13 = (u10 & 240) >> 4;
                                }
                                if (wVar.u() == 1) {
                                    num2 = num3;
                                    z12 = true;
                                } else {
                                    num2 = num3;
                                    z12 = false;
                                }
                                int u11 = wVar.u();
                                byte[] bArr2 = new byte[16];
                                wVar.e(0, 16, bArr2);
                                if (z12 && u11 == 0) {
                                    int u12 = wVar.u();
                                    byte[] bArr3 = new byte[u12];
                                    wVar.e(0, u12, bArr3);
                                    bArr = bArr3;
                                }
                                num = num2;
                                qVar = new q(z12, str, u11, bArr2, i13, i12, bArr);
                            } else {
                                i18 += g13;
                            }
                        } else {
                            num = num3;
                            qVar = null;
                            break;
                        }
                    }
                    if (qVar != null) {
                        z13 = true;
                    }
                    t6.a("tenc atom is mandatory", z13);
                    int i19 = d0.f6937a;
                    create = Pair.create(num, qVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i14 += g10;
        }
        return null;
    }

    public static z3.s e(z3.p r40, z3.a r41, r3.p r42) {
        throw new UnsupportedOperationException("Method not decompiled: z3.e.e(z3.p, z3.a, r3.p):z3.s");
    }

    public static java.util.ArrayList f(z3.a r73, r3.p r74, long r75, o3.g r77, boolean r78, boolean r79, r8.e r80) {
        throw new UnsupportedOperationException("Method not decompiled: z3.e.f(z3.a, r3.p, long, o3.g, boolean, boolean, r8.e):java.util.ArrayList");
    }
}
