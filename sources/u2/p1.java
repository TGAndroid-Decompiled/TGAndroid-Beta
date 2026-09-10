package u2;
public final class p1 implements e0, d0 {
    public final e0 f42418a;
    public final long f42419b;
    public d0 f42420c;

    public p1(e0 e0Var, long j3) {
        this.f42418a = e0Var;
        this.f42419b = j3;
    }

    @Override
    public final void b(e0 e0Var) {
        d0 d0Var = this.f42420c;
        d0Var.getClass();
        d0Var.b(this);
    }

    @Override
    public final boolean c() {
        return this.f42418a.c();
    }

    @Override
    public final long d() {
        long d = this.f42418a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.f42419b;
    }

    @Override
    public final void f() {
        this.f42418a.f();
    }

    @Override
    public final void g(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f42420c;
        d0Var.getClass();
        d0Var.g(this);
    }

    @Override
    public final long h(long j3) {
        long j10 = this.f42419b;
        return this.f42418a.h(j3 - j10) + j10;
    }

    @Override
    public final void i(long j3) {
        this.f42418a.i(j3 - this.f42419b);
    }

    @Override
    public final void j(d0 d0Var, long j3) {
        this.f42420c = d0Var;
        this.f42418a.j(this, j3 - this.f42419b);
    }

    @Override
    public final long m() {
        long m10 = this.f42418a.m();
        if (m10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return m10 + this.f42419b;
    }

    @Override
    public final boolean n(i2.q0 q0Var) {
        ?? obj = new Object();
        long j3 = q0Var.f10347a;
        obj.f10341b = q0Var.f10348b;
        obj.f10342c = q0Var.f10349c;
        obj.f10340a = j3 - this.f42419b;
        return this.f42418a.n(new i2.q0(obj));
    }

    @Override
    public final long o(x2.r[] rVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        d1[] d1VarArr2 = new d1[d1VarArr.length];
        int i10 = 0;
        while (true) {
            d1 d1Var = null;
            if (i10 >= d1VarArr.length) {
                break;
            }
            o1 o1Var = (o1) d1VarArr[i10];
            if (o1Var != null) {
                d1Var = o1Var.f42411a;
            }
            d1VarArr2[i10] = d1Var;
            i10++;
        }
        e0 e0Var = this.f42418a;
        long j10 = this.f42419b;
        long o9 = e0Var.o(rVarArr, zArr, d1VarArr2, zArr2, j3 - j10);
        for (int i11 = 0; i11 < d1VarArr.length; i11++) {
            d1 d1Var2 = d1VarArr2[i11];
            if (d1Var2 == null) {
                d1VarArr[i11] = null;
            } else {
                d1 d1Var3 = d1VarArr[i11];
                if (d1Var3 == null || ((o1) d1Var3).f42411a != d1Var2) {
                    d1VarArr[i11] = new o1(d1Var2, j10);
                }
            }
        }
        return o9 + j10;
    }

    @Override
    public final q1 q() {
        return this.f42418a.q();
    }

    @Override
    public final long r() {
        long r10 = this.f42418a.r();
        if (r10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return r10 + this.f42419b;
    }

    @Override
    public final long s(long j3, i2.o1 o1Var) {
        long j10 = this.f42419b;
        return this.f42418a.s(j3 - j10, o1Var) + j10;
    }

    @Override
    public final void u(long j3) {
        this.f42418a.u(j3 - this.f42419b);
    }
}
