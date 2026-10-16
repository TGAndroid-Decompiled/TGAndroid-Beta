package u2;
public final class y implements e0, d0 {
    public final g0 f46092a;
    public final long f46093b;
    public final androidx.biometric.e f46094c;
    public a d;
    public e0 e;
    public d0 f46095f;
    public long h = -9223372036854775807L;

    public y(g0 g0Var, androidx.biometric.e eVar, long j10) {
        this.f46092a = g0Var;
        this.f46094c = eVar;
        this.f46093b = j10;
    }

    @Override
    public final void F(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f46095f;
        String str = e2.m0.f8375a;
        d0Var.F(this);
    }

    public final void a(g0 g0Var) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.f46093b;
        }
        a aVar = this.d;
        aVar.getClass();
        e0 c10 = aVar.c(g0Var, this.f46094c, j10);
        this.e = c10;
        if (this.f46095f != null) {
            c10.k(this, j10);
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
        String str = e2.m0.f8375a;
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
    public final long h(long j10) {
        e0 e0Var = this.e;
        String str = e2.m0.f8375a;
        return e0Var.h(j10);
    }

    @Override
    public final void i(long j10) {
        e0 e0Var = this.e;
        String str = e2.m0.f8375a;
        e0Var.i(j10);
    }

    @Override
    public final void k(d0 d0Var, long j10) {
        this.f46095f = d0Var;
        e0 e0Var = this.e;
        if (e0Var != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.f46093b;
            }
            e0Var.k(this, j11);
        }
    }

    @Override
    public final long l() {
        e0 e0Var = this.e;
        String str = e2.m0.f8375a;
        return e0Var.l();
    }

    @Override
    public final boolean m(i2.v0 v0Var) {
        e0 e0Var = this.e;
        if (e0Var != null && e0Var.m(v0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final long n(x2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.h;
        if (j12 != -9223372036854775807L && j10 == this.f46093b) {
            j11 = j12;
        } else {
            j11 = j10;
        }
        this.h = -9223372036854775807L;
        e0 e0Var = this.e;
        String str = e2.m0.f8375a;
        return e0Var.n(pVarArr, zArr, d1VarArr, zArr2, j11);
    }

    @Override
    public final r1 o() {
        e0 e0Var = this.e;
        String str = e2.m0.f8375a;
        return e0Var.o();
    }

    @Override
    public final long p() {
        e0 e0Var = this.e;
        String str = e2.m0.f8375a;
        return e0Var.p();
    }

    @Override
    public final void q(e0 e0Var) {
        d0 d0Var = this.f46095f;
        String str = e2.m0.f8375a;
        d0Var.q(this);
    }

    @Override
    public final long r(long j10, i2.t1 t1Var) {
        e0 e0Var = this.e;
        String str = e2.m0.f8375a;
        return e0Var.r(j10, t1Var);
    }

    @Override
    public final void s(long j10) {
        e0 e0Var = this.e;
        String str = e2.m0.f8375a;
        e0Var.s(j10);
    }
}
