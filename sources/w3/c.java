package w3;

import android.util.Pair;
import b2.p0;
import b2.r0;
import com.google.android.gms.internal.vision.e2;
import e2.d0;
import e2.v;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import u2.x0;
public abstract class c {
    public static final byte[] f47952a;

    static {
        String str = d0.f8765a;
        f47952a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(v vVar) {
        int i10 = vVar.f8818b;
        vVar.K(4);
        if (vVar.j() != 1751411826) {
            i10 += 4;
        }
        vVar.J(i10);
    }

    public static void b(e2.v r50, int r51, int r52, int r53, int r54, java.lang.String r55, boolean r56, b2.o r57, e2.a0 r58, int r59) {
        throw new UnsupportedOperationException("Method not decompiled: w3.c.b(e2.v, int, int, int, int, java.lang.String, boolean, b2.o, e2.a0, int):void");
    }

    public static x0 c(int i10, v vVar) {
        vVar.J(i10 + 12);
        vVar.K(1);
        d(vVar);
        vVar.K(2);
        int x10 = vVar.x();
        if ((x10 & 128) != 0) {
            vVar.K(2);
        }
        if ((x10 & 64) != 0) {
            vVar.K(vVar.x());
        }
        if ((x10 & 32) != 0) {
            vVar.K(2);
        }
        vVar.K(1);
        d(vVar);
        String e7 = r0.e(vVar.x());
        if (!"audio/mpeg".equals(e7) && !"audio/vnd.dts".equals(e7) && !"audio/vnd.dts.hd".equals(e7)) {
            vVar.K(4);
            long z10 = vVar.z();
            long z11 = vVar.z();
            vVar.K(1);
            int d = d(vVar);
            long j3 = z11;
            byte[] bArr = new byte[d];
            vVar.h(0, d, bArr);
            long j10 = -1;
            if (j3 <= 0) {
                j3 = -1;
            }
            if (z10 > 0) {
                j10 = z10;
            }
            return new x0(e7, bArr, j3, j10);
        }
        return new x0(e7, null, -1L, -1L);
    }

    public static int d(v vVar) {
        int x10 = vVar.x();
        int i10 = x10 & 127;
        while ((x10 & 128) == 128) {
            x10 = vVar.x();
            i10 = (i10 << 7) | (x10 & 127);
        }
        return i10;
    }

    public static int e(int i10) {
        return (i10 >> 24) & 255;
    }

    public static p0 f(f2.d dVar) {
        f2.b bVar;
        f2.e e7 = dVar.e(1751411826);
        f2.e e10 = dVar.e(1801812339);
        f2.e e11 = dVar.e(1768715124);
        if (e7 != null && e10 != null && e11 != null) {
            v vVar = e7.f9205c;
            vVar.J(16);
            if (vVar.j() == 1835299937) {
                v vVar2 = e10.f9205c;
                vVar2.J(12);
                int j3 = vVar2.j();
                String[] strArr = new String[j3];
                for (int i10 = 0; i10 < j3; i10++) {
                    int j10 = vVar2.j();
                    vVar2.K(4);
                    strArr[i10] = vVar2.v(j10 - 8, StandardCharsets.UTF_8);
                }
                v vVar3 = e11.f9205c;
                vVar3.J(8);
                ArrayList arrayList = new ArrayList();
                while (vVar3.a() > 8) {
                    int i11 = vVar3.f8818b;
                    int j11 = vVar3.j();
                    int j12 = vVar3.j() - 1;
                    if (j12 >= 0 && j12 < j3) {
                        String str = strArr[j12];
                        int i12 = i11 + j11;
                        while (true) {
                            int i13 = vVar3.f8818b;
                            if (i13 < i12) {
                                int j13 = vVar3.j();
                                if (vVar3.j() == 1684108385) {
                                    int j14 = vVar3.j();
                                    int j15 = vVar3.j();
                                    int i14 = j13 - 16;
                                    byte[] bArr = new byte[i14];
                                    vVar3.h(0, i14, bArr);
                                    bVar = new f2.b(str, bArr, j15, j14);
                                    break;
                                }
                                vVar3.J(i13 + j13);
                            } else {
                                bVar = null;
                                break;
                            }
                        }
                        if (bVar != null) {
                            arrayList.add(bVar);
                        }
                    } else {
                        e2.n(j12, "Skipped metadata with unknown key index: ", "BoxParsers");
                    }
                    vVar3.J(i11 + j11);
                }
                if (!arrayList.isEmpty()) {
                    return new p0(arrayList);
                }
            }
        }
        return null;
    }

    public static f2.g g(v vVar) {
        long r10;
        long r11;
        vVar.J(8);
        if (e(vVar.j()) == 0) {
            r10 = vVar.z();
            r11 = vVar.z();
        } else {
            r10 = vVar.r();
            r11 = vVar.r();
        }
        return new f2.g(r10, r11, vVar.z());
    }

    public static Pair h(v vVar, int i10, int i11) {
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
        int i14 = vVar.f8818b;
        while (i14 - i10 < i11) {
            vVar.J(i14);
            int j3 = vVar.j();
            boolean z14 = false;
            if (j3 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c3.b.c("childAtomSize must be positive", z10);
            if (vVar.j() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = -1;
                Integer num3 = null;
                String str = null;
                int i17 = 0;
                while (i15 - i14 < j3) {
                    vVar.J(i15);
                    int j10 = vVar.j();
                    int j11 = vVar.j();
                    if (j11 == 1718775137) {
                        num3 = Integer.valueOf(vVar.j());
                    } else if (j11 == 1935894637) {
                        vVar.K(4);
                        str = vVar.v(4, StandardCharsets.UTF_8);
                    } else if (j11 == 1935894633) {
                        i16 = i15;
                        i17 = j10;
                    }
                    i15 += j10;
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
                    c3.b.c("frma atom is mandatory", z11);
                    if (i16 != -1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c3.b.c("schi atom is mandatory", z12);
                    int i18 = i16 + 8;
                    while (true) {
                        if (i18 - i16 < i17) {
                            vVar.J(i18);
                            int j12 = vVar.j();
                            if (vVar.j() == 1952804451) {
                                int e7 = e(vVar.j());
                                vVar.K(1);
                                if (e7 == 0) {
                                    vVar.K(1);
                                    i13 = 0;
                                    i12 = 0;
                                } else {
                                    int x10 = vVar.x();
                                    i12 = x10 & 15;
                                    i13 = (x10 & 240) >> 4;
                                }
                                if (vVar.x() == 1) {
                                    num2 = num3;
                                    z13 = true;
                                } else {
                                    num2 = num3;
                                    z13 = false;
                                }
                                int x11 = vVar.x();
                                byte[] bArr2 = new byte[16];
                                vVar.h(0, 16, bArr2);
                                if (z13 && x11 == 0) {
                                    int x12 = vVar.x();
                                    byte[] bArr3 = new byte[x12];
                                    vVar.h(0, x12, bArr3);
                                    bArr = bArr3;
                                }
                                num = num2;
                                pVar = new p(z13, str, x11, bArr2, i13, i12, bArr);
                            } else {
                                i18 += j12;
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
                    c3.b.c("tenc atom is mandatory", z14);
                    String str2 = d0.f8765a;
                    create = Pair.create(num, pVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i14 += j3;
        }
        return null;
    }

    public static e2.a0 i(e2.v r67, s4.g1 r68, java.lang.String r69, b2.o r70, boolean r71) {
        throw new UnsupportedOperationException("Method not decompiled: w3.c.i(e2.v, s4.g1, java.lang.String, b2.o, boolean):e2.a0");
    }

    public static java.util.ArrayList j(f2.d r54, c3.w r55, long r56, b2.o r58, boolean r59, boolean r60, d9.e r61) {
        throw new UnsupportedOperationException("Method not decompiled: w3.c.j(f2.d, c3.w, long, b2.o, boolean, boolean, d9.e):java.util.ArrayList");
    }

    public static b2.p0 k(f2.e r17) {
        throw new UnsupportedOperationException("Method not decompiled: w3.c.k(f2.e):b2.p0");
    }
}
