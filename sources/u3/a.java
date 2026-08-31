package u3;

import b4.e0;
import b4.x;
import e4.c;
import h5.d0;
import h5.w;
import j3.r1;
import java.util.Arrays;
import k7.v6;
import k7.w6;
import k7.x6;
import org.telegram.ui.Components.jb;
import r3.h;
import r3.k;
import r3.l;
import r3.m;
import r3.n;
import r3.o;
import r3.s;
import r3.v;
import sf.g;
public final class a implements k {
    public m f48233e;
    public v f48234f;
    public c h;
    public o f48236i;
    public int f48237j;
    public int f48238k;
    public x f48239l;
    public int f48240m;
    public long f48241n;
    public final byte[] f48230a = new byte[42];
    public final w f48231b = new w(new byte[32768], 0);
    public final boolean f48232c = false;
    public final jb d = new Object();
    public int f48235g = 0;

    @Override
    public final void d(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f48235g = 0;
        } else {
            x xVar = this.f48239l;
            if (xVar != null) {
                xVar.d(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f48241n = j12;
        this.f48240m = 0;
        this.f48231b.C(0);
    }

    @Override
    public final void e(m mVar) {
        this.f48233e = mVar;
        this.f48234f = mVar.i2(0, 1);
        mVar.i1();
    }

    @Override
    public final int h(l lVar, jb jbVar) {
        o oVar;
        c cVar;
        int i10;
        s nVar;
        g gVar;
        long j10;
        long j11;
        long j12;
        boolean z4;
        boolean z10;
        int i11 = this.f48235g;
        boolean z11 = true;
        if (i11 != 0) {
            byte[] bArr = this.f48230a;
            if (i11 != 1) {
                int i12 = 3;
                if (i11 != 2) {
                    int i13 = 7;
                    if (i11 != 3) {
                        long j13 = 0;
                        if (i11 != 4) {
                            if (i11 == 5) {
                                this.f48234f.getClass();
                                this.f48236i.getClass();
                                x xVar = this.f48239l;
                                if (xVar != null && xVar.f1667c != null) {
                                    return xVar.b(lVar, jbVar);
                                }
                                if (this.f48241n == -1) {
                                    o oVar2 = this.f48236i;
                                    ((h) lVar).f46558f = 0;
                                    h hVar = (h) lVar;
                                    hVar.a(1, false);
                                    byte[] bArr2 = new byte[1];
                                    hVar.f(bArr2, 0, 1, false);
                                    if ((bArr2[0] & 1) == 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    hVar.a(2, false);
                                    if (!z10) {
                                        i13 = 6;
                                    }
                                    w wVar = new w(i13);
                                    byte[] bArr3 = wVar.f7308a;
                                    int i14 = 0;
                                    while (i14 < i13) {
                                        int e6 = hVar.e(i14, i13 - i14, bArr3);
                                        if (e6 == -1) {
                                            break;
                                        }
                                        i14 += e6;
                                    }
                                    wVar.E(i14);
                                    hVar.f46558f = 0;
                                    try {
                                        long A = wVar.A();
                                        if (!z10) {
                                            A *= oVar2.f46567b;
                                        }
                                        j13 = A;
                                    } catch (NumberFormatException unused) {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        this.f48241n = j13;
                                    } else {
                                        throw r1.a(null, null);
                                    }
                                } else {
                                    w wVar2 = this.f48231b;
                                    int i15 = wVar2.f7310c;
                                    if (i15 < 32768) {
                                        int read = ((h) lVar).read(wVar2.f7308a, i15, 32768 - i15);
                                        if (read != -1) {
                                            z11 = false;
                                        }
                                        if (!z11) {
                                            wVar2.E(i15 + read);
                                        } else if (wVar2.a() == 0) {
                                            o oVar3 = this.f48236i;
                                            int i16 = d0.f7237a;
                                            this.f48234f.c((this.f48241n * 1000000) / oVar3.f46569e, 1, this.f48240m, 0, null);
                                            return -1;
                                        }
                                    } else {
                                        z11 = false;
                                    }
                                    int i17 = wVar2.f7309b;
                                    int i18 = this.f48240m;
                                    int i19 = this.f48237j;
                                    if (i18 < i19) {
                                        wVar2.G(Math.min(i19 - i18, wVar2.a()));
                                    }
                                    this.f48236i.getClass();
                                    int i20 = wVar2.f7309b;
                                    while (true) {
                                        int i21 = wVar2.f7310c - 16;
                                        jb jbVar2 = this.d;
                                        if (i20 <= i21) {
                                            wVar2.F(i20);
                                            if (v6.a(wVar2, this.f48236i, this.f48238k, jbVar2)) {
                                                wVar2.F(i20);
                                                j12 = jbVar2.f28091a;
                                                break;
                                            }
                                            i20++;
                                        } else {
                                            if (z11) {
                                                while (true) {
                                                    int i22 = wVar2.f7310c;
                                                    if (i20 <= i22 - this.f48237j) {
                                                        wVar2.F(i20);
                                                        try {
                                                            z4 = v6.a(wVar2, this.f48236i, this.f48238k, jbVar2);
                                                        } catch (IndexOutOfBoundsException unused2) {
                                                            z4 = false;
                                                        }
                                                        if (wVar2.f7309b > wVar2.f7310c) {
                                                            z4 = false;
                                                        }
                                                        if (z4) {
                                                            wVar2.F(i20);
                                                            j12 = jbVar2.f28091a;
                                                            break;
                                                        }
                                                        i20++;
                                                    } else {
                                                        wVar2.F(i22);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                wVar2.F(i20);
                                            }
                                            j12 = -1;
                                        }
                                    }
                                    int i23 = wVar2.f7309b - i17;
                                    wVar2.F(i17);
                                    this.f48234f.d(i23, wVar2);
                                    int i24 = this.f48240m + i23;
                                    this.f48240m = i24;
                                    if (j12 != -1) {
                                        o oVar4 = this.f48236i;
                                        int i25 = d0.f7237a;
                                        this.f48234f.c((this.f48241n * 1000000) / oVar4.f46569e, 1, i24, 0, null);
                                        this.f48240m = 0;
                                        this.f48241n = j12;
                                    }
                                    if (wVar2.a() < 16) {
                                        int a2 = wVar2.a();
                                        byte[] bArr4 = wVar2.f7308a;
                                        System.arraycopy(bArr4, wVar2.f7309b, bArr4, 0, a2);
                                        wVar2.F(0);
                                        wVar2.E(a2);
                                    }
                                }
                                return 0;
                            }
                            throw new IllegalStateException();
                        }
                        ((h) lVar).f46558f = 0;
                        w wVar3 = new w(2);
                        h hVar2 = (h) lVar;
                        hVar2.f(wVar3.f7308a, 0, 2, false);
                        int z12 = wVar3.z();
                        if ((z12 >> 2) == 16382) {
                            hVar2.f46558f = 0;
                            this.f48238k = z12;
                            m mVar = this.f48233e;
                            int i26 = d0.f7237a;
                            long j14 = hVar2.d;
                            long j15 = hVar2.f46556c;
                            this.f48236i.getClass();
                            o oVar5 = this.f48236i;
                            if (oVar5.f46574k != null) {
                                nVar = new n(oVar5, j14, 0);
                                i10 = 0;
                            } else if (j15 != -1 && oVar5.f46573j > 0) {
                                int i27 = this.f48238k;
                                int i28 = oVar5.f46568c;
                                g gVar2 = new g(oVar5, 5);
                                e0 e0Var = new e0(oVar5, i27);
                                long b10 = oVar5.b();
                                long j16 = oVar5.f46573j;
                                int i29 = oVar5.d;
                                if (i29 > 0) {
                                    i10 = 0;
                                    gVar = gVar2;
                                    j11 = ((i29 + i28) / 2) + 1;
                                } else {
                                    gVar = gVar2;
                                    i10 = 0;
                                    int i30 = oVar5.f46566a;
                                    if (i30 == oVar5.f46567b && i30 > 0) {
                                        j10 = i30;
                                    } else {
                                        j10 = 4096;
                                    }
                                    j11 = (((j10 * oVar5.f46571g) * oVar5.h) / 8) + 64;
                                }
                                x xVar2 = new x(gVar, e0Var, b10, j16, j14, j15, j11, Math.max(6, i28));
                                this.f48239l = xVar2;
                                nVar = xVar2.f1665a;
                            } else {
                                i10 = 0;
                                nVar = new n(oVar5.b());
                            }
                            mVar.m2(nVar);
                            this.f48235g = 5;
                            return i10;
                        }
                        hVar2.f46558f = 0;
                        throw r1.a("First frame does not start with sync code.", null);
                    }
                    ?? r22 = 0;
                    o oVar6 = this.f48236i;
                    boolean z13 = false;
                    while (!z13) {
                        ((h) lVar).f46558f = r22;
                        byte[] bArr5 = new byte[4];
                        h5.v vVar = new h5.v(bArr5, 4);
                        h hVar3 = (h) lVar;
                        hVar3.f(bArr5, r22, 4, r22);
                        boolean h = vVar.h();
                        int i31 = vVar.i(i13);
                        int i32 = vVar.i(24) + 4;
                        if (i31 == 0) {
                            byte[] bArr6 = new byte[38];
                            hVar3.c(bArr6, r22, 38, r22);
                            oVar6 = new o(bArr6, 4);
                        } else if (oVar6 != null) {
                            c cVar2 = oVar6.f46575l;
                            if (i31 == i12) {
                                w wVar4 = new w(i32);
                                hVar3.c(wVar4.f7308a, r22, i32, r22);
                                oVar = new o(oVar6.f46566a, oVar6.f46567b, oVar6.f46568c, oVar6.d, oVar6.f46569e, oVar6.f46571g, oVar6.h, oVar6.f46573j, w6.b(wVar4), oVar6.f46575l);
                            } else if (i31 == 4) {
                                w wVar5 = new w(i32);
                                hVar3.c(wVar5.f7308a, 0, i32, false);
                                wVar5.G(4);
                                c a10 = x6.a(Arrays.asList(x6.b(wVar5, false, false).f46596a));
                                if (cVar2 == null) {
                                    cVar = a10;
                                } else {
                                    if (a10 != null) {
                                        cVar2 = cVar2.a(a10.f4938a);
                                    }
                                    cVar = cVar2;
                                }
                                oVar = new o(oVar6.f46566a, oVar6.f46567b, oVar6.f46568c, oVar6.d, oVar6.f46569e, oVar6.f46571g, oVar6.h, oVar6.f46573j, oVar6.f46574k, cVar);
                            } else if (i31 == 6) {
                                w wVar6 = new w(i32);
                                hVar3.c(wVar6.f7308a, 0, i32, false);
                                wVar6.G(4);
                                c cVar3 = new c(s8.v.x(h4.a.a(wVar6)));
                                if (cVar2 != null) {
                                    cVar3 = cVar2.a(cVar3.f4938a);
                                }
                                oVar = new o(oVar6.f46566a, oVar6.f46567b, oVar6.f46568c, oVar6.d, oVar6.f46569e, oVar6.f46571g, oVar6.h, oVar6.f46573j, oVar6.f46574k, cVar3);
                            } else {
                                hVar3.s(i32);
                            }
                            oVar6 = oVar;
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i33 = d0.f7237a;
                        this.f48236i = oVar6;
                        z13 = h;
                        r22 = 0;
                        i12 = 3;
                        i13 = 7;
                    }
                    this.f48236i.getClass();
                    this.f48237j = Math.max(this.f48236i.f46568c, 6);
                    v vVar2 = this.f48234f;
                    int i34 = d0.f7237a;
                    vVar2.b(this.f48236i.c(bArr, this.h));
                    this.f48235g = 4;
                    return 0;
                }
                w wVar7 = new w(4);
                ((h) lVar).c(wVar7.f7308a, 0, 4, false);
                if (wVar7.v() == 1716281667) {
                    this.f48235g = 3;
                    return 0;
                }
                throw r1.a("Failed to read FLAC stream marker.", null);
            }
            ((h) lVar).f(bArr, 0, bArr.length, false);
            ((h) lVar).f46558f = 0;
            this.f48235g = 2;
            return 0;
        }
        ((h) lVar).f46558f = 0;
        h hVar4 = (h) lVar;
        long g10 = hVar4.g();
        c a11 = w6.a(lVar, !this.f48232c);
        hVar4.s((int) (hVar4.g() - g10));
        this.h = a11;
        this.f48235g = 1;
        return 0;
    }

    @Override
    public final boolean i(l lVar) {
        w6.a(lVar, false);
        w wVar = new w(4);
        ((h) lVar).f(wVar.f7308a, 0, 4, false);
        if (wVar.v() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override
    public final void release() {
    }
}
