package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
public final class w0 extends a {
    public final g2.g h;
    public final r5.d f48742i;
    public final n2.m f48743j;
    public final rb.a f48744k;
    public final int f48745l;
    public final b2.s f48746m;
    public boolean f48747n = true;
    public long f48748o = -9223372036854775807L;
    public boolean f48749p;
    public boolean f48750q;
    public g2.c0 f48751r;
    public b2.k0 f48752s;

    public w0(b2.k0 k0Var, g2.g gVar, r5.d dVar, n2.m mVar, rb.a aVar, int i10, b2.s sVar) {
        this.f48752s = k0Var;
        this.h = gVar;
        this.f48742i = dVar;
        this.f48743j = mVar;
        this.f48744k = aVar;
        this.f48745l = i10;
        this.f48746m = sVar;
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
        g2.c0 c0Var = this.f48751r;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.f0 f0Var2 = i().f3400b;
        f0Var2.getClass();
        Uri uri = f0Var2.f3305a;
        e2.d.h(this.f48514g);
        return new u0(uri, createDataSource, new la.h((c3.r) this.f48742i.f46987b), this.f48743j, new n2.j(this.d.f16520c, 0, f0Var), this.f48744k, b(f0Var), this, dVar, f0Var2.f3309f, this.f48745l, this.f48746m, e2.d0.P(f0Var2.h), null);
    }

    @Override
    public final synchronized b2.k0 i() {
        return this.f48752s;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f48751r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f48514g;
        e2.d.h(kVar);
        n2.m mVar = this.f48743j;
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
                    gVar.a(a1Var.f48526e);
                    a1Var.h = null;
                    a1Var.f48528g = null;
                }
            }
        }
        u0Var.f48730x.e(u0Var);
        u0Var.H.removeCallbacksAndMessages(null);
        u0Var.I = null;
        u0Var.f48725f0 = true;
    }

    @Override
    public final void q() {
        this.f48743j.release();
    }

    @Override
    public final synchronized void t(b2.k0 k0Var) {
        this.f48752s = k0Var;
    }

    public final void u() {
        b2.e0 e0Var;
        long j3 = this.f48748o;
        boolean z10 = this.f48749p;
        boolean z11 = this.f48750q;
        b2.k0 i10 = i();
        if (z11) {
            e0Var = i10.f3401c;
        } else {
            e0Var = null;
        }
        b2.k1 h1Var = new h1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i10, e0Var);
        if (this.f48747n) {
            h1Var = new u(h1Var, 1);
        }
        n(h1Var);
    }

    public final void v(long j3, c3.b0 b0Var, boolean z10) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f48748o;
        }
        boolean f7 = b0Var.f();
        if (!this.f48747n && this.f48748o == j3 && this.f48749p == f7 && this.f48750q == z10) {
            return;
        }
        this.f48748o = j3;
        this.f48749p = f7;
        this.f48750q = z10;
        this.f48747n = false;
        u();
    }

    @Override
    public final void k() {
    }
}
