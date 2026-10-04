package u2;
public final class x implements d0, c0 {
    public final f0 f47429a;
    public final long f47430b;
    public final y2.d f47431c;
    public a d;
    public d0 f47432e;
    public c0 f47433f;
    public long h = -9223372036854775807L;

    public x(f0 f0Var, y2.d dVar, long j3) {
        this.f47429a = f0Var;
        this.f47431c = dVar;
        this.f47430b = j3;
    }

    public final void a(f0 f0Var) {
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            j3 = this.f47430b;
        }
        a aVar = this.d;
        aVar.getClass();
        d0 c10 = aVar.c(f0Var, this.f47431c, j3);
        this.f47432e = c10;
        if (this.f47433f != null) {
            c10.k(this, j3);
        }
    }

    @Override
    public final void b(d0 d0Var) {
        c0 c0Var = this.f47433f;
        String str = e2.d0.f8537a;
        c0Var.b(this);
    }

    @Override
    public final boolean c() {
        d0 d0Var = this.f47432e;
        if (d0Var != null && d0Var.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final long d() {
        d0 d0Var = this.f47432e;
        String str = e2.d0.f8537a;
        return d0Var.d();
    }

    @Override
    public final void f(e1 e1Var) {
        d0 d0Var = (d0) e1Var;
        c0 c0Var = this.f47433f;
        String str = e2.d0.f8537a;
        c0Var.f(this);
    }

    @Override
    public final void g() {
        d0 d0Var = this.f47432e;
        if (d0Var != null) {
            d0Var.g();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override
    public final long h(long j3) {
        d0 d0Var = this.f47432e;
        String str = e2.d0.f8537a;
        return d0Var.h(j3);
    }

    @Override
    public final void i(long j3) {
        d0 d0Var = this.f47432e;
        String str = e2.d0.f8537a;
        d0Var.i(j3);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f47433f = c0Var;
        d0 d0Var = this.f47432e;
        if (d0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.f47430b;
            }
            d0Var.k(this, j10);
        }
    }

    @Override
    public final long l() {
        d0 d0Var = this.f47432e;
        String str = e2.d0.f8537a;
        return d0Var.l();
    }

    @Override
    public final boolean m(i2.s0 s0Var) {
        d0 d0Var = this.f47432e;
        if (d0Var != null && d0Var.m(s0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final long n(x2.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        long j10;
        long j11 = this.h;
        if (j11 != -9223372036854775807L && j3 == this.f47430b) {
            j10 = j11;
        } else {
            j10 = j3;
        }
        this.h = -9223372036854775807L;
        d0 d0Var = this.f47432e;
        String str = e2.d0.f8537a;
        return d0Var.n(rVarArr, zArr, c1VarArr, zArr2, j10);
    }

    @Override
    public final p1 o() {
        d0 d0Var = this.f47432e;
        String str = e2.d0.f8537a;
        return d0Var.o();
    }

    @Override
    public final long p() {
        d0 d0Var = this.f47432e;
        String str = e2.d0.f8537a;
        return d0Var.p();
    }

    @Override
    public final long q(long j3, i2.q1 q1Var) {
        d0 d0Var = this.f47432e;
        String str = e2.d0.f8537a;
        return d0Var.q(j3, q1Var);
    }

    @Override
    public final void r(long j3) {
        d0 d0Var = this.f47432e;
        String str = e2.d0.f8537a;
        d0Var.r(j3);
    }
}
