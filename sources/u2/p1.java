package u2;
public final class p1 implements e0, d0 {
    public final e0 f47426a;
    public final long f47427b;
    public d0 f47428c;

    public p1(e0 e0Var, long j10) {
        this.f47426a = e0Var;
        this.f47427b = j10;
    }

    @Override
    public final boolean c() {
        return this.f47426a.c();
    }

    @Override
    public final long d() {
        long d = this.f47426a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.f47427b;
    }

    @Override
    public final void g() {
        this.f47426a.g();
    }

    @Override
    public final void h(e0 e0Var) {
        d0 d0Var = this.f47428c;
        d0Var.getClass();
        d0Var.h(this);
    }

    @Override
    public final long i(long j10) {
        long j11 = this.f47427b;
        return this.f47426a.i(j10 - j11) + j11;
    }

    @Override
    public final void k(long j10) {
        this.f47426a.k(j10 - this.f47427b);
    }

    @Override
    public final void m(d0 d0Var, long j10) {
        this.f47428c = d0Var;
        this.f47426a.m(this, j10 - this.f47427b);
    }

    @Override
    public final long o() {
        long o10 = this.f47426a.o();
        if (o10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o10 + this.f47427b;
    }

    @Override
    public final boolean p(i2.t0 t0Var) {
        ?? obj = new Object();
        long j10 = t0Var.f12594a;
        obj.f12587b = t0Var.f12595b;
        obj.f12588c = t0Var.f12596c;
        obj.f12586a = j10 - this.f47427b;
        return this.f47426a.p(new i2.t0(obj));
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
                d1Var = o1Var.f47419a;
            }
            d1VarArr2[i10] = d1Var;
            i10++;
        }
        e0 e0Var = this.f47426a;
        long j11 = this.f47427b;
        long q6 = e0Var.q(pVarArr, zArr, d1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < d1VarArr.length; i11++) {
            d1 d1Var2 = d1VarArr2[i11];
            if (d1Var2 == null) {
                d1VarArr[i11] = null;
            } else {
                d1 d1Var3 = d1VarArr[i11];
                if (d1Var3 == null || ((o1) d1Var3).f47419a != d1Var2) {
                    d1VarArr[i11] = new o1(d1Var2, j11);
                }
            }
        }
        return q6 + j11;
    }

    @Override
    public final r1 r() {
        return this.f47426a.r();
    }

    @Override
    public final long s() {
        long s10 = this.f47426a.s();
        if (s10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s10 + this.f47427b;
    }

    @Override
    public final long t(long j10, i2.r1 r1Var) {
        long j11 = this.f47427b;
        return this.f47426a.t(j10 - j11, r1Var) + j11;
    }

    @Override
    public final void u(long j10) {
        this.f47426a.u(j10 - this.f47427b);
    }

    @Override
    public final void v(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f47428c;
        d0Var.getClass();
        d0Var.v(this);
    }
}
