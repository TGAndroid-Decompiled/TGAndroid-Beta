package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class y0 extends a {
    public final g2.g h;
    public final qg.h0 f47482i;
    public final n2.n f47483j;
    public final oa.d f47484k;
    public final int f47485l;
    public final b2.w f47486m;
    public boolean f47487n = true;
    public long f47488o = -9223372036854775807L;
    public boolean f47489p;
    public boolean f47490q;
    public boolean f47491r;
    public g2.c0 f47492s;
    public b2.o0 f47493t;

    public y0(b2.o0 o0Var, g2.g gVar, qg.h0 h0Var, n2.n nVar, oa.d dVar, int i10, b2.w wVar) {
        this.f47493t = o0Var;
        this.h = gVar;
        this.f47482i = h0Var;
        this.f47483j = nVar;
        this.f47484k = dVar;
        this.f47485l = i10;
        this.f47486m = wVar;
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
        g2.c0 c0Var = this.f47492s;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.j0 j0Var = i().f3887b;
        j0Var.getClass();
        Uri uri = j0Var.f3797a;
        this.f47249g.getClass();
        return new w0(uri, createDataSource, new c((c3.r) this.f47482i.f44527b), this.f47483j, new n2.k(this.d.f17059c, 0, g0Var), this.f47484k, b(g0Var), this, eVar, j0Var.f3800f, this.f47485l, this.f47486m, e2.m0.S(j0Var.h), null);
    }

    @Override
    public final synchronized b2.o0 i() {
        return this.f47493t;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f47492s = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f47249g;
        kVar.getClass();
        n2.n nVar = this.f47483j;
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
                    c1Var.f47272g = null;
                }
            }
        }
        w0Var.f47470x.e(w0Var);
        w0Var.H.removeCallbacksAndMessages(null);
        w0Var.I = null;
        w0Var.f47465h0 = true;
    }

    @Override
    public final void q() {
        this.f47483j.release();
    }

    @Override
    public final synchronized void t(b2.o0 o0Var) {
        this.f47493t = o0Var;
    }

    public final void u() {
        b2.i0 i0Var;
        long j10 = this.f47488o;
        boolean z10 = this.f47489p;
        boolean z11 = this.f47490q;
        b2.o0 i10 = i();
        if (z11) {
            i0Var = i10.f3888c;
        } else {
            i0Var = null;
        }
        b2.o1 j1Var = new j1(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, i10, i0Var);
        if (this.f47487n) {
            j1Var = new v(j1Var, 1);
        }
        n(j1Var);
    }

    public final void v(long j10, c3.c0 c0Var, boolean z10) {
        if (!this.f47491r || !c0Var.e()) {
            this.f47491r = !c0Var.e();
            if (j10 == -9223372036854775807L) {
                j10 = this.f47488o;
            }
            boolean d = c0Var.d();
            if (!this.f47487n && this.f47488o == j10 && this.f47489p == d && this.f47490q == z10) {
                return;
            }
            this.f47488o = j10;
            this.f47489p = d;
            this.f47490q = z10;
            this.f47487n = false;
            u();
        }
    }

    @Override
    public final void k() {
    }
}
