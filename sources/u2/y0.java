package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
import m.e3;
public final class y0 extends a {
    public final g2.g h;
    public final th.e f42493i;
    public final n2.n f42494j;
    public final rb.a f42495k;
    public final int f42496l;
    public final b2.s f42497m;
    public boolean f42498n = true;
    public long f42499o = -9223372036854775807L;
    public boolean f42500p;
    public boolean f42501q;
    public g2.c0 f42502r;
    public b2.k0 f42503s;

    public y0(b2.k0 k0Var, g2.g gVar, th.e eVar, n2.n nVar, rb.a aVar, int i10, b2.s sVar) {
        this.f42503s = k0Var;
        this.h = gVar;
        this.f42493i = eVar;
        this.f42494j = nVar;
        this.f42495k = aVar;
        this.f42496l = i10;
        this.f42497m = sVar;
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        b2.f0 f0Var = i().f1771b;
        f0Var.getClass();
        b2.f0 f0Var2 = k0Var.f1771b;
        if (f0Var2 != null && f0Var2.f1686a.equals(f0Var.f1686a) && f0Var2.h == f0Var.h && Objects.equals(f0Var2.f1689f, f0Var.f1689f)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, y2.d dVar, long j3) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.f42502r;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.f0 f0Var = i().f1771b;
        f0Var.getClass();
        Uri uri = f0Var.f1686a;
        e2.d.h(this.f42270g);
        return new w0(uri, createDataSource, new e3((c3.r) this.f42493i.f42200b), this.f42494j, new n2.j(this.d.f13736c, 0, g0Var), this.f42495k, b(g0Var), this, dVar, f0Var.f1689f, this.f42496l, this.f42497m, e2.d0.Q(f0Var.h), null);
    }

    @Override
    public final synchronized b2.k0 i() {
        return this.f42503s;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f42502r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.f42270g;
        e2.d.h(kVar);
        n2.n nVar = this.f42494j;
        nVar.C(myLooper, kVar);
        nVar.b();
        u();
    }

    @Override
    public final void o(e0 e0Var) {
        c1[] c1VarArr;
        w0 w0Var = (w0) e0Var;
        if (w0Var.N) {
            for (c1 c1Var : w0Var.K) {
                c1Var.k();
                n2.g gVar = c1Var.h;
                if (gVar != null) {
                    gVar.a(c1Var.e);
                    c1Var.h = null;
                    c1Var.f42291g = null;
                }
            }
        }
        w0Var.f42481x.e(w0Var);
        w0Var.H.removeCallbacksAndMessages(null);
        w0Var.I = null;
        w0Var.f42476f0 = true;
    }

    @Override
    public final void q() {
        this.f42494j.release();
    }

    @Override
    public final synchronized void t(b2.k0 k0Var) {
        this.f42503s = k0Var;
    }

    public final void u() {
        b2.e0 e0Var;
        long j3 = this.f42499o;
        boolean z10 = this.f42500p;
        boolean z11 = this.f42501q;
        b2.k0 i10 = i();
        if (z11) {
            e0Var = i10.f1772c;
        } else {
            e0Var = null;
        }
        b2.k1 j1Var = new j1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i10, e0Var);
        if (this.f42498n) {
            j1Var = new v(j1Var, 1);
        }
        n(j1Var);
    }

    public final void v(long j3, c3.b0 b0Var, boolean z10) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f42499o;
        }
        boolean f7 = b0Var.f();
        if (!this.f42498n && this.f42499o == j3 && this.f42500p == f7 && this.f42501q == z10) {
            return;
        }
        this.f42499o = j3;
        this.f42500p = f7;
        this.f42501q = z10;
        this.f42498n = false;
        u();
    }

    @Override
    public final void k() {
    }
}
