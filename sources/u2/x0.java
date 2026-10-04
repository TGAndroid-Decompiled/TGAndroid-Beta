package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class x0 extends a {
    public final g2.g h;
    public final r2.s f47442i;
    public final n2.n f47443j;
    public final qb.b f47444k;
    public final int f47445l;
    public final b2.s f47446m;
    public boolean f47447n = true;
    public long f47448o = -9223372036854775807L;
    public boolean f47449p;
    public boolean f47450q;
    public g2.c0 f47451r;
    public b2.k0 f47452s;

    public x0(b2.k0 k0Var, g2.g gVar, r2.s sVar, n2.n nVar, qb.b bVar, int i10, b2.s sVar2) {
        this.f47452s = k0Var;
        this.h = gVar;
        this.f47442i = sVar;
        this.f47443j = nVar;
        this.f47444k = bVar;
        this.f47445l = i10;
        this.f47446m = sVar2;
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        b2.f0 f0Var = i().f3321b;
        f0Var.getClass();
        b2.f0 f0Var2 = k0Var.f3321b;
        if (f0Var2 != null && f0Var2.f3226a.equals(f0Var.f3226a) && f0Var2.h == f0Var.h && Objects.equals(f0Var2.f3230f, f0Var.f3230f)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.f47451r;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.f0 f0Var2 = i().f3321b;
        f0Var2.getClass();
        Uri uri = f0Var2.f3226a;
        e2.d.h(this.f47208g);
        return new v0(uri, createDataSource, new la.h((c3.r) this.f47442i.f45780b), this.f47443j, new n2.k(this.d.f16550c, 0, f0Var), this.f47444k, b(f0Var), this, dVar, f0Var2.f3230f, this.f47445l, this.f47446m, e2.d0.Q(f0Var2.h), null);
    }

    @Override
    public final synchronized b2.k0 i() {
        return this.f47452s;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f47451r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f47208g;
        e2.d.h(kVar);
        n2.n nVar = this.f47443j;
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
                    hVar.a(b1Var.f47226e);
                    b1Var.h = null;
                    b1Var.f47228g = null;
                }
            }
        }
        v0Var.f47428x.e(v0Var);
        v0Var.H.removeCallbacksAndMessages(null);
        v0Var.I = null;
        v0Var.f47423f0 = true;
    }

    @Override
    public final void q() {
        this.f47443j.release();
    }

    @Override
    public final synchronized void t(b2.k0 k0Var) {
        this.f47452s = k0Var;
    }

    public final void u() {
        b2.e0 e0Var;
        long j3 = this.f47448o;
        boolean z10 = this.f47449p;
        boolean z11 = this.f47450q;
        b2.k0 i10 = i();
        if (z11) {
            e0Var = i10.f3322c;
        } else {
            e0Var = null;
        }
        b2.k1 i1Var = new i1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i10, e0Var);
        if (this.f47447n) {
            i1Var = new u(i1Var, 1);
        }
        n(i1Var);
    }

    public final void v(long j3, c3.b0 b0Var, boolean z10) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f47448o;
        }
        boolean f7 = b0Var.f();
        if (!this.f47447n && this.f47448o == j3 && this.f47449p == f7 && this.f47450q == z10) {
            return;
        }
        this.f47448o = j3;
        this.f47449p = f7;
        this.f47450q = z10;
        this.f47447n = false;
        u();
    }

    @Override
    public final void k() {
    }
}
