package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class x0 extends a {
    public final g2.g h;
    public final r5.d f43822i;
    public final n2.n f43823j;
    public final qb.b f43824k;
    public final int f43825l;
    public final b2.s f43826m;
    public boolean f43827n = true;
    public long f43828o = -9223372036854775807L;
    public boolean f43829p;
    public boolean f43830q;
    public g2.c0 f43831r;
    public b2.k0 f43832s;

    public x0(b2.k0 k0Var, g2.g gVar, r5.d dVar, n2.n nVar, qb.b bVar, int i10, b2.s sVar) {
        this.f43832s = k0Var;
        this.h = gVar;
        this.f43822i = dVar;
        this.f43823j = nVar;
        this.f43824k = bVar;
        this.f43825l = i10;
        this.f43826m = sVar;
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        b2.f0 f0Var = i().f3078b;
        f0Var.getClass();
        b2.f0 f0Var2 = k0Var.f3078b;
        if (f0Var2 != null && f0Var2.f2993a.equals(f0Var.f2993a) && f0Var2.h == f0Var.h && Objects.equals(f0Var2.f2996f, f0Var.f2996f)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.f43831r;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.f0 f0Var2 = i().f3078b;
        f0Var2.getClass();
        Uri uri = f0Var2.f2993a;
        e2.d.h(this.f43602g);
        return new v0(uri, createDataSource, new lf.h((c3.r) this.f43822i.f42348b), this.f43823j, new n2.k(this.d.f15131c, 0, f0Var), this.f43824k, b(f0Var), this, dVar, f0Var2.f2996f, this.f43825l, this.f43826m, e2.d0.Q(f0Var2.h), null);
    }

    @Override
    public final synchronized b2.k0 i() {
        return this.f43832s;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f43831r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f43602g;
        e2.d.h(kVar);
        n2.n nVar = this.f43823j;
        nVar.C(myLooper, kVar);
        nVar.b();
        u();
    }

    @Override
    public final void o(d0 d0Var) {
        b1[] b1VarArr;
        v0 v0Var = (v0) d0Var;
        if (v0Var.N) {
            for (b1 b1Var : v0Var.K) {
                b1Var.k();
                n2.h hVar = b1Var.h;
                if (hVar != null) {
                    hVar.a(b1Var.e);
                    b1Var.h = null;
                    b1Var.f43620g = null;
                }
            }
        }
        v0Var.f43810x.e(v0Var);
        v0Var.H.removeCallbacksAndMessages(null);
        v0Var.I = null;
        v0Var.f43805f0 = true;
    }

    @Override
    public final void q() {
        this.f43823j.release();
    }

    @Override
    public final synchronized void t(b2.k0 k0Var) {
        this.f43832s = k0Var;
    }

    public final void u() {
        b2.e0 e0Var;
        long j3 = this.f43828o;
        boolean z10 = this.f43829p;
        boolean z11 = this.f43830q;
        b2.k0 i10 = i();
        if (z11) {
            e0Var = i10.f3079c;
        } else {
            e0Var = null;
        }
        b2.k1 i1Var = new i1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i10, e0Var);
        if (this.f43827n) {
            i1Var = new u(i1Var, 1);
        }
        n(i1Var);
    }

    public final void v(long j3, c3.b0 b0Var, boolean z10) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f43828o;
        }
        boolean f7 = b0Var.f();
        if (!this.f43827n && this.f43828o == j3 && this.f43829p == f7 && this.f43830q == z10) {
            return;
        }
        this.f43828o = j3;
        this.f43829p = f7;
        this.f43830q = z10;
        this.f43827n = false;
        u();
    }

    @Override
    public final void k() {
    }
}
