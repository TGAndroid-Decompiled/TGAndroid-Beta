package u2;
public final class x implements d0, c0 {
    public final f0 f47519a;
    public final long f47520b;
    public final androidx.biometric.e f47521c;
    public a d;
    public d0 e;
    public c0 f47522f;
    public long h = -9223372036854775807L;

    public x(f0 f0Var, androidx.biometric.e eVar, long j10) {
        this.f47519a = f0Var;
        this.f47521c = eVar;
        this.f47520b = j10;
    }

    public final void a(f0 f0Var) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.f47520b;
        }
        a aVar = this.d;
        aVar.getClass();
        d0 c10 = aVar.c(f0Var, this.f47521c, j10);
        this.e = c10;
        if (this.f47522f != null) {
            c10.m(this, j10);
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
        String str = e2.m0.f8255a;
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
    public final void h(d0 d0Var) {
        c0 c0Var = this.f47522f;
        String str = e2.m0.f8255a;
        c0Var.h(this);
    }

    @Override
    public final long i(long j10) {
        d0 d0Var = this.e;
        String str = e2.m0.f8255a;
        return d0Var.i(j10);
    }

    @Override
    public final void k(long j10) {
        d0 d0Var = this.e;
        String str = e2.m0.f8255a;
        d0Var.k(j10);
    }

    @Override
    public final void m(c0 c0Var, long j10) {
        this.f47522f = c0Var;
        d0 d0Var = this.e;
        if (d0Var != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.f47520b;
            }
            d0Var.m(this, j11);
        }
    }

    @Override
    public final long o() {
        d0 d0Var = this.e;
        String str = e2.m0.f8255a;
        return d0Var.o();
    }

    @Override
    public final boolean p(i2.u0 u0Var) {
        d0 d0Var = this.e;
        if (d0Var != null && d0Var.p(u0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final long q(x2.p[] pVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.h;
        if (j12 != -9223372036854775807L && j10 == this.f47520b) {
            j11 = j12;
        } else {
            j11 = j10;
        }
        this.h = -9223372036854775807L;
        d0 d0Var = this.e;
        String str = e2.m0.f8255a;
        return d0Var.q(pVarArr, zArr, c1VarArr, zArr2, j11);
    }

    @Override
    public final q1 r() {
        d0 d0Var = this.e;
        String str = e2.m0.f8255a;
        return d0Var.r();
    }

    @Override
    public final long s() {
        d0 d0Var = this.e;
        String str = e2.m0.f8255a;
        return d0Var.s();
    }

    @Override
    public final long t(long j10, i2.r1 r1Var) {
        d0 d0Var = this.e;
        String str = e2.m0.f8255a;
        return d0Var.t(j10, r1Var);
    }

    @Override
    public final void u(long j10) {
        d0 d0Var = this.e;
        String str = e2.m0.f8255a;
        d0Var.u(j10);
    }

    @Override
    public final void v(e1 e1Var) {
        d0 d0Var = (d0) e1Var;
        c0 c0Var = this.f47522f;
        String str = e2.m0.f8255a;
        c0Var.v(this);
    }
}
