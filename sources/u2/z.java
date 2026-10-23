package u2;
public final class z implements f0, e0 {
    public final h0 f47944a;
    public final long f47945b;
    public final androidx.biometric.e f47946c;
    public a d;
    public f0 e;
    public e0 f47947f;
    public long h = -9223372036854775807L;

    public z(h0 h0Var, androidx.biometric.e eVar, long j10) {
        this.f47944a = h0Var;
        this.f47946c = eVar;
        this.f47945b = j10;
    }

    @Override
    public final void a(f0 f0Var) {
        e0 e0Var = this.f47947f;
        String str = e2.m0.f8259a;
        e0Var.a(this);
    }

    @Override
    public final void b(h1 h1Var) {
        f0 f0Var = (f0) h1Var;
        e0 e0Var = this.f47947f;
        String str = e2.m0.f8259a;
        e0Var.b(this);
    }

    @Override
    public final boolean c() {
        f0 f0Var = this.e;
        if (f0Var != null && f0Var.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final long d() {
        f0 f0Var = this.e;
        String str = e2.m0.f8259a;
        return f0Var.d();
    }

    public final void e(h0 h0Var) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.f47945b;
        }
        a aVar = this.d;
        aVar.getClass();
        f0 c10 = aVar.c(h0Var, this.f47946c, j10);
        this.e = c10;
        if (this.f47947f != null) {
            c10.n(this, j10);
        }
    }

    @Override
    public final void h() {
        f0 f0Var = this.e;
        if (f0Var != null) {
            f0Var.h();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override
    public final long i(long j10) {
        f0 f0Var = this.e;
        String str = e2.m0.f8259a;
        return f0Var.i(j10);
    }

    @Override
    public final void l(long j10) {
        f0 f0Var = this.e;
        String str = e2.m0.f8259a;
        f0Var.l(j10);
    }

    @Override
    public final void n(e0 e0Var, long j10) {
        this.f47947f = e0Var;
        f0 f0Var = this.e;
        if (f0Var != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.f47945b;
            }
            f0Var.n(this, j11);
        }
    }

    @Override
    public final long o() {
        f0 f0Var = this.e;
        String str = e2.m0.f8259a;
        return f0Var.o();
    }

    @Override
    public final boolean p(i2.u0 u0Var) {
        f0 f0Var = this.e;
        if (f0Var != null && f0Var.p(u0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final long q(x2.p[] pVarArr, boolean[] zArr, f1[] f1VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.h;
        if (j12 != -9223372036854775807L && j10 == this.f47945b) {
            j11 = j12;
        } else {
            j11 = j10;
        }
        this.h = -9223372036854775807L;
        f0 f0Var = this.e;
        String str = e2.m0.f8259a;
        return f0Var.q(pVarArr, zArr, f1VarArr, zArr2, j11);
    }

    @Override
    public final t1 r() {
        f0 f0Var = this.e;
        String str = e2.m0.f8259a;
        return f0Var.r();
    }

    @Override
    public final long s() {
        f0 f0Var = this.e;
        String str = e2.m0.f8259a;
        return f0Var.s();
    }

    @Override
    public final long t(long j10, i2.s1 s1Var) {
        f0 f0Var = this.e;
        String str = e2.m0.f8259a;
        return f0Var.t(j10, s1Var);
    }

    @Override
    public final void u(long j10) {
        f0 f0Var = this.e;
        String str = e2.m0.f8259a;
        f0Var.u(j10);
    }
}
