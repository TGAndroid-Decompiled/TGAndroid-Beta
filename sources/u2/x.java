package u2;
public final class x implements d0, c0 {
    public final f0 f43839a;
    public final long f43840b;
    public final y2.d f43841c;
    public a d;
    public d0 e;
    public c0 f43842f;
    public long h = -9223372036854775807L;

    public x(f0 f0Var, y2.d dVar, long j3) {
        this.f43839a = f0Var;
        this.f43841c = dVar;
        this.f43840b = j3;
    }

    @Override
    public final void a(d0 d0Var) {
        c0 c0Var = this.f43842f;
        String str = e2.d0.f7887a;
        c0Var.a(this);
    }

    public final void b(f0 f0Var) {
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            j3 = this.f43840b;
        }
        a aVar = this.d;
        aVar.getClass();
        d0 c10 = aVar.c(f0Var, this.f43841c, j3);
        this.e = c10;
        if (this.f43842f != null) {
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
        String str = e2.d0.f7887a;
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
        String str = e2.d0.f7887a;
        return d0Var.h(j3);
    }

    @Override
    public final void i(long j3) {
        d0 d0Var = this.e;
        String str = e2.d0.f7887a;
        d0Var.i(j3);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f43842f = c0Var;
        d0 d0Var = this.e;
        if (d0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.f43840b;
            }
            d0Var.k(this, j10);
        }
    }

    @Override
    public final void l(e1 e1Var) {
        d0 d0Var = (d0) e1Var;
        c0 c0Var = this.f43842f;
        String str = e2.d0.f7887a;
        c0Var.l(this);
    }

    @Override
    public final long m() {
        d0 d0Var = this.e;
        String str = e2.d0.f7887a;
        return d0Var.m();
    }

    @Override
    public final boolean q(i2.r0 r0Var) {
        d0 d0Var = this.e;
        if (d0Var != null && d0Var.q(r0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final long r(x2.s[] sVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        long j10;
        long j11 = this.h;
        if (j11 != -9223372036854775807L && j3 == this.f43840b) {
            j10 = j11;
        } else {
            j10 = j3;
        }
        this.h = -9223372036854775807L;
        d0 d0Var = this.e;
        String str = e2.d0.f7887a;
        return d0Var.r(sVarArr, zArr, c1VarArr, zArr2, j10);
    }

    @Override
    public final p1 s() {
        d0 d0Var = this.e;
        String str = e2.d0.f7887a;
        return d0Var.s();
    }

    @Override
    public final long t() {
        d0 d0Var = this.e;
        String str = e2.d0.f7887a;
        return d0Var.t();
    }

    @Override
    public final long u(long j3, i2.p1 p1Var) {
        d0 d0Var = this.e;
        String str = e2.d0.f7887a;
        return d0Var.u(j3, p1Var);
    }

    @Override
    public final void v(long j3) {
        d0 d0Var = this.e;
        String str = e2.d0.f7887a;
        d0Var.v(j3);
    }
}
