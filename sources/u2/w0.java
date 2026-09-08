package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
import rg.p2;
public final class w0 extends a {
    public final g2.g h;
    public final p2 f46866i;
    public final n2.m f46867j;
    public final rb.a f46868k;
    public final int f46869l;
    public final b2.s f46870m;
    public boolean f46871n = true;
    public long f46872o = -9223372036854775807L;
    public boolean f46873p;
    public boolean f46874q;
    public g2.c0 f46875r;
    public b2.k0 f46876s;

    public w0(b2.k0 k0Var, g2.g gVar, p2 p2Var, n2.m mVar, rb.a aVar, int i10, b2.s sVar) {
        this.f46876s = k0Var;
        this.h = gVar;
        this.f46866i = p2Var;
        this.f46867j = mVar;
        this.f46868k = aVar;
        this.f46869l = i10;
        this.f46870m = sVar;
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        b2.f0 f0Var = i().f2154b;
        f0Var.getClass();
        b2.f0 f0Var2 = k0Var.f2154b;
        if (f0Var2 != null && f0Var2.f2059a.equals(f0Var.f2059a) && f0Var2.h == f0Var.h && Objects.equals(f0Var2.f2063f, f0Var.f2063f)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.f46875r;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.f0 f0Var2 = i().f2154b;
        f0Var2.getClass();
        Uri uri = f0Var2.f2059a;
        e2.d.h(this.f46637g);
        return new u0(uri, createDataSource, new m2.t((c3.r) this.f46866i.f45444b), this.f46867j, new n2.j(this.d.f16429c, 0, f0Var), this.f46868k, b(f0Var), this, dVar, f0Var2.f2063f, this.f46869l, this.f46870m, e2.d0.Q(f0Var2.h), null);
    }

    @Override
    public final synchronized b2.k0 i() {
        return this.f46876s;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f46875r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f46637g;
        e2.d.h(kVar);
        n2.m mVar = this.f46867j;
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
                    gVar.a(a1Var.f46649e);
                    a1Var.h = null;
                    a1Var.f46651g = null;
                }
            }
        }
        u0Var.f46854x.e(u0Var);
        u0Var.H.removeCallbacksAndMessages(null);
        u0Var.I = null;
        u0Var.f46849f0 = true;
    }

    @Override
    public final void q() {
        this.f46867j.release();
    }

    @Override
    public final synchronized void t(b2.k0 k0Var) {
        this.f46876s = k0Var;
    }

    public final void u() {
        b2.e0 e0Var;
        long j3 = this.f46872o;
        boolean z10 = this.f46873p;
        boolean z11 = this.f46874q;
        b2.k0 i10 = i();
        if (z11) {
            e0Var = i10.f2155c;
        } else {
            e0Var = null;
        }
        b2.k1 h1Var = new h1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i10, e0Var);
        if (this.f46871n) {
            h1Var = new u(h1Var, 1);
        }
        n(h1Var);
    }

    public final void v(long j3, c3.b0 b0Var, boolean z10) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f46872o;
        }
        boolean f7 = b0Var.f();
        if (!this.f46871n && this.f46872o == j3 && this.f46873p == f7 && this.f46874q == z10) {
            return;
        }
        this.f46872o = j3;
        this.f46873p = f7;
        this.f46874q = z10;
        this.f46871n = false;
        u();
    }

    @Override
    public final void k() {
    }
}
