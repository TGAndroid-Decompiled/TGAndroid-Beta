package u2;

import i2.q1;
public final class x implements d0, c0 {
    public final f0 f48854a;
    public final long f48855b;
    public final y2.d f48856c;
    public a d;
    public d0 f48857e;
    public c0 f48858f;
    public long h = -9223372036854775807L;

    public x(f0 f0Var, y2.d dVar, long j3) {
        this.f48854a = f0Var;
        this.f48856c = dVar;
        this.f48855b = j3;
    }

    @Override
    public final void D(c1 c1Var) {
        d0 d0Var = (d0) c1Var;
        c0 c0Var = this.f48858f;
        String str = e2.d0.f8531a;
        c0Var.D(this);
    }

    public final void a(f0 f0Var) {
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            j3 = this.f48855b;
        }
        a aVar = this.d;
        aVar.getClass();
        d0 c10 = aVar.c(f0Var, this.f48856c, j3);
        this.f48857e = c10;
        if (this.f48858f != null) {
            c10.k(this, j3);
        }
    }

    @Override
    public final boolean c() {
        d0 d0Var = this.f48857e;
        if (d0Var != null && d0Var.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final long d() {
        d0 d0Var = this.f48857e;
        String str = e2.d0.f8531a;
        return d0Var.d();
    }

    @Override
    public final void g() {
        d0 d0Var = this.f48857e;
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
        d0 d0Var = this.f48857e;
        String str = e2.d0.f8531a;
        return d0Var.h(j3);
    }

    @Override
    public final void i(long j3) {
        d0 d0Var = this.f48857e;
        String str = e2.d0.f8531a;
        d0Var.i(j3);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f48858f = c0Var;
        d0 d0Var = this.f48857e;
        if (d0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.f48855b;
            }
            d0Var.k(this, j10);
        }
    }

    @Override
    public final long l() {
        d0 d0Var = this.f48857e;
        String str = e2.d0.f8531a;
        return d0Var.l();
    }

    @Override
    public final void m(d0 d0Var) {
        c0 c0Var = this.f48858f;
        String str = e2.d0.f8531a;
        c0Var.m(this);
    }

    @Override
    public final boolean n(i2.s0 s0Var) {
        d0 d0Var = this.f48857e;
        if (d0Var != null && d0Var.n(s0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final long o(x2.r[] rVarArr, boolean[] zArr, a1[] a1VarArr, boolean[] zArr2, long j3) {
        long j10;
        long j11 = this.h;
        if (j11 != -9223372036854775807L && j3 == this.f48855b) {
            j10 = j11;
        } else {
            j10 = j3;
        }
        this.h = -9223372036854775807L;
        d0 d0Var = this.f48857e;
        String str = e2.d0.f8531a;
        return d0Var.o(rVarArr, zArr, a1VarArr, zArr2, j10);
    }

    @Override
    public final n1 p() {
        d0 d0Var = this.f48857e;
        String str = e2.d0.f8531a;
        return d0Var.p();
    }

    @Override
    public final long q() {
        d0 d0Var = this.f48857e;
        String str = e2.d0.f8531a;
        return d0Var.q();
    }

    @Override
    public final long r(long j3, q1 q1Var) {
        d0 d0Var = this.f48857e;
        String str = e2.d0.f8531a;
        return d0Var.r(j3, q1Var);
    }

    @Override
    public final void s(long j3) {
        d0 d0Var = this.f48857e;
        String str = e2.d0.f8531a;
        d0Var.s(j3);
    }
}
