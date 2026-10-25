package u2;
public final class p1 implements e0, d0 {
    public final e0 f49398a;
    public final long f49399b;
    public d0 f49400c;

    public p1(e0 e0Var, long j10) {
        this.f49398a = e0Var;
        this.f49399b = j10;
    }

    @Override
    public final long b() {
        long b10 = this.f49398a.b();
        if (b10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return b10 + this.f49399b;
    }

    @Override
    public final boolean c() {
        return this.f49398a.c();
    }

    @Override
    public final void g() {
        this.f49398a.g();
    }

    @Override
    public final long h(long j10) {
        long j11 = this.f49399b;
        return this.f49398a.h(j10 - j11) + j11;
    }

    @Override
    public final void i(long j10) {
        this.f49398a.i(j10 - this.f49399b);
    }

    @Override
    public final void k(d0 d0Var, long j10) {
        this.f49400c = d0Var;
        this.f49398a.k(this, j10 - this.f49399b);
    }

    @Override
    public final long l() {
        long l4 = this.f49398a.l();
        if (l4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return l4 + this.f49399b;
    }

    @Override
    public final boolean m(i2.w0 w0Var) {
        ?? obj = new Object();
        long j10 = w0Var.f13783a;
        obj.f13779b = w0Var.f13784b;
        obj.f13780c = w0Var.f13785c;
        obj.f13778a = j10 - this.f49399b;
        return this.f49398a.m(new i2.w0(obj));
    }

    @Override
    public final void n(e0 e0Var) {
        d0 d0Var = this.f49400c;
        d0Var.getClass();
        d0Var.n(this);
    }

    @Override
    public final long o(x2.q[] qVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        d1[] d1VarArr2 = new d1[d1VarArr.length];
        int i10 = 0;
        while (true) {
            d1 d1Var = null;
            if (i10 >= d1VarArr.length) {
                break;
            }
            o1 o1Var = (o1) d1VarArr[i10];
            if (o1Var != null) {
                d1Var = o1Var.f49389a;
            }
            d1VarArr2[i10] = d1Var;
            i10++;
        }
        e0 e0Var = this.f49398a;
        long j11 = this.f49399b;
        long o10 = e0Var.o(qVarArr, zArr, d1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < d1VarArr.length; i11++) {
            d1 d1Var2 = d1VarArr2[i11];
            if (d1Var2 == null) {
                d1VarArr[i11] = null;
            } else {
                d1 d1Var3 = d1VarArr[i11];
                if (d1Var3 == null || ((o1) d1Var3).f49389a != d1Var2) {
                    d1VarArr[i11] = new o1(d1Var2, j11);
                }
            }
        }
        return o10 + j11;
    }

    @Override
    public final r1 p() {
        return this.f49398a.p();
    }

    @Override
    public final long q() {
        long q5 = this.f49398a.q();
        if (q5 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return q5 + this.f49399b;
    }

    @Override
    public final long r(long j10, i2.t1 t1Var) {
        long j11 = this.f49399b;
        return this.f49398a.r(j10 - j11, t1Var) + j11;
    }

    @Override
    public final void s(long j10) {
        this.f49398a.s(j10 - this.f49399b);
    }

    @Override
    public final void u(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f49400c;
        d0Var.getClass();
        d0Var.u(this);
    }
}
