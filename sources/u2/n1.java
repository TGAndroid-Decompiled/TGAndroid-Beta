package u2;
public final class n1 implements d0, c0 {
    public final d0 f43731a;
    public final long f43732b;
    public c0 f43733c;

    public n1(d0 d0Var, long j3) {
        this.f43731a = d0Var;
        this.f43732b = j3;
    }

    @Override
    public final void b(d0 d0Var) {
        c0 c0Var = this.f43733c;
        c0Var.getClass();
        c0Var.b(this);
    }

    @Override
    public final boolean c() {
        return this.f43731a.c();
    }

    @Override
    public final long d() {
        long d = this.f43731a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.f43732b;
    }

    @Override
    public final void g() {
        this.f43731a.g();
    }

    @Override
    public final long h(long j3) {
        long j10 = this.f43732b;
        return this.f43731a.h(j3 - j10) + j10;
    }

    @Override
    public final void i(long j3) {
        this.f43731a.i(j3 - this.f43732b);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f43733c = c0Var;
        this.f43731a.k(this, j3 - this.f43732b);
    }

    @Override
    public final long l() {
        long l4 = this.f43731a.l();
        if (l4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return l4 + this.f43732b;
    }

    @Override
    public final void m(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.f43733c;
        c0Var.getClass();
        c0Var.m(this);
    }

    @Override
    public final boolean p(i2.s0 s0Var) {
        ?? obj = new Object();
        long j3 = s0Var.f10863a;
        obj.f10855b = s0Var.f10864b;
        obj.f10856c = s0Var.f10865c;
        obj.f10854a = j3 - this.f43732b;
        return this.f43731a.p(new i2.s0(obj));
    }

    @Override
    public final long q(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        b1[] b1VarArr2 = new b1[b1VarArr.length];
        int i10 = 0;
        while (true) {
            b1 b1Var = null;
            if (i10 >= b1VarArr.length) {
                break;
            }
            m1 m1Var = (m1) b1VarArr[i10];
            if (m1Var != null) {
                b1Var = m1Var.f43718a;
            }
            b1VarArr2[i10] = b1Var;
            i10++;
        }
        d0 d0Var = this.f43731a;
        long j10 = this.f43732b;
        long q6 = d0Var.q(rVarArr, zArr, b1VarArr2, zArr2, j3 - j10);
        for (int i11 = 0; i11 < b1VarArr.length; i11++) {
            b1 b1Var2 = b1VarArr2[i11];
            if (b1Var2 == null) {
                b1VarArr[i11] = null;
            } else {
                b1 b1Var3 = b1VarArr[i11];
                if (b1Var3 == null || ((m1) b1Var3).f43718a != b1Var2) {
                    b1VarArr[i11] = new m1(b1Var2, j10);
                }
            }
        }
        return q6 + j10;
    }

    @Override
    public final p1 r() {
        return this.f43731a.r();
    }

    @Override
    public final long s() {
        long s10 = this.f43731a.s();
        if (s10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s10 + this.f43732b;
    }

    @Override
    public final long t(long j3, i2.q1 q1Var) {
        long j10 = this.f43732b;
        return this.f43731a.t(j3 - j10, q1Var) + j10;
    }

    @Override
    public final void u(long j3) {
        this.f43731a.u(j3 - this.f43732b);
    }
}
