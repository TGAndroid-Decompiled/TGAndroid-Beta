package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class y0 extends a {
    public final g2.g h;
    public final rg.b0 f46096i;
    public final n2.n f46097j;
    public final oa.d f46098k;
    public final int f46099l;
    public final b2.x f46100m;
    public boolean f46101n = true;
    public long f46102o = -9223372036854775807L;
    public boolean f46103p;
    public boolean f46104q;
    public boolean f46105r;
    public g2.c0 f46106s;
    public b2.p0 f46107t;

    public y0(b2.p0 p0Var, g2.g gVar, rg.b0 b0Var, n2.n nVar, oa.d dVar, int i10, b2.x xVar) {
        this.f46107t = p0Var;
        this.h = gVar;
        this.f46096i = b0Var;
        this.f46097j = nVar;
        this.f46098k = dVar;
        this.f46099l = i10;
        this.f46100m = xVar;
    }

    @Override
    public final boolean a(b2.p0 p0Var) {
        b2.k0 k0Var = i().f2278b;
        k0Var.getClass();
        b2.k0 k0Var2 = p0Var.f2278b;
        if (k0Var2 != null && k0Var2.f2188a.equals(k0Var.f2188a) && k0Var2.h == k0Var.h && Objects.equals(k0Var2.f2191f, k0Var.f2191f)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.f46106s;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.k0 k0Var = i().f2278b;
        k0Var.getClass();
        Uri uri = k0Var.f2188a;
        this.f45863g.getClass();
        return new w0(uri, createDataSource, new c((c3.r) this.f46096i.f44209b), this.f46097j, new n2.k(this.d.f15965c, 0, g0Var), this.f46098k, b(g0Var), this, eVar, k0Var.f2191f, this.f46099l, this.f46100m, e2.m0.S(k0Var.h), null);
    }

    @Override
    public final synchronized b2.p0 i() {
        return this.f46107t;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f46106s = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f45863g;
        kVar.getClass();
        n2.n nVar = this.f46097j;
        nVar.D(myLooper, kVar);
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
                n2.g gVar = c1Var.h;
                if (gVar != null) {
                    gVar.a(c1Var.e);
                    c1Var.h = null;
                    c1Var.f45886g = null;
                }
            }
        }
        w0Var.f46084x.e(w0Var);
        w0Var.H.removeCallbacksAndMessages(null);
        w0Var.I = null;
        w0Var.f46079h0 = true;
    }

    @Override
    public final void q() {
        this.f46097j.release();
    }

    @Override
    public final synchronized void t(b2.p0 p0Var) {
        this.f46107t = p0Var;
    }

    public final void u() {
        b2.j0 j0Var;
        long j10 = this.f46102o;
        boolean z10 = this.f46103p;
        boolean z11 = this.f46104q;
        b2.p0 i10 = i();
        if (z11) {
            j0Var = i10.f2279c;
        } else {
            j0Var = null;
        }
        b2.p1 j1Var = new j1(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, i10, j0Var);
        if (this.f46101n) {
            j1Var = new v(j1Var, 1);
        }
        n(j1Var);
    }

    public final void v(long j10, c3.b0 b0Var, boolean z10) {
        if (!this.f46105r || !b0Var.e()) {
            this.f46105r = !b0Var.e();
            if (j10 == -9223372036854775807L) {
                j10 = this.f46102o;
            }
            boolean d = b0Var.d();
            if (!this.f46101n && this.f46102o == j10 && this.f46103p == d && this.f46104q == z10) {
                return;
            }
            this.f46102o = j10;
            this.f46103p = d;
            this.f46104q = z10;
            this.f46101n = false;
            u();
        }
    }

    @Override
    public final void k() {
    }
}
