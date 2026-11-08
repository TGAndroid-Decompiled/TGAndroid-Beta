package x2;

import l2.t1;
public final class y implements e0, d0 {
    public final g0 f58518a;
    public final long f58519b;
    public final h6.m f58520c;
    public a d;
    public e0 f58521e;
    public d0 f58522f;
    public long h = -9223372036854775807L;

    public y(g0 g0Var, h6.m mVar, long j3) {
        this.f58518a = g0Var;
        this.f58520c = mVar;
        this.f58519b = j3;
    }

    @Override
    public final void a(e0 e0Var) {
        d0 d0Var = this.f58522f;
        String str = h2.m0.f14112a;
        d0Var.a(this);
    }

    @Override
    public final long b(a3.u[] uVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        long j10;
        long j11 = this.h;
        if (j11 != -9223372036854775807L && j3 == this.f58519b) {
            j10 = j11;
        } else {
            j10 = j3;
        }
        this.h = -9223372036854775807L;
        e0 e0Var = this.f58521e;
        String str = h2.m0.f14112a;
        return e0Var.b(uVarArr, zArr, c1VarArr, zArr2, j10);
    }

    @Override
    public final boolean c(l2.v0 v0Var) {
        e0 e0Var = this.f58521e;
        if (e0Var != null && e0Var.c(v0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(e1 e1Var) {
        e0 e0Var = (e0) e1Var;
        d0 d0Var = this.f58522f;
        String str = h2.m0.f14112a;
        d0Var.d(this);
    }

    @Override
    public final long e() {
        e0 e0Var = this.f58521e;
        String str = h2.m0.f14112a;
        return e0Var.e();
    }

    public final void f(g0 g0Var) {
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            j3 = this.f58519b;
        }
        a aVar = this.d;
        aVar.getClass();
        e0 c10 = aVar.c(g0Var, this.f58520c, j3);
        this.f58521e = c10;
        if (this.f58522f != null) {
            c10.q(this, j3);
        }
    }

    @Override
    public final boolean g() {
        e0 e0Var = this.f58521e;
        if (e0Var != null && e0Var.g()) {
            return true;
        }
        return false;
    }

    @Override
    public final long h(long j3, t1 t1Var) {
        e0 e0Var = this.f58521e;
        String str = h2.m0.f14112a;
        return e0Var.h(j3, t1Var);
    }

    @Override
    public final void i() {
        e0 e0Var = this.f58521e;
        if (e0Var != null) {
            e0Var.i();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override
    public final long j(long j3) {
        e0 e0Var = this.f58521e;
        String str = h2.m0.f14112a;
        return e0Var.j(j3);
    }

    @Override
    public final void k(long j3) {
        e0 e0Var = this.f58521e;
        String str = h2.m0.f14112a;
        e0Var.k(j3);
    }

    @Override
    public final long n() {
        e0 e0Var = this.f58521e;
        String str = h2.m0.f14112a;
        return e0Var.n();
    }

    @Override
    public final q1 o() {
        e0 e0Var = this.f58521e;
        String str = h2.m0.f14112a;
        return e0Var.o();
    }

    @Override
    public final long p() {
        e0 e0Var = this.f58521e;
        String str = h2.m0.f14112a;
        return e0Var.p();
    }

    @Override
    public final void q(d0 d0Var, long j3) {
        this.f58522f = d0Var;
        e0 e0Var = this.f58521e;
        if (e0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.f58519b;
            }
            e0Var.q(this, j10);
        }
    }

    @Override
    public final void r(long j3) {
        e0 e0Var = this.f58521e;
        String str = h2.m0.f14112a;
        e0Var.r(j3);
    }
}
