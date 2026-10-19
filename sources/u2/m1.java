package u2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public final class m1 implements e0, y2.g {
    public final g2.m f47363a;
    public final g2.g f47364b;
    public final g2.c0 f47365c;
    public final oa.d d;
    public final a5.a e;
    public final r1 f47366f;
    public final ArrayList h = new ArrayList();
    public final long f47367n;
    public final y2.l f47368r;
    public final b2.w f47369s;
    public final boolean v;
    public boolean f47370w;
    public byte[] f47371x;
    public int f47372y;

    public m1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.w wVar, long j10, oa.d dVar, a5.a aVar, boolean z10, z2.a aVar2) {
        y2.l lVar;
        this.f47363a = mVar;
        this.f47364b = gVar;
        this.f47365c = c0Var;
        this.f47369s = wVar;
        this.f47367n = j10;
        this.d = dVar;
        this.e = aVar;
        this.v = z10;
        this.f47366f = new r1(new b2.p1("", wVar));
        if (aVar2 != null) {
            lVar = new y2.l(aVar2);
        } else {
            lVar = new y2.l("SingleSampleMediaPeriod");
        }
        this.f47368r = lVar;
    }

    @Override
    public final void J(y2.i iVar, long j10, long j11, boolean z10) {
        l1 l1Var = (l1) iVar;
        g2.b0 b0Var = l1Var.f47352b;
        u uVar = new u(l1Var.f47351a, b0Var.f10766c, b0Var.d, j10, j11, b0Var.f10765b);
        this.d.getClass();
        this.e.q(uVar, 1, -1, null, 0, null, 0L, this.f47367n);
    }

    @Override
    public final boolean c() {
        return this.f47368r.d();
    }

    @Override
    public final long d() {
        if (!this.f47370w && !this.f47368r.d()) {
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
        l1 l1Var = (l1) iVar;
        g2.b0 b0Var = l1Var.f47352b;
        u uVar = new u(l1Var.f47351a, b0Var.f10766c, b0Var.d, j10, j11, b0Var.f10765b);
        String str = e2.m0.f8254a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f10783a == 2008)) {
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
            this.f47370w = true;
            dVar = y2.l.e;
        } else {
            iOException2 = iOException;
            if (i11 != 0) {
                dVar = new k4.d(0, min, false);
            } else {
                dVar = y2.l.f49923f;
            }
        }
        this.e.s(uVar, 1, -1, this.f47369s, 0, null, 0L, this.f47367n, iOException2, !dVar.a());
        return dVar;
    }

    @Override
    public final void h(y2.i iVar, long j10, long j11, int i10) {
        u uVar;
        l1 l1Var = (l1) iVar;
        g2.b0 b0Var = l1Var.f47352b;
        if (i10 == 0) {
            uVar = new u(l1Var.f47351a, j10);
        } else {
            uVar = new u(l1Var.f47351a, b0Var.f10766c, b0Var.d, j10, j11, b0Var.f10765b);
        }
        this.e.v(uVar, 1, -1, this.f47369s, 0, null, 0L, this.f47367n, i10);
    }

    @Override
    public final long j(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                k1 k1Var = (k1) arrayList.get(i10);
                if (k1Var.f47343a == 2) {
                    k1Var.f47343a = 1;
                }
                i10++;
            } else {
                return j10;
            }
        }
    }

    @Override
    public final void k(y2.i iVar, long j10, long j11) {
        l1 l1Var = (l1) iVar;
        this.f47372y = (int) l1Var.f47352b.f10765b;
        byte[] bArr = l1Var.f47353c;
        bArr.getClass();
        this.f47371x = bArr;
        this.f47370w = true;
        g2.b0 b0Var = l1Var.f47352b;
        u uVar = new u(l1Var.f47351a, b0Var.f10766c, b0Var.d, j10, j11, this.f47372y);
        this.d.getClass();
        this.e.r(uVar, 1, -1, this.f47369s, 0, null, 0L, this.f47367n);
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
        if (!this.f47370w) {
            y2.l lVar = this.f47368r;
            if (!lVar.d() && !lVar.c()) {
                g2.h createDataSource = this.f47364b.createDataSource();
                g2.c0 c0Var = this.f47365c;
                if (c0Var != null) {
                    createDataSource.addTransferListener(c0Var);
                }
                l1 l1Var = new l1(createDataSource, this.f47363a);
                this.d.getClass();
                lVar.f(l1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long q(x2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < pVarArr.length; i10++) {
            d1 d1Var = d1VarArr[i10];
            ArrayList arrayList = this.h;
            if (d1Var != null && (pVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(d1Var);
                d1VarArr[i10] = null;
            }
            if (d1VarArr[i10] == null && pVarArr[i10] != null) {
                k1 k1Var = new k1(this);
                arrayList.add(k1Var);
                d1VarArr[i10] = k1Var;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override
    public final r1 r() {
        return this.f47366f;
    }

    @Override
    public final long s() {
        if (this.f47370w) {
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
