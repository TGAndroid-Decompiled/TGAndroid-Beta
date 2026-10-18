package u2;
public final class y implements e0, d0 {
    public final g0 f47477a;
    public final long f47478b;
    public final androidx.biometric.e f47479c;
    public a d;
    public e0 e;
    public d0 f47480f;
    public long h = -9223372036854775807L;

    public y(g0 g0Var, androidx.biometric.e eVar, long j10) {
        this.f47477a = g0Var;
        this.f47479c = eVar;
        this.f47478b = j10;
    }

    public final void a(g0 g0Var) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.f47478b;
        }
        a aVar = this.d;
        aVar.getClass();
        e0 c10 = aVar.c(g0Var, this.f47479c, j10);
        this.e = c10;
        if (this.f47480f != null) {
            c10.m(this, j10);
        }
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
        String str = e2.m0.f8253a;
        return e0Var.d();
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
    public final void h(e0 e0Var) {
        d0 d0Var = this.f47480f;
        String str = e2.m0.f8253a;
        d0Var.h(this);
    }

    @Override
    public final long i(long j10) {
        e0 e0Var = this.e;
        String str = e2.m0.f8253a;
        return e0Var.i(j10);
    }

    @Override
    public final void k(long j10) {
        e0 e0Var = this.e;
        String str = e2.m0.f8253a;
        e0Var.k(j10);
    }

    @Override
    public final void m(d0 d0Var, long j10) {
        this.f47480f = d0Var;
        e0 e0Var = this.e;
        if (e0Var != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.f47478b;
            }
            e0Var.m(this, j11);
        }
    }

    @Override
    public final long o() {
        e0 e0Var = this.e;
        String str = e2.m0.f8253a;
        return e0Var.o();
    }

    @Override
    public final boolean p(i2.u0 u0Var) {
        e0 e0Var = this.e;
        if (e0Var != null && e0Var.p(u0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final long q(x2.p[] pVarArr, boolean[] zArr, e1[] e1VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.h;
        if (j12 != -9223372036854775807L && j10 == this.f47478b) {
            j11 = j12;
        } else {
            j11 = j10;
        }
        this.h = -9223372036854775807L;
        e0 e0Var = this.e;
        String str = e2.m0.f8253a;
        return e0Var.q(pVarArr, zArr, e1VarArr, zArr2, j11);
    }

    @Override
    public final s1 r() {
        e0 e0Var = this.e;
        String str = e2.m0.f8253a;
        return e0Var.r();
    }

    @Override
    public final long s() {
        e0 e0Var = this.e;
        String str = e2.m0.f8253a;
        return e0Var.s();
    }

    @Override
    public final long t(long j10, i2.r1 r1Var) {
        e0 e0Var = this.e;
        String str = e2.m0.f8253a;
        return e0Var.t(j10, r1Var);
    }

    @Override
    public final void u(long j10) {
        e0 e0Var = this.e;
        String str = e2.m0.f8253a;
        e0Var.u(j10);
    }

    @Override
    public final void v(g1 g1Var) {
        e0 e0Var = (e0) g1Var;
        d0 d0Var = this.f47480f;
        String str = e2.m0.f8253a;
        d0Var.v(this);
    }
}
