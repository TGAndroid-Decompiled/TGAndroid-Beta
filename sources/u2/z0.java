package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class z0 extends a {
    public final g2.g h;
    public final qg.h0 f47499i;
    public final n2.n f47500j;
    public final oa.d f47501k;
    public final int f47502l;
    public final b2.w f47503m;
    public boolean f47504n = true;
    public long f47505o = -9223372036854775807L;
    public boolean f47506p;
    public boolean f47507q;
    public boolean f47508r;
    public g2.c0 f47509s;
    public b2.o0 f47510t;

    public z0(b2.o0 o0Var, g2.g gVar, qg.h0 h0Var, n2.n nVar, oa.d dVar, int i10, b2.w wVar) {
        this.f47510t = o0Var;
        this.h = gVar;
        this.f47499i = h0Var;
        this.f47500j = nVar;
        this.f47501k = dVar;
        this.f47502l = i10;
        this.f47503m = wVar;
    }

    @Override
    public final boolean a(b2.o0 o0Var) {
        b2.j0 j0Var = i().f3887b;
        j0Var.getClass();
        b2.j0 j0Var2 = o0Var.f3887b;
        if (j0Var2 != null && j0Var2.f3797a.equals(j0Var.f3797a) && j0Var2.h == j0Var.h && Objects.equals(j0Var2.f3800f, j0Var.f3800f)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.f47509s;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.j0 j0Var = i().f3887b;
        j0Var.getClass();
        Uri uri = j0Var.f3797a;
        this.f47258g.getClass();
        return new x0(uri, createDataSource, new c((c3.r) this.f47499i.f44539b), this.f47500j, new n2.k(this.d.f17059c, 0, g0Var), this.f47501k, b(g0Var), this, eVar, j0Var.f3800f, this.f47502l, this.f47503m, e2.m0.S(j0Var.h), null);
    }

    @Override
    public final synchronized b2.o0 i() {
        return this.f47510t;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f47509s = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f47258g;
        kVar.getClass();
        n2.n nVar = this.f47500j;
        nVar.E(myLooper, kVar);
        nVar.b();
        u();
    }

    @Override
    public final void o(e0 e0Var) {
        d1[] d1VarArr;
        x0 x0Var = (x0) e0Var;
        if (x0Var.O) {
            for (d1 d1Var : x0Var.L) {
                d1Var.l();
                n2.h hVar = d1Var.h;
                if (hVar != null) {
                    hVar.a(d1Var.e);
                    d1Var.h = null;
                    d1Var.f47287g = null;
                }
            }
        }
        x0Var.f47488x.e(x0Var);
        x0Var.H.removeCallbacksAndMessages(null);
        x0Var.I = null;
        x0Var.f47483h0 = true;
    }

    @Override
    public final void q() {
        this.f47500j.release();
    }

    @Override
    public final synchronized void t(b2.o0 o0Var) {
        this.f47510t = o0Var;
    }

    public final void u() {
        b2.i0 i0Var;
        long j10 = this.f47505o;
        boolean z10 = this.f47506p;
        boolean z11 = this.f47507q;
        b2.o0 i10 = i();
        if (z11) {
            i0Var = i10.f3888c;
        } else {
            i0Var = null;
        }
        b2.o1 k1Var = new k1(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, i10, i0Var);
        if (this.f47504n) {
            k1Var = new v(k1Var, 1);
        }
        n(k1Var);
    }

    public final void v(long j10, c3.c0 c0Var, boolean z10) {
        if (!this.f47508r || !c0Var.e()) {
            this.f47508r = !c0Var.e();
            if (j10 == -9223372036854775807L) {
                j10 = this.f47505o;
            }
            boolean d = c0Var.d();
            if (!this.f47504n && this.f47505o == j10 && this.f47506p == d && this.f47507q == z10) {
                return;
            }
            this.f47505o = j10;
            this.f47506p = d;
            this.f47507q = z10;
            this.f47504n = false;
            u();
        }
    }

    @Override
    public final void k() {
    }
}
