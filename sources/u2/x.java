package u2;

import i2.q1;
public final class x implements d0, c0 {
    public final f0 f43857a;
    public final long f43858b;
    public final y2.d f43859c;
    public a d;
    public d0 e;
    public c0 f43860f;
    public long h = -9223372036854775807L;

    public x(f0 f0Var, y2.d dVar, long j3) {
        this.f43857a = f0Var;
        this.f43859c = dVar;
        this.f43858b = j3;
    }

    public final void a(f0 f0Var) {
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            j3 = this.f43858b;
        }
        a aVar = this.d;
        aVar.getClass();
        d0 c10 = aVar.c(f0Var, this.f43859c, j3);
        this.e = c10;
        if (this.f43860f != null) {
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
        String str = e2.d0.f7872a;
        return d0Var.d();
    }

    @Override
    public final void e(d0 d0Var) {
        c0 c0Var = this.f43860f;
        String str = e2.d0.f7872a;
        c0Var.e(this);
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
    public final void h(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.f43860f;
        String str = e2.d0.f7872a;
        c0Var.h(this);
    }

    @Override
    public final long i(long j3) {
        d0 d0Var = this.e;
        String str = e2.d0.f7872a;
        return d0Var.i(j3);
    }

    @Override
    public final void j(long j3) {
        d0 d0Var = this.e;
        String str = e2.d0.f7872a;
        d0Var.j(j3);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f43860f = c0Var;
        d0 d0Var = this.e;
        if (d0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.f43858b;
            }
            d0Var.k(this, j10);
        }
    }

    @Override
    public final long n() {
        d0 d0Var = this.e;
        String str = e2.d0.f7872a;
        return d0Var.n();
    }

    @Override
    public final boolean o(i2.s0 s0Var) {
        d0 d0Var = this.e;
        if (d0Var != null && d0Var.o(s0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final long p(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        long j10;
        long j11 = this.h;
        if (j11 != -9223372036854775807L && j3 == this.f43858b) {
            j10 = j11;
        } else {
            j10 = j3;
        }
        this.h = -9223372036854775807L;
        d0 d0Var = this.e;
        String str = e2.d0.f7872a;
        return d0Var.p(rVarArr, zArr, b1VarArr, zArr2, j10);
    }

    @Override
    public final o1 r() {
        d0 d0Var = this.e;
        String str = e2.d0.f7872a;
        return d0Var.r();
    }

    @Override
    public final long s() {
        d0 d0Var = this.e;
        String str = e2.d0.f7872a;
        return d0Var.s();
    }

    @Override
    public final long t(long j3, q1 q1Var) {
        d0 d0Var = this.e;
        String str = e2.d0.f7872a;
        return d0Var.t(j3, q1Var);
    }

    @Override
    public final void u(long j3) {
        d0 d0Var = this.e;
        String str = e2.d0.f7872a;
        d0Var.u(j3);
    }
}
