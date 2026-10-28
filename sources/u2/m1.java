package u2;

import a8.ng;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public final class m1 implements e0, y2.g {
    public final g2.m f49393a;
    public final g2.g f49394b;
    public final g2.c0 f49395c;
    public final u7.s d;
    public final ng e;
    public final r1 f49396f;
    public final ArrayList h = new ArrayList();
    public final long f49397n;
    public final y2.l f49398r;
    public final b2.x f49399s;
    public final boolean v;
    public boolean f49400w;
    public byte[] f49401x;
    public int f49402y;

    public m1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.x xVar, long j10, u7.s sVar, ng ngVar, boolean z10, z2.a aVar) {
        y2.l lVar;
        this.f49393a = mVar;
        this.f49394b = gVar;
        this.f49395c = c0Var;
        this.f49399s = xVar;
        this.f49397n = j10;
        this.d = sVar;
        this.e = ngVar;
        this.v = z10;
        this.f49396f = new r1(new b2.q1("", xVar));
        if (aVar != null) {
            lVar = new y2.l(aVar);
        } else {
            lVar = new y2.l("SingleSampleMediaPeriod");
        }
        this.f49398r = lVar;
    }

    @Override
    public final void B(y2.i iVar, long j10, long j11) {
        l1 l1Var = (l1) iVar;
        this.f49402y = (int) l1Var.f49382b.f12229b;
        byte[] bArr = l1Var.f49383c;
        bArr.getClass();
        this.f49401x = bArr;
        this.f49400w = true;
        g2.b0 b0Var = l1Var.f49382b;
        u uVar = new u(l1Var.f49381a, b0Var.f12230c, b0Var.d, j10, j11, this.f49402y);
        this.d.getClass();
        this.e.q(uVar, 1, -1, this.f49399s, 0, null, 0L, this.f49397n);
    }

    @Override
    public final long b() {
        if (!this.f49400w && !this.f49398r.c()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final boolean c() {
        return this.f49398r.c();
    }

    @Override
    public final long h(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                k1 k1Var = (k1) arrayList.get(i10);
                if (k1Var.f49374a == 2) {
                    k1Var.f49374a = 1;
                }
                i10++;
            } else {
                return j10;
            }
        }
    }

    @Override
    public final void k(d0 d0Var, long j10) {
        d0Var.n(this);
    }

    @Override
    public final long l() {
        return -9223372036854775807L;
    }

    @Override
    public final void l0(y2.i iVar, long j10, long j11, boolean z10) {
        l1 l1Var = (l1) iVar;
        g2.b0 b0Var = l1Var.f49382b;
        u uVar = new u(l1Var.f49381a, b0Var.f12230c, b0Var.d, j10, j11, b0Var.f12229b);
        this.d.getClass();
        this.e.p(uVar, 1, -1, null, 0, null, 0L, this.f49397n);
    }

    @Override
    public final boolean m(i2.w0 w0Var) {
        if (!this.f49400w) {
            y2.l lVar = this.f49398r;
            if (!lVar.c() && !lVar.b()) {
                g2.h createDataSource = this.f49394b.createDataSource();
                g2.c0 c0Var = this.f49395c;
                if (c0Var != null) {
                    createDataSource.addTransferListener(c0Var);
                }
                l1 l1Var = new l1(createDataSource, this.f49393a);
                this.d.getClass();
                lVar.f(l1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long o(x2.q[] qVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
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
    public final r1 p() {
        return this.f49396f;
    }

    @Override
    public final long q() {
        if (this.f49400w) {
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
        g2.b0 b0Var = l1Var.f49382b;
        u uVar = new u(l1Var.f49381a, b0Var.f12230c, b0Var.d, j10, j11, b0Var.f12229b);
        String str = e2.n0.f9691a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.x0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f12247a == 2008)) {
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
            this.f49400w = true;
            dVar = y2.l.e;
        } else {
            iOException2 = iOException;
            if (i11 != 0) {
                dVar = new k4.d(0, min, false);
            } else {
                dVar = y2.l.f52021f;
            }
        }
        this.e.r(uVar, 1, -1, this.f49399s, 0, null, 0L, this.f49397n, iOException2, !dVar.a());
        return dVar;
    }

    @Override
    public final void z(y2.i iVar, long j10, long j11, int i10) {
        u uVar;
        l1 l1Var = (l1) iVar;
        g2.b0 b0Var = l1Var.f49382b;
        if (i10 == 0) {
            uVar = new u(l1Var.f49381a, j10);
        } else {
            uVar = new u(l1Var.f49381a, b0Var.f12230c, b0Var.d, j10, j11, b0Var.f12229b);
        }
        this.e.u(uVar, 1, -1, this.f49399s, 0, null, 0L, this.f49397n, i10);
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
