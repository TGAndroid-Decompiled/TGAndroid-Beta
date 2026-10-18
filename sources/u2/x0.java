package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class x0 extends a {
    public final g2.g h;
    public final qg.g0 f47523i;
    public final n2.n f47524j;
    public final oa.d f47525k;
    public final int f47526l;
    public final b2.w f47527m;
    public boolean f47528n = true;
    public long f47529o = -9223372036854775807L;
    public boolean f47530p;
    public boolean f47531q;
    public boolean f47532r;
    public g2.c0 f47533s;
    public b2.o0 f47534t;

    public x0(b2.o0 o0Var, g2.g gVar, qg.g0 g0Var, n2.n nVar, oa.d dVar, int i10, b2.w wVar) {
        this.f47534t = o0Var;
        this.h = gVar;
        this.f47523i = g0Var;
        this.f47524j = nVar;
        this.f47525k = dVar;
        this.f47526l = i10;
        this.f47527m = wVar;
    }

    @Override
    public final boolean a(b2.o0 o0Var) {
        b2.j0 j0Var = i().f3891b;
        j0Var.getClass();
        b2.j0 j0Var2 = o0Var.f3891b;
        if (j0Var2 != null && j0Var2.f3801a.equals(j0Var.f3801a) && j0Var2.h == j0Var.h && Objects.equals(j0Var2.f3804f, j0Var.f3804f)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, androidx.biometric.e eVar, long j10) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.f47533s;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.j0 j0Var = i().f3891b;
        j0Var.getClass();
        Uri uri = j0Var.f3801a;
        this.f47295g.getClass();
        return new v0(uri, createDataSource, new t0.h((c3.r) this.f47523i.f44570b), this.f47524j, new n2.k(this.d.f17062c, 0, f0Var), this.f47525k, b(f0Var), this, eVar, j0Var.f3804f, this.f47526l, this.f47527m, e2.m0.S(j0Var.h), null);
    }

    @Override
    public final synchronized b2.o0 i() {
        return this.f47534t;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f47533s = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f47295g;
        kVar.getClass();
        n2.n nVar = this.f47524j;
        nVar.E(myLooper, kVar);
        nVar.b();
        u();
    }

    @Override
    public final void o(d0 d0Var) {
        b1[] b1VarArr;
        v0 v0Var = (v0) d0Var;
        if (v0Var.O) {
            for (b1 b1Var : v0Var.L) {
                b1Var.l();
                n2.h hVar = b1Var.h;
                if (hVar != null) {
                    hVar.a(b1Var.e);
                    b1Var.h = null;
                    b1Var.f47313g = null;
                }
            }
        }
        v0Var.f47511x.e(v0Var);
        v0Var.H.removeCallbacksAndMessages(null);
        v0Var.I = null;
        v0Var.f47506h0 = true;
    }

    @Override
    public final void q() {
        this.f47524j.release();
    }

    @Override
    public final synchronized void t(b2.o0 o0Var) {
        this.f47534t = o0Var;
    }

    public final void u() {
        b2.i0 i0Var;
        long j10 = this.f47529o;
        boolean z10 = this.f47530p;
        boolean z11 = this.f47531q;
        b2.o0 i10 = i();
        if (z11) {
            i0Var = i10.f3892c;
        } else {
            i0Var = null;
        }
        b2.o1 i1Var = new i1(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, i10, i0Var);
        if (this.f47528n) {
            i1Var = new u(i1Var, 1);
        }
        n(i1Var);
    }

    public final void v(long j10, c3.c0 c0Var, boolean z10) {
        if (!this.f47532r || !c0Var.e()) {
            this.f47532r = !c0Var.e();
            if (j10 == -9223372036854775807L) {
                j10 = this.f47529o;
            }
            boolean d = c0Var.d();
            if (!this.f47528n && this.f47529o == j10 && this.f47530p == d && this.f47531q == z10) {
                return;
            }
            this.f47529o = j10;
            this.f47530p = d;
            this.f47531q = z10;
            this.f47528n = false;
            u();
        }
    }

    @Override
    public final void k() {
    }
}
