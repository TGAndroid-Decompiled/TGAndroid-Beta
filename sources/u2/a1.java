package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class a1 extends a {
    public final g2.g h;
    public final qg.g0 f47696i;
    public final n2.n f47697j;
    public final oa.d f47698k;
    public final int f47699l;
    public final b2.w f47700m;
    public boolean f47701n = true;
    public long f47702o = -9223372036854775807L;
    public boolean f47703p;
    public boolean f47704q;
    public boolean f47705r;
    public g2.c0 f47706s;
    public b2.o0 f47707t;

    public a1(b2.o0 o0Var, g2.g gVar, qg.g0 g0Var, n2.n nVar, oa.d dVar, int i10, b2.w wVar) {
        this.f47707t = o0Var;
        this.h = gVar;
        this.f47696i = g0Var;
        this.f47697j = nVar;
        this.f47698k = dVar;
        this.f47699l = i10;
        this.f47700m = wVar;
    }

    @Override
    public final boolean a(b2.o0 o0Var) {
        b2.j0 j0Var = i().f3894b;
        j0Var.getClass();
        b2.j0 j0Var2 = o0Var.f3894b;
        if (j0Var2 != null && j0Var2.f3804a.equals(j0Var.f3804a) && j0Var2.h == j0Var.h && Objects.equals(j0Var2.f3807f, j0Var.f3807f)) {
            return true;
        }
        return false;
    }

    @Override
    public final f0 c(h0 h0Var, androidx.biometric.e eVar, long j10) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.f47706s;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.j0 j0Var = i().f3894b;
        j0Var.getClass();
        Uri uri = j0Var.f3804a;
        this.f47693g.getClass();
        return new y0(uri, createDataSource, new c((c3.t) this.f47696i.f44949b), this.f47697j, new n2.k(this.d.f17122c, 0, h0Var), this.f47698k, b(h0Var), this, eVar, j0Var.f3807f, this.f47699l, this.f47700m, e2.m0.S(j0Var.h), null);
    }

    @Override
    public final synchronized b2.o0 i() {
        return this.f47707t;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f47706s = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.j jVar = this.f47693g;
        jVar.getClass();
        n2.n nVar = this.f47697j;
        nVar.E(myLooper, jVar);
        nVar.b();
        u();
    }

    @Override
    public final void o(f0 f0Var) {
        e1[] e1VarArr;
        y0 y0Var = (y0) f0Var;
        if (y0Var.O) {
            for (e1 e1Var : y0Var.L) {
                e1Var.l();
                n2.h hVar = e1Var.h;
                if (hVar != null) {
                    hVar.a(e1Var.e);
                    e1Var.h = null;
                    e1Var.f47741g = null;
                }
            }
        }
        y0Var.f47942x.e(y0Var);
        y0Var.H.removeCallbacksAndMessages(null);
        y0Var.I = null;
        y0Var.f47937h0 = true;
    }

    @Override
    public final void q() {
        this.f47697j.release();
    }

    @Override
    public final synchronized void t(b2.o0 o0Var) {
        this.f47707t = o0Var;
    }

    public final void u() {
        b2.i0 i0Var;
        long j10 = this.f47702o;
        boolean z10 = this.f47703p;
        boolean z11 = this.f47704q;
        b2.o0 i10 = i();
        if (z11) {
            i0Var = i10.f3895c;
        } else {
            i0Var = null;
        }
        b2.o1 l1Var = new l1(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, i10, i0Var);
        if (this.f47701n) {
            l1Var = new w(l1Var, 1);
        }
        n(l1Var);
    }

    public final void v(long j10, c3.e0 e0Var, boolean z10) {
        if (!this.f47705r || !e0Var.e()) {
            this.f47705r = !e0Var.e();
            if (j10 == -9223372036854775807L) {
                j10 = this.f47702o;
            }
            boolean d = e0Var.d();
            if (!this.f47701n && this.f47702o == j10 && this.f47703p == d && this.f47704q == z10) {
                return;
            }
            this.f47702o = j10;
            this.f47703p = d;
            this.f47704q = z10;
            this.f47701n = false;
            u();
        }
    }

    @Override
    public final void k() {
    }
}
