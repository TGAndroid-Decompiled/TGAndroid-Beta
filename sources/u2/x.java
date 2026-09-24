package u2;
public final class x implements d0, c0 {
    public final f0 f43798a;
    public final long f43799b;
    public final y2.d f43800c;
    public a d;
    public d0 e;
    public c0 f43801f;
    public long h = -9223372036854775807L;

    public x(f0 f0Var, y2.d dVar, long j3) {
        this.f43798a = f0Var;
        this.f43800c = dVar;
        this.f43799b = j3;
    }

    public final void a(f0 f0Var) {
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            j3 = this.f43799b;
        }
        a aVar = this.d;
        aVar.getClass();
        d0 c10 = aVar.c(f0Var, this.f43800c, j3);
        this.e = c10;
        if (this.f43801f != null) {
            c10.k(this, j3);
        }
    }

    @Override
    public final void b(d0 d0Var) {
        c0 c0Var = this.f43801f;
        String str = e2.d0.f7870a;
        c0Var.b(this);
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
        String str = e2.d0.f7870a;
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
        String str = e2.d0.f7870a;
        return d0Var.h(j3);
    }

    @Override
    public final void i(long j3) {
        d0 d0Var = this.e;
        String str = e2.d0.f7870a;
        d0Var.i(j3);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f43801f = c0Var;
        d0 d0Var = this.e;
        if (d0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.f43799b;
            }
            d0Var.k(this, j10);
        }
    }

    @Override
    public final long l() {
        d0 d0Var = this.e;
        String str = e2.d0.f7870a;
        return d0Var.l();
    }

    @Override
    public final void m(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.f43801f;
        String str = e2.d0.f7870a;
        c0Var.m(this);
    }

    @Override
    public final boolean p(i2.s0 s0Var) {
        d0 d0Var = this.e;
        if (d0Var != null && d0Var.p(s0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final long q(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        long j10;
        long j11 = this.h;
        if (j11 != -9223372036854775807L && j3 == this.f43799b) {
            j10 = j11;
        } else {
            j10 = j3;
        }
        this.h = -9223372036854775807L;
        d0 d0Var = this.e;
        String str = e2.d0.f7870a;
        return d0Var.q(rVarArr, zArr, b1VarArr, zArr2, j10);
    }

    @Override
    public final p1 r() {
        d0 d0Var = this.e;
        String str = e2.d0.f7870a;
        return d0Var.r();
    }

    @Override
    public final long s() {
        d0 d0Var = this.e;
        String str = e2.d0.f7870a;
        return d0Var.s();
    }

    @Override
    public final long t(long j3, i2.q1 q1Var) {
        d0 d0Var = this.e;
        String str = e2.d0.f7870a;
        return d0Var.t(j3, q1Var);
    }

    @Override
    public final void u(long j3) {
        d0 d0Var = this.e;
        String str = e2.d0.f7870a;
        d0Var.u(j3);
    }
}
