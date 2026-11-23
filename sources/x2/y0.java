package x2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
import org.telegram.ui.md0;
public final class y0 extends a {
    public final j2.g h;
    public final tg.o1 f60330i;
    public final q2.m f60331j;
    public final qb.a f60332k;
    public final int f60333l;
    public final e2.u f60334m;
    public boolean f60335n = true;
    public long f60336o = -9223372036854775807L;
    public boolean f60337p;
    public boolean f60338q;
    public boolean f60339r;
    public j2.c0 f60340s;
    public e2.l0 f60341t;

    public y0(e2.l0 l0Var, j2.g gVar, tg.o1 o1Var, q2.m mVar, qb.a aVar, int i7, e2.u uVar) {
        this.f60341t = l0Var;
        this.h = gVar;
        this.f60330i = o1Var;
        this.f60331j = mVar;
        this.f60332k = aVar;
        this.f60333l = i7;
        this.f60334m = uVar;
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        e2.g0 g0Var = i().f10533b;
        g0Var.getClass();
        e2.g0 g0Var2 = l0Var.f10533b;
        if (g0Var2 != null && g0Var2.f10442a.equals(g0Var.f10442a) && g0Var2.h == g0Var.h && Objects.equals(g0Var2.f10446f, g0Var.f10446f)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        j2.h createDataSource = this.h.createDataSource();
        j2.c0 c0Var = this.f60340s;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        e2.g0 g0Var2 = i().f10533b;
        g0Var2.getClass();
        Uri uri = g0Var2.f10442a;
        this.f60074g.getClass();
        return new w0(uri, createDataSource, new md0((f3.r) this.f60330i.f58105b), this.f60331j, new q2.j(this.d.f55806c, 0, g0Var), this.f60332k, b(g0Var), this, mVar, g0Var2.f10446f, this.f60333l, this.f60334m, h2.l0.S(g0Var2.h), null);
    }

    @Override
    public final synchronized e2.l0 i() {
        return this.f60341t;
    }

    @Override
    public final void m(j2.c0 c0Var) {
        this.f60340s = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        m2.i iVar = this.f60074g;
        iVar.getClass();
        q2.m mVar = this.f60331j;
        mVar.r1(myLooper, iVar);
        mVar.a();
        u();
    }

    @Override
    public final void o(e0 e0Var) {
        c1[] c1VarArr;
        w0 w0Var = (w0) e0Var;
        if (w0Var.P) {
            for (c1 c1Var : w0Var.M) {
                c1Var.l();
                q2.g gVar = c1Var.h;
                if (gVar != null) {
                    gVar.c(c1Var.f60098e);
                    c1Var.h = null;
                    c1Var.f60100g = null;
                }
            }
        }
        w0Var.f60317y.e(w0Var);
        w0Var.I.removeCallbacksAndMessages(null);
        w0Var.J = null;
        w0Var.f60311i0 = true;
    }

    @Override
    public final void q() {
        this.f60331j.release();
    }

    @Override
    public final synchronized void t(e2.l0 l0Var) {
        this.f60341t = l0Var;
    }

    public final void u() {
        e2.f0 f0Var;
        long j3 = this.f60336o;
        boolean z10 = this.f60337p;
        boolean z11 = this.f60338q;
        e2.l0 i7 = i();
        if (z11) {
            f0Var = i7.f10534c;
        } else {
            f0Var = null;
        }
        e2.l1 j1Var = new j1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i7, f0Var);
        if (this.f60335n) {
            j1Var = new v(j1Var, 1);
        }
        n(j1Var);
    }

    public final void v(long j3, f3.b0 b0Var, boolean z10) {
        if (!this.f60339r || !b0Var.e()) {
            this.f60339r = !b0Var.e();
            if (j3 == -9223372036854775807L) {
                j3 = this.f60336o;
            }
            boolean d = b0Var.d();
            if (!this.f60335n && this.f60336o == j3 && this.f60337p == d && this.f60338q == z10) {
                return;
            }
            this.f60336o = j3;
            this.f60337p = d;
            this.f60338q = z10;
            this.f60335n = false;
            u();
        }
    }

    @Override
    public final void k() {
    }
}
