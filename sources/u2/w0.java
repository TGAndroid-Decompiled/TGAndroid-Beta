package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class w0 extends a {
    public final g2.g h;
    public final r5.d f48740i;
    public final n2.m f48741j;
    public final rb.a f48742k;
    public final int f48743l;
    public final b2.s f48744m;
    public boolean f48745n = true;
    public long f48746o = -9223372036854775807L;
    public boolean f48747p;
    public boolean f48748q;
    public g2.c0 f48749r;
    public b2.k0 f48750s;

    public w0(b2.k0 k0Var, g2.g gVar, r5.d dVar, n2.m mVar, rb.a aVar, int i10, b2.s sVar) {
        this.f48750s = k0Var;
        this.h = gVar;
        this.f48740i = dVar;
        this.f48741j = mVar;
        this.f48742k = aVar;
        this.f48743l = i10;
        this.f48744m = sVar;
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        b2.f0 f0Var = i().f3400b;
        f0Var.getClass();
        b2.f0 f0Var2 = k0Var.f3400b;
        if (f0Var2 != null && f0Var2.f3305a.equals(f0Var.f3305a) && f0Var2.h == f0Var.h && Objects.equals(f0Var2.f3309f, f0Var.f3309f)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.f48749r;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.f0 f0Var2 = i().f3400b;
        f0Var2.getClass();
        Uri uri = f0Var2.f3305a;
        e2.d.h(this.f48512g);
        return new u0(uri, createDataSource, new la.h((c3.r) this.f48740i.f46985b), this.f48741j, new n2.j(this.d.f16520c, 0, f0Var), this.f48742k, b(f0Var), this, dVar, f0Var2.f3309f, this.f48743l, this.f48744m, e2.d0.P(f0Var2.h), null);
    }

    @Override
    public final synchronized b2.k0 i() {
        return this.f48750s;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f48749r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f48512g;
        e2.d.h(kVar);
        n2.m mVar = this.f48741j;
        mVar.F(myLooper, kVar);
        mVar.b();
        u();
    }

    @Override
    public final void o(d0 d0Var) {
        a1[] a1VarArr;
        u0 u0Var = (u0) d0Var;
        if (u0Var.N) {
            for (a1 a1Var : u0Var.K) {
                a1Var.k();
                n2.g gVar = a1Var.h;
                if (gVar != null) {
                    gVar.a(a1Var.f48524e);
                    a1Var.h = null;
                    a1Var.f48526g = null;
                }
            }
        }
        u0Var.f48728x.e(u0Var);
        u0Var.H.removeCallbacksAndMessages(null);
        u0Var.I = null;
        u0Var.f48723f0 = true;
    }

    @Override
    public final void q() {
        this.f48741j.release();
    }

    @Override
    public final synchronized void t(b2.k0 k0Var) {
        this.f48750s = k0Var;
    }

    public final void u() {
        b2.e0 e0Var;
        long j3 = this.f48746o;
        boolean z10 = this.f48747p;
        boolean z11 = this.f48748q;
        b2.k0 i10 = i();
        if (z11) {
            e0Var = i10.f3401c;
        } else {
            e0Var = null;
        }
        b2.k1 h1Var = new h1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i10, e0Var);
        if (this.f48745n) {
            h1Var = new u(h1Var, 1);
        }
        n(h1Var);
    }

    public final void v(long j3, c3.b0 b0Var, boolean z10) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f48746o;
        }
        boolean f7 = b0Var.f();
        if (!this.f48745n && this.f48746o == j3 && this.f48747p == f7 && this.f48748q == z10) {
            return;
        }
        this.f48746o = j3;
        this.f48747p = f7;
        this.f48748q = z10;
        this.f48745n = false;
        u();
    }

    @Override
    public final void k() {
    }
}
