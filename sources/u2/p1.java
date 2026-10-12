package u2;
public final class p1 implements e0, d0 {
    public final e0 f46019a;
    public final long f46020b;
    public d0 f46021c;

    public p1(e0 e0Var, long j10) {
        this.f46019a = e0Var;
        this.f46020b = j10;
    }

    @Override
    public final void G(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f46021c;
        d0Var.getClass();
        d0Var.G(this);
    }

    @Override
    public final long b() {
        long b10 = this.f46019a.b();
        if (b10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return b10 + this.f46020b;
    }

    @Override
    public final boolean c() {
        return this.f46019a.c();
    }

    @Override
    public final void g() {
        this.f46019a.g();
    }

    @Override
    public final long h(long j10) {
        long j11 = this.f46020b;
        return this.f46019a.h(j10 - j11) + j11;
    }

    @Override
    public final void i(long j10) {
        this.f46019a.i(j10 - this.f46020b);
    }

    @Override
    public final void n(d0 d0Var, long j10) {
        this.f46021c = d0Var;
        this.f46019a.n(this, j10 - this.f46020b);
    }

    @Override
    public final long o() {
        long o10 = this.f46019a.o();
        if (o10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o10 + this.f46020b;
    }

    @Override
    public final boolean p(i2.v0 v0Var) {
        ?? obj = new Object();
        long j10 = v0Var.f11206a;
        obj.f11199b = v0Var.f11207b;
        obj.f11200c = v0Var.f11208c;
        obj.f11198a = j10 - this.f46020b;
        return this.f46019a.p(new i2.v0(obj));
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
                d1Var = o1Var.f46012a;
            }
            d1VarArr2[i10] = d1Var;
            i10++;
        }
        e0 e0Var = this.f46019a;
        long j11 = this.f46020b;
        long q6 = e0Var.q(pVarArr, zArr, d1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < d1VarArr.length; i11++) {
            d1 d1Var2 = d1VarArr2[i11];
            if (d1Var2 == null) {
                d1VarArr[i11] = null;
            } else {
                d1 d1Var3 = d1VarArr[i11];
                if (d1Var3 == null || ((o1) d1Var3).f46012a != d1Var2) {
                    d1VarArr[i11] = new o1(d1Var2, j11);
                }
            }
        }
        return q6 + j11;
    }

    @Override
    public final r1 r() {
        return this.f46019a.r();
    }

    @Override
    public final long s() {
        long s10 = this.f46019a.s();
        if (s10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s10 + this.f46020b;
    }

    @Override
    public final long t(long j10, i2.t1 t1Var) {
        long j11 = this.f46020b;
        return this.f46019a.t(j10 - j11, t1Var) + j11;
    }

    @Override
    public final void u(long j10) {
        this.f46019a.u(j10 - this.f46020b);
    }

    @Override
    public final void y(e0 e0Var) {
        d0 d0Var = this.f46021c;
        d0Var.getClass();
        d0Var.y(this);
    }
}
