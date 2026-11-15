package x2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
import org.telegram.ui.ld0;
import tg.z1;
public final class x0 extends a {
    public final j2.g h;
    public final z1 f59712i;
    public final q2.n f59713j;
    public final qb.a f59714k;
    public final int f59715l;
    public final e2.u f59716m;
    public boolean f59717n = true;
    public long f59718o = -9223372036854775807L;
    public boolean f59719p;
    public boolean f59720q;
    public boolean f59721r;
    public j2.c0 f59722s;
    public e2.l0 f59723t;

    public x0(e2.l0 l0Var, j2.g gVar, z1 z1Var, q2.n nVar, qb.a aVar, int i7, e2.u uVar) {
        this.f59723t = l0Var;
        this.h = gVar;
        this.f59712i = z1Var;
        this.f59713j = nVar;
        this.f59714k = aVar;
        this.f59715l = i7;
        this.f59716m = uVar;
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        e2.g0 g0Var = i().f10186b;
        g0Var.getClass();
        e2.g0 g0Var2 = l0Var.f10186b;
        if (g0Var2 != null && g0Var2.f10095a.equals(g0Var.f10095a) && g0Var2.h == g0Var.h && Objects.equals(g0Var2.f10099f, g0Var.f10099f)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, h6.m mVar, long j3) {
        j2.h createDataSource = this.h.createDataSource();
        j2.c0 c0Var = this.f59722s;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        e2.g0 g0Var = i().f10186b;
        g0Var.getClass();
        Uri uri = g0Var.f10095a;
        this.f59464g.getClass();
        return new v0(uri, createDataSource, new ld0((f3.r) this.f59712i.f57629b), this.f59713j, new q2.k(this.d.f55187c, 0, f0Var), this.f59714k, b(f0Var), this, mVar, g0Var.f10099f, this.f59715l, this.f59716m, h2.l0.S(g0Var.h), null);
    }

    @Override
    public final synchronized e2.l0 i() {
        return this.f59723t;
    }

    @Override
    public final void m(j2.c0 c0Var) {
        this.f59722s = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        m2.j jVar = this.f59464g;
        jVar.getClass();
        q2.n nVar = this.f59713j;
        nVar.r1(myLooper, jVar);
        nVar.a();
        u();
    }

    @Override
    public final void o(d0 d0Var) {
        a1[] a1VarArr;
        v0 v0Var = (v0) d0Var;
        if (v0Var.P) {
            for (a1 a1Var : v0Var.M) {
                a1Var.l();
                q2.h hVar = a1Var.h;
                if (hVar != null) {
                    hVar.c(a1Var.f59476e);
                    a1Var.h = null;
                    a1Var.f59478g = null;
                }
            }
        }
        v0Var.f59699y.e(v0Var);
        v0Var.I.removeCallbacksAndMessages(null);
        v0Var.J = null;
        v0Var.f59693i0 = true;
    }

    @Override
    public final void q() {
        this.f59713j.release();
    }

    @Override
    public final synchronized void t(e2.l0 l0Var) {
        this.f59723t = l0Var;
    }

    public final void u() {
        e2.f0 f0Var;
        long j3 = this.f59718o;
        boolean z10 = this.f59719p;
        boolean z11 = this.f59720q;
        e2.l0 i7 = i();
        if (z11) {
            f0Var = i7.f10187c;
        } else {
            f0Var = null;
        }
        e2.l1 h1Var = new h1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i7, f0Var);
        if (this.f59717n) {
            h1Var = new u(h1Var, 1);
        }
        n(h1Var);
    }

    public final void v(long j3, f3.b0 b0Var, boolean z10) {
        if (!this.f59721r || !b0Var.e()) {
            this.f59721r = !b0Var.e();
            if (j3 == -9223372036854775807L) {
                j3 = this.f59718o;
            }
            boolean d = b0Var.d();
            if (!this.f59717n && this.f59718o == j3 && this.f59719p == d && this.f59720q == z10) {
                return;
            }
            this.f59718o = j3;
            this.f59719p = d;
            this.f59720q = z10;
            this.f59717n = false;
            u();
        }
    }

    @Override
    public final void k() {
    }
}
