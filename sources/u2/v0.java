package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class v0 extends a {
    public final g2.g h;
    public final r5.d f48837i;
    public final n2.m f48838j;
    public final rb.a f48839k;
    public final int f48840l;
    public final b2.s f48841m;
    public boolean f48842n = true;
    public long f48843o = -9223372036854775807L;
    public boolean f48844p;
    public boolean f48845q;
    public g2.c0 f48846r;
    public b2.k0 f48847s;

    public v0(b2.k0 k0Var, g2.g gVar, r5.d dVar, n2.m mVar, rb.a aVar, int i10, b2.s sVar) {
        this.f48847s = k0Var;
        this.h = gVar;
        this.f48837i = dVar;
        this.f48838j = mVar;
        this.f48839k = aVar;
        this.f48840l = i10;
        this.f48841m = sVar;
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
        g2.c0 c0Var = this.f48846r;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.f0 f0Var2 = i().f3400b;
        f0Var2.getClass();
        Uri uri = f0Var2.f3305a;
        e2.d.h(this.f48638g);
        return new t0(uri, createDataSource, new la.h((c3.r) this.f48837i.f47111b), this.f48838j, new n2.j(this.d.f16602c, 0, f0Var), this.f48839k, b(f0Var), this, dVar, f0Var2.f3309f, this.f48840l, this.f48841m, e2.d0.P(f0Var2.h), null);
    }

    @Override
    public final synchronized b2.k0 i() {
        return this.f48847s;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f48846r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f48638g;
        e2.d.h(kVar);
        n2.m mVar = this.f48838j;
        mVar.F(myLooper, kVar);
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
                    gVar.a(z0Var.f48867e);
                    z0Var.h = null;
                    z0Var.f48869g = null;
                }
            }
        }
        t0Var.f48827x.e(t0Var);
        t0Var.H.removeCallbacksAndMessages(null);
        t0Var.I = null;
        t0Var.f48822f0 = true;
    }

    @Override
    public final void q() {
        this.f48838j.release();
    }

    @Override
    public final synchronized void t(b2.k0 k0Var) {
        this.f48847s = k0Var;
    }

    public final void u() {
        b2.e0 e0Var;
        long j3 = this.f48843o;
        boolean z10 = this.f48844p;
        boolean z11 = this.f48845q;
        b2.k0 i10 = i();
        if (z11) {
            e0Var = i10.f3401c;
        } else {
            e0Var = null;
        }
        b2.k1 g1Var = new g1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i10, e0Var);
        if (this.f48842n) {
            g1Var = new u(g1Var, 1);
        }
        n(g1Var);
    }

    public final void v(long j3, c3.b0 b0Var, boolean z10) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f48843o;
        }
        boolean f7 = b0Var.f();
        if (!this.f48842n && this.f48843o == j3 && this.f48844p == f7 && this.f48845q == z10) {
            return;
        }
        this.f48843o = j3;
        this.f48844p = f7;
        this.f48845q = z10;
        this.f48842n = false;
        u();
    }

    @Override
    public final void k() {
    }
}
