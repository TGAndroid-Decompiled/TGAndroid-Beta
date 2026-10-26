package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class y0 extends a {
    public final g2.g h;
    public final org.telegram.ui.Components.voip.j1 f49478i;
    public final n2.m f49479j;
    public final u7.s f49480k;
    public final int f49481l;
    public final b2.x f49482m;
    public boolean f49483n = true;
    public long f49484o = -9223372036854775807L;
    public boolean f49485p;
    public boolean f49486q;
    public boolean f49487r;
    public g2.c0 f49488s;
    public b2.p0 f49489t;

    public y0(b2.p0 p0Var, g2.g gVar, org.telegram.ui.Components.voip.j1 j1Var, n2.m mVar, u7.s sVar, int i10, b2.x xVar) {
        this.f49489t = p0Var;
        this.h = gVar;
        this.f49478i = j1Var;
        this.f49479j = mVar;
        this.f49480k = sVar;
        this.f49481l = i10;
        this.f49482m = xVar;
    }

    @Override
    public final boolean a(b2.p0 p0Var) {
        b2.k0 k0Var = i().f3345b;
        k0Var.getClass();
        b2.k0 k0Var2 = p0Var.f3345b;
        if (k0Var2 != null && k0Var2.f3255a.equals(k0Var.f3255a) && k0Var2.h == k0Var.h && Objects.equals(k0Var2.f3258f, k0Var.f3258f)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, a8.h0 h0Var, long j10) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.f49488s;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.k0 k0Var = i().f3345b;
        k0Var.getClass();
        Uri uri = k0Var.f3255a;
        this.f49243g.getClass();
        return new w0(uri, createDataSource, new s4.d((c3.r) this.f49478i.f33875b), this.f49479j, new n2.j(this.d.f18627c, 0, g0Var), this.f49480k, b(g0Var), this, h0Var, k0Var.f3258f, this.f49481l, this.f49482m, e2.n0.S(k0Var.h), null);
    }

    @Override
    public final synchronized b2.p0 i() {
        return this.f49489t;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f49488s = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.j jVar = this.f49243g;
        jVar.getClass();
        n2.m mVar = this.f49479j;
        mVar.f(myLooper, jVar);
        mVar.a();
        u();
    }

    @Override
    public final void o(e0 e0Var) {
        c1[] c1VarArr;
        w0 w0Var = (w0) e0Var;
        if (w0Var.O) {
            for (c1 c1Var : w0Var.L) {
                c1Var.l();
                n2.g gVar = c1Var.h;
                if (gVar != null) {
                    gVar.a(c1Var.e);
                    c1Var.h = null;
                    c1Var.f49266g = null;
                }
            }
        }
        w0Var.f49466x.e(w0Var);
        w0Var.H.removeCallbacksAndMessages(null);
        w0Var.I = null;
        w0Var.f49461h0 = true;
    }

    @Override
    public final void q() {
        this.f49479j.release();
    }

    @Override
    public final synchronized void t(b2.p0 p0Var) {
        this.f49489t = p0Var;
    }

    public final void u() {
        b2.j0 j0Var;
        long j10 = this.f49484o;
        boolean z10 = this.f49485p;
        boolean z11 = this.f49486q;
        b2.p0 i10 = i();
        if (z11) {
            j0Var = i10.f3346c;
        } else {
            j0Var = null;
        }
        b2.p1 j1Var = new j1(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, i10, j0Var);
        if (this.f49483n) {
            j1Var = new v(j1Var, 1);
        }
        n(j1Var);
    }

    public final void v(long j10, c3.b0 b0Var, boolean z10) {
        if (!this.f49487r || !b0Var.e()) {
            this.f49487r = !b0Var.e();
            if (j10 == -9223372036854775807L) {
                j10 = this.f49484o;
            }
            boolean d = b0Var.d();
            if (!this.f49483n && this.f49484o == j10 && this.f49485p == d && this.f49486q == z10) {
                return;
            }
            this.f49484o = j10;
            this.f49485p = d;
            this.f49486q = z10;
            this.f49483n = false;
            u();
        }
    }

    @Override
    public final void k() {
    }
}
