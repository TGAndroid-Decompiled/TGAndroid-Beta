package x2;

import l2.t1;
public final class x implements d0, c0 {
    public final f0 f58524a;
    public final long f58525b;
    public final h6.m f58526c;
    public a d;
    public d0 f58527e;
    public c0 f58528f;
    public long h = -9223372036854775807L;

    public x(f0 f0Var, h6.m mVar, long j3) {
        this.f58524a = f0Var;
        this.f58526c = mVar;
        this.f58525b = j3;
    }

    @Override
    public final void a(d0 d0Var) {
        c0 c0Var = this.f58528f;
        String str = h2.m0.f14114a;
        c0Var.a(this);
    }

    @Override
    public final long b(a3.u[] uVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        long j10;
        long j11 = this.h;
        if (j11 != -9223372036854775807L && j3 == this.f58525b) {
            j10 = j11;
        } else {
            j10 = j3;
        }
        this.h = -9223372036854775807L;
        d0 d0Var = this.f58527e;
        String str = h2.m0.f14114a;
        return d0Var.b(uVarArr, zArr, b1VarArr, zArr2, j10);
    }

    @Override
    public final boolean c(l2.v0 v0Var) {
        d0 d0Var = this.f58527e;
        if (d0Var != null && d0Var.c(v0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.f58528f;
        String str = h2.m0.f14114a;
        c0Var.d(this);
    }

    @Override
    public final long e() {
        d0 d0Var = this.f58527e;
        String str = h2.m0.f14114a;
        return d0Var.e();
    }

    public final void f(f0 f0Var) {
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            j3 = this.f58525b;
        }
        a aVar = this.d;
        aVar.getClass();
        d0 c10 = aVar.c(f0Var, this.f58526c, j3);
        this.f58527e = c10;
        if (this.f58528f != null) {
            c10.q(this, j3);
        }
    }

    @Override
    public final boolean g() {
        d0 d0Var = this.f58527e;
        if (d0Var != null && d0Var.g()) {
            return true;
        }
        return false;
    }

    @Override
    public final long h(long j3, t1 t1Var) {
        d0 d0Var = this.f58527e;
        String str = h2.m0.f14114a;
        return d0Var.h(j3, t1Var);
    }

    @Override
    public final void i() {
        d0 d0Var = this.f58527e;
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
        d0 d0Var = this.f58527e;
        String str = h2.m0.f14114a;
        return d0Var.j(j3);
    }

    @Override
    public final void k(long j3) {
        d0 d0Var = this.f58527e;
        String str = h2.m0.f14114a;
        d0Var.k(j3);
    }

    @Override
    public final long n() {
        d0 d0Var = this.f58527e;
        String str = h2.m0.f14114a;
        return d0Var.n();
    }

    @Override
    public final p1 o() {
        d0 d0Var = this.f58527e;
        String str = h2.m0.f14114a;
        return d0Var.o();
    }

    @Override
    public final long p() {
        d0 d0Var = this.f58527e;
        String str = h2.m0.f14114a;
        return d0Var.p();
    }

    @Override
    public final void q(c0 c0Var, long j3) {
        this.f58528f = c0Var;
        d0 d0Var = this.f58527e;
        if (d0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.f58525b;
            }
            d0Var.q(this, j10);
        }
    }

    @Override
    public final void r(long j3) {
        d0 d0Var = this.f58527e;
        String str = h2.m0.f14114a;
        d0Var.r(j3);
    }
}
