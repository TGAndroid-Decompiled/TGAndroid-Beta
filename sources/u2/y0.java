package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class y0 extends a {
    public final g2.g h;
    public final org.telegram.ui.Components.voip.j1 f49513i;
    public final n2.m f49514j;
    public final u7.s f49515k;
    public final int f49516l;
    public final b2.x f49517m;
    public boolean f49518n = true;
    public long f49519o = -9223372036854775807L;
    public boolean f49520p;
    public boolean f49521q;
    public boolean f49522r;
    public g2.c0 f49523s;
    public b2.p0 f49524t;

    public y0(b2.p0 p0Var, g2.g gVar, org.telegram.ui.Components.voip.j1 j1Var, n2.m mVar, u7.s sVar, int i10, b2.x xVar) {
        this.f49524t = p0Var;
        this.h = gVar;
        this.f49513i = j1Var;
        this.f49514j = mVar;
        this.f49515k = sVar;
        this.f49516l = i10;
        this.f49517m = xVar;
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
        g2.c0 c0Var = this.f49523s;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.k0 k0Var = i().f3345b;
        k0Var.getClass();
        Uri uri = k0Var.f3255a;
        this.f49278g.getClass();
        return new w0(uri, createDataSource, new s4.d((c3.r) this.f49513i.f33980b), this.f49514j, new n2.j(this.d.f18626c, 0, g0Var), this.f49515k, b(g0Var), this, h0Var, k0Var.f3258f, this.f49516l, this.f49517m, e2.n0.S(k0Var.h), null);
    }

    @Override
    public final synchronized b2.p0 i() {
        return this.f49524t;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f49523s = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.j jVar = this.f49278g;
        jVar.getClass();
        n2.m mVar = this.f49514j;
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
                    c1Var.f49301g = null;
                }
            }
        }
        w0Var.f49501x.e(w0Var);
        w0Var.H.removeCallbacksAndMessages(null);
        w0Var.I = null;
        w0Var.f49496h0 = true;
    }

    @Override
    public final void q() {
        this.f49514j.release();
    }

    @Override
    public final synchronized void t(b2.p0 p0Var) {
        this.f49524t = p0Var;
    }

    public final void u() {
        b2.j0 j0Var;
        long j10 = this.f49519o;
        boolean z10 = this.f49520p;
        boolean z11 = this.f49521q;
        b2.p0 i10 = i();
        if (z11) {
            j0Var = i10.f3346c;
        } else {
            j0Var = null;
        }
        b2.p1 j1Var = new j1(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, i10, j0Var);
        if (this.f49518n) {
            j1Var = new v(j1Var, 1);
        }
        n(j1Var);
    }

    public final void v(long j10, c3.b0 b0Var, boolean z10) {
        if (!this.f49522r || !b0Var.e()) {
            this.f49522r = !b0Var.e();
            if (j10 == -9223372036854775807L) {
                j10 = this.f49519o;
            }
            boolean d = b0Var.d();
            if (!this.f49518n && this.f49519o == j10 && this.f49520p == d && this.f49521q == z10) {
                return;
            }
            this.f49519o = j10;
            this.f49520p = d;
            this.f49521q = z10;
            this.f49518n = false;
            u();
        }
    }

    @Override
    public final void k() {
    }
}
