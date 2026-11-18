package x2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
import org.telegram.ui.md0;
import tg.z1;
public final class y0 extends a {
    public final j2.g h;
    public final z1 f60284i;
    public final q2.m f60285j;
    public final qb.a f60286k;
    public final int f60287l;
    public final e2.u f60288m;
    public boolean f60289n = true;
    public long f60290o = -9223372036854775807L;
    public boolean f60291p;
    public boolean f60292q;
    public boolean f60293r;
    public j2.c0 f60294s;
    public e2.l0 f60295t;

    public y0(e2.l0 l0Var, j2.g gVar, z1 z1Var, q2.m mVar, qb.a aVar, int i7, e2.u uVar) {
        this.f60295t = l0Var;
        this.h = gVar;
        this.f60284i = z1Var;
        this.f60285j = mVar;
        this.f60286k = aVar;
        this.f60287l = i7;
        this.f60288m = uVar;
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        e2.g0 g0Var = i().f10504b;
        g0Var.getClass();
        e2.g0 g0Var2 = l0Var.f10504b;
        if (g0Var2 != null && g0Var2.f10413a.equals(g0Var.f10413a) && g0Var2.h == g0Var.h && Objects.equals(g0Var2.f10417f, g0Var.f10417f)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        j2.h createDataSource = this.h.createDataSource();
        j2.c0 c0Var = this.f60294s;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        e2.g0 g0Var2 = i().f10504b;
        g0Var2.getClass();
        Uri uri = g0Var2.f10413a;
        this.f60028g.getClass();
        return new w0(uri, createDataSource, new md0((f3.r) this.f60284i.f58196b), this.f60285j, new q2.j(this.d.f55761c, 0, g0Var), this.f60286k, b(g0Var), this, mVar, g0Var2.f10417f, this.f60287l, this.f60288m, h2.l0.S(g0Var2.h), null);
    }

    @Override
    public final synchronized e2.l0 i() {
        return this.f60295t;
    }

    @Override
    public final void m(j2.c0 c0Var) {
        this.f60294s = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        m2.i iVar = this.f60028g;
        iVar.getClass();
        q2.m mVar = this.f60285j;
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
                    gVar.c(c1Var.f60052e);
                    c1Var.h = null;
                    c1Var.f60054g = null;
                }
            }
        }
        w0Var.f60271y.e(w0Var);
        w0Var.I.removeCallbacksAndMessages(null);
        w0Var.J = null;
        w0Var.f60265i0 = true;
    }

    @Override
    public final void q() {
        this.f60285j.release();
    }

    @Override
    public final synchronized void t(e2.l0 l0Var) {
        this.f60295t = l0Var;
    }

    public final void u() {
        e2.f0 f0Var;
        long j3 = this.f60290o;
        boolean z10 = this.f60291p;
        boolean z11 = this.f60292q;
        e2.l0 i7 = i();
        if (z11) {
            f0Var = i7.f10505c;
        } else {
            f0Var = null;
        }
        e2.l1 j1Var = new j1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i7, f0Var);
        if (this.f60289n) {
            j1Var = new v(j1Var, 1);
        }
        n(j1Var);
    }

    public final void v(long j3, f3.b0 b0Var, boolean z10) {
        if (!this.f60293r || !b0Var.e()) {
            this.f60293r = !b0Var.e();
            if (j3 == -9223372036854775807L) {
                j3 = this.f60290o;
            }
            boolean d = b0Var.d();
            if (!this.f60289n && this.f60290o == j3 && this.f60291p == d && this.f60292q == z10) {
                return;
            }
            this.f60290o = j3;
            this.f60291p = d;
            this.f60292q = z10;
            this.f60289n = false;
            u();
        }
    }

    @Override
    public final void k() {
    }
}
