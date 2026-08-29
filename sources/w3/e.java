package w3;

import android.util.Pair;
import f5.d0;
import f5.w;
import i7.h0;
import l4.v0;
public abstract class e {
    public static final byte[] f49642a;

    static {
        int i10 = d0.f6579a;
        f49642a = "OpusHead".getBytes(p8.d.f45658c);
    }

    public static v0 a(int i10, w wVar) {
        wVar.C(i10 + 12);
        wVar.D(1);
        b(wVar);
        wVar.D(2);
        int r6 = wVar.r();
        if ((r6 & 128) != 0) {
            wVar.D(2);
        }
        if ((r6 & 64) != 0) {
            wVar.D(wVar.r());
        }
        if ((r6 & 32) != 0) {
            wVar.D(2);
        }
        wVar.D(1);
        b(wVar);
        String d = f5.o.d(wVar.r());
        if (!"audio/mpeg".equals(d) && !"audio/vnd.dts".equals(d) && !"audio/vnd.dts.hd".equals(d)) {
            wVar.D(4);
            long s10 = wVar.s();
            long s11 = wVar.s();
            wVar.D(1);
            int b10 = b(wVar);
            long j10 = s11;
            byte[] bArr = new byte[b10];
            wVar.c(0, b10, bArr);
            long j11 = -1;
            if (j10 <= 0) {
                j10 = -1;
            }
            if (s10 > 0) {
                j11 = s10;
            }
            return new v0(d, bArr, j10, j11);
        }
        return new v0(d, null, -1L, -1L);
    }

    public static int b(w wVar) {
        int r6 = wVar.r();
        int i10 = r6 & 127;
        while ((r6 & 128) == 128) {
            r6 = wVar.r();
            i10 = (i10 << 7) | (r6 & 127);
        }
        return i10;
    }

    public static Pair c(w wVar, int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        p pVar;
        Pair create;
        int i12;
        int i13;
        Integer num2;
        boolean z13;
        int i14 = wVar.f6641b;
        while (i14 - i10 < i11) {
            wVar.C(i14);
            int e10 = wVar.e();
            boolean z14 = false;
            if (e10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            h0.a("childAtomSize must be positive", z10);
            if (wVar.e() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = -1;
                Integer num3 = null;
                String str = null;
                int i17 = 0;
                while (i15 - i14 < e10) {
                    wVar.C(i15);
                    int e11 = wVar.e();
                    int e12 = wVar.e();
                    if (e12 == 1718775137) {
                        num3 = Integer.valueOf(wVar.e());
                    } else if (e12 == 1935894637) {
                        wVar.D(4);
                        str = wVar.p(4, p8.d.f45658c);
                    } else if (e12 == 1935894633) {
                        i16 = i15;
                        i17 = e11;
                    }
                    i15 += e11;
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
                    h0.a("frma atom is mandatory", z11);
                    if (i16 != -1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    h0.a("schi atom is mandatory", z12);
                    int i18 = i16 + 8;
                    while (true) {
                        if (i18 - i16 < i17) {
                            wVar.C(i18);
                            int e13 = wVar.e();
                            if (wVar.e() == 1952804451) {
                                int b10 = nc.k.b(wVar.e());
                                wVar.D(1);
                                if (b10 == 0) {
                                    wVar.D(1);
                                    i13 = 0;
                                    i12 = 0;
                                } else {
                                    int r6 = wVar.r();
                                    i12 = r6 & 15;
                                    i13 = (r6 & 240) >> 4;
                                }
                                if (wVar.r() == 1) {
                                    num2 = num3;
                                    z13 = true;
                                } else {
                                    num2 = num3;
                                    z13 = false;
                                }
                                int r9 = wVar.r();
                                byte[] bArr2 = new byte[16];
                                wVar.c(0, 16, bArr2);
                                if (z13 && r9 == 0) {
                                    int r10 = wVar.r();
                                    byte[] bArr3 = new byte[r10];
                                    wVar.c(0, r10, bArr3);
                                    bArr = bArr3;
                                }
                                num = num2;
                                pVar = new p(z13, str, r9, bArr2, i13, i12, bArr);
                            } else {
                                i18 += e13;
                            }
                        } else {
                            num = num3;
                            pVar = null;
                            break;
                        }
                    }
                    if (pVar != null) {
                        z14 = true;
                    }
                    h0.a("tenc atom is mandatory", z14);
                    int i19 = d0.f6579a;
                    create = Pair.create(num, pVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i14 += e10;
        }
        return null;
    }

    public static w3.r d(w3.o r42, w3.a r43, o3.q r44) {
        throw new UnsupportedOperationException("Method not decompiled: w3.e.d(w3.o, w3.a, o3.q):w3.r");
    }

    public static java.util.ArrayList e(w3.a r73, o3.q r74, long r75, n3.c r77, boolean r78, boolean r79, p8.e r80) {
        throw new UnsupportedOperationException("Method not decompiled: w3.e.e(w3.a, o3.q, long, n3.c, boolean, boolean, p8.e):java.util.ArrayList");
    }
}
