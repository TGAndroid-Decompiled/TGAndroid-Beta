package u3;

import android.util.Pair;
import d5.f0;
import d5.y;
import j4.v0;
public abstract class e {
    public static final byte[] f47983a;

    static {
        int i9 = f0.f4349a;
        f47983a = "OpusHead".getBytes(n8.d.f18513c);
    }

    public static v0 a(int i9, y yVar) {
        yVar.C(i9 + 12);
        yVar.D(1);
        b(yVar);
        yVar.D(2);
        int r10 = yVar.r();
        if ((r10 & 128) != 0) {
            yVar.D(2);
        }
        if ((r10 & 64) != 0) {
            yVar.D(yVar.r());
        }
        if ((r10 & 32) != 0) {
            yVar.D(2);
        }
        yVar.D(1);
        b(yVar);
        String d = d5.q.d(yVar.r());
        if (!"audio/mpeg".equals(d) && !"audio/vnd.dts".equals(d) && !"audio/vnd.dts.hd".equals(d)) {
            yVar.D(4);
            long s10 = yVar.s();
            long s11 = yVar.s();
            yVar.D(1);
            int b10 = b(yVar);
            long j10 = s11;
            byte[] bArr = new byte[b10];
            yVar.c(0, b10, bArr);
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

    public static int b(y yVar) {
        int r10 = yVar.r();
        int i9 = r10 & 127;
        while ((r10 & 128) == 128) {
            r10 = yVar.r();
            i9 = (i9 << 7) | (r10 & 127);
        }
        return i9;
    }

    public static Pair c(y yVar, int i9, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        p pVar;
        Pair create;
        int i11;
        int i12;
        Integer num2;
        boolean z13;
        int i13 = yVar.f4411b;
        while (i13 - i9 < i10) {
            yVar.C(i13);
            int e10 = yVar.e();
            boolean z14 = false;
            if (e10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            g7.q.a("childAtomSize must be positive", z10);
            if (yVar.e() == 1936289382) {
                int i14 = i13 + 8;
                int i15 = -1;
                Integer num3 = null;
                String str = null;
                int i16 = 0;
                while (i14 - i13 < e10) {
                    yVar.C(i14);
                    int e11 = yVar.e();
                    int e12 = yVar.e();
                    if (e12 == 1718775137) {
                        num3 = Integer.valueOf(yVar.e());
                    } else if (e12 == 1935894637) {
                        yVar.D(4);
                        str = yVar.p(4, n8.d.f18513c);
                    } else if (e12 == 1935894633) {
                        i15 = i14;
                        i16 = e11;
                    }
                    i14 += e11;
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
                    g7.q.a("frma atom is mandatory", z11);
                    if (i15 != -1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    g7.q.a("schi atom is mandatory", z12);
                    int i17 = i15 + 8;
                    while (true) {
                        if (i17 - i15 < i16) {
                            yVar.C(i17);
                            int e13 = yVar.e();
                            if (yVar.e() == 1952804451) {
                                int b10 = lc.k.b(yVar.e());
                                yVar.D(1);
                                if (b10 == 0) {
                                    yVar.D(1);
                                    i12 = 0;
                                    i11 = 0;
                                } else {
                                    int r10 = yVar.r();
                                    i11 = r10 & 15;
                                    i12 = (r10 & 240) >> 4;
                                }
                                if (yVar.r() == 1) {
                                    num2 = num3;
                                    z13 = true;
                                } else {
                                    num2 = num3;
                                    z13 = false;
                                }
                                int r11 = yVar.r();
                                byte[] bArr2 = new byte[16];
                                yVar.c(0, 16, bArr2);
                                if (z13 && r11 == 0) {
                                    int r12 = yVar.r();
                                    byte[] bArr3 = new byte[r12];
                                    yVar.c(0, r12, bArr3);
                                    bArr = bArr3;
                                }
                                num = num2;
                                pVar = new p(z13, str, r11, bArr2, i12, i11, bArr);
                            } else {
                                i17 += e13;
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
                    g7.q.a("tenc atom is mandatory", z14);
                    int i18 = f0.f4349a;
                    create = Pair.create(num, pVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i13 += e10;
        }
        return null;
    }

    public static u3.r d(u3.o r42, u3.a r43, m3.q r44) {
        throw new UnsupportedOperationException("Method not decompiled: u3.e.d(u3.o, u3.a, m3.q):u3.r");
    }

    public static java.util.ArrayList e(u3.a r73, m3.q r74, long r75, l3.c r77, boolean r78, boolean r79, n8.e r80) {
        throw new UnsupportedOperationException("Method not decompiled: u3.e.e(u3.a, m3.q, long, l3.c, boolean, boolean, n8.e):java.util.ArrayList");
    }
}
