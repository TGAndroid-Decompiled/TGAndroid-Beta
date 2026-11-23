package x2;
public final class y implements e0, d0 {
    public final g0 f60408a;
    public final long f60409b;
    public final h6.m f60410c;
    public a d;
    public e0 f60411e;
    public d0 f60412f;
    public long h = -9223372036854775807L;

    public y(g0 g0Var, h6.m mVar, long j3) {
        this.f60408a = g0Var;
        this.f60410c = mVar;
        this.f60409b = j3;
    }

    @Override
    public final void V(e0 e0Var) {
        d0 d0Var = this.f60412f;
        String str = h2.l0.f13778a;
        d0Var.V(this);
    }

    public final void a(g0 g0Var) {
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            j3 = this.f60409b;
        }
        a aVar = this.d;
        aVar.getClass();
        e0 c10 = aVar.c(g0Var, this.f60410c, j3);
        this.f60411e = c10;
        if (this.f60412f != null) {
            c10.s(this, j3);
        }
    }

    @Override
    public final long c(a3.u[] uVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        long j10;
        long j11 = this.h;
        if (j11 != -9223372036854775807L && j3 == this.f60409b) {
            j10 = j11;
        } else {
            j10 = j3;
        }
        this.h = -9223372036854775807L;
        e0 e0Var = this.f60411e;
        String str = h2.l0.f13778a;
        return e0Var.c(uVarArr, zArr, d1VarArr, zArr2, j10);
    }

    @Override
    public final boolean d(l2.t0 t0Var) {
        e0 e0Var = this.f60411e;
        if (e0Var != null && e0Var.d(t0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final long f() {
        e0 e0Var = this.f60411e;
        String str = h2.l0.f13778a;
        return e0Var.f();
    }

    @Override
    public final boolean g() {
        e0 e0Var = this.f60411e;
        if (e0Var != null && e0Var.g()) {
            return true;
        }
        return false;
    }

    @Override
    public final long i(long j3, l2.q1 q1Var) {
        e0 e0Var = this.f60411e;
        String str = h2.l0.f13778a;
        return e0Var.i(j3, q1Var);
    }

    @Override
    public final void i2(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f60412f;
        String str = h2.l0.f13778a;
        d0Var.i2(this);
    }

    @Override
    public final void j() {
        e0 e0Var = this.f60411e;
        if (e0Var != null) {
            e0Var.j();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override
    public final long l(long j3) {
        e0 e0Var = this.f60411e;
        String str = h2.l0.f13778a;
        return e0Var.l(j3);
    }

    @Override
    public final void n(long j3) {
        e0 e0Var = this.f60411e;
        String str = h2.l0.f13778a;
        e0Var.n(j3);
    }

    @Override
    public final long p() {
        e0 e0Var = this.f60411e;
        String str = h2.l0.f13778a;
        return e0Var.p();
    }

    @Override
    public final r1 q() {
        e0 e0Var = this.f60411e;
        String str = h2.l0.f13778a;
        return e0Var.q();
    }

    @Override
    public final long r() {
        e0 e0Var = this.f60411e;
        String str = h2.l0.f13778a;
        return e0Var.r();
    }

    @Override
    public final void s(d0 d0Var, long j3) {
        this.f60412f = d0Var;
        e0 e0Var = this.f60411e;
        if (e0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.f60409b;
            }
            e0Var.s(this, j10);
        }
    }

    @Override
    public final void u(long j3) {
        e0 e0Var = this.f60411e;
        String str = h2.l0.f13778a;
        e0Var.u(j3);
    }
}
