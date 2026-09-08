package u2;
public final class x implements d0, c0 {
    public final f0 f46877a;
    public final long f46878b;
    public final y2.d f46879c;
    public a d;
    public d0 f46880e;
    public c0 f46881f;
    public long h = -9223372036854775807L;

    public x(f0 f0Var, y2.d dVar, long j3) {
        this.f46877a = f0Var;
        this.f46879c = dVar;
        this.f46878b = j3;
    }

    @Override
    public final void a(d0 d0Var) {
        c0 c0Var = this.f46881f;
        String str = e2.d0.f8765a;
        c0Var.a(this);
    }

    @Override
    public final void b(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.f46881f;
        String str = e2.d0.f8765a;
        c0Var.b(this);
    }

    @Override
    public final boolean c() {
        d0 d0Var = this.f46880e;
        if (d0Var != null && d0Var.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final long d() {
        d0 d0Var = this.f46880e;
        String str = e2.d0.f8765a;
        return d0Var.d();
    }

    public final void e(f0 f0Var) {
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            j3 = this.f46878b;
        }
        a aVar = this.d;
        aVar.getClass();
        d0 c10 = aVar.c(f0Var, this.f46879c, j3);
        this.f46880e = c10;
        if (this.f46881f != null) {
            c10.n(this, j3);
        }
    }

    @Override
    public final void j() {
        d0 d0Var = this.f46880e;
        if (d0Var != null) {
            d0Var.j();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override
    public final long k(long j3) {
        d0 d0Var = this.f46880e;
        String str = e2.d0.f8765a;
        return d0Var.k(j3);
    }

    @Override
    public final void l(long j3) {
        d0 d0Var = this.f46880e;
        String str = e2.d0.f8765a;
        d0Var.l(j3);
    }

    @Override
    public final void n(c0 c0Var, long j3) {
        this.f46881f = c0Var;
        d0 d0Var = this.f46880e;
        if (d0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.f46878b;
            }
            d0Var.n(this, j10);
        }
    }

    @Override
    public final long o() {
        d0 d0Var = this.f46880e;
        String str = e2.d0.f8765a;
        return d0Var.o();
    }

    @Override
    public final boolean p(i2.r0 r0Var) {
        d0 d0Var = this.f46880e;
        if (d0Var != null && d0Var.p(r0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final long q(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        long j10;
        long j11 = this.h;
        if (j11 != -9223372036854775807L && j3 == this.f46878b) {
            j10 = j11;
        } else {
            j10 = j3;
        }
        this.h = -9223372036854775807L;
        d0 d0Var = this.f46880e;
        String str = e2.d0.f8765a;
        return d0Var.q(rVarArr, zArr, b1VarArr, zArr2, j10);
    }

    @Override
    public final o1 r() {
        d0 d0Var = this.f46880e;
        String str = e2.d0.f8765a;
        return d0Var.r();
    }

    @Override
    public final long s() {
        d0 d0Var = this.f46880e;
        String str = e2.d0.f8765a;
        return d0Var.s();
    }

    @Override
    public final long t(long j3, i2.p1 p1Var) {
        d0 d0Var = this.f46880e;
        String str = e2.d0.f8765a;
        return d0Var.t(j3, p1Var);
    }

    @Override
    public final void u(long j3) {
        d0 d0Var = this.f46880e;
        String str = e2.d0.f8765a;
        d0Var.u(j3);
    }
}
