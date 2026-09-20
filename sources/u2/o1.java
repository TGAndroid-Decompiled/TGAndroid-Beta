package u2;
public final class o1 implements d0, c0 {
    public final d0 f43747a;
    public final long f43748b;
    public c0 f43749c;

    public o1(d0 d0Var, long j3) {
        this.f43747a = d0Var;
        this.f43748b = j3;
    }

    @Override
    public final void b(d0 d0Var) {
        c0 c0Var = this.f43749c;
        c0Var.getClass();
        c0Var.b(this);
    }

    @Override
    public final boolean c() {
        return this.f43747a.c();
    }

    @Override
    public final long d() {
        long d = this.f43747a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.f43748b;
    }

    @Override
    public final void g() {
        this.f43747a.g();
    }

    @Override
    public final long h(long j3) {
        long j10 = this.f43748b;
        return this.f43747a.h(j3 - j10) + j10;
    }

    @Override
    public final void i(long j3) {
        this.f43747a.i(j3 - this.f43748b);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f43749c = c0Var;
        this.f43747a.k(this, j3 - this.f43748b);
    }

    @Override
    public final long l() {
        long l4 = this.f43747a.l();
        if (l4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return l4 + this.f43748b;
    }

    @Override
    public final void m(e1 e1Var) {
        d0 d0Var = (d0) e1Var;
        c0 c0Var = this.f43749c;
        c0Var.getClass();
        c0Var.m(this);
    }

    @Override
    public final boolean p(i2.r0 r0Var) {
        ?? obj = new Object();
        long j3 = r0Var.f10870a;
        obj.f10865b = r0Var.f10871b;
        obj.f10866c = r0Var.f10872c;
        obj.f10864a = j3 - this.f43748b;
        return this.f43747a.p(new i2.r0(obj));
    }

    @Override
    public final long q(x2.s[] sVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        c1[] c1VarArr2 = new c1[c1VarArr.length];
        int i10 = 0;
        while (true) {
            c1 c1Var = null;
            if (i10 >= c1VarArr.length) {
                break;
            }
            n1 n1Var = (n1) c1VarArr[i10];
            if (n1Var != null) {
                c1Var = n1Var.f43740a;
            }
            c1VarArr2[i10] = c1Var;
            i10++;
        }
        d0 d0Var = this.f43747a;
        long j10 = this.f43748b;
        long q6 = d0Var.q(sVarArr, zArr, c1VarArr2, zArr2, j3 - j10);
        for (int i11 = 0; i11 < c1VarArr.length; i11++) {
            c1 c1Var2 = c1VarArr2[i11];
            if (c1Var2 == null) {
                c1VarArr[i11] = null;
            } else {
                c1 c1Var3 = c1VarArr[i11];
                if (c1Var3 == null || ((n1) c1Var3).f43740a != c1Var2) {
                    c1VarArr[i11] = new n1(c1Var2, j10);
                }
            }
        }
        return q6 + j10;
    }

    @Override
    public final p1 r() {
        return this.f43747a.r();
    }

    @Override
    public final long s() {
        long s10 = this.f43747a.s();
        if (s10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s10 + this.f43748b;
    }

    @Override
    public final long t(long j3, i2.p1 p1Var) {
        long j10 = this.f43748b;
        return this.f43747a.t(j3 - j10, p1Var) + j10;
    }

    @Override
    public final void u(long j3) {
        this.f43747a.u(j3 - this.f43748b);
    }
}
