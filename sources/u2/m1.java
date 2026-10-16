package u2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public final class m1 implements e0, y2.g {
    public final g2.m f45979a;
    public final g2.g f45980b;
    public final g2.c0 f45981c;
    public final oa.d d;
    public final a5.a e;
    public final r1 f45982f;
    public final ArrayList h = new ArrayList();
    public final long f45983n;
    public final y2.l f45984r;
    public final b2.x f45985s;
    public final boolean v;
    public boolean f45986w;
    public byte[] f45987x;
    public int f45988y;

    public m1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.x xVar, long j10, oa.d dVar, a5.a aVar, boolean z10, z2.a aVar2) {
        y2.l lVar;
        this.f45979a = mVar;
        this.f45980b = gVar;
        this.f45981c = c0Var;
        this.f45985s = xVar;
        this.f45983n = j10;
        this.d = dVar;
        this.e = aVar;
        this.v = z10;
        this.f45982f = new r1(new b2.q1("", xVar));
        if (aVar2 != null) {
            lVar = new y2.l(aVar2);
        } else {
            lVar = new y2.l("SingleSampleMediaPeriod");
        }
        this.f45984r = lVar;
    }

    @Override
    public final void A(y2.i iVar, long j10, long j11) {
        l1 l1Var = (l1) iVar;
        this.f45988y = (int) l1Var.f45968b.f9858b;
        byte[] bArr = l1Var.f45969c;
        bArr.getClass();
        this.f45987x = bArr;
        this.f45986w = true;
        g2.b0 b0Var = l1Var.f45968b;
        u uVar = new u(l1Var.f45967a, b0Var.f9859c, b0Var.d, j10, j11, this.f45988y);
        this.d.getClass();
        this.e.r(uVar, 1, -1, this.f45985s, 0, null, 0L, this.f45983n);
    }

    @Override
    public final void X0(y2.i iVar, long j10, long j11, boolean z10) {
        l1 l1Var = (l1) iVar;
        g2.b0 b0Var = l1Var.f45968b;
        u uVar = new u(l1Var.f45967a, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b);
        this.d.getClass();
        this.e.q(uVar, 1, -1, null, 0, null, 0L, this.f45983n);
    }

    @Override
    public final boolean c() {
        return this.f45984r.d();
    }

    @Override
    public final long d() {
        if (!this.f45986w && !this.f45984r.d()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long h(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                k1 k1Var = (k1) arrayList.get(i10);
                if (k1Var.f45959a == 2) {
                    k1Var.f45959a = 1;
                }
                i10++;
            } else {
                return j10;
            }
        }
    }

    @Override
    public final void k(d0 d0Var, long j10) {
        d0Var.q(this);
    }

    @Override
    public final long l() {
        return -9223372036854775807L;
    }

    @Override
    public final boolean m(i2.v0 v0Var) {
        if (!this.f45986w) {
            y2.l lVar = this.f45984r;
            if (!lVar.d() && !lVar.c()) {
                g2.h createDataSource = this.f45980b.createDataSource();
                g2.c0 c0Var = this.f45981c;
                if (c0Var != null) {
                    createDataSource.addTransferListener(c0Var);
                }
                l1 l1Var = new l1(createDataSource, this.f45979a);
                this.d.getClass();
                lVar.f(l1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long n(x2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
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
    public final r1 o() {
        return this.f45982f;
    }

    @Override
    public final long p() {
        if (this.f45986w) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override
    public final k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        boolean z10;
        IOException iOException2;
        k4.d dVar;
        l1 l1Var = (l1) iVar;
        g2.b0 b0Var = l1Var.f45968b;
        u uVar = new u(l1Var.f45967a, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b);
        String str = e2.m0.f8375a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.x0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f9876a == 2008)) {
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
            this.f45986w = true;
            dVar = y2.l.e;
        } else {
            iOException2 = iOException;
            if (i11 != 0) {
                dVar = new k4.d(0, min, false);
            } else {
                dVar = y2.l.f48541f;
            }
        }
        this.e.s(uVar, 1, -1, this.f45985s, 0, null, 0L, this.f45983n, iOException2, !dVar.a());
        return dVar;
    }

    @Override
    public final void y(y2.i iVar, long j10, long j11, int i10) {
        u uVar;
        l1 l1Var = (l1) iVar;
        g2.b0 b0Var = l1Var.f45968b;
        if (i10 == 0) {
            uVar = new u(l1Var.f45967a, j10);
        } else {
            uVar = new u(l1Var.f45967a, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b);
        }
        this.e.v(uVar, 1, -1, this.f45985s, 0, null, 0L, this.f45983n, i10);
    }

    @Override
    public final void g() {
    }

    @Override
    public final void i(long j10) {
    }

    @Override
    public final void s(long j10) {
    }

    @Override
    public final long r(long j10, i2.t1 t1Var) {
        return j10;
    }
}
