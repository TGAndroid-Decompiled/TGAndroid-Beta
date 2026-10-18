package u2;
public final class q1 implements e0, d0 {
    public final e0 f47413a;
    public final long f47414b;
    public d0 f47415c;

    public q1(e0 e0Var, long j10) {
        this.f47413a = e0Var;
        this.f47414b = j10;
    }

    @Override
    public final boolean c() {
        return this.f47413a.c();
    }

    @Override
    public final long d() {
        long d = this.f47413a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.f47414b;
    }

    @Override
    public final void g() {
        this.f47413a.g();
    }

    @Override
    public final void h(e0 e0Var) {
        d0 d0Var = this.f47415c;
        d0Var.getClass();
        d0Var.h(this);
    }

    @Override
    public final long i(long j10) {
        long j11 = this.f47414b;
        return this.f47413a.i(j10 - j11) + j11;
    }

    @Override
    public final void k(long j10) {
        this.f47413a.k(j10 - this.f47414b);
    }

    @Override
    public final void m(d0 d0Var, long j10) {
        this.f47415c = d0Var;
        this.f47413a.m(this, j10 - this.f47414b);
    }

    @Override
    public final long o() {
        long o10 = this.f47413a.o();
        if (o10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o10 + this.f47414b;
    }

    @Override
    public final boolean p(i2.u0 u0Var) {
        ?? obj = new Object();
        long j10 = u0Var.f12593a;
        obj.f12589b = u0Var.f12594b;
        obj.f12590c = u0Var.f12595c;
        obj.f12588a = j10 - this.f47414b;
        return this.f47413a.p(new i2.u0(obj));
    }

    @Override
    public final long q(x2.p[] pVarArr, boolean[] zArr, e1[] e1VarArr, boolean[] zArr2, long j10) {
        e1[] e1VarArr2 = new e1[e1VarArr.length];
        int i10 = 0;
        while (true) {
            e1 e1Var = null;
            if (i10 >= e1VarArr.length) {
                break;
            }
            p1 p1Var = (p1) e1VarArr[i10];
            if (p1Var != null) {
                e1Var = p1Var.f47402a;
            }
            e1VarArr2[i10] = e1Var;
            i10++;
        }
        e0 e0Var = this.f47413a;
        long j11 = this.f47414b;
        long q6 = e0Var.q(pVarArr, zArr, e1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < e1VarArr.length; i11++) {
            e1 e1Var2 = e1VarArr2[i11];
            if (e1Var2 == null) {
                e1VarArr[i11] = null;
            } else {
                e1 e1Var3 = e1VarArr[i11];
                if (e1Var3 == null || ((p1) e1Var3).f47402a != e1Var2) {
                    e1VarArr[i11] = new p1(e1Var2, j11);
                }
            }
        }
        return q6 + j11;
    }

    @Override
    public final s1 r() {
        return this.f47413a.r();
    }

    @Override
    public final long s() {
        long s10 = this.f47413a.s();
        if (s10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s10 + this.f47414b;
    }

    @Override
    public final long t(long j10, i2.r1 r1Var) {
        long j11 = this.f47414b;
        return this.f47413a.t(j10 - j11, r1Var) + j11;
    }

    @Override
    public final void u(long j10) {
        this.f47413a.u(j10 - this.f47414b);
    }

    @Override
    public final void v(g1 g1Var) {
        e0 e0Var = (e0) g1Var;
        d0 d0Var = this.f47415c;
        d0Var.getClass();
        d0Var.v(this);
    }
}
