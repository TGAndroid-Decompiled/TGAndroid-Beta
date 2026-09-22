package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class w0 extends a {
    public final g2.g h;
    public final r5.e f43512i;
    public final n2.m f43513j;
    public final qb.b f43514k;
    public final int f43515l;
    public final b2.s f43516m;
    public boolean f43517n = true;
    public long f43518o = -9223372036854775807L;
    public boolean f43519p;
    public boolean f43520q;
    public g2.c0 f43521r;
    public b2.k0 f43522s;

    public w0(b2.k0 k0Var, g2.g gVar, r5.e eVar, n2.m mVar, qb.b bVar, int i10, b2.s sVar) {
        this.f43522s = k0Var;
        this.h = gVar;
        this.f43512i = eVar;
        this.f43513j = mVar;
        this.f43514k = bVar;
        this.f43515l = i10;
        this.f43516m = sVar;
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        b2.f0 f0Var = i().f3075b;
        f0Var.getClass();
        b2.f0 f0Var2 = k0Var.f3075b;
        if (f0Var2 != null && f0Var2.f2990a.equals(f0Var.f2990a) && f0Var2.h == f0Var.h && Objects.equals(f0Var2.f2993f, f0Var.f2993f)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.f43521r;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.f0 f0Var2 = i().f3075b;
        f0Var2.getClass();
        Uri uri = f0Var2.f2990a;
        e2.d.h(this.f43299g);
        return new u0(uri, createDataSource, new lf.i((c3.r) this.f43512i.f42048b), this.f43513j, new n2.j(this.d.f14905c, 0, f0Var), this.f43514k, b(f0Var), this, dVar, f0Var2.f2993f, this.f43515l, this.f43516m, e2.d0.Q(f0Var2.h), null);
    }

    @Override
    public final synchronized b2.k0 i() {
        return this.f43522s;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f43521r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f43299g;
        e2.d.h(kVar);
        n2.m mVar = this.f43513j;
        mVar.C(myLooper, kVar);
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
                    gVar.a(a1Var.e);
                    a1Var.h = null;
                    a1Var.f43312g = null;
                }
            }
        }
        u0Var.f43501x.e(u0Var);
        u0Var.H.removeCallbacksAndMessages(null);
        u0Var.I = null;
        u0Var.f43496f0 = true;
    }

    @Override
    public final void q() {
        this.f43513j.release();
    }

    @Override
    public final synchronized void t(b2.k0 k0Var) {
        this.f43522s = k0Var;
    }

    public final void u() {
        b2.e0 e0Var;
        long j3 = this.f43518o;
        boolean z10 = this.f43519p;
        boolean z11 = this.f43520q;
        b2.k0 i10 = i();
        if (z11) {
            e0Var = i10.f3076c;
        } else {
            e0Var = null;
        }
        b2.k1 h1Var = new h1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i10, e0Var);
        if (this.f43517n) {
            h1Var = new u(h1Var, 1);
        }
        n(h1Var);
    }

    public final void v(long j3, c3.b0 b0Var, boolean z10) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f43518o;
        }
        boolean f7 = b0Var.f();
        if (!this.f43517n && this.f43518o == j3 && this.f43519p == f7 && this.f43520q == z10) {
            return;
        }
        this.f43518o = j3;
        this.f43519p = f7;
        this.f43520q = z10;
        this.f43517n = false;
        u();
    }

    @Override
    public final void k() {
    }
}
