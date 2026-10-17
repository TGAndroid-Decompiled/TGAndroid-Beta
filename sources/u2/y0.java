package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class y0 extends a {
    public final g2.g h;
    public final qg.g0 f47503i;
    public final n2.n f47504j;
    public final oa.d f47505k;
    public final int f47506l;
    public final b2.w f47507m;
    public boolean f47508n = true;
    public long f47509o = -9223372036854775807L;
    public boolean f47510p;
    public boolean f47511q;
    public boolean f47512r;
    public g2.c0 f47513s;
    public b2.o0 f47514t;

    public y0(b2.o0 o0Var, g2.g gVar, qg.g0 g0Var, n2.n nVar, oa.d dVar, int i10, b2.w wVar) {
        this.f47514t = o0Var;
        this.h = gVar;
        this.f47503i = g0Var;
        this.f47504j = nVar;
        this.f47505k = dVar;
        this.f47506l = i10;
        this.f47507m = wVar;
    }

    @Override
    public final boolean a(b2.o0 o0Var) {
        b2.j0 j0Var = i().f3890b;
        j0Var.getClass();
        b2.j0 j0Var2 = o0Var.f3890b;
        if (j0Var2 != null && j0Var2.f3800a.equals(j0Var.f3800a) && j0Var2.h == j0Var.h && Objects.equals(j0Var2.f3803f, j0Var.f3803f)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.f47513s;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.j0 j0Var = i().f3890b;
        j0Var.getClass();
        Uri uri = j0Var.f3800a;
        this.f47270g.getClass();
        return new w0(uri, createDataSource, new c((c3.r) this.f47503i.f44550b), this.f47504j, new n2.k(this.d.f17055c, 0, g0Var), this.f47505k, b(g0Var), this, eVar, j0Var.f3803f, this.f47506l, this.f47507m, e2.m0.S(j0Var.h), null);
    }

    @Override
    public final synchronized b2.o0 i() {
        return this.f47514t;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f47513s = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f47270g;
        kVar.getClass();
        n2.n nVar = this.f47504j;
        nVar.E(myLooper, kVar);
        nVar.b();
        u();
    }

    @Override
    public final void o(e0 e0Var) {
        c1[] c1VarArr;
        w0 w0Var = (w0) e0Var;
        if (w0Var.O) {
            for (c1 c1Var : w0Var.L) {
                c1Var.l();
                n2.h hVar = c1Var.h;
                if (hVar != null) {
                    hVar.a(c1Var.e);
                    c1Var.h = null;
                    c1Var.f47293g = null;
                }
            }
        }
        w0Var.f47491x.e(w0Var);
        w0Var.H.removeCallbacksAndMessages(null);
        w0Var.I = null;
        w0Var.f47486h0 = true;
    }

    @Override
    public final void q() {
        this.f47504j.release();
    }

    @Override
    public final synchronized void t(b2.o0 o0Var) {
        this.f47514t = o0Var;
    }

    public final void u() {
        b2.i0 i0Var;
        long j10 = this.f47509o;
        boolean z10 = this.f47510p;
        boolean z11 = this.f47511q;
        b2.o0 i10 = i();
        if (z11) {
            i0Var = i10.f3891c;
        } else {
            i0Var = null;
        }
        b2.o1 j1Var = new j1(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, i10, i0Var);
        if (this.f47508n) {
            j1Var = new v(j1Var, 1);
        }
        n(j1Var);
    }

    public final void v(long j10, c3.c0 c0Var, boolean z10) {
        if (!this.f47512r || !c0Var.e()) {
            this.f47512r = !c0Var.e();
            if (j10 == -9223372036854775807L) {
                j10 = this.f47509o;
            }
            boolean d = c0Var.d();
            if (!this.f47508n && this.f47509o == j10 && this.f47510p == d && this.f47511q == z10) {
                return;
            }
            this.f47509o = j10;
            this.f47510p = d;
            this.f47511q = z10;
            this.f47508n = false;
            u();
        }
    }

    @Override
    public final void k() {
    }
}
