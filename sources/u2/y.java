package u2;
public final class y implements e0, d0 {
    public final g0 f47478a;
    public final long f47479b;
    public final androidx.biometric.e f47480c;
    public a d;
    public e0 e;
    public d0 f47481f;
    public long h = -9223372036854775807L;

    public y(g0 g0Var, androidx.biometric.e eVar, long j10) {
        this.f47478a = g0Var;
        this.f47480c = eVar;
        this.f47479b = j10;
    }

    @Override
    public final void a(e0 e0Var) {
        d0 d0Var = this.f47481f;
        String str = e2.m0.f8252a;
        d0Var.a(this);
    }

    public final void b(g0 g0Var) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.f47479b;
        }
        a aVar = this.d;
        aVar.getClass();
        e0 c10 = aVar.c(g0Var, this.f47480c, j10);
        this.e = c10;
        if (this.f47481f != null) {
            c10.n(this, j10);
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
        String str = e2.m0.f8252a;
        return e0Var.d();
    }

    @Override
    public final void h(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f47481f;
        String str = e2.m0.f8252a;
        d0Var.h(this);
    }

    @Override
    public final void i() {
        e0 e0Var = this.e;
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
    public final long j(long j10) {
        e0 e0Var = this.e;
        String str = e2.m0.f8252a;
        return e0Var.j(j10);
    }

    @Override
    public final void l(long j10) {
        e0 e0Var = this.e;
        String str = e2.m0.f8252a;
        e0Var.l(j10);
    }

    @Override
    public final void n(d0 d0Var, long j10) {
        this.f47481f = d0Var;
        e0 e0Var = this.e;
        if (e0Var != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.f47479b;
            }
            e0Var.n(this, j11);
        }
    }

    @Override
    public final long o() {
        e0 e0Var = this.e;
        String str = e2.m0.f8252a;
        return e0Var.o();
    }

    @Override
    public final boolean p(i2.v0 v0Var) {
        e0 e0Var = this.e;
        if (e0Var != null && e0Var.p(v0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final long q(x2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.h;
        if (j12 != -9223372036854775807L && j10 == this.f47479b) {
            j11 = j12;
        } else {
            j11 = j10;
        }
        this.h = -9223372036854775807L;
        e0 e0Var = this.e;
        String str = e2.m0.f8252a;
        return e0Var.q(pVarArr, zArr, d1VarArr, zArr2, j11);
    }

    @Override
    public final r1 r() {
        e0 e0Var = this.e;
        String str = e2.m0.f8252a;
        return e0Var.r();
    }

    @Override
    public final long s() {
        e0 e0Var = this.e;
        String str = e2.m0.f8252a;
        return e0Var.s();
    }

    @Override
    public final long t(long j10, i2.s1 s1Var) {
        e0 e0Var = this.e;
        String str = e2.m0.f8252a;
        return e0Var.t(j10, s1Var);
    }

    @Override
    public final void u(long j10) {
        e0 e0Var = this.e;
        String str = e2.m0.f8252a;
        e0Var.u(j10);
    }
}
