package u2;
public final class o1 implements d0, c0 {
    public final d0 f47446a;
    public final long f47447b;
    public c0 f47448c;

    public o1(d0 d0Var, long j10) {
        this.f47446a = d0Var;
        this.f47447b = j10;
    }

    @Override
    public final boolean c() {
        return this.f47446a.c();
    }

    @Override
    public final long d() {
        long d = this.f47446a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.f47447b;
    }

    @Override
    public final void g() {
        this.f47446a.g();
    }

    @Override
    public final void h(d0 d0Var) {
        c0 c0Var = this.f47448c;
        c0Var.getClass();
        c0Var.h(this);
    }

    @Override
    public final long i(long j10) {
        long j11 = this.f47447b;
        return this.f47446a.i(j10 - j11) + j11;
    }

    @Override
    public final void k(long j10) {
        this.f47446a.k(j10 - this.f47447b);
    }

    @Override
    public final void m(c0 c0Var, long j10) {
        this.f47448c = c0Var;
        this.f47446a.m(this, j10 - this.f47447b);
    }

    @Override
    public final long o() {
        long o10 = this.f47446a.o();
        if (o10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o10 + this.f47447b;
    }

    @Override
    public final boolean p(i2.u0 u0Var) {
        ?? obj = new Object();
        long j10 = u0Var.f12595a;
        obj.f12591b = u0Var.f12596b;
        obj.f12592c = u0Var.f12597c;
        obj.f12590a = j10 - this.f47447b;
        return this.f47446a.p(new i2.u0(obj));
    }

    @Override
    public final long q(x2.p[] pVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        c1[] c1VarArr2 = new c1[c1VarArr.length];
        int i10 = 0;
        while (true) {
            c1 c1Var = null;
            if (i10 >= c1VarArr.length) {
                break;
            }
            n1 n1Var = (n1) c1VarArr[i10];
            if (n1Var != null) {
                c1Var = n1Var.f47439a;
            }
            c1VarArr2[i10] = c1Var;
            i10++;
        }
        d0 d0Var = this.f47446a;
        long j11 = this.f47447b;
        long q6 = d0Var.q(pVarArr, zArr, c1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < c1VarArr.length; i11++) {
            c1 c1Var2 = c1VarArr2[i11];
            if (c1Var2 == null) {
                c1VarArr[i11] = null;
            } else {
                c1 c1Var3 = c1VarArr[i11];
                if (c1Var3 == null || ((n1) c1Var3).f47439a != c1Var2) {
                    c1VarArr[i11] = new n1(c1Var2, j11);
                }
            }
        }
        return q6 + j11;
    }

    @Override
    public final q1 r() {
        return this.f47446a.r();
    }

    @Override
    public final long s() {
        long s10 = this.f47446a.s();
        if (s10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s10 + this.f47447b;
    }

    @Override
    public final long t(long j10, i2.r1 r1Var) {
        long j11 = this.f47447b;
        return this.f47446a.t(j10 - j11, r1Var) + j11;
    }

    @Override
    public final void u(long j10) {
        this.f47446a.u(j10 - this.f47447b);
    }

    @Override
    public final void v(e1 e1Var) {
        d0 d0Var = (d0) e1Var;
        c0 c0Var = this.f47448c;
        c0Var.getClass();
        c0Var.v(this);
    }
}
