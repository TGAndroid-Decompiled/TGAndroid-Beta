package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class w0 extends a {
    public final g2.g h;
    public final r5.d f43544i;
    public final n2.m f43545j;
    public final qb.b f43546k;
    public final int f43547l;
    public final b2.s f43548m;
    public boolean f43549n = true;
    public long f43550o = -9223372036854775807L;
    public boolean f43551p;
    public boolean f43552q;
    public g2.c0 f43553r;
    public b2.k0 f43554s;

    public w0(b2.k0 k0Var, g2.g gVar, r5.d dVar, n2.m mVar, qb.b bVar, int i10, b2.s sVar) {
        this.f43554s = k0Var;
        this.h = gVar;
        this.f43544i = dVar;
        this.f43545j = mVar;
        this.f43546k = bVar;
        this.f43547l = i10;
        this.f43548m = sVar;
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        b2.f0 f0Var = i().f3078b;
        f0Var.getClass();
        b2.f0 f0Var2 = k0Var.f3078b;
        if (f0Var2 != null && f0Var2.f2993a.equals(f0Var.f2993a) && f0Var2.h == f0Var.h && Objects.equals(f0Var2.f2996f, f0Var.f2996f)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.f43553r;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.f0 f0Var2 = i().f3078b;
        f0Var2.getClass();
        Uri uri = f0Var2.f2993a;
        e2.d.h(this.f43331g);
        return new u0(uri, createDataSource, new lf.i((c3.r) this.f43544i.f42076b), this.f43545j, new n2.j(this.d.f14917c, 0, f0Var), this.f43546k, b(f0Var), this, dVar, f0Var2.f2996f, this.f43547l, this.f43548m, e2.d0.Q(f0Var2.h), null);
    }

    @Override
    public final synchronized b2.k0 i() {
        return this.f43554s;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f43553r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f43331g;
        e2.d.h(kVar);
        n2.m mVar = this.f43545j;
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
                    a1Var.f43344g = null;
                }
            }
        }
        u0Var.f43533x.e(u0Var);
        u0Var.H.removeCallbacksAndMessages(null);
        u0Var.I = null;
        u0Var.f43528f0 = true;
    }

    @Override
    public final void q() {
        this.f43545j.release();
    }

    @Override
    public final synchronized void t(b2.k0 k0Var) {
        this.f43554s = k0Var;
    }

    public final void u() {
        b2.e0 e0Var;
        long j3 = this.f43550o;
        boolean z10 = this.f43551p;
        boolean z11 = this.f43552q;
        b2.k0 i10 = i();
        if (z11) {
            e0Var = i10.f3079c;
        } else {
            e0Var = null;
        }
        b2.k1 h1Var = new h1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i10, e0Var);
        if (this.f43549n) {
            h1Var = new u(h1Var, 1);
        }
        n(h1Var);
    }

    public final void v(long j3, c3.b0 b0Var, boolean z10) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f43550o;
        }
        boolean f7 = b0Var.f();
        if (!this.f43549n && this.f43550o == j3 && this.f43551p == f7 && this.f43552q == z10) {
            return;
        }
        this.f43550o = j3;
        this.f43551p = f7;
        this.f43552q = z10;
        this.f43549n = false;
        u();
    }

    @Override
    public final void k() {
    }
}
