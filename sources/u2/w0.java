package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
import rg.p2;
public final class w0 extends a {
    public final g2.g h;
    public final p2 f46839i;
    public final n2.m f46840j;
    public final rb.a f46841k;
    public final int f46842l;
    public final b2.s f46843m;
    public boolean f46844n = true;
    public long f46845o = -9223372036854775807L;
    public boolean f46846p;
    public boolean f46847q;
    public g2.c0 f46848r;
    public b2.k0 f46849s;

    public w0(b2.k0 k0Var, g2.g gVar, p2 p2Var, n2.m mVar, rb.a aVar, int i10, b2.s sVar) {
        this.f46849s = k0Var;
        this.h = gVar;
        this.f46839i = p2Var;
        this.f46840j = mVar;
        this.f46841k = aVar;
        this.f46842l = i10;
        this.f46843m = sVar;
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        b2.f0 f0Var = i().f2127b;
        f0Var.getClass();
        b2.f0 f0Var2 = k0Var.f2127b;
        if (f0Var2 != null && f0Var2.f2032a.equals(f0Var.f2032a) && f0Var2.h == f0Var.h && Objects.equals(f0Var2.f2036f, f0Var.f2036f)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.f46848r;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.f0 f0Var2 = i().f2127b;
        f0Var2.getClass();
        Uri uri = f0Var2.f2032a;
        e2.d.h(this.f46610g);
        return new u0(uri, createDataSource, new m2.t((c3.r) this.f46839i.f45417b), this.f46840j, new n2.j(this.d.f16402c, 0, f0Var), this.f46841k, b(f0Var), this, dVar, f0Var2.f2036f, this.f46842l, this.f46843m, e2.d0.Q(f0Var2.h), null);
    }

    @Override
    public final synchronized b2.k0 i() {
        return this.f46849s;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f46848r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f46610g;
        e2.d.h(kVar);
        n2.m mVar = this.f46840j;
        mVar.B(myLooper, kVar);
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
                    gVar.a(a1Var.f46622e);
                    a1Var.h = null;
                    a1Var.f46624g = null;
                }
            }
        }
        u0Var.f46827x.e(u0Var);
        u0Var.H.removeCallbacksAndMessages(null);
        u0Var.I = null;
        u0Var.f46822f0 = true;
    }

    @Override
    public final void q() {
        this.f46840j.release();
    }

    @Override
    public final synchronized void t(b2.k0 k0Var) {
        this.f46849s = k0Var;
    }

    public final void u() {
        b2.e0 e0Var;
        long j3 = this.f46845o;
        boolean z10 = this.f46846p;
        boolean z11 = this.f46847q;
        b2.k0 i10 = i();
        if (z11) {
            e0Var = i10.f2128c;
        } else {
            e0Var = null;
        }
        b2.k1 h1Var = new h1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i10, e0Var);
        if (this.f46844n) {
            h1Var = new u(h1Var, 1);
        }
        n(h1Var);
    }

    public final void v(long j3, c3.b0 b0Var, boolean z10) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f46845o;
        }
        boolean f7 = b0Var.f();
        if (!this.f46844n && this.f46845o == j3 && this.f46846p == f7 && this.f46847q == z10) {
            return;
        }
        this.f46845o = j3;
        this.f46846p = f7;
        this.f46847q = z10;
        this.f46844n = false;
        u();
    }

    @Override
    public final void k() {
    }
}
