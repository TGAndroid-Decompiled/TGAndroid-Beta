package x2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
import org.telegram.ui.ly0;
public final class x0 extends a {
    public final j2.g h;
    public final u5.e f58529i;
    public final q2.m f58530j;
    public final pb.b f58531k;
    public final int f58532l;
    public final e2.u f58533m;
    public boolean f58534n = true;
    public long f58535o = -9223372036854775807L;
    public boolean f58536p;
    public boolean f58537q;
    public boolean f58538r;
    public j2.d0 f58539s;
    public e2.l0 f58540t;

    public x0(e2.l0 l0Var, j2.g gVar, u5.e eVar, q2.m mVar, pb.b bVar, int i7, e2.u uVar) {
        this.f58540t = l0Var;
        this.h = gVar;
        this.f58529i = eVar;
        this.f58530j = mVar;
        this.f58531k = bVar;
        this.f58532l = i7;
        this.f58533m = uVar;
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        e2.g0 g0Var = i().f10355b;
        g0Var.getClass();
        e2.g0 g0Var2 = l0Var.f10355b;
        if (g0Var2 != null && g0Var2.f10264a.equals(g0Var.f10264a) && g0Var2.h == g0Var.h && Objects.equals(g0Var2.f10268f, g0Var.f10268f)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, h6.m mVar, long j3) {
        j2.h createDataSource = this.h.createDataSource();
        j2.d0 d0Var = this.f58539s;
        if (d0Var != null) {
            createDataSource.addTransferListener(d0Var);
        }
        e2.g0 g0Var = i().f10355b;
        g0Var.getClass();
        Uri uri = g0Var.f10264a;
        this.f58283g.getClass();
        return new v0(uri, createDataSource, new ly0((f3.r) this.f58529i.f56363b), this.f58530j, new q2.j(this.d.f53750c, 0, f0Var), this.f58531k, b(f0Var), this, mVar, g0Var.f10268f, this.f58532l, this.f58533m, h2.m0.S(g0Var.h), null);
    }

    @Override
    public final synchronized e2.l0 i() {
        return this.f58540t;
    }

    @Override
    public final void m(j2.d0 d0Var) {
        this.f58539s = d0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        m2.j jVar = this.f58283g;
        jVar.getClass();
        q2.m mVar = this.f58530j;
        mVar.E(myLooper, jVar);
        mVar.a();
        u();
    }

    @Override
    public final void o(d0 d0Var) {
        a1[] a1VarArr;
        v0 v0Var = (v0) d0Var;
        if (v0Var.O) {
            for (a1 a1Var : v0Var.L) {
                a1Var.l();
                q2.g gVar = a1Var.h;
                if (gVar != null) {
                    gVar.c(a1Var.f58295e);
                    a1Var.h = null;
                    a1Var.f58297g = null;
                }
            }
        }
        v0Var.f58516y.e(v0Var);
        v0Var.H.removeCallbacksAndMessages(null);
        v0Var.I = null;
        v0Var.f58510h0 = true;
    }

    @Override
    public final void q() {
        this.f58530j.release();
    }

    @Override
    public final synchronized void t(e2.l0 l0Var) {
        this.f58540t = l0Var;
    }

    public final void u() {
        e2.f0 f0Var;
        long j3 = this.f58535o;
        boolean z9 = this.f58536p;
        boolean z10 = this.f58537q;
        e2.l0 i7 = i();
        if (z10) {
            f0Var = i7.f10356c;
        } else {
            f0Var = null;
        }
        e2.l1 h1Var = new h1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z9, false, false, null, i7, f0Var);
        if (this.f58534n) {
            h1Var = new u(h1Var, 1);
        }
        n(h1Var);
    }

    public final void v(long j3, f3.c0 c0Var, boolean z9) {
        if (!this.f58538r || !c0Var.e()) {
            this.f58538r = !c0Var.e();
            if (j3 == -9223372036854775807L) {
                j3 = this.f58535o;
            }
            boolean d = c0Var.d();
            if (!this.f58534n && this.f58535o == j3 && this.f58536p == d && this.f58537q == z9) {
                return;
            }
            this.f58535o = j3;
            this.f58536p = d;
            this.f58537q = z9;
            this.f58534n = false;
            u();
        }
    }

    @Override
    public final void k() {
    }
}
