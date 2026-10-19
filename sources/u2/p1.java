package u2;
public final class p1 implements e0, d0 {
    public final e0 f47405a;
    public final long f47406b;
    public d0 f47407c;

    public p1(e0 e0Var, long j10) {
        this.f47405a = e0Var;
        this.f47406b = j10;
    }

    @Override
    public final void a(e0 e0Var) {
        d0 d0Var = this.f47407c;
        d0Var.getClass();
        d0Var.a(this);
    }

    @Override
    public final boolean c() {
        return this.f47405a.c();
    }

    @Override
    public final long d() {
        long d = this.f47405a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.f47406b;
    }

    @Override
    public final void h(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f47407c;
        d0Var.getClass();
        d0Var.h(this);
    }

    @Override
    public final void i() {
        this.f47405a.i();
    }

    @Override
    public final long j(long j10) {
        long j11 = this.f47406b;
        return this.f47405a.j(j10 - j11) + j11;
    }

    @Override
    public final void l(long j10) {
        this.f47405a.l(j10 - this.f47406b);
    }

    @Override
    public final void n(d0 d0Var, long j10) {
        this.f47407c = d0Var;
        this.f47405a.n(this, j10 - this.f47406b);
    }

    @Override
    public final long o() {
        long o10 = this.f47405a.o();
        if (o10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o10 + this.f47406b;
    }

    @Override
    public final boolean p(i2.v0 v0Var) {
        ?? obj = new Object();
        long j10 = v0Var.f12596a;
        obj.f12592b = v0Var.f12597b;
        obj.f12593c = v0Var.f12598c;
        obj.f12591a = j10 - this.f47406b;
        return this.f47405a.p(new i2.v0(obj));
    }

    @Override
    public final long q(x2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        d1[] d1VarArr2 = new d1[d1VarArr.length];
        int i10 = 0;
        while (true) {
            d1 d1Var = null;
            if (i10 >= d1VarArr.length) {
                break;
            }
            o1 o1Var = (o1) d1VarArr[i10];
            if (o1Var != null) {
                d1Var = o1Var.f47398a;
            }
            d1VarArr2[i10] = d1Var;
            i10++;
        }
        e0 e0Var = this.f47405a;
        long j11 = this.f47406b;
        long q6 = e0Var.q(pVarArr, zArr, d1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < d1VarArr.length; i11++) {
            d1 d1Var2 = d1VarArr2[i11];
            if (d1Var2 == null) {
                d1VarArr[i11] = null;
            } else {
                d1 d1Var3 = d1VarArr[i11];
                if (d1Var3 == null || ((o1) d1Var3).f47398a != d1Var2) {
                    d1VarArr[i11] = new o1(d1Var2, j11);
                }
            }
        }
        return q6 + j11;
    }

    @Override
    public final r1 r() {
        return this.f47405a.r();
    }

    @Override
    public final long s() {
        long s10 = this.f47405a.s();
        if (s10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s10 + this.f47406b;
    }

    @Override
    public final long t(long j10, i2.s1 s1Var) {
        long j11 = this.f47406b;
        return this.f47405a.t(j10 - j11, s1Var) + j11;
    }

    @Override
    public final void u(long j10) {
        this.f47405a.u(j10 - this.f47406b);
    }
}
