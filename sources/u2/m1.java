package u2;

import i2.v1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public final class m1 implements e0, y2.g {
    public int D;
    public final g2.n f49950a;
    public final g2.g f49951b;
    public final g2.d0 f49952c;
    public final hb.a d;
    public final a5.a e;
    public final r1 f49953f;
    public final ArrayList h = new ArrayList();
    public final long f49954n;
    public final y2.l f49955r;
    public final b2.x f49956s;
    public final boolean f49957w;
    public boolean f49958x;
    public byte[] f49959y;

    public m1(g2.n nVar, g2.g gVar, g2.d0 d0Var, b2.x xVar, long j10, hb.a aVar, a5.a aVar2, boolean z10, z2.a aVar3) {
        y2.l lVar;
        this.f49950a = nVar;
        this.f49951b = gVar;
        this.f49952c = d0Var;
        this.f49956s = xVar;
        this.f49954n = j10;
        this.d = aVar;
        this.e = aVar2;
        this.f49957w = z10;
        this.f49953f = new r1(new b2.p1("", xVar));
        if (aVar3 != null) {
            lVar = new y2.l(aVar3);
        } else {
            lVar = new y2.l("SingleSampleMediaPeriod");
        }
        this.f49955r = lVar;
    }

    @Override
    public final void M(y2.i iVar, long j10, long j11, boolean z10) {
        l1 l1Var = (l1) iVar;
        g2.c0 c0Var = l1Var.f49939b;
        u uVar = new u(l1Var.f49938a, c0Var.f7285c, c0Var.d, j10, j11, c0Var.f7284b);
        this.d.getClass();
        this.e.p(uVar, 1, -1, null, 0, null, 0L, this.f49954n);
    }

    @Override
    public final long c() {
        if (!this.f49958x && !this.f49955r.d()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final boolean d() {
        return this.f49955r.d();
    }

    @Override
    public final long g(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                k1 k1Var = (k1) arrayList.get(i10);
                if (k1Var.f49931a == 2) {
                    k1Var.f49931a = 1;
                }
                i10++;
            } else {
                return j10;
            }
        }
    }

    @Override
    public final void j(d0 d0Var, long j10) {
        d0Var.e(this);
    }

    @Override
    public final long k() {
        return -9223372036854775807L;
    }

    @Override
    public final k4.d l(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        boolean z10;
        IOException iOException2;
        k4.d dVar;
        l1 l1Var = (l1) iVar;
        g2.c0 c0Var = l1Var.f49939b;
        u uVar = new u(l1Var.f49938a, c0Var.f7285c, c0Var.d, j10, j11, c0Var.f7284b);
        String str = e2.l0.f6165a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.v) || (th2 instanceof y2.k) || ((th2 instanceof g2.k) && ((g2.k) th2).f7305a == 2008)) {
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
        if (this.f49957w && z10) {
            iOException2 = iOException;
            e2.a.m("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException2);
            this.f49958x = true;
            dVar = y2.l.e;
        } else {
            iOException2 = iOException;
            if (i11 != 0) {
                dVar = new k4.d(0, min, false);
            } else {
                dVar = y2.l.f54184f;
            }
        }
        this.e.r(uVar, 1, -1, this.f49956s, 0, null, 0L, this.f49954n, iOException2, !dVar.a());
        return dVar;
    }

    @Override
    public final boolean m(i2.w0 w0Var) {
        if (!this.f49958x) {
            y2.l lVar = this.f49955r;
            if (!lVar.d() && !lVar.c()) {
                g2.h createDataSource = this.f49951b.createDataSource();
                g2.d0 d0Var = this.f49952c;
                if (d0Var != null) {
                    createDataSource.addTransferListener(d0Var);
                }
                l1 l1Var = new l1(createDataSource, this.f49950a);
                this.d.getClass();
                lVar.f(l1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void n(y2.i iVar, long j10, long j11, int i10) {
        u uVar;
        l1 l1Var = (l1) iVar;
        g2.c0 c0Var = l1Var.f49939b;
        if (i10 == 0) {
            uVar = new u(l1Var.f49938a, j10);
        } else {
            uVar = new u(l1Var.f49938a, c0Var.f7285c, c0Var.d, j10, j11, c0Var.f7284b);
        }
        this.e.u(uVar, 1, -1, this.f49956s, 0, null, 0L, this.f49954n, i10);
    }

    @Override
    public final void o(y2.i iVar, long j10, long j11) {
        l1 l1Var = (l1) iVar;
        this.D = (int) l1Var.f49939b.f7284b;
        byte[] bArr = l1Var.f49940c;
        bArr.getClass();
        this.f49959y = bArr;
        this.f49958x = true;
        g2.c0 c0Var = l1Var.f49939b;
        u uVar = new u(l1Var.f49938a, c0Var.f7285c, c0Var.d, j10, j11, this.D);
        this.d.getClass();
        this.e.q(uVar, 1, -1, this.f49956s, 0, null, 0L, this.f49954n);
    }

    @Override
    public final long p(x2.q[] qVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            d1 d1Var = d1VarArr[i10];
            ArrayList arrayList = this.h;
            if (d1Var != null && (qVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(d1Var);
                d1VarArr[i10] = null;
            }
            if (d1VarArr[i10] == null && qVarArr[i10] != null) {
                k1 k1Var = new k1(this);
                arrayList.add(k1Var);
                d1VarArr[i10] = k1Var;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override
    public final r1 q() {
        return this.f49953f;
    }

    @Override
    public final long s() {
        if (this.f49958x) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override
    public final void f() {
    }

    @Override
    public final void h(long j10) {
    }

    @Override
    public final void u(long j10) {
    }

    @Override
    public final long t(long j10, v1 v1Var) {
        return j10;
    }
}
