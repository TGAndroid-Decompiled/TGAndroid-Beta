package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class w0 extends a {
    public final g2.g h;
    public final r5.d f43909i;
    public final n2.n f43910j;
    public final qb.b f43911k;
    public final int f43912l;
    public final b2.s f43913m;
    public boolean f43914n = true;
    public long f43915o = -9223372036854775807L;
    public boolean f43916p;
    public boolean f43917q;
    public g2.c0 f43918r;
    public b2.k0 f43919s;

    public w0(b2.k0 k0Var, g2.g gVar, r5.d dVar, n2.n nVar, qb.b bVar, int i10, b2.s sVar) {
        this.f43919s = k0Var;
        this.h = gVar;
        this.f43909i = dVar;
        this.f43910j = nVar;
        this.f43911k = bVar;
        this.f43912l = i10;
        this.f43913m = sVar;
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        b2.f0 f0Var = i().f3077b;
        f0Var.getClass();
        b2.f0 f0Var2 = k0Var.f3077b;
        if (f0Var2 != null && f0Var2.f2992a.equals(f0Var.f2992a) && f0Var2.h == f0Var.h && Objects.equals(f0Var2.f2995f, f0Var.f2995f)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.f43918r;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.f0 f0Var2 = i().f3077b;
        f0Var2.getClass();
        Uri uri = f0Var2.f2992a;
        e2.d.h(this.f43695g);
        return new u0(uri, createDataSource, new la.h((c3.r) this.f43909i.f42439b), this.f43910j, new n2.k(this.d.f15151c, 0, f0Var), this.f43911k, b(f0Var), this, dVar, f0Var2.f2995f, this.f43912l, this.f43913m, e2.d0.Q(f0Var2.h), null);
    }

    @Override
    public final synchronized b2.k0 i() {
        return this.f43919s;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f43918r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f43695g;
        e2.d.h(kVar);
        n2.n nVar = this.f43910j;
        nVar.C(myLooper, kVar);
        nVar.b();
        u();
    }

    @Override
    public final void o(d0 d0Var) {
        a1[] a1VarArr;
        u0 u0Var = (u0) d0Var;
        if (u0Var.N) {
            for (a1 a1Var : u0Var.K) {
                a1Var.k();
                n2.h hVar = a1Var.h;
                if (hVar != null) {
                    hVar.a(a1Var.e);
                    a1Var.h = null;
                    a1Var.f43708g = null;
                }
            }
        }
        u0Var.f43898x.e(u0Var);
        u0Var.H.removeCallbacksAndMessages(null);
        u0Var.I = null;
        u0Var.f43893f0 = true;
    }

    @Override
    public final void q() {
        this.f43910j.release();
    }

    @Override
    public final synchronized void t(b2.k0 k0Var) {
        this.f43919s = k0Var;
    }

    public final void u() {
        b2.e0 e0Var;
        long j3 = this.f43915o;
        boolean z10 = this.f43916p;
        boolean z11 = this.f43917q;
        b2.k0 i10 = i();
        if (z11) {
            e0Var = i10.f3078c;
        } else {
            e0Var = null;
        }
        b2.k1 h1Var = new h1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i10, e0Var);
        if (this.f43914n) {
            h1Var = new u(h1Var, 1);
        }
        n(h1Var);
    }

    public final void v(long j3, c3.b0 b0Var, boolean z10) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f43915o;
        }
        boolean f7 = b0Var.f();
        if (!this.f43914n && this.f43915o == j3 && this.f43916p == f7 && this.f43917q == z10) {
            return;
        }
        this.f43915o = j3;
        this.f43916p = f7;
        this.f43917q = z10;
        this.f43914n = false;
        u();
    }

    @Override
    public final void k() {
    }
}
