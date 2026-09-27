package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class v0 extends a {
    public final g2.g h;
    public final r5.d f43840i;
    public final n2.m f43841j;
    public final qb.b f43842k;
    public final int f43843l;
    public final b2.s f43844m;
    public boolean f43845n = true;
    public long f43846o = -9223372036854775807L;
    public boolean f43847p;
    public boolean f43848q;
    public g2.c0 f43849r;
    public b2.k0 f43850s;

    public v0(b2.k0 k0Var, g2.g gVar, r5.d dVar, n2.m mVar, qb.b bVar, int i10, b2.s sVar) {
        this.f43850s = k0Var;
        this.h = gVar;
        this.f43840i = dVar;
        this.f43841j = mVar;
        this.f43842k = bVar;
        this.f43843l = i10;
        this.f43844m = sVar;
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        b2.f0 f0Var = i().f3072b;
        f0Var.getClass();
        b2.f0 f0Var2 = k0Var.f3072b;
        if (f0Var2 != null && f0Var2.f2987a.equals(f0Var.f2987a) && f0Var2.h == f0Var.h && Objects.equals(f0Var2.f2990f, f0Var.f2990f)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.f43849r;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.f0 f0Var2 = i().f3072b;
        f0Var2.getClass();
        Uri uri = f0Var2.f2987a;
        e2.d.h(this.f43633g);
        return new t0(uri, createDataSource, new la.h((c3.r) this.f43840i.f42379b), this.f43841j, new n2.j(this.d.f15170c, 0, f0Var), this.f43842k, b(f0Var), this, dVar, f0Var2.f2990f, this.f43843l, this.f43844m, e2.d0.Q(f0Var2.h), null);
    }

    @Override
    public final synchronized b2.k0 i() {
        return this.f43850s;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f43849r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f43633g;
        e2.d.h(kVar);
        n2.m mVar = this.f43841j;
        mVar.C(myLooper, kVar);
        mVar.b();
        u();
    }

    @Override
    public final void o(d0 d0Var) {
        a1[] a1VarArr;
        t0 t0Var = (t0) d0Var;
        if (t0Var.N) {
            for (a1 a1Var : t0Var.K) {
                a1Var.k();
                n2.g gVar = a1Var.h;
                if (gVar != null) {
                    gVar.a(a1Var.e);
                    a1Var.h = null;
                    a1Var.f43646g = null;
                }
            }
        }
        t0Var.f43831x.e(t0Var);
        t0Var.H.removeCallbacksAndMessages(null);
        t0Var.I = null;
        t0Var.f43826f0 = true;
    }

    @Override
    public final void q() {
        this.f43841j.release();
    }

    @Override
    public final synchronized void t(b2.k0 k0Var) {
        this.f43850s = k0Var;
    }

    public final void u() {
        b2.e0 e0Var;
        long j3 = this.f43846o;
        boolean z10 = this.f43847p;
        boolean z11 = this.f43848q;
        b2.k0 i10 = i();
        if (z11) {
            e0Var = i10.f3073c;
        } else {
            e0Var = null;
        }
        b2.k1 h1Var = new h1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i10, e0Var);
        if (this.f43845n) {
            h1Var = new u(h1Var, 1);
        }
        n(h1Var);
    }

    public final void v(long j3, c3.b0 b0Var, boolean z10) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f43846o;
        }
        boolean f7 = b0Var.f();
        if (!this.f43845n && this.f43846o == j3 && this.f43847p == f7 && this.f43848q == z10) {
            return;
        }
        this.f43846o = j3;
        this.f43847p = f7;
        this.f43848q = z10;
        this.f43845n = false;
        u();
    }

    @Override
    public final void k() {
    }
}
