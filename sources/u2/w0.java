package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class w0 extends a {
    public final g2.g h;
    public final r5.d f48786i;
    public final n2.m f48787j;
    public final rb.a f48788k;
    public final int f48789l;
    public final b2.s f48790m;
    public boolean f48791n = true;
    public long f48792o = -9223372036854775807L;
    public boolean f48793p;
    public boolean f48794q;
    public g2.c0 f48795r;
    public b2.k0 f48796s;

    public w0(b2.k0 k0Var, g2.g gVar, r5.d dVar, n2.m mVar, rb.a aVar, int i10, b2.s sVar) {
        this.f48796s = k0Var;
        this.h = gVar;
        this.f48786i = dVar;
        this.f48787j = mVar;
        this.f48788k = aVar;
        this.f48789l = i10;
        this.f48790m = sVar;
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
        g2.c0 c0Var = this.f48795r;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.f0 f0Var2 = i().f3400b;
        f0Var2.getClass();
        Uri uri = f0Var2.f3305a;
        e2.d.h(this.f48558g);
        return new u0(uri, createDataSource, new la.h((c3.r) this.f48786i.f47031b), this.f48787j, new n2.j(this.d.f16524c, 0, f0Var), this.f48788k, b(f0Var), this, dVar, f0Var2.f3309f, this.f48789l, this.f48790m, e2.d0.P(f0Var2.h), null);
    }

    @Override
    public final synchronized b2.k0 i() {
        return this.f48796s;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f48795r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f48558g;
        e2.d.h(kVar);
        n2.m mVar = this.f48787j;
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
                    gVar.a(a1Var.f48570e);
                    a1Var.h = null;
                    a1Var.f48572g = null;
                }
            }
        }
        u0Var.f48774x.e(u0Var);
        u0Var.H.removeCallbacksAndMessages(null);
        u0Var.I = null;
        u0Var.f48769f0 = true;
    }

    @Override
    public final void q() {
        this.f48787j.release();
    }

    @Override
    public final synchronized void t(b2.k0 k0Var) {
        this.f48796s = k0Var;
    }

    public final void u() {
        b2.e0 e0Var;
        long j3 = this.f48792o;
        boolean z10 = this.f48793p;
        boolean z11 = this.f48794q;
        b2.k0 i10 = i();
        if (z11) {
            e0Var = i10.f3401c;
        } else {
            e0Var = null;
        }
        b2.k1 h1Var = new h1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i10, e0Var);
        if (this.f48791n) {
            h1Var = new u(h1Var, 1);
        }
        n(h1Var);
    }

    public final void v(long j3, c3.b0 b0Var, boolean z10) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f48792o;
        }
        boolean f7 = b0Var.f();
        if (!this.f48791n && this.f48792o == j3 && this.f48793p == f7 && this.f48794q == z10) {
            return;
        }
        this.f48792o = j3;
        this.f48793p = f7;
        this.f48794q = z10;
        this.f48791n = false;
        u();
    }

    @Override
    public final void k() {
    }
}
