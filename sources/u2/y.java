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
    public final void G(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f46095f;
        String str = e2.m0.f8372a;
        d0Var.G(this);
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
            c10.n(this, j10);
        }
    }

    @Override
    public final long b() {
        e0 e0Var = this.e;
        String str = e2.m0.f8372a;
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
        String str = e2.m0.f8372a;
        return e0Var.h(j10);
    }

    @Override
    public final void i(long j10) {
        e0 e0Var = this.e;
        String str = e2.m0.f8372a;
        e0Var.i(j10);
    }

    @Override
    public final void n(d0 d0Var, long j10) {
        this.f46095f = d0Var;
        e0 e0Var = this.e;
        if (e0Var != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.f46093b;
            }
            e0Var.n(this, j11);
        }
    }

    @Override
    public final long o() {
        e0 e0Var = this.e;
        String str = e2.m0.f8372a;
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
        if (j12 != -9223372036854775807L && j10 == this.f46093b) {
            j11 = j12;
        } else {
            j11 = j10;
        }
        this.h = -9223372036854775807L;
        e0 e0Var = this.e;
        String str = e2.m0.f8372a;
        return e0Var.q(pVarArr, zArr, d1VarArr, zArr2, j11);
    }

    @Override
    public final r1 r() {
        e0 e0Var = this.e;
        String str = e2.m0.f8372a;
        return e0Var.r();
    }

    @Override
    public final long s() {
        e0 e0Var = this.e;
        String str = e2.m0.f8372a;
        return e0Var.s();
    }

    @Override
    public final long t(long j10, i2.t1 t1Var) {
        e0 e0Var = this.e;
        String str = e2.m0.f8372a;
        return e0Var.t(j10, t1Var);
    }

    @Override
    public final void u(long j10) {
        e0 e0Var = this.e;
        String str = e2.m0.f8372a;
        e0Var.u(j10);
    }

    @Override
    public final void y(e0 e0Var) {
        d0 d0Var = this.f46095f;
        String str = e2.m0.f8372a;
        d0Var.y(this);
    }
}
