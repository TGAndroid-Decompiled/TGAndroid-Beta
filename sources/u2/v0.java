package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
import m.f3;
public final class v0 extends a {
    public final g2.g h;
    public final r5.d f48944i;
    public final n2.m f48945j;
    public final t7.t f48946k;
    public final int f48947l;
    public final b2.s f48948m;
    public boolean f48949n = true;
    public long f48950o = -9223372036854775807L;
    public boolean f48951p;
    public boolean f48952q;
    public g2.c0 f48953r;
    public b2.k0 f48954s;

    public v0(b2.k0 k0Var, g2.g gVar, r5.d dVar, n2.m mVar, t7.t tVar, int i10, b2.s sVar) {
        this.f48954s = k0Var;
        this.h = gVar;
        this.f48944i = dVar;
        this.f48945j = mVar;
        this.f48946k = tVar;
        this.f48947l = i10;
        this.f48948m = sVar;
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        b2.f0 f0Var = i().f3398b;
        f0Var.getClass();
        b2.f0 f0Var2 = k0Var.f3398b;
        if (f0Var2 != null && f0Var2.f3303a.equals(f0Var.f3303a) && f0Var2.h == f0Var.h && Objects.equals(f0Var2.f3307f, f0Var.f3307f)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.f48953r;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.f0 f0Var2 = i().f3398b;
        f0Var2.getClass();
        Uri uri = f0Var2.f3303a;
        e2.d.h(this.f48745g);
        return new t0(uri, createDataSource, new f3((c3.r) this.f48944i.f47201b), this.f48945j, new n2.j(this.d.f16268c, 0, f0Var), this.f48946k, b(f0Var), this, dVar, f0Var2.f3307f, this.f48947l, this.f48948m, e2.d0.P(f0Var2.h), null);
    }

    @Override
    public final synchronized b2.k0 i() {
        return this.f48954s;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f48953r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f48745g;
        e2.d.h(kVar);
        n2.m mVar = this.f48945j;
        mVar.D(myLooper, kVar);
        mVar.b();
        u();
    }

    @Override
    public final void o(d0 d0Var) {
        z0[] z0VarArr;
        t0 t0Var = (t0) d0Var;
        if (t0Var.N) {
            for (z0 z0Var : t0Var.K) {
                z0Var.k();
                n2.g gVar = z0Var.h;
                if (gVar != null) {
                    gVar.a(z0Var.f48974e);
                    z0Var.h = null;
                    z0Var.f48976g = null;
                }
            }
        }
        t0Var.f48934x.e(t0Var);
        t0Var.H.removeCallbacksAndMessages(null);
        t0Var.I = null;
        t0Var.f48929f0 = true;
    }

    @Override
    public final void q() {
        this.f48945j.release();
    }

    @Override
    public final synchronized void t(b2.k0 k0Var) {
        this.f48954s = k0Var;
    }

    public final void u() {
        b2.e0 e0Var;
        long j3 = this.f48950o;
        boolean z10 = this.f48951p;
        boolean z11 = this.f48952q;
        b2.k0 i10 = i();
        if (z11) {
            e0Var = i10.f3399c;
        } else {
            e0Var = null;
        }
        b2.k1 g1Var = new g1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i10, e0Var);
        if (this.f48949n) {
            g1Var = new u(g1Var, 1);
        }
        n(g1Var);
    }

    public final void v(long j3, c3.b0 b0Var, boolean z10) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f48950o;
        }
        boolean f7 = b0Var.f();
        if (!this.f48949n && this.f48950o == j3 && this.f48951p == f7 && this.f48952q == z10) {
            return;
        }
        this.f48950o = j3;
        this.f48951p = f7;
        this.f48952q = z10;
        this.f48949n = false;
        u();
    }

    @Override
    public final void k() {
    }
}
