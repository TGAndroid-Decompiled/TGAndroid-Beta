package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class w0 extends a {
    public final g2.g h;
    public final r5.d f43803i;
    public final n2.n f43804j;
    public final qb.b f43805k;
    public final int f43806l;
    public final b2.s f43807m;
    public boolean f43808n = true;
    public long f43809o = -9223372036854775807L;
    public boolean f43810p;
    public boolean f43811q;
    public g2.c0 f43812r;
    public b2.k0 f43813s;

    public w0(b2.k0 k0Var, g2.g gVar, r5.d dVar, n2.n nVar, qb.b bVar, int i10, b2.s sVar) {
        this.f43813s = k0Var;
        this.h = gVar;
        this.f43803i = dVar;
        this.f43804j = nVar;
        this.f43805k = bVar;
        this.f43806l = i10;
        this.f43807m = sVar;
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        b2.f0 f0Var = i().f3070b;
        f0Var.getClass();
        b2.f0 f0Var2 = k0Var.f3070b;
        if (f0Var2 != null && f0Var2.f2985a.equals(f0Var.f2985a) && f0Var2.h == f0Var.h && Objects.equals(f0Var2.f2988f, f0Var.f2988f)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.f43812r;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.f0 f0Var2 = i().f3070b;
        f0Var2.getClass();
        Uri uri = f0Var2.f2985a;
        e2.d.h(this.f43589g);
        return new u0(uri, createDataSource, new la.h((c3.r) this.f43803i.f42336b), this.f43804j, new n2.k(this.d.f15136c, 0, f0Var), this.f43805k, b(f0Var), this, dVar, f0Var2.f2988f, this.f43806l, this.f43807m, e2.d0.Q(f0Var2.h), null);
    }

    @Override
    public final synchronized b2.k0 i() {
        return this.f43813s;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f43812r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f43589g;
        e2.d.h(kVar);
        n2.n nVar = this.f43804j;
        nVar.C(myLooper, kVar);
        nVar.b();
        u();
    }

    @Override
    public final void o(d0 d0Var) {
        a1[] a1VarArr;
        u0 u0Var = (u0) d0Var;
        if (u0Var.N) {
            for (a1 a1Var : u0Var.K) {
                a1Var.k();
                n2.h hVar = a1Var.h;
                if (hVar != null) {
                    hVar.a(a1Var.e);
                    a1Var.h = null;
                    a1Var.f43602g = null;
                }
            }
        }
        u0Var.f43792x.e(u0Var);
        u0Var.H.removeCallbacksAndMessages(null);
        u0Var.I = null;
        u0Var.f43787f0 = true;
    }

    @Override
    public final void q() {
        this.f43804j.release();
    }

    @Override
    public final synchronized void t(b2.k0 k0Var) {
        this.f43813s = k0Var;
    }

    public final void u() {
        b2.e0 e0Var;
        long j3 = this.f43809o;
        boolean z10 = this.f43810p;
        boolean z11 = this.f43811q;
        b2.k0 i10 = i();
        if (z11) {
            e0Var = i10.f3071c;
        } else {
            e0Var = null;
        }
        b2.k1 h1Var = new h1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i10, e0Var);
        if (this.f43808n) {
            h1Var = new u(h1Var, 1);
        }
        n(h1Var);
    }

    public final void v(long j3, c3.b0 b0Var, boolean z10) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f43809o;
        }
        boolean f7 = b0Var.f();
        if (!this.f43808n && this.f43809o == j3 && this.f43810p == f7 && this.f43811q == z10) {
            return;
        }
        this.f43809o = j3;
        this.f43810p = f7;
        this.f43811q = z10;
        this.f43808n = false;
        u();
    }

    @Override
    public final void k() {
    }
}
