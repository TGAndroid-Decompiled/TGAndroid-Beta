package u2;

import i2.v1;
public final class y implements e0, d0 {
    public final g0 f50067a;
    public final long f50068b;
    public final android.support.v4.media.session.a0 f50069c;
    public a d;
    public e0 e;
    public d0 f50070f;
    public long h = -9223372036854775807L;

    public y(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        this.f50067a = g0Var;
        this.f50069c = a0Var;
        this.f50068b = j10;
    }

    public final void a(g0 g0Var) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.f50068b;
        }
        a aVar = this.d;
        aVar.getClass();
        e0 c10 = aVar.c(g0Var, this.f50069c, j10);
        this.e = c10;
        if (this.f50070f != null) {
            c10.j(this, j10);
        }
    }

    @Override
    public final long c() {
        e0 e0Var = this.e;
        String str = e2.l0.f6165a;
        return e0Var.c();
    }

    @Override
    public final boolean d() {
        e0 e0Var = this.e;
        if (e0Var != null && e0Var.d()) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(e0 e0Var) {
        d0 d0Var = this.f50070f;
        String str = e2.l0.f6165a;
        d0Var.e(this);
    }

    @Override
    public final void f() {
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.f();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override
    public final long g(long j10) {
        e0 e0Var = this.e;
        String str = e2.l0.f6165a;
        return e0Var.g(j10);
    }

    @Override
    public final void h(long j10) {
        e0 e0Var = this.e;
        String str = e2.l0.f6165a;
        e0Var.h(j10);
    }

    @Override
    public final void j(d0 d0Var, long j10) {
        this.f50070f = d0Var;
        e0 e0Var = this.e;
        if (e0Var != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.f50068b;
            }
            e0Var.j(this, j11);
        }
    }

    @Override
    public final long k() {
        e0 e0Var = this.e;
        String str = e2.l0.f6165a;
        return e0Var.k();
    }

    @Override
    public final boolean m(i2.w0 w0Var) {
        e0 e0Var = this.e;
        if (e0Var != null && e0Var.m(w0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final long p(x2.q[] qVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.h;
        if (j12 != -9223372036854775807L && j10 == this.f50068b) {
            j11 = j12;
        } else {
            j11 = j10;
        }
        this.h = -9223372036854775807L;
        e0 e0Var = this.e;
        String str = e2.l0.f6165a;
        return e0Var.p(qVarArr, zArr, d1VarArr, zArr2, j11);
    }

    @Override
    public final r1 q() {
        e0 e0Var = this.e;
        String str = e2.l0.f6165a;
        return e0Var.q();
    }

    @Override
    public final void r(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f50070f;
        String str = e2.l0.f6165a;
        d0Var.r(this);
    }

    @Override
    public final long s() {
        e0 e0Var = this.e;
        String str = e2.l0.f6165a;
        return e0Var.s();
    }

    @Override
    public final long t(long j10, v1 v1Var) {
        e0 e0Var = this.e;
        String str = e2.l0.f6165a;
        return e0Var.t(j10, v1Var);
    }

    @Override
    public final void u(long j10) {
        e0 e0Var = this.e;
        String str = e2.l0.f6165a;
        e0Var.u(j10);
    }
}
