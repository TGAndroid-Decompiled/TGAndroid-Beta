package u2;
public final class y implements e0, d0 {
    public final g0 f42489a;
    public final long f42490b;
    public final y2.d f42491c;
    public a d;
    public e0 e;
    public d0 f42492f;
    public long h = -9223372036854775807L;

    public y(g0 g0Var, y2.d dVar, long j3) {
        this.f42489a = g0Var;
        this.f42491c = dVar;
        this.f42490b = j3;
    }

    public final void a(g0 g0Var) {
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            j3 = this.f42490b;
        }
        a aVar = this.d;
        aVar.getClass();
        e0 c10 = aVar.c(g0Var, this.f42491c, j3);
        this.e = c10;
        if (this.f42492f != null) {
            c10.j(this, j3);
        }
    }

    @Override
    public final void b(e0 e0Var) {
        d0 d0Var = this.f42492f;
        String str = e2.d0.f7188a;
        d0Var.b(this);
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
    public final long d() {
        e0 e0Var = this.e;
        String str = e2.d0.f7188a;
        return e0Var.d();
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
    public final void g(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f42492f;
        String str = e2.d0.f7188a;
        d0Var.g(this);
    }

    @Override
    public final long h(long j3) {
        e0 e0Var = this.e;
        String str = e2.d0.f7188a;
        return e0Var.h(j3);
    }

    @Override
    public final void i(long j3) {
        e0 e0Var = this.e;
        String str = e2.d0.f7188a;
        e0Var.i(j3);
    }

    @Override
    public final void j(d0 d0Var, long j3) {
        this.f42492f = d0Var;
        e0 e0Var = this.e;
        if (e0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.f42490b;
            }
            e0Var.j(this, j10);
        }
    }

    @Override
    public final long m() {
        e0 e0Var = this.e;
        String str = e2.d0.f7188a;
        return e0Var.m();
    }

    @Override
    public final boolean n(i2.q0 q0Var) {
        e0 e0Var = this.e;
        if (e0Var != null && e0Var.n(q0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final long o(x2.r[] rVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        long j10;
        long j11 = this.h;
        if (j11 != -9223372036854775807L && j3 == this.f42490b) {
            j10 = j11;
        } else {
            j10 = j3;
        }
        this.h = -9223372036854775807L;
        e0 e0Var = this.e;
        String str = e2.d0.f7188a;
        return e0Var.o(rVarArr, zArr, d1VarArr, zArr2, j10);
    }

    @Override
    public final q1 q() {
        e0 e0Var = this.e;
        String str = e2.d0.f7188a;
        return e0Var.q();
    }

    @Override
    public final long r() {
        e0 e0Var = this.e;
        String str = e2.d0.f7188a;
        return e0Var.r();
    }

    @Override
    public final long s(long j3, i2.o1 o1Var) {
        e0 e0Var = this.e;
        String str = e2.d0.f7188a;
        return e0Var.s(j3, o1Var);
    }

    @Override
    public final void u(long j3) {
        e0 e0Var = this.e;
        String str = e2.d0.f7188a;
        e0Var.u(j3);
    }
}
