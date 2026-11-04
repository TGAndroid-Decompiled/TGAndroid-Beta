package w2;
public final class y implements e0, d0 {
    public final g0 f57273a;
    public final long f57274b;
    public final android.support.v4.media.session.a0 f57275c;
    public a d;
    public e0 f57276e;
    public d0 f57277f;
    public long h = -9223372036854775807L;

    public y(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        this.f57273a = g0Var;
        this.f57275c = a0Var;
        this.f57274b = j10;
    }

    public final void a(g0 g0Var) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.f57274b;
        }
        a aVar = this.d;
        aVar.getClass();
        e0 c2 = aVar.c(g0Var, this.f57275c, j10);
        this.f57276e = c2;
        if (this.f57277f != null) {
            c2.i(this, j10);
        }
    }

    @Override
    public final void b(e0 e0Var) {
        d0 d0Var = this.f57277f;
        String str = g2.n0.f11873a;
        d0Var.b(this);
    }

    @Override
    public final boolean c(k2.v0 v0Var) {
        e0 e0Var = this.f57276e;
        if (e0Var != null && e0Var.c(v0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean d() {
        e0 e0Var = this.f57276e;
        if (e0Var != null && e0Var.d()) {
            return true;
        }
        return false;
    }

    @Override
    public final long e() {
        e0 e0Var = this.f57276e;
        String str = g2.n0.f11873a;
        return e0Var.e();
    }

    @Override
    public final void g() {
        e0 e0Var = this.f57276e;
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
    public final void i(d0 d0Var, long j10) {
        this.f57277f = d0Var;
        e0 e0Var = this.f57276e;
        if (e0Var != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.f57274b;
            }
            e0Var.i(this, j11);
        }
    }

    @Override
    public final long j(long j10) {
        e0 e0Var = this.f57276e;
        String str = g2.n0.f11873a;
        return e0Var.j(j10);
    }

    @Override
    public final void k(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f57277f;
        String str = g2.n0.f11873a;
        d0Var.k(this);
    }

    @Override
    public final void l(long j10) {
        e0 e0Var = this.f57276e;
        String str = g2.n0.f11873a;
        e0Var.l(j10);
    }

    @Override
    public final long n() {
        e0 e0Var = this.f57276e;
        String str = g2.n0.f11873a;
        return e0Var.n();
    }

    @Override
    public final r1 p() {
        e0 e0Var = this.f57276e;
        String str = g2.n0.f11873a;
        return e0Var.p();
    }

    @Override
    public final long q() {
        e0 e0Var = this.f57276e;
        String str = g2.n0.f11873a;
        return e0Var.q();
    }

    @Override
    public final long r(long j10, k2.t1 t1Var) {
        e0 e0Var = this.f57276e;
        String str = g2.n0.f11873a;
        return e0Var.r(j10, t1Var);
    }

    @Override
    public final long s(z2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.h;
        if (j12 != -9223372036854775807L && j10 == this.f57274b) {
            j11 = j12;
        } else {
            j11 = j10;
        }
        this.h = -9223372036854775807L;
        e0 e0Var = this.f57276e;
        String str = g2.n0.f11873a;
        return e0Var.s(pVarArr, zArr, d1VarArr, zArr2, j11);
    }

    @Override
    public final void t(long j10) {
        e0 e0Var = this.f57276e;
        String str = g2.n0.f11873a;
        e0Var.t(j10);
    }
}
