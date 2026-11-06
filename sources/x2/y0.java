package x2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
import org.telegram.ui.hy0;
public final class y0 extends a {
    public final j2.g h;
    public final u5.e f58427i;
    public final q2.m f58428j;
    public final pb.b f58429k;
    public final int f58430l;
    public final e2.u f58431m;
    public boolean f58432n = true;
    public long f58433o = -9223372036854775807L;
    public boolean f58434p;
    public boolean f58435q;
    public boolean f58436r;
    public j2.d0 f58437s;
    public e2.l0 f58438t;

    public y0(e2.l0 l0Var, j2.g gVar, u5.e eVar, q2.m mVar, pb.b bVar, int i7, e2.u uVar) {
        this.f58438t = l0Var;
        this.h = gVar;
        this.f58427i = eVar;
        this.f58428j = mVar;
        this.f58429k = bVar;
        this.f58430l = i7;
        this.f58431m = uVar;
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        e2.g0 g0Var = i().f10350b;
        g0Var.getClass();
        e2.g0 g0Var2 = l0Var.f10350b;
        if (g0Var2 != null && g0Var2.f10259a.equals(g0Var.f10259a) && g0Var2.h == g0Var.h && Objects.equals(g0Var2.f10263f, g0Var.f10263f)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        j2.h createDataSource = this.h.createDataSource();
        j2.d0 d0Var = this.f58437s;
        if (d0Var != null) {
            createDataSource.addTransferListener(d0Var);
        }
        e2.g0 g0Var2 = i().f10350b;
        g0Var2.getClass();
        Uri uri = g0Var2.f10259a;
        this.f58174g.getClass();
        return new w0(uri, createDataSource, new hy0((f3.r) this.f58427i.f56262b), this.f58428j, new q2.j(this.d.f53645c, 0, g0Var), this.f58429k, b(g0Var), this, mVar, g0Var2.f10263f, this.f58430l, this.f58431m, h2.m0.S(g0Var2.h), null);
    }

    @Override
    public final synchronized e2.l0 i() {
        return this.f58438t;
    }

    @Override
    public final void m(j2.d0 d0Var) {
        this.f58437s = d0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        m2.j jVar = this.f58174g;
        jVar.getClass();
        q2.m mVar = this.f58428j;
        mVar.E(myLooper, jVar);
        mVar.a();
        u();
    }

    @Override
    public final void o(e0 e0Var) {
        b1[] b1VarArr;
        w0 w0Var = (w0) e0Var;
        if (w0Var.O) {
            for (b1 b1Var : w0Var.L) {
                b1Var.l();
                q2.g gVar = b1Var.h;
                if (gVar != null) {
                    gVar.c(b1Var.f58187e);
                    b1Var.h = null;
                    b1Var.f58189g = null;
                }
            }
        }
        w0Var.f58414y.e(w0Var);
        w0Var.H.removeCallbacksAndMessages(null);
        w0Var.I = null;
        w0Var.f58408h0 = true;
    }

    @Override
    public final void q() {
        this.f58428j.release();
    }

    @Override
    public final synchronized void t(e2.l0 l0Var) {
        this.f58438t = l0Var;
    }

    public final void u() {
        e2.f0 f0Var;
        long j3 = this.f58433o;
        boolean z9 = this.f58434p;
        boolean z10 = this.f58435q;
        e2.l0 i7 = i();
        if (z10) {
            f0Var = i7.f10351c;
        } else {
            f0Var = null;
        }
        e2.l1 i1Var = new i1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z9, false, false, null, i7, f0Var);
        if (this.f58432n) {
            i1Var = new v(i1Var, 1);
        }
        n(i1Var);
    }

    public final void v(long j3, f3.c0 c0Var, boolean z9) {
        if (!this.f58436r || !c0Var.e()) {
            this.f58436r = !c0Var.e();
            if (j3 == -9223372036854775807L) {
                j3 = this.f58433o;
            }
            boolean d = c0Var.d();
            if (!this.f58432n && this.f58433o == j3 && this.f58434p == d && this.f58435q == z9) {
                return;
            }
            this.f58433o = j3;
            this.f58434p = d;
            this.f58435q = z9;
            this.f58432n = false;
            u();
        }
    }

    @Override
    public final void k() {
    }
}
