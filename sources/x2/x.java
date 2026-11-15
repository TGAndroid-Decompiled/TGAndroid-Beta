package x2;
public final class x implements d0, c0 {
    public final f0 f59707a;
    public final long f59708b;
    public final h6.m f59709c;
    public a d;
    public d0 f59710e;
    public c0 f59711f;
    public long h = -9223372036854775807L;

    public x(f0 f0Var, h6.m mVar, long j3) {
        this.f59707a = f0Var;
        this.f59709c = mVar;
        this.f59708b = j3;
    }

    public final void a(f0 f0Var) {
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            j3 = this.f59708b;
        }
        a aVar = this.d;
        aVar.getClass();
        d0 c10 = aVar.c(f0Var, this.f59709c, j3);
        this.f59710e = c10;
        if (this.f59711f != null) {
            c10.t(this, j3);
        }
    }

    @Override
    public final long b(a3.u[] uVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        long j10;
        long j11 = this.h;
        if (j11 != -9223372036854775807L && j3 == this.f59708b) {
            j10 = j11;
        } else {
            j10 = j3;
        }
        this.h = -9223372036854775807L;
        d0 d0Var = this.f59710e;
        String str = h2.l0.f13471a;
        return d0Var.b(uVarArr, zArr, b1VarArr, zArr2, j10);
    }

    @Override
    public final boolean c(l2.s0 s0Var) {
        d0 d0Var = this.f59710e;
        if (d0Var != null && d0Var.c(s0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final long e() {
        d0 d0Var = this.f59710e;
        String str = h2.l0.f13471a;
        return d0Var.e();
    }

    @Override
    public final void f0(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.f59711f;
        String str = h2.l0.f13471a;
        c0Var.f0(this);
    }

    @Override
    public final boolean g() {
        d0 d0Var = this.f59710e;
        if (d0Var != null && d0Var.g()) {
            return true;
        }
        return false;
    }

    @Override
    public final long h(long j3, l2.p1 p1Var) {
        d0 d0Var = this.f59710e;
        String str = h2.l0.f13471a;
        return d0Var.h(j3, p1Var);
    }

    @Override
    public final void i() {
        d0 d0Var = this.f59710e;
        if (d0Var != null) {
            d0Var.i();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override
    public final long j(long j3) {
        d0 d0Var = this.f59710e;
        String str = h2.l0.f13471a;
        return d0Var.j(j3);
    }

    @Override
    public final void k(d0 d0Var) {
        c0 c0Var = this.f59711f;
        String str = h2.l0.f13471a;
        c0Var.k(this);
    }

    @Override
    public final void l(long j3) {
        d0 d0Var = this.f59710e;
        String str = h2.l0.f13471a;
        d0Var.l(j3);
    }

    @Override
    public final long o() {
        d0 d0Var = this.f59710e;
        String str = h2.l0.f13471a;
        return d0Var.o();
    }

    @Override
    public final q1 p() {
        d0 d0Var = this.f59710e;
        String str = h2.l0.f13471a;
        return d0Var.p();
    }

    @Override
    public final long s() {
        d0 d0Var = this.f59710e;
        String str = h2.l0.f13471a;
        return d0Var.s();
    }

    @Override
    public final void t(c0 c0Var, long j3) {
        this.f59711f = c0Var;
        d0 d0Var = this.f59710e;
        if (d0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.f59708b;
            }
            d0Var.t(this, j10);
        }
    }

    @Override
    public final void u(long j3) {
        d0 d0Var = this.f59710e;
        String str = h2.l0.f13471a;
        d0Var.u(j3);
    }
}
