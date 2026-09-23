package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class v0 extends a {
    public final g2.g h;
    public final r5.d f43439i;
    public final n2.m f43440j;
    public final qb.b f43441k;
    public final int f43442l;
    public final b2.s f43443m;
    public boolean f43444n = true;
    public long f43445o = -9223372036854775807L;
    public boolean f43446p;
    public boolean f43447q;
    public g2.c0 f43448r;
    public b2.k0 f43449s;

    public v0(b2.k0 k0Var, g2.g gVar, r5.d dVar, n2.m mVar, qb.b bVar, int i10, b2.s sVar) {
        this.f43449s = k0Var;
        this.h = gVar;
        this.f43439i = dVar;
        this.f43440j = mVar;
        this.f43441k = bVar;
        this.f43442l = i10;
        this.f43443m = sVar;
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        b2.f0 f0Var = i().f3070b;
        f0Var.getClass();
        b2.f0 f0Var2 = k0Var.f3070b;
        if (f0Var2 != null && f0Var2.f2985a.equals(f0Var.f2985a) && f0Var2.h == f0Var.h && Objects.equals(f0Var2.f2988f, f0Var.f2988f)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.f43448r;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.f0 f0Var2 = i().f3070b;
        f0Var2.getClass();
        Uri uri = f0Var2.f2985a;
        e2.d.h(this.f43254g);
        return new t0(uri, createDataSource, new lf.i((c3.r) this.f43439i.f42001b), this.f43440j, new n2.j(this.d.f14882c, 0, f0Var), this.f43441k, b(f0Var), this, dVar, f0Var2.f2988f, this.f43442l, this.f43443m, e2.d0.Q(f0Var2.h), null);
    }

    @Override
    public final synchronized b2.k0 i() {
        return this.f43449s;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f43448r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f43254g;
        e2.d.h(kVar);
        n2.m mVar = this.f43440j;
        mVar.C(myLooper, kVar);
        mVar.b();
        u();
    }

    @Override
    public final void o(d0 d0Var) {
        z0[] z0VarArr;
        t0 t0Var = (t0) d0Var;
        if (t0Var.N) {
            for (z0 z0Var : t0Var.K) {
                z0Var.k();
                n2.g gVar = z0Var.h;
                if (gVar != null) {
                    gVar.a(z0Var.e);
                    z0Var.h = null;
                    z0Var.f43468g = null;
                }
            }
        }
        t0Var.f43430x.e(t0Var);
        t0Var.H.removeCallbacksAndMessages(null);
        t0Var.I = null;
        t0Var.f43425f0 = true;
    }

    @Override
    public final void q() {
        this.f43440j.release();
    }

    @Override
    public final synchronized void t(b2.k0 k0Var) {
        this.f43449s = k0Var;
    }

    public final void u() {
        b2.e0 e0Var;
        long j3 = this.f43445o;
        boolean z10 = this.f43446p;
        boolean z11 = this.f43447q;
        b2.k0 i10 = i();
        if (z11) {
            e0Var = i10.f3071c;
        } else {
            e0Var = null;
        }
        b2.k1 g1Var = new g1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i10, e0Var);
        if (this.f43444n) {
            g1Var = new u(g1Var, 1);
        }
        n(g1Var);
    }

    public final void v(long j3, c3.b0 b0Var, boolean z10) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f43445o;
        }
        boolean f7 = b0Var.f();
        if (!this.f43444n && this.f43445o == j3 && this.f43446p == f7 && this.f43447q == z10) {
            return;
        }
        this.f43445o = j3;
        this.f43446p = f7;
        this.f43447q = z10;
        this.f43444n = false;
        u();
    }

    @Override
    public final void k() {
    }
}
