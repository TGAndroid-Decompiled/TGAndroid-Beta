package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
import m.f3;
public final class v0 extends a {
    public final g2.g h;
    public final r5.d f48952i;
    public final n2.m f48953j;
    public final t7.t f48954k;
    public final int f48955l;
    public final b2.s f48956m;
    public boolean f48957n = true;
    public long f48958o = -9223372036854775807L;
    public boolean f48959p;
    public boolean f48960q;
    public g2.c0 f48961r;
    public b2.k0 f48962s;

    public v0(b2.k0 k0Var, g2.g gVar, r5.d dVar, n2.m mVar, t7.t tVar, int i10, b2.s sVar) {
        this.f48962s = k0Var;
        this.h = gVar;
        this.f48952i = dVar;
        this.f48953j = mVar;
        this.f48954k = tVar;
        this.f48955l = i10;
        this.f48956m = sVar;
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        b2.f0 f0Var = i().f3398b;
        f0Var.getClass();
        b2.f0 f0Var2 = k0Var.f3398b;
        if (f0Var2 != null && f0Var2.f3303a.equals(f0Var.f3303a) && f0Var2.h == f0Var.h && Objects.equals(f0Var2.f3307f, f0Var.f3307f)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.f48961r;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.f0 f0Var2 = i().f3398b;
        f0Var2.getClass();
        Uri uri = f0Var2.f3303a;
        e2.d.h(this.f48753g);
        return new t0(uri, createDataSource, new f3((c3.r) this.f48952i.f47209b), this.f48953j, new n2.j(this.d.f16269c, 0, f0Var), this.f48954k, b(f0Var), this, dVar, f0Var2.f3307f, this.f48955l, this.f48956m, e2.d0.P(f0Var2.h), null);
    }

    @Override
    public final synchronized b2.k0 i() {
        return this.f48962s;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f48961r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f48753g;
        e2.d.h(kVar);
        n2.m mVar = this.f48953j;
        mVar.D(myLooper, kVar);
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
                    gVar.a(z0Var.f48982e);
                    z0Var.h = null;
                    z0Var.f48984g = null;
                }
            }
        }
        t0Var.f48942x.e(t0Var);
        t0Var.H.removeCallbacksAndMessages(null);
        t0Var.I = null;
        t0Var.f48937f0 = true;
    }

    @Override
    public final void q() {
        this.f48953j.release();
    }

    @Override
    public final synchronized void t(b2.k0 k0Var) {
        this.f48962s = k0Var;
    }

    public final void u() {
        b2.e0 e0Var;
        long j3 = this.f48958o;
        boolean z10 = this.f48959p;
        boolean z11 = this.f48960q;
        b2.k0 i10 = i();
        if (z11) {
            e0Var = i10.f3399c;
        } else {
            e0Var = null;
        }
        b2.k1 g1Var = new g1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i10, e0Var);
        if (this.f48957n) {
            g1Var = new u(g1Var, 1);
        }
        n(g1Var);
    }

    public final void v(long j3, c3.b0 b0Var, boolean z10) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f48958o;
        }
        boolean f7 = b0Var.f();
        if (!this.f48957n && this.f48958o == j3 && this.f48959p == f7 && this.f48960q == z10) {
            return;
        }
        this.f48958o = j3;
        this.f48959p = f7;
        this.f48960q = z10;
        this.f48957n = false;
        u();
    }

    @Override
    public final void k() {
    }
}
