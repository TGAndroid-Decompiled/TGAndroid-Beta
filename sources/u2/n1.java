package u2;

import i2.q1;
public final class n1 implements d0, c0 {
    public final d0 f48665a;
    public final long f48666b;
    public c0 f48667c;

    public n1(d0 d0Var, long j3) {
        this.f48665a = d0Var;
        this.f48666b = j3;
    }

    @Override
    public final void D(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.f48667c;
        c0Var.getClass();
        c0Var.D(this);
    }

    @Override
    public final boolean c() {
        return this.f48665a.c();
    }

    @Override
    public final long d() {
        long d = this.f48665a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.f48666b;
    }

    @Override
    public final void g() {
        this.f48665a.g();
    }

    @Override
    public final long h(long j3) {
        long j10 = this.f48666b;
        return this.f48665a.h(j3 - j10) + j10;
    }

    @Override
    public final void i(long j3) {
        this.f48665a.i(j3 - this.f48666b);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f48667c = c0Var;
        this.f48665a.k(this, j3 - this.f48666b);
    }

    @Override
    public final long l() {
        long l4 = this.f48665a.l();
        if (l4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return l4 + this.f48666b;
    }

    @Override
    public final void m(d0 d0Var) {
        c0 c0Var = this.f48667c;
        c0Var.getClass();
        c0Var.m(this);
    }

    @Override
    public final boolean n(i2.s0 s0Var) {
        ?? obj = new Object();
        long j3 = s0Var.f11886a;
        obj.f11877b = s0Var.f11887b;
        obj.f11878c = s0Var.f11888c;
        obj.f11876a = j3 - this.f48666b;
        return this.f48665a.n(new i2.s0(obj));
    }

    @Override
    public final long o(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        b1[] b1VarArr2 = new b1[b1VarArr.length];
        int i10 = 0;
        while (true) {
            b1 b1Var = null;
            if (i10 >= b1VarArr.length) {
                break;
            }
            m1 m1Var = (m1) b1VarArr[i10];
            if (m1Var != null) {
                b1Var = m1Var.f48652a;
            }
            b1VarArr2[i10] = b1Var;
            i10++;
        }
        d0 d0Var = this.f48665a;
        long j10 = this.f48666b;
        long o9 = d0Var.o(rVarArr, zArr, b1VarArr2, zArr2, j3 - j10);
        for (int i11 = 0; i11 < b1VarArr.length; i11++) {
            b1 b1Var2 = b1VarArr2[i11];
            if (b1Var2 == null) {
                b1VarArr[i11] = null;
            } else {
                b1 b1Var3 = b1VarArr[i11];
                if (b1Var3 == null || ((m1) b1Var3).f48652a != b1Var2) {
                    b1VarArr[i11] = new m1(b1Var2, j10);
                }
            }
        }
        return o9 + j10;
    }

    @Override
    public final o1 p() {
        return this.f48665a.p();
    }

    @Override
    public final long q() {
        long q6 = this.f48665a.q();
        if (q6 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return q6 + this.f48666b;
    }

    @Override
    public final long r(long j3, q1 q1Var) {
        long j10 = this.f48666b;
        return this.f48665a.r(j3 - j10, q1Var) + j10;
    }

    @Override
    public final void s(long j3) {
        this.f48665a.s(j3 - this.f48666b);
    }
}
