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
    public final void F(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f46021c;
        d0Var.getClass();
        d0Var.F(this);
    }

    @Override
    public final boolean c() {
        return this.f46019a.c();
    }

    @Override
    public final long d() {
        long d = this.f46019a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.f46020b;
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
    public final void k(d0 d0Var, long j10) {
        this.f46021c = d0Var;
        this.f46019a.k(this, j10 - this.f46020b);
    }

    @Override
    public final long l() {
        long l4 = this.f46019a.l();
        if (l4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return l4 + this.f46020b;
    }

    @Override
    public final boolean m(i2.v0 v0Var) {
        ?? obj = new Object();
        long j10 = v0Var.f11210a;
        obj.f11203b = v0Var.f11211b;
        obj.f11204c = v0Var.f11212c;
        obj.f11202a = j10 - this.f46020b;
        return this.f46019a.m(new i2.v0(obj));
    }

    @Override
    public final long n(x2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
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
        long n10 = e0Var.n(pVarArr, zArr, d1VarArr2, zArr2, j10 - j11);
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
        return n10 + j11;
    }

    @Override
    public final r1 o() {
        return this.f46019a.o();
    }

    @Override
    public final long p() {
        long p5 = this.f46019a.p();
        if (p5 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return p5 + this.f46020b;
    }

    @Override
    public final void q(e0 e0Var) {
        d0 d0Var = this.f46021c;
        d0Var.getClass();
        d0Var.q(this);
    }

    @Override
    public final long r(long j10, i2.t1 t1Var) {
        long j11 = this.f46020b;
        return this.f46019a.r(j10 - j11, t1Var) + j11;
    }

    @Override
    public final void s(long j10) {
        this.f46019a.s(j10 - this.f46020b);
    }
}
