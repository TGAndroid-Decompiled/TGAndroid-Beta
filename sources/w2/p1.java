package w2;
public final class p1 implements e0, d0 {
    public final e0 f57190a;
    public final long f57191b;
    public d0 f57192c;

    public p1(e0 e0Var, long j10) {
        this.f57190a = e0Var;
        this.f57191b = j10;
    }

    @Override
    public final void b(e0 e0Var) {
        d0 d0Var = this.f57192c;
        d0Var.getClass();
        d0Var.b(this);
    }

    @Override
    public final boolean c(k2.v0 v0Var) {
        ?? obj = new Object();
        long j10 = v0Var.f16753a;
        obj.f16745b = v0Var.f16754b;
        obj.f16746c = v0Var.f16755c;
        obj.f16744a = j10 - this.f57191b;
        return this.f57190a.c(new k2.v0(obj));
    }

    @Override
    public final boolean d() {
        return this.f57190a.d();
    }

    @Override
    public final long e() {
        long e10 = this.f57190a.e();
        if (e10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return e10 + this.f57191b;
    }

    @Override
    public final void g() {
        this.f57190a.g();
    }

    @Override
    public final void i(d0 d0Var, long j10) {
        this.f57192c = d0Var;
        this.f57190a.i(this, j10 - this.f57191b);
    }

    @Override
    public final long j(long j10) {
        long j11 = this.f57191b;
        return this.f57190a.j(j10 - j11) + j11;
    }

    @Override
    public final void k(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f57192c;
        d0Var.getClass();
        d0Var.k(this);
    }

    @Override
    public final void l(long j10) {
        this.f57190a.l(j10 - this.f57191b);
    }

    @Override
    public final long n() {
        long n4 = this.f57190a.n();
        if (n4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return n4 + this.f57191b;
    }

    @Override
    public final r1 p() {
        return this.f57190a.p();
    }

    @Override
    public final long q() {
        long q10 = this.f57190a.q();
        if (q10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return q10 + this.f57191b;
    }

    @Override
    public final long r(long j10, k2.t1 t1Var) {
        long j11 = this.f57191b;
        return this.f57190a.r(j10 - j11, t1Var) + j11;
    }

    @Override
    public final long s(z2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        d1[] d1VarArr2 = new d1[d1VarArr.length];
        int i3 = 0;
        while (true) {
            d1 d1Var = null;
            if (i3 >= d1VarArr.length) {
                break;
            }
            o1 o1Var = (o1) d1VarArr[i3];
            if (o1Var != null) {
                d1Var = o1Var.f57180a;
            }
            d1VarArr2[i3] = d1Var;
            i3++;
        }
        e0 e0Var = this.f57190a;
        long j11 = this.f57191b;
        long s6 = e0Var.s(pVarArr, zArr, d1VarArr2, zArr2, j10 - j11);
        for (int i10 = 0; i10 < d1VarArr.length; i10++) {
            d1 d1Var2 = d1VarArr2[i10];
            if (d1Var2 == null) {
                d1VarArr[i10] = null;
            } else {
                d1 d1Var3 = d1VarArr[i10];
                if (d1Var3 == null || ((o1) d1Var3).f57180a != d1Var2) {
                    d1VarArr[i10] = new o1(d1Var2, j11);
                }
            }
        }
        return s6 + j11;
    }

    @Override
    public final void t(long j10) {
        this.f57190a.t(j10 - this.f57191b);
    }
}
