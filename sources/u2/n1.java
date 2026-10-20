package u2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public final class n1 implements e0, y2.g {
    public final g2.m f47378a;
    public final g2.g f47379b;
    public final g2.c0 f47380c;
    public final oa.d d;
    public final a5.a e;
    public final s1 f47381f;
    public final ArrayList h = new ArrayList();
    public final long f47382n;
    public final y2.l f47383r;
    public final b2.w f47384s;
    public final boolean v;
    public boolean f47385w;
    public byte[] f47386x;
    public int f47387y;

    public n1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.w wVar, long j10, oa.d dVar, a5.a aVar, boolean z10, z2.a aVar2) {
        y2.l lVar;
        this.f47378a = mVar;
        this.f47379b = gVar;
        this.f47380c = c0Var;
        this.f47384s = wVar;
        this.f47382n = j10;
        this.d = dVar;
        this.e = aVar;
        this.v = z10;
        this.f47381f = new s1(new b2.p1("", wVar));
        if (aVar2 != null) {
            lVar = new y2.l(aVar2);
        } else {
            lVar = new y2.l("SingleSampleMediaPeriod");
        }
        this.f47383r = lVar;
    }

    @Override
    public final void J(y2.i iVar, long j10, long j11, boolean z10) {
        m1 m1Var = (m1) iVar;
        g2.b0 b0Var = m1Var.f47367b;
        u uVar = new u(m1Var.f47366a, b0Var.f10764c, b0Var.d, j10, j11, b0Var.f10763b);
        this.d.getClass();
        this.e.q(uVar, 1, -1, null, 0, null, 0L, this.f47382n);
    }

    @Override
    public final boolean c() {
        return this.f47383r.d();
    }

    @Override
    public final long d() {
        if (!this.f47385w && !this.f47383r.d()) {
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
        m1 m1Var = (m1) iVar;
        g2.b0 b0Var = m1Var.f47367b;
        u uVar = new u(m1Var.f47366a, b0Var.f10764c, b0Var.d, j10, j11, b0Var.f10763b);
        String str = e2.m0.f8252a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f10781a == 2008)) {
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
            this.f47385w = true;
            dVar = y2.l.e;
        } else {
            iOException2 = iOException;
            if (i11 != 0) {
                dVar = new k4.d(0, min, false);
            } else {
                dVar = y2.l.f49930f;
            }
        }
        this.e.s(uVar, 1, -1, this.f47384s, 0, null, 0L, this.f47382n, iOException2, !dVar.a());
        return dVar;
    }

    @Override
    public final void h(y2.i iVar, long j10, long j11, int i10) {
        u uVar;
        m1 m1Var = (m1) iVar;
        g2.b0 b0Var = m1Var.f47367b;
        if (i10 == 0) {
            uVar = new u(m1Var.f47366a, j10);
        } else {
            uVar = new u(m1Var.f47366a, b0Var.f10764c, b0Var.d, j10, j11, b0Var.f10763b);
        }
        this.e.v(uVar, 1, -1, this.f47384s, 0, null, 0L, this.f47382n, i10);
    }

    @Override
    public final long j(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                l1 l1Var = (l1) arrayList.get(i10);
                if (l1Var.f47359a == 2) {
                    l1Var.f47359a = 1;
                }
                i10++;
            } else {
                return j10;
            }
        }
    }

    @Override
    public final void k(y2.i iVar, long j10, long j11) {
        m1 m1Var = (m1) iVar;
        this.f47387y = (int) m1Var.f47367b.f10763b;
        byte[] bArr = m1Var.f47368c;
        bArr.getClass();
        this.f47386x = bArr;
        this.f47385w = true;
        g2.b0 b0Var = m1Var.f47367b;
        u uVar = new u(m1Var.f47366a, b0Var.f10764c, b0Var.d, j10, j11, this.f47387y);
        this.d.getClass();
        this.e.r(uVar, 1, -1, this.f47384s, 0, null, 0L, this.f47382n);
    }

    @Override
    public final void n(d0 d0Var, long j10) {
        d0Var.a(this);
    }

    @Override
    public final long o() {
        return -9223372036854775807L;
    }

    @Override
    public final boolean p(i2.v0 v0Var) {
        if (!this.f47385w) {
            y2.l lVar = this.f47383r;
            if (!lVar.d() && !lVar.c()) {
                g2.h createDataSource = this.f47379b.createDataSource();
                g2.c0 c0Var = this.f47380c;
                if (c0Var != null) {
                    createDataSource.addTransferListener(c0Var);
                }
                m1 m1Var = new m1(createDataSource, this.f47378a);
                this.d.getClass();
                lVar.f(m1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long q(x2.p[] pVarArr, boolean[] zArr, e1[] e1VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < pVarArr.length; i10++) {
            e1 e1Var = e1VarArr[i10];
            ArrayList arrayList = this.h;
            if (e1Var != null && (pVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(e1Var);
                e1VarArr[i10] = null;
            }
            if (e1VarArr[i10] == null && pVarArr[i10] != null) {
                l1 l1Var = new l1(this);
                arrayList.add(l1Var);
                e1VarArr[i10] = l1Var;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override
    public final s1 r() {
        return this.f47381f;
    }

    @Override
    public final long s() {
        if (this.f47385w) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override
    public final void i() {
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
