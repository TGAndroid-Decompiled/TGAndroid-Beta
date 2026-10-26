package u2;
public final class y implements e0, d0 {
    public final g0 f49474a;
    public final long f49475b;
    public final a8.h0 f49476c;
    public a d;
    public e0 e;
    public d0 f49477f;
    public long h = -9223372036854775807L;

    public y(g0 g0Var, a8.h0 h0Var, long j10) {
        this.f49474a = g0Var;
        this.f49476c = h0Var;
        this.f49475b = j10;
    }

    public final void a(g0 g0Var) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.f49475b;
        }
        a aVar = this.d;
        aVar.getClass();
        e0 c10 = aVar.c(g0Var, this.f49476c, j10);
        this.e = c10;
        if (this.f49477f != null) {
            c10.k(this, j10);
        }
    }

    @Override
    public final long b() {
        e0 e0Var = this.e;
        String str = e2.n0.f9692a;
        return e0Var.b();
    }

    @Override
    public final boolean c() {
        e0 e0Var = this.e;
        if (e0Var != null && e0Var.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final void g() {
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.g();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override
    public final long h(long j10) {
        e0 e0Var = this.e;
        String str = e2.n0.f9692a;
        return e0Var.h(j10);
    }

    @Override
    public final void i(long j10) {
        e0 e0Var = this.e;
        String str = e2.n0.f9692a;
        e0Var.i(j10);
    }

    @Override
    public final void k(d0 d0Var, long j10) {
        this.f49477f = d0Var;
        e0 e0Var = this.e;
        if (e0Var != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.f49475b;
            }
            e0Var.k(this, j11);
        }
    }

    @Override
    public final long l() {
        e0 e0Var = this.e;
        String str = e2.n0.f9692a;
        return e0Var.l();
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
    public final void n(e0 e0Var) {
        d0 d0Var = this.f49477f;
        String str = e2.n0.f9692a;
        d0Var.n(this);
    }

    @Override
    public final long o(x2.q[] qVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.h;
        if (j12 != -9223372036854775807L && j10 == this.f49475b) {
            j11 = j12;
        } else {
            j11 = j10;
        }
        this.h = -9223372036854775807L;
        e0 e0Var = this.e;
        String str = e2.n0.f9692a;
        return e0Var.o(qVarArr, zArr, d1VarArr, zArr2, j11);
    }

    @Override
    public final r1 p() {
        e0 e0Var = this.e;
        String str = e2.n0.f9692a;
        return e0Var.p();
    }

    @Override
    public final long q() {
        e0 e0Var = this.e;
        String str = e2.n0.f9692a;
        return e0Var.q();
    }

    @Override
    public final long r(long j10, i2.t1 t1Var) {
        e0 e0Var = this.e;
        String str = e2.n0.f9692a;
        return e0Var.r(j10, t1Var);
    }

    @Override
    public final void s(long j10) {
        e0 e0Var = this.e;
        String str = e2.n0.f9692a;
        e0Var.s(j10);
    }

    @Override
    public final void u(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f49477f;
        String str = e2.n0.f9692a;
        d0Var.u(this);
    }
}
