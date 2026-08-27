package v3;

import d5.g0;
import d5.z;
import h3.t0;
import h3.t1;
import h7.t;
import j4.u0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.w;

public final class d implements k {

    public m f48751a;

    public i f48752b;

    public boolean f48753c;

    public final boolean a(l lVar) {
        boolean zC;
        f fVar = new f();
        if (fVar.a(lVar, true) && (fVar.f48758a & 2) == 2) {
            int iMin = Math.min(fVar.f48761e, 8);
            z zVar = new z(iMin);
            lVar.b(0, iMin, zVar.f4858a);
            zVar.C(0);
            if (zVar.a() >= 5 && zVar.r() == 127 && zVar.s() == 1179402563) {
                this.f48752b = new c();
                return true;
            }
            zVar.C(0);
            try {
                zC = t.c(1, zVar, true);
            } catch (t1 unused) {
                zC = false;
            }
            if (zC) {
                this.f48752b = new j();
            } else {
                zVar.C(0);
                if (h.e(zVar, h.f48764o)) {
                    this.f48752b = new h();
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final int b(l lVar, n nVar) throws t1, EOFException, InterruptedIOException {
        int i10;
        byte[] bArr;
        d5.a.j(this.f48751a);
        if (this.f48752b == null) {
            if (!a(lVar)) {
                throw t1.a("Failed to determine bitstream type", null);
            }
            ((m3.h) lVar).f17614f = 0;
        }
        if (!this.f48753c) {
            w wVarC = this.f48751a.C(0, 1);
            this.f48751a.A();
            i iVar = this.f48752b;
            iVar.f48769c = this.f48751a;
            iVar.f48768b = wVarC;
            iVar.d(true);
            this.f48753c = true;
        }
        i iVar2 = this.f48752b;
        e eVar = iVar2.f48767a;
        d5.a.j(iVar2.f48768b);
        int i11 = g0.f4795a;
        int i12 = iVar2.h;
        long j10 = -1;
        if (i12 != 0) {
            if (i12 == 1) {
                ((m3.h) lVar).t((int) iVar2.f48771f);
                iVar2.h = 2;
                return 0;
            }
            if (i12 != 2) {
                if (i12 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            long jB = iVar2.d.b(lVar);
            if (jB >= 0) {
                nVar.f17620a = jB;
                return 1;
            }
            if (jB < -1) {
                iVar2.a(-(jB + 2));
            }
            if (!iVar2.f48776l) {
                m3.t tVarL = iVar2.d.l();
                d5.a.j(tVarL);
                iVar2.f48769c.n(tVarL);
                iVar2.f48776l = true;
            }
            if (iVar2.f48775k <= 0 && !eVar.b(lVar)) {
                iVar2.h = 3;
                return -1;
            }
            iVar2.f48775k = 0L;
            z zVar = eVar.f48755b;
            long jB2 = iVar2.b(zVar);
            if (jB2 >= 0) {
                long j11 = iVar2.f48772g;
                if (j11 + jB2 >= iVar2.f48770e) {
                    long j12 = (j11 * 1000000) / ((long) iVar2.f48773i);
                    iVar2.f48768b.a(zVar.f4860c, zVar);
                    iVar2.f48768b.e(j12, 1, zVar.f4860c, 0, null);
                    iVar2.f48770e = -1L;
                }
            }
            iVar2.f48772g += jB2;
            return 0;
        }
        while (true) {
            boolean zB = eVar.b(lVar);
            z zVar2 = eVar.f48755b;
            if (!zB) {
                iVar2.h = 3;
                return -1;
            }
            long j13 = ((m3.h) lVar).d;
            long j14 = j10;
            long j15 = iVar2.f48771f;
            iVar2.f48775k = j13 - j15;
            if (!iVar2.c(zVar2, j15, iVar2.f48774j)) {
                t0 t0Var = (t0) iVar2.f48774j.f38984b;
                iVar2.f48773i = t0Var.P;
                if (!iVar2.f48777m) {
                    iVar2.f48768b.c(t0Var);
                    iVar2.f48777m = true;
                }
                u0 u0Var = (u0) iVar2.f48774j.f38985c;
                if (u0Var == null) {
                    long j16 = ((m3.h) lVar).f17612c;
                    if (j16 == j14) {
                        iVar2.d = new za.b(22);
                    } else {
                        f fVar = eVar.f48754a;
                        i10 = 2;
                        iVar2.d = new b(iVar2, iVar2.f48771f, j16, fVar.d + fVar.f48761e, fVar.f48759b, (fVar.f48758a & 4) != 0);
                    }
                    iVar2.h = i10;
                    bArr = zVar2.f4858a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    zVar2.A(zVar2.f4860c, Arrays.copyOf(bArr, Math.max(65025, zVar2.f4860c)));
                    return 0;
                }
                iVar2.d = u0Var;
                i10 = 2;
                iVar2.h = i10;
                bArr = zVar2.f4858a;
                if (bArr.length == 65025) {
                    return 0;
                }
                zVar2.A(zVar2.f4860c, Arrays.copyOf(bArr, Math.max(65025, zVar2.f4860c)));
                return 0;
            }
            iVar2.f48771f = ((m3.h) lVar).d;
            j10 = j14;
        }
    }

    @Override
    public final void c(m mVar) {
        this.f48751a = mVar;
    }

    @Override
    public final boolean f(l lVar) {
        try {
            return a(lVar);
        } catch (t1 unused) {
            return false;
        }
    }

    @Override
    public final void g(long j10, long j11) {
        i iVar = this.f48752b;
        if (iVar != null) {
            e eVar = iVar.f48767a;
            f fVar = eVar.f48754a;
            fVar.f48758a = 0;
            fVar.f48759b = 0L;
            fVar.f48760c = 0;
            fVar.d = 0;
            fVar.f48761e = 0;
            eVar.f48755b.z(0);
            eVar.f48756c = -1;
            eVar.f48757e = false;
            if (j10 == 0) {
                iVar.d(!iVar.f48776l);
                return;
            }
            if (iVar.h != 0) {
                long j12 = (((long) iVar.f48773i) * j11) / 1000000;
                iVar.f48770e = j12;
                g gVar = iVar.d;
                int i10 = g0.f4795a;
                gVar.A(j12);
                iVar.h = 2;
            }
        }
    }

    @Override
    public final void release() {
    }
}
