package w2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
import org.telegram.ui.ActionBar.e3;
public final class y0 extends a {
    public final i2.g h;
    public final e3 f57278i;
    public final p2.m f57279j;
    public final kb.a f57280k;
    public final int f57281l;
    public final d2.v f57282m;
    public boolean f57283n = true;
    public long f57284o = -9223372036854775807L;
    public boolean f57285p;
    public boolean f57286q;
    public boolean f57287r;
    public i2.d0 f57288s;
    public d2.n0 f57289t;

    public y0(d2.n0 n0Var, i2.g gVar, e3 e3Var, p2.m mVar, kb.a aVar, int i3, d2.v vVar) {
        this.f57289t = n0Var;
        this.h = gVar;
        this.f57278i = e3Var;
        this.f57279j = mVar;
        this.f57280k = aVar;
        this.f57281l = i3;
        this.f57282m = vVar;
    }

    @Override
    public final boolean a(d2.n0 n0Var) {
        d2.i0 i0Var = i().f8241b;
        i0Var.getClass();
        d2.i0 i0Var2 = n0Var.f8241b;
        if (i0Var2 != null && i0Var2.f8139a.equals(i0Var.f8139a) && i0Var2.h == i0Var.h && Objects.equals(i0Var2.f8143f, i0Var.f8143f)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        i2.h createDataSource = this.h.createDataSource();
        i2.d0 d0Var = this.f57288s;
        if (d0Var != null) {
            createDataSource.addTransferListener(d0Var);
        }
        d2.i0 i0Var = i().f8241b;
        i0Var.getClass();
        Uri uri = i0Var.f8139a;
        this.f57022g.getClass();
        return new w0(uri, createDataSource, new p7.d((e3.r) this.f57278i.f27474b), this.f57279j, new p2.j(this.d.f53117c, 0, g0Var), this.f57280k, b(g0Var), this, a0Var, i0Var.f8143f, this.f57281l, this.f57282m, g2.n0.S(i0Var.h), null);
    }

    @Override
    public final synchronized d2.n0 i() {
        return this.f57289t;
    }

    @Override
    public final void m(i2.d0 d0Var) {
        this.f57288s = d0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        l2.k kVar = this.f57022g;
        kVar.getClass();
        p2.m mVar = this.f57279j;
        mVar.k(myLooper, kVar);
        mVar.a();
        u();
    }

    @Override
    public final void o(e0 e0Var) {
        c1[] c1VarArr;
        w0 w0Var = (w0) e0Var;
        if (w0Var.P) {
            for (c1 c1Var : w0Var.M) {
                c1Var.l();
                p2.g gVar = c1Var.h;
                if (gVar != null) {
                    gVar.b(c1Var.f57046e);
                    c1Var.h = null;
                    c1Var.f57048g = null;
                }
            }
        }
        w0Var.f57265y.e(w0Var);
        w0Var.I.removeCallbacksAndMessages(null);
        w0Var.J = null;
        w0Var.f57259i0 = true;
    }

    @Override
    public final void q() {
        this.f57279j.release();
    }

    @Override
    public final synchronized void t(d2.n0 n0Var) {
        this.f57289t = n0Var;
    }

    public final void u() {
        d2.h0 h0Var;
        long j10 = this.f57284o;
        boolean z10 = this.f57285p;
        boolean z11 = this.f57286q;
        d2.n0 i3 = i();
        if (z11) {
            h0Var = i3.f8242c;
        } else {
            h0Var = null;
        }
        d2.n1 j1Var = new j1(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, i3, h0Var);
        if (this.f57283n) {
            j1Var = new v(j1Var, 1);
        }
        n(j1Var);
    }

    public final void v(long j10, e3.b0 b0Var, boolean z10) {
        if (!this.f57287r || !b0Var.e()) {
            this.f57287r = !b0Var.e();
            if (j10 == -9223372036854775807L) {
                j10 = this.f57284o;
            }
            boolean d = b0Var.d();
            if (!this.f57283n && this.f57284o == j10 && this.f57285p == d && this.f57286q == z10) {
                return;
            }
            this.f57284o = j10;
            this.f57285p = d;
            this.f57286q = z10;
            this.f57283n = false;
            u();
        }
    }

    @Override
    public final void k() {
    }
}
