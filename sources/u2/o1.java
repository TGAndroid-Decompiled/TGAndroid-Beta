package u2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public final class o1 implements f0, y2.g {
    public final g2.m f47833a;
    public final g2.g f47834b;
    public final g2.c0 f47835c;
    public final oa.d d;
    public final a5.a e;
    public final t1 f47836f;
    public final ArrayList h = new ArrayList();
    public final long f47837n;
    public final y2.l f47838r;
    public final b2.w f47839s;
    public final boolean v;
    public boolean f47840w;
    public byte[] f47841x;
    public int f47842y;

    public o1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.w wVar, long j10, oa.d dVar, a5.a aVar, boolean z10, z2.a aVar2) {
        y2.l lVar;
        this.f47833a = mVar;
        this.f47834b = gVar;
        this.f47835c = c0Var;
        this.f47839s = wVar;
        this.f47837n = j10;
        this.d = dVar;
        this.e = aVar;
        this.v = z10;
        this.f47836f = new t1(new b2.p1("", wVar));
        if (aVar2 != null) {
            lVar = new y2.l(aVar2);
        } else {
            lVar = new y2.l("SingleSampleMediaPeriod");
        }
        this.f47838r = lVar;
    }

    @Override
    public final boolean c() {
        return this.f47838r.d();
    }

    @Override
    public final long d() {
        if (!this.f47840w && !this.f47838r.d()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final k4.d e(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        boolean z10;
        IOException iOException2;
        k4.d dVar;
        n1 n1Var = (n1) iVar;
        g2.b0 b0Var = n1Var.f47822b;
        v vVar = new v(n1Var.f47821a, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b);
        String str = e2.m0.f8259a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f10800a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * 1000, 5000);
        int i11 = (min > (-9223372036854775807L) ? 1 : (min == (-9223372036854775807L) ? 0 : -1));
        if (i11 != 0 && i10 < 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.v && z10) {
            iOException2 = iOException;
            e2.a.m("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException2);
            this.f47840w = true;
            dVar = y2.l.e;
        } else {
            iOException2 = iOException;
            if (i11 != 0) {
                dVar = new k4.d(0, min, false);
            } else {
                dVar = y2.l.f50374f;
            }
        }
        this.e.s(vVar, 1, -1, this.f47839s, 0, null, 0L, this.f47837n, iOException2, !dVar.a());
        return dVar;
    }

    @Override
    public final long i(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                m1 m1Var = (m1) arrayList.get(i10);
                if (m1Var.f47814a == 2) {
                    m1Var.f47814a = 1;
                }
                i10++;
            } else {
                return j10;
            }
        }
    }

    @Override
    public final void j(y2.i iVar, long j10, long j11, int i10) {
        v vVar;
        n1 n1Var = (n1) iVar;
        g2.b0 b0Var = n1Var.f47822b;
        if (i10 == 0) {
            vVar = new v(n1Var.f47821a, j10);
        } else {
            vVar = new v(n1Var.f47821a, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b);
        }
        this.e.v(vVar, 1, -1, this.f47839s, 0, null, 0L, this.f47837n, i10);
    }

    @Override
    public final void k(y2.i iVar, long j10, long j11) {
        n1 n1Var = (n1) iVar;
        this.f47842y = (int) n1Var.f47822b.f10782b;
        byte[] bArr = n1Var.f47823c;
        bArr.getClass();
        this.f47841x = bArr;
        this.f47840w = true;
        g2.b0 b0Var = n1Var.f47822b;
        v vVar = new v(n1Var.f47821a, b0Var.f10783c, b0Var.d, j10, j11, this.f47842y);
        this.d.getClass();
        this.e.r(vVar, 1, -1, this.f47839s, 0, null, 0L, this.f47837n);
    }

    @Override
    public final void n(e0 e0Var, long j10) {
        e0Var.a(this);
    }

    @Override
    public final long o() {
        return -9223372036854775807L;
    }

    @Override
    public final boolean p(i2.u0 u0Var) {
        if (!this.f47840w) {
            y2.l lVar = this.f47838r;
            if (!lVar.d() && !lVar.c()) {
                g2.h createDataSource = this.f47834b.createDataSource();
                g2.c0 c0Var = this.f47835c;
                if (c0Var != null) {
                    createDataSource.addTransferListener(c0Var);
                }
                n1 n1Var = new n1(createDataSource, this.f47833a);
                this.d.getClass();
                lVar.f(n1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long q(x2.p[] pVarArr, boolean[] zArr, f1[] f1VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < pVarArr.length; i10++) {
            f1 f1Var = f1VarArr[i10];
            ArrayList arrayList = this.h;
            if (f1Var != null && (pVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(f1Var);
                f1VarArr[i10] = null;
            }
            if (f1VarArr[i10] == null && pVarArr[i10] != null) {
                m1 m1Var = new m1(this);
                arrayList.add(m1Var);
                f1VarArr[i10] = m1Var;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override
    public final t1 r() {
        return this.f47836f;
    }

    @Override
    public final long s() {
        if (this.f47840w) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override
    public final void z(y2.i iVar, long j10, long j11, boolean z10) {
        n1 n1Var = (n1) iVar;
        g2.b0 b0Var = n1Var.f47822b;
        v vVar = new v(n1Var.f47821a, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b);
        this.d.getClass();
        this.e.q(vVar, 1, -1, null, 0, null, 0L, this.f47837n);
    }

    @Override
    public final void h() {
    }

    @Override
    public final void l(long j10) {
    }

    @Override
    public final void u(long j10) {
    }

    @Override
    public final long t(long j10, i2.s1 s1Var) {
        return j10;
    }
}
