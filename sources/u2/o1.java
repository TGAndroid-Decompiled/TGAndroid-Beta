package u2;
public final class o1 implements d0, c0 {
    public final d0 f47366a;
    public final long f47367b;
    public c0 f47368c;

    public o1(d0 d0Var, long j3) {
        this.f47366a = d0Var;
        this.f47367b = j3;
    }

    @Override
    public final void b(d0 d0Var) {
        c0 c0Var = this.f47368c;
        c0Var.getClass();
        c0Var.b(this);
    }

    @Override
    public final boolean c() {
        return this.f47366a.c();
    }

    @Override
    public final long d() {
        long d = this.f47366a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.f47367b;
    }

    @Override
    public final void f(e1 e1Var) {
        d0 d0Var = (d0) e1Var;
        c0 c0Var = this.f47368c;
        c0Var.getClass();
        c0Var.f(this);
    }

    @Override
    public final void g() {
        this.f47366a.g();
    }

    @Override
    public final long h(long j3) {
        long j10 = this.f47367b;
        return this.f47366a.h(j3 - j10) + j10;
    }

    @Override
    public final void i(long j3) {
        this.f47366a.i(j3 - this.f47367b);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f47368c = c0Var;
        this.f47366a.k(this, j3 - this.f47367b);
    }

    @Override
    public final long l() {
        long l4 = this.f47366a.l();
        if (l4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return l4 + this.f47367b;
    }

    @Override
    public final boolean m(i2.s0 s0Var) {
        ?? obj = new Object();
        long j3 = s0Var.f11836a;
        obj.f11827b = s0Var.f11837b;
        obj.f11828c = s0Var.f11838c;
        obj.f11826a = j3 - this.f47367b;
        return this.f47366a.m(new i2.s0(obj));
    }

    @Override
    public final long n(x2.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        c1[] c1VarArr2 = new c1[c1VarArr.length];
        int i10 = 0;
        while (true) {
            c1 c1Var = null;
            if (i10 >= c1VarArr.length) {
                break;
            }
            n1 n1Var = (n1) c1VarArr[i10];
            if (n1Var != null) {
                c1Var = n1Var.f47359a;
            }
            c1VarArr2[i10] = c1Var;
            i10++;
        }
        d0 d0Var = this.f47366a;
        long j10 = this.f47367b;
        long n10 = d0Var.n(rVarArr, zArr, c1VarArr2, zArr2, j3 - j10);
        for (int i11 = 0; i11 < c1VarArr.length; i11++) {
            c1 c1Var2 = c1VarArr2[i11];
            if (c1Var2 == null) {
                c1VarArr[i11] = null;
            } else {
                c1 c1Var3 = c1VarArr[i11];
                if (c1Var3 == null || ((n1) c1Var3).f47359a != c1Var2) {
                    c1VarArr[i11] = new n1(c1Var2, j10);
                }
            }
        }
        return n10 + j10;
    }

    @Override
    public final p1 o() {
        return this.f47366a.o();
    }

    @Override
    public final long p() {
        long p5 = this.f47366a.p();
        if (p5 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return p5 + this.f47367b;
    }

    @Override
    public final long q(long j3, i2.q1 q1Var) {
        long j10 = this.f47367b;
        return this.f47366a.q(j3 - j10, q1Var) + j10;
    }

    @Override
    public final void r(long j3) {
        this.f47366a.r(j3 - this.f47367b);
    }
}
