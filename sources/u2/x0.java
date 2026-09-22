package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class x0 extends a {
    public final g2.g h;
    public final r5.d f43843i;
    public final n2.m f43844j;
    public final qb.b f43845k;
    public final int f43846l;
    public final b2.s f43847m;
    public boolean f43848n = true;
    public long f43849o = -9223372036854775807L;
    public boolean f43850p;
    public boolean f43851q;
    public g2.c0 f43852r;
    public b2.k0 f43853s;

    public x0(b2.k0 k0Var, g2.g gVar, r5.d dVar, n2.m mVar, qb.b bVar, int i10, b2.s sVar) {
        this.f43853s = k0Var;
        this.h = gVar;
        this.f43843i = dVar;
        this.f43844j = mVar;
        this.f43845k = bVar;
        this.f43846l = i10;
        this.f43847m = sVar;
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
        g2.c0 c0Var = this.f43852r;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.f0 f0Var2 = i().f3077b;
        f0Var2.getClass();
        Uri uri = f0Var2.f2992a;
        e2.d.h(this.f43623g);
        return new v0(uri, createDataSource, new lf.h((c3.r) this.f43843i.f42369b), this.f43844j, new n2.j(this.d.f15144c, 0, f0Var), this.f43845k, b(f0Var), this, dVar, f0Var2.f2995f, this.f43846l, this.f43847m, e2.d0.Q(f0Var2.h), null);
    }

    @Override
    public final synchronized b2.k0 i() {
        return this.f43853s;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f43852r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f43623g;
        e2.d.h(kVar);
        n2.m mVar = this.f43844j;
        mVar.C(myLooper, kVar);
        mVar.b();
        u();
    }

    @Override
    public final void o(d0 d0Var) {
        b1[] b1VarArr;
        v0 v0Var = (v0) d0Var;
        if (v0Var.N) {
            for (b1 b1Var : v0Var.K) {
                b1Var.k();
                n2.g gVar = b1Var.h;
                if (gVar != null) {
                    gVar.a(b1Var.e);
                    b1Var.h = null;
                    b1Var.f43641g = null;
                }
            }
        }
        v0Var.f43831x.e(v0Var);
        v0Var.H.removeCallbacksAndMessages(null);
        v0Var.I = null;
        v0Var.f43826f0 = true;
    }

    @Override
    public final void q() {
        this.f43844j.release();
    }

    @Override
    public final synchronized void t(b2.k0 k0Var) {
        this.f43853s = k0Var;
    }

    public final void u() {
        b2.e0 e0Var;
        long j3 = this.f43849o;
        boolean z10 = this.f43850p;
        boolean z11 = this.f43851q;
        b2.k0 i10 = i();
        if (z11) {
            e0Var = i10.f3078c;
        } else {
            e0Var = null;
        }
        b2.k1 i1Var = new i1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i10, e0Var);
        if (this.f43848n) {
            i1Var = new u(i1Var, 1);
        }
        n(i1Var);
    }

    public final void v(long j3, c3.b0 b0Var, boolean z10) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f43849o;
        }
        boolean f7 = b0Var.f();
        if (!this.f43848n && this.f43849o == j3 && this.f43850p == f7 && this.f43851q == z10) {
            return;
        }
        this.f43849o = j3;
        this.f43850p = f7;
        this.f43851q = z10;
        this.f43848n = false;
        u();
    }

    @Override
    public final void k() {
    }
}
