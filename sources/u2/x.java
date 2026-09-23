package u2;

import i2.q1;
public final class x implements d0, c0 {
    public final f0 f43456a;
    public final long f43457b;
    public final y2.d f43458c;
    public a d;
    public d0 e;
    public c0 f43459f;
    public long h = -9223372036854775807L;

    public x(f0 f0Var, y2.d dVar, long j3) {
        this.f43456a = f0Var;
        this.f43458c = dVar;
        this.f43457b = j3;
    }

    @Override
    public final void a(d0 d0Var) {
        c0 c0Var = this.f43459f;
        String str = e2.d0.f7871a;
        c0Var.a(this);
    }

    public final void b(f0 f0Var) {
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            j3 = this.f43457b;
        }
        a aVar = this.d;
        aVar.getClass();
        d0 c10 = aVar.c(f0Var, this.f43458c, j3);
        this.e = c10;
        if (this.f43459f != null) {
            c10.k(this, j3);
        }
    }

    @Override
    public final boolean c() {
        d0 d0Var = this.e;
        if (d0Var != null && d0Var.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final long d() {
        d0 d0Var = this.e;
        String str = e2.d0.f7871a;
        return d0Var.d();
    }

    @Override
    public final void g() {
        d0 d0Var = this.e;
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
        d0 d0Var = this.e;
        String str = e2.d0.f7871a;
        return d0Var.h(j3);
    }

    @Override
    public final void i(long j3) {
        d0 d0Var = this.e;
        String str = e2.d0.f7871a;
        d0Var.i(j3);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f43459f = c0Var;
        d0 d0Var = this.e;
        if (d0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.f43457b;
            }
            d0Var.k(this, j10);
        }
    }

    @Override
    public final long l() {
        d0 d0Var = this.e;
        String str = e2.d0.f7871a;
        return d0Var.l();
    }

    @Override
    public final boolean m(i2.s0 s0Var) {
        d0 d0Var = this.e;
        if (d0Var != null && d0Var.m(s0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final long p(x2.r[] rVarArr, boolean[] zArr, a1[] a1VarArr, boolean[] zArr2, long j3) {
        long j10;
        long j11 = this.h;
        if (j11 != -9223372036854775807L && j3 == this.f43457b) {
            j10 = j11;
        } else {
            j10 = j3;
        }
        this.h = -9223372036854775807L;
        d0 d0Var = this.e;
        String str = e2.d0.f7871a;
        return d0Var.p(rVarArr, zArr, a1VarArr, zArr2, j10);
    }

    @Override
    public final n1 r() {
        d0 d0Var = this.e;
        String str = e2.d0.f7871a;
        return d0Var.r();
    }

    @Override
    public final long s() {
        d0 d0Var = this.e;
        String str = e2.d0.f7871a;
        return d0Var.s();
    }

    @Override
    public final long t(long j3, q1 q1Var) {
        d0 d0Var = this.e;
        String str = e2.d0.f7871a;
        return d0Var.t(j3, q1Var);
    }

    @Override
    public final void u(long j3) {
        d0 d0Var = this.e;
        String str = e2.d0.f7871a;
        d0Var.u(j3);
    }

    @Override
    public final void v(c1 c1Var) {
        d0 d0Var = (d0) c1Var;
        c0 c0Var = this.f43459f;
        String str = e2.d0.f7871a;
        c0Var.v(this);
    }
}
