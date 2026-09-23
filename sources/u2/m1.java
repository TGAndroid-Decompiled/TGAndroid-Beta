package u2;

import i2.q1;
public final class m1 implements d0, c0 {
    public final d0 f43366a;
    public final long f43367b;
    public c0 f43368c;

    public m1(d0 d0Var, long j3) {
        this.f43366a = d0Var;
        this.f43367b = j3;
    }

    @Override
    public final void a(d0 d0Var) {
        c0 c0Var = this.f43368c;
        c0Var.getClass();
        c0Var.a(this);
    }

    @Override
    public final boolean c() {
        return this.f43366a.c();
    }

    @Override
    public final long d() {
        long d = this.f43366a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.f43367b;
    }

    @Override
    public final void g() {
        this.f43366a.g();
    }

    @Override
    public final long h(long j3) {
        long j10 = this.f43367b;
        return this.f43366a.h(j3 - j10) + j10;
    }

    @Override
    public final void i(long j3) {
        this.f43366a.i(j3 - this.f43367b);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f43368c = c0Var;
        this.f43366a.k(this, j3 - this.f43367b);
    }

    @Override
    public final long l() {
        long l4 = this.f43366a.l();
        if (l4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return l4 + this.f43367b;
    }

    @Override
    public final boolean m(i2.s0 s0Var) {
        ?? obj = new Object();
        long j3 = s0Var.f10863a;
        obj.f10855b = s0Var.f10864b;
        obj.f10856c = s0Var.f10865c;
        obj.f10854a = j3 - this.f43367b;
        return this.f43366a.m(new i2.s0(obj));
    }

    @Override
    public final long p(x2.r[] rVarArr, boolean[] zArr, a1[] a1VarArr, boolean[] zArr2, long j3) {
        a1[] a1VarArr2 = new a1[a1VarArr.length];
        int i10 = 0;
        while (true) {
            a1 a1Var = null;
            if (i10 >= a1VarArr.length) {
                break;
            }
            l1 l1Var = (l1) a1VarArr[i10];
            if (l1Var != null) {
                a1Var = l1Var.f43360a;
            }
            a1VarArr2[i10] = a1Var;
            i10++;
        }
        d0 d0Var = this.f43366a;
        long j10 = this.f43367b;
        long p5 = d0Var.p(rVarArr, zArr, a1VarArr2, zArr2, j3 - j10);
        for (int i11 = 0; i11 < a1VarArr.length; i11++) {
            a1 a1Var2 = a1VarArr2[i11];
            if (a1Var2 == null) {
                a1VarArr[i11] = null;
            } else {
                a1 a1Var3 = a1VarArr[i11];
                if (a1Var3 == null || ((l1) a1Var3).f43360a != a1Var2) {
                    a1VarArr[i11] = new l1(a1Var2, j10);
                }
            }
        }
        return p5 + j10;
    }

    @Override
    public final n1 r() {
        return this.f43366a.r();
    }

    @Override
    public final long s() {
        long s10 = this.f43366a.s();
        if (s10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s10 + this.f43367b;
    }

    @Override
    public final long t(long j3, q1 q1Var) {
        long j10 = this.f43367b;
        return this.f43366a.t(j3 - j10, q1Var) + j10;
    }

    @Override
    public final void u(long j3) {
        this.f43366a.u(j3 - this.f43367b);
    }

    @Override
    public final void v(c1 c1Var) {
        d0 d0Var = (d0) c1Var;
        c0 c0Var = this.f43368c;
        c0Var.getClass();
        c0Var.v(this);
    }
}
