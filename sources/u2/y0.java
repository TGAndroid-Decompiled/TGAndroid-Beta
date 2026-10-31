package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class y0 extends a {
    public final g2.g h;
    public final rh.d0 f50057i;
    public final n2.m f50058j;
    public final hb.a f50059k;
    public final int f50060l;
    public final b2.x f50061m;
    public boolean f50062n = true;
    public long f50063o = -9223372036854775807L;
    public boolean f50064p;
    public boolean f50065q;
    public boolean f50066r;
    public g2.d0 f50067s;
    public b2.p0 f50068t;

    public y0(b2.p0 p0Var, g2.g gVar, rh.d0 d0Var, n2.m mVar, hb.a aVar, int i10, b2.x xVar) {
        this.f50068t = p0Var;
        this.h = gVar;
        this.f50057i = d0Var;
        this.f50058j = mVar;
        this.f50059k = aVar;
        this.f50060l = i10;
        this.f50061m = xVar;
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
        g2.d0 d0Var = this.f50067s;
        if (d0Var != null) {
            createDataSource.addTransferListener(d0Var);
        }
        b2.k0 k0Var = i().f2182b;
        k0Var.getClass();
        Uri uri = k0Var.f2091a;
        this.f49821g.getClass();
        return new w0(uri, createDataSource, new q5.d((c3.r) this.f50057i.f46749b), this.f50058j, new n2.j(this.d.f13463c, 0, g0Var), this.f50059k, b(g0Var), this, a0Var, k0Var.f2094f, this.f50060l, this.f50061m, e2.l0.S(k0Var.h), null);
    }

    @Override
    public final synchronized b2.p0 i() {
        return this.f50068t;
    }

    @Override
    public final void m(g2.d0 d0Var) {
        this.f50067s = d0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.l lVar = this.f49821g;
        lVar.getClass();
        n2.m mVar = this.f50058j;
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
                    c1Var.f49844g = null;
                }
            }
        }
        w0Var.f50046y.e(w0Var);
        w0Var.H.removeCallbacksAndMessages(null);
        w0Var.I = null;
        w0Var.f50040h0 = true;
    }

    @Override
    public final void q() {
        this.f50058j.release();
    }

    @Override
    public final synchronized void t(b2.p0 p0Var) {
        this.f50068t = p0Var;
    }

    public final void u() {
        b2.j0 j0Var;
        long j10 = this.f50063o;
        boolean z10 = this.f50064p;
        boolean z11 = this.f50065q;
        b2.p0 i10 = i();
        if (z11) {
            j0Var = i10.f2183c;
        } else {
            j0Var = null;
        }
        b2.o1 j1Var = new j1(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, i10, j0Var);
        if (this.f50062n) {
            j1Var = new v(j1Var, 1);
        }
        n(j1Var);
    }

    public final void v(long j10, c3.b0 b0Var, boolean z10) {
        if (!this.f50066r || !b0Var.e()) {
            this.f50066r = !b0Var.e();
            if (j10 == -9223372036854775807L) {
                j10 = this.f50063o;
            }
            boolean d = b0Var.d();
            if (!this.f50062n && this.f50063o == j10 && this.f50064p == d && this.f50065q == z10) {
                return;
            }
            this.f50063o = j10;
            this.f50064p = d;
            this.f50065q = z10;
            this.f50062n = false;
            u();
        }
    }

    @Override
    public final void k() {
    }
}
