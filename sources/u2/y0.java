package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class y0 extends a {
    public final g2.g h;
    public final rh.d0 f50071i;
    public final n2.m f50072j;
    public final hb.a f50073k;
    public final int f50074l;
    public final b2.x f50075m;
    public boolean f50076n = true;
    public long f50077o = -9223372036854775807L;
    public boolean f50078p;
    public boolean f50079q;
    public boolean f50080r;
    public g2.d0 f50081s;
    public b2.p0 f50082t;

    public y0(b2.p0 p0Var, g2.g gVar, rh.d0 d0Var, n2.m mVar, hb.a aVar, int i10, b2.x xVar) {
        this.f50082t = p0Var;
        this.h = gVar;
        this.f50071i = d0Var;
        this.f50072j = mVar;
        this.f50073k = aVar;
        this.f50074l = i10;
        this.f50075m = xVar;
    }

    @Override
    public final boolean a(b2.p0 p0Var) {
        b2.k0 k0Var = i().f2182b;
        k0Var.getClass();
        b2.k0 k0Var2 = p0Var.f2182b;
        if (k0Var2 != null && k0Var2.f2091a.equals(k0Var.f2091a) && k0Var2.h == k0Var.h && Objects.equals(k0Var2.f2094f, k0Var.f2094f)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        g2.h createDataSource = this.h.createDataSource();
        g2.d0 d0Var = this.f50081s;
        if (d0Var != null) {
            createDataSource.addTransferListener(d0Var);
        }
        b2.k0 k0Var = i().f2182b;
        k0Var.getClass();
        Uri uri = k0Var.f2091a;
        this.f49835g.getClass();
        return new w0(uri, createDataSource, new q5.d((c3.r) this.f50071i.f46763b), this.f50072j, new n2.j(this.d.f13464c, 0, g0Var), this.f50073k, b(g0Var), this, a0Var, k0Var.f2094f, this.f50074l, this.f50075m, e2.l0.S(k0Var.h), null);
    }

    @Override
    public final synchronized b2.p0 i() {
        return this.f50082t;
    }

    @Override
    public final void m(g2.d0 d0Var) {
        this.f50081s = d0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.l lVar = this.f49835g;
        lVar.getClass();
        n2.m mVar = this.f50072j;
        mVar.g(myLooper, lVar);
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
                    c1Var.f49858g = null;
                }
            }
        }
        w0Var.f50060y.e(w0Var);
        w0Var.H.removeCallbacksAndMessages(null);
        w0Var.I = null;
        w0Var.f50054h0 = true;
    }

    @Override
    public final void q() {
        this.f50072j.release();
    }

    @Override
    public final synchronized void t(b2.p0 p0Var) {
        this.f50082t = p0Var;
    }

    public final void u() {
        b2.j0 j0Var;
        long j10 = this.f50077o;
        boolean z10 = this.f50078p;
        boolean z11 = this.f50079q;
        b2.p0 i10 = i();
        if (z11) {
            j0Var = i10.f2183c;
        } else {
            j0Var = null;
        }
        b2.o1 j1Var = new j1(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, i10, j0Var);
        if (this.f50076n) {
            j1Var = new v(j1Var, 1);
        }
        n(j1Var);
    }

    public final void v(long j10, c3.b0 b0Var, boolean z10) {
        if (!this.f50080r || !b0Var.e()) {
            this.f50080r = !b0Var.e();
            if (j10 == -9223372036854775807L) {
                j10 = this.f50077o;
            }
            boolean d = b0Var.d();
            if (!this.f50076n && this.f50077o == j10 && this.f50078p == d && this.f50079q == z10) {
                return;
            }
            this.f50077o = j10;
            this.f50078p = d;
            this.f50079q = z10;
            this.f50076n = false;
            u();
        }
    }

    @Override
    public final void k() {
    }
}
