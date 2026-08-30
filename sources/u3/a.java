package u3;

import b4.e0;
import b4.x;
import e4.c;
import h5.d0;
import h5.w;
import j3.r1;
import java.util.Arrays;
import k7.u6;
import k7.v6;
import k7.w6;
import org.telegram.ui.Components.jb;
import r3.h;
import r3.k;
import r3.l;
import r3.m;
import r3.n;
import r3.o;
import r3.s;
import r3.v;
import rh.e;
public final class a implements k {
    public m e;
    public v f44991f;
    public c h;
    public o f44993i;
    public int f44994j;
    public int f44995k;
    public x f44996l;
    public int f44997m;
    public long f44998n;
    public final byte[] f44988a = new byte[42];
    public final w f44989b = new w(new byte[32768], 0);
    public final boolean f44990c = false;
    public final jb d = new Object();
    public int f44992g = 0;

    @Override
    public final void d(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f44992g = 0;
        } else {
            x xVar = this.f44996l;
            if (xVar != null) {
                xVar.d(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f44998n = j12;
        this.f44997m = 0;
        this.f44989b.C(0);
    }

    @Override
    public final void e(m mVar) {
        this.e = mVar;
        this.f44991f = mVar.c2(0, 1);
        mVar.f1();
    }

    @Override
    public final int h(l lVar, jb jbVar) {
        o oVar;
        c cVar;
        int i10;
        s nVar;
        long j10;
        long j11;
        long j12;
        long j13;
        boolean z4;
        boolean z10;
        long j14;
        int i11 = this.f44992g;
        boolean z11 = true;
        if (i11 != 0) {
            byte[] bArr = this.f44988a;
            if (i11 != 1) {
                int i12 = 3;
                if (i11 != 2) {
                    int i13 = 7;
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                this.f44991f.getClass();
                                this.f44993i.getClass();
                                x xVar = this.f44996l;
                                if (xVar != null && xVar.f1542c != null) {
                                    return xVar.b(lVar, jbVar);
                                }
                                if (this.f44998n == -1) {
                                    o oVar2 = this.f44993i;
                                    ((h) lVar).f43223f = 0;
                                    h hVar = (h) lVar;
                                    hVar.a(1, false);
                                    byte[] bArr2 = new byte[1];
                                    hVar.h(bArr2, 0, 1, false);
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
                                    byte[] bArr3 = wVar.f7000a;
                                    int i14 = 0;
                                    while (i14 < i13) {
                                        int f10 = hVar.f(i14, i13 - i14, bArr3);
                                        if (f10 == -1) {
                                            break;
                                        }
                                        i14 += f10;
                                    }
                                    wVar.E(i14);
                                    hVar.f43223f = 0;
                                    try {
                                        long A = wVar.A();
                                        if (!z10) {
                                            A *= oVar2.f43232b;
                                        }
                                        j14 = A;
                                    } catch (NumberFormatException unused) {
                                        z11 = false;
                                        j14 = 0;
                                    }
                                    if (z11) {
                                        this.f44998n = j14;
                                    } else {
                                        throw r1.a(null, null);
                                    }
                                } else {
                                    w wVar2 = this.f44989b;
                                    int i15 = wVar2.f7002c;
                                    if (i15 < 32768) {
                                        int read = ((h) lVar).read(wVar2.f7000a, i15, 32768 - i15);
                                        if (read != -1) {
                                            z11 = false;
                                        }
                                        if (!z11) {
                                            wVar2.E(i15 + read);
                                        } else if (wVar2.a() == 0) {
                                            o oVar3 = this.f44993i;
                                            int i16 = d0.f6937a;
                                            this.f44991f.c((this.f44998n * 1000000) / oVar3.e, 1, this.f44997m, 0, null);
                                            return -1;
                                        }
                                    } else {
                                        z11 = false;
                                    }
                                    int i17 = wVar2.f7001b;
                                    int i18 = this.f44997m;
                                    int i19 = this.f44994j;
                                    if (i18 < i19) {
                                        wVar2.G(Math.min(i19 - i18, wVar2.a()));
                                    }
                                    this.f44993i.getClass();
                                    int i20 = wVar2.f7001b;
                                    while (true) {
                                        int i21 = wVar2.f7002c - 16;
                                        jb jbVar2 = this.d;
                                        if (i20 <= i21) {
                                            wVar2.F(i20);
                                            if (u6.a(wVar2, this.f44993i, this.f44995k, jbVar2)) {
                                                wVar2.F(i20);
                                                j13 = jbVar2.f25949a;
                                                break;
                                            }
                                            i20++;
                                        } else {
                                            if (z11) {
                                                while (true) {
                                                    int i22 = wVar2.f7002c;
                                                    if (i20 <= i22 - this.f44994j) {
                                                        wVar2.F(i20);
                                                        try {
                                                            z4 = u6.a(wVar2, this.f44993i, this.f44995k, jbVar2);
                                                        } catch (IndexOutOfBoundsException unused2) {
                                                            z4 = false;
                                                        }
                                                        if (wVar2.f7001b > wVar2.f7002c) {
                                                            z4 = false;
                                                        }
                                                        if (z4) {
                                                            wVar2.F(i20);
                                                            j13 = jbVar2.f25949a;
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
                                            j13 = -1;
                                        }
                                    }
                                    int i23 = wVar2.f7001b - i17;
                                    wVar2.F(i17);
                                    this.f44991f.d(i23, wVar2);
                                    int i24 = this.f44997m + i23;
                                    this.f44997m = i24;
                                    if (j13 != -1) {
                                        o oVar4 = this.f44993i;
                                        int i25 = d0.f6937a;
                                        this.f44991f.c((this.f44998n * 1000000) / oVar4.e, 1, i24, 0, null);
                                        this.f44997m = 0;
                                        this.f44998n = j13;
                                    }
                                    if (wVar2.a() < 16) {
                                        int a2 = wVar2.a();
                                        byte[] bArr4 = wVar2.f7000a;
                                        System.arraycopy(bArr4, wVar2.f7001b, bArr4, 0, a2);
                                        wVar2.F(0);
                                        wVar2.E(a2);
                                    }
                                }
                                return 0;
                            }
                            throw new IllegalStateException();
                        }
                        ((h) lVar).f43223f = 0;
                        w wVar3 = new w(2);
                        h hVar2 = (h) lVar;
                        hVar2.h(wVar3.f7000a, 0, 2, false);
                        int z12 = wVar3.z();
                        if ((z12 >> 2) == 16382) {
                            hVar2.f43223f = 0;
                            this.f44995k = z12;
                            m mVar = this.e;
                            int i26 = d0.f6937a;
                            long j15 = hVar2.d;
                            long j16 = hVar2.f43222c;
                            this.f44993i.getClass();
                            o oVar5 = this.f44993i;
                            if (oVar5.f43238k != null) {
                                nVar = new n(oVar5, j15, 0);
                                i10 = 0;
                            } else if (j16 != -1 && oVar5.f43237j > 0) {
                                int i27 = this.f44995k;
                                int i28 = oVar5.f43233c;
                                e eVar = new e(oVar5, 3);
                                e0 e0Var = new e0(oVar5, i27);
                                long b10 = oVar5.b();
                                long j17 = oVar5.f43237j;
                                int i29 = oVar5.d;
                                if (i29 > 0) {
                                    i10 = 0;
                                    j10 = j16;
                                    j12 = ((i29 + i28) / 2) + 1;
                                } else {
                                    j10 = j16;
                                    i10 = 0;
                                    int i30 = oVar5.f43231a;
                                    if (i30 == oVar5.f43232b && i30 > 0) {
                                        j11 = i30;
                                    } else {
                                        j11 = 4096;
                                    }
                                    j12 = (((j11 * oVar5.f43235g) * oVar5.h) / 8) + 64;
                                }
                                x xVar2 = new x(eVar, e0Var, b10, j17, j15, j10, j12, Math.max(6, i28));
                                this.f44996l = xVar2;
                                nVar = xVar2.f1540a;
                            } else {
                                i10 = 0;
                                nVar = new n(oVar5.b());
                            }
                            mVar.g2(nVar);
                            this.f44992g = 5;
                            return i10;
                        }
                        hVar2.f43223f = 0;
                        throw r1.a("First frame does not start with sync code.", null);
                    }
                    ?? r22 = 0;
                    o oVar6 = this.f44993i;
                    boolean z13 = false;
                    while (!z13) {
                        ((h) lVar).f43223f = r22;
                        byte[] bArr5 = new byte[4];
                        h5.v vVar = new h5.v(bArr5, 4);
                        h hVar3 = (h) lVar;
                        hVar3.h(bArr5, r22, 4, r22);
                        boolean h = vVar.h();
                        int i31 = vVar.i(i13);
                        int i32 = vVar.i(24) + 4;
                        if (i31 == 0) {
                            byte[] bArr6 = new byte[38];
                            hVar3.d(bArr6, r22, 38, r22);
                            oVar6 = new o(bArr6, 4);
                        } else if (oVar6 != null) {
                            c cVar2 = oVar6.f43239l;
                            if (i31 == i12) {
                                w wVar4 = new w(i32);
                                hVar3.d(wVar4.f7000a, r22, i32, r22);
                                oVar = new o(oVar6.f43231a, oVar6.f43232b, oVar6.f43233c, oVar6.d, oVar6.e, oVar6.f43235g, oVar6.h, oVar6.f43237j, v6.b(wVar4), oVar6.f43239l);
                            } else if (i31 == 4) {
                                w wVar5 = new w(i32);
                                hVar3.d(wVar5.f7000a, 0, i32, false);
                                wVar5.G(4);
                                c a10 = w6.a(Arrays.asList((String[]) w6.b(wVar5, false, false).f16220b));
                                if (cVar2 == null) {
                                    cVar = a10;
                                } else {
                                    if (a10 != null) {
                                        cVar2 = cVar2.a(a10.f5101a);
                                    }
                                    cVar = cVar2;
                                }
                                oVar = new o(oVar6.f43231a, oVar6.f43232b, oVar6.f43233c, oVar6.d, oVar6.e, oVar6.f43235g, oVar6.h, oVar6.f43237j, oVar6.f43238k, cVar);
                            } else if (i31 == 6) {
                                w wVar6 = new w(i32);
                                hVar3.d(wVar6.f7000a, 0, i32, false);
                                wVar6.G(4);
                                c cVar3 = new c(s8.v.x(h4.a.a(wVar6)));
                                if (cVar2 != null) {
                                    cVar3 = cVar2.a(cVar3.f5101a);
                                }
                                oVar = new o(oVar6.f43231a, oVar6.f43232b, oVar6.f43233c, oVar6.d, oVar6.e, oVar6.f43235g, oVar6.h, oVar6.f43237j, oVar6.f43238k, cVar3);
                            } else {
                                hVar3.u(i32);
                            }
                            oVar6 = oVar;
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i33 = d0.f6937a;
                        this.f44993i = oVar6;
                        z13 = h;
                        r22 = 0;
                        i12 = 3;
                        i13 = 7;
                    }
                    this.f44993i.getClass();
                    this.f44994j = Math.max(this.f44993i.f43233c, 6);
                    v vVar2 = this.f44991f;
                    int i34 = d0.f6937a;
                    vVar2.b(this.f44993i.c(bArr, this.h));
                    this.f44992g = 4;
                    return 0;
                }
                w wVar7 = new w(4);
                ((h) lVar).d(wVar7.f7000a, 0, 4, false);
                if (wVar7.v() == 1716281667) {
                    this.f44992g = 3;
                    return 0;
                }
                throw r1.a("Failed to read FLAC stream marker.", null);
            }
            ((h) lVar).h(bArr, 0, bArr.length, false);
            ((h) lVar).f43223f = 0;
            this.f44992g = 2;
            return 0;
        }
        ((h) lVar).f43223f = 0;
        h hVar4 = (h) lVar;
        long i35 = hVar4.i();
        c a11 = v6.a(lVar, !this.f44990c);
        hVar4.u((int) (hVar4.i() - i35));
        this.h = a11;
        this.f44992g = 1;
        return 0;
    }

    @Override
    public final boolean i(l lVar) {
        v6.a(lVar, false);
        w wVar = new w(4);
        ((h) lVar).h(wVar.f7000a, 0, 4, false);
        if (wVar.v() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override
    public final void release() {
    }
}
