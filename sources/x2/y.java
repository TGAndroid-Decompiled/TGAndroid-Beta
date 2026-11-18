package x2;
public final class y implements e0, d0 {
    public final g0 f60280a;
    public final long f60281b;
    public final h6.m f60282c;
    public a d;
    public e0 f60283e;
    public d0 f60284f;
    public long h = -9223372036854775807L;

    public y(g0 g0Var, h6.m mVar, long j3) {
        this.f60280a = g0Var;
        this.f60282c = mVar;
        this.f60281b = j3;
    }

    public final void a(g0 g0Var) {
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            j3 = this.f60281b;
        }
        a aVar = this.d;
        aVar.getClass();
        e0 c10 = aVar.c(g0Var, this.f60282c, j3);
        this.f60283e = c10;
        if (this.f60284f != null) {
            c10.t(this, j3);
        }
    }

    @Override
    public final long b(a3.u[] uVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        long j10;
        long j11 = this.h;
        if (j11 != -9223372036854775807L && j3 == this.f60281b) {
            j10 = j11;
        } else {
            j10 = j3;
        }
        this.h = -9223372036854775807L;
        e0 e0Var = this.f60283e;
        String str = h2.l0.f13783a;
        return e0Var.b(uVarArr, zArr, d1VarArr, zArr2, j10);
    }

    @Override
    public final boolean c(l2.s0 s0Var) {
        e0 e0Var = this.f60283e;
        if (e0Var != null && e0Var.c(s0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final void c0(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f60284f;
        String str = h2.l0.f13783a;
        d0Var.c0(this);
    }

    @Override
    public final long e() {
        e0 e0Var = this.f60283e;
        String str = h2.l0.f13783a;
        return e0Var.e();
    }

    @Override
    public final long f(long j3, l2.p1 p1Var) {
        e0 e0Var = this.f60283e;
        String str = h2.l0.f13783a;
        return e0Var.f(j3, p1Var);
    }

    @Override
    public final boolean g() {
        e0 e0Var = this.f60283e;
        if (e0Var != null && e0Var.g()) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        e0 e0Var = this.f60283e;
        if (e0Var != null) {
            e0Var.i();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override
    public final long k(long j3) {
        e0 e0Var = this.f60283e;
        String str = h2.l0.f13783a;
        return e0Var.k(j3);
    }

    @Override
    public final void m(e0 e0Var) {
        d0 d0Var = this.f60284f;
        String str = h2.l0.f13783a;
        d0Var.m(this);
    }

    @Override
    public final void n(long j3) {
        e0 e0Var = this.f60283e;
        String str = h2.l0.f13783a;
        e0Var.n(j3);
    }

    @Override
    public final long o() {
        e0 e0Var = this.f60283e;
        String str = h2.l0.f13783a;
        return e0Var.o();
    }

    @Override
    public final r1 q() {
        e0 e0Var = this.f60283e;
        String str = h2.l0.f13783a;
        return e0Var.q();
    }

    @Override
    public final long r() {
        e0 e0Var = this.f60283e;
        String str = h2.l0.f13783a;
        return e0Var.r();
    }

    @Override
    public final void t(d0 d0Var, long j3) {
        this.f60284f = d0Var;
        e0 e0Var = this.f60283e;
        if (e0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.f60281b;
            }
            e0Var.t(this, j10);
        }
    }

    @Override
    public final void u(long j3) {
        e0 e0Var = this.f60283e;
        String str = h2.l0.f13783a;
        e0Var.u(j3);
    }
}
