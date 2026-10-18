package u2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public final class l1 implements d0, y2.g {
    public final g2.m f47406a;
    public final g2.g f47407b;
    public final g2.c0 f47408c;
    public final oa.d d;
    public final a5.a e;
    public final q1 f47409f;
    public final ArrayList h = new ArrayList();
    public final long f47410n;
    public final y2.l f47411r;
    public final b2.w f47412s;
    public final boolean v;
    public boolean f47413w;
    public byte[] f47414x;
    public int f47415y;

    public l1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.w wVar, long j10, oa.d dVar, a5.a aVar, boolean z10, z2.a aVar2) {
        y2.l lVar;
        this.f47406a = mVar;
        this.f47407b = gVar;
        this.f47408c = c0Var;
        this.f47412s = wVar;
        this.f47410n = j10;
        this.d = dVar;
        this.e = aVar;
        this.v = z10;
        this.f47409f = new q1(new b2.p1("", wVar));
        if (aVar2 != null) {
            lVar = new y2.l(aVar2);
        } else {
            lVar = new y2.l("SingleSampleMediaPeriod");
        }
        this.f47411r = lVar;
    }

    @Override
    public final void I(y2.i iVar, long j10, long j11, boolean z10) {
        k1 k1Var = (k1) iVar;
        g2.b0 b0Var = k1Var.f47395b;
        t tVar = new t(k1Var.f47394a, b0Var.f10767c, b0Var.d, j10, j11, b0Var.f10766b);
        this.d.getClass();
        this.e.q(tVar, 1, -1, null, 0, null, 0L, this.f47410n);
    }

    @Override
    public final boolean c() {
        return this.f47411r.d();
    }

    @Override
    public final long d() {
        if (!this.f47413w && !this.f47411r.d()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long i(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                j1 j1Var = (j1) arrayList.get(i10);
                if (j1Var.f47386a == 2) {
                    j1Var.f47386a = 1;
                }
                i10++;
            } else {
                return j10;
            }
        }
    }

    @Override
    public final k4.d j(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        boolean z10;
        IOException iOException2;
        k4.d dVar;
        k1 k1Var = (k1) iVar;
        g2.b0 b0Var = k1Var.f47395b;
        t tVar = new t(k1Var.f47394a, b0Var.f10767c, b0Var.d, j10, j11, b0Var.f10766b);
        String str = e2.m0.f8255a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f10784a == 2008)) {
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
            this.f47413w = true;
            dVar = y2.l.e;
        } else {
            iOException2 = iOException;
            if (i11 != 0) {
                dVar = new k4.d(0, min, false);
            } else {
                dVar = y2.l.f49971f;
            }
        }
        this.e.s(tVar, 1, -1, this.f47412s, 0, null, 0L, this.f47410n, iOException2, !dVar.a());
        return dVar;
    }

    @Override
    public final void l(y2.i iVar, long j10, long j11, int i10) {
        t tVar;
        k1 k1Var = (k1) iVar;
        g2.b0 b0Var = k1Var.f47395b;
        if (i10 == 0) {
            tVar = new t(k1Var.f47394a, j10);
        } else {
            tVar = new t(k1Var.f47394a, b0Var.f10767c, b0Var.d, j10, j11, b0Var.f10766b);
        }
        this.e.v(tVar, 1, -1, this.f47412s, 0, null, 0L, this.f47410n, i10);
    }

    @Override
    public final void m(c0 c0Var, long j10) {
        c0Var.h(this);
    }

    @Override
    public final void n(y2.i iVar, long j10, long j11) {
        k1 k1Var = (k1) iVar;
        this.f47415y = (int) k1Var.f47395b.f10766b;
        byte[] bArr = k1Var.f47396c;
        bArr.getClass();
        this.f47414x = bArr;
        this.f47413w = true;
        g2.b0 b0Var = k1Var.f47395b;
        t tVar = new t(k1Var.f47394a, b0Var.f10767c, b0Var.d, j10, j11, this.f47415y);
        this.d.getClass();
        this.e.r(tVar, 1, -1, this.f47412s, 0, null, 0L, this.f47410n);
    }

    @Override
    public final long o() {
        return -9223372036854775807L;
    }

    @Override
    public final boolean p(i2.u0 u0Var) {
        if (!this.f47413w) {
            y2.l lVar = this.f47411r;
            if (!lVar.d() && !lVar.c()) {
                g2.h createDataSource = this.f47407b.createDataSource();
                g2.c0 c0Var = this.f47408c;
                if (c0Var != null) {
                    createDataSource.addTransferListener(c0Var);
                }
                k1 k1Var = new k1(createDataSource, this.f47406a);
                this.d.getClass();
                lVar.f(k1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long q(x2.p[] pVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < pVarArr.length; i10++) {
            c1 c1Var = c1VarArr[i10];
            ArrayList arrayList = this.h;
            if (c1Var != null && (pVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(c1Var);
                c1VarArr[i10] = null;
            }
            if (c1VarArr[i10] == null && pVarArr[i10] != null) {
                j1 j1Var = new j1(this);
                arrayList.add(j1Var);
                c1VarArr[i10] = j1Var;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override
    public final q1 r() {
        return this.f47409f;
    }

    @Override
    public final long s() {
        if (this.f47413w) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override
    public final void g() {
    }

    @Override
    public final void k(long j10) {
    }

    @Override
    public final void u(long j10) {
    }

    @Override
    public final long t(long j10, i2.r1 r1Var) {
        return j10;
    }
}
