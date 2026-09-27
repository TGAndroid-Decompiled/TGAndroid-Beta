package u2;

import i2.q1;
public final class n1 implements d0, c0 {
    public final d0 f43778a;
    public final long f43779b;
    public c0 f43780c;

    public n1(d0 d0Var, long j3) {
        this.f43778a = d0Var;
        this.f43779b = j3;
    }

    @Override
    public final boolean c() {
        return this.f43778a.c();
    }

    @Override
    public final long d() {
        long d = this.f43778a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.f43779b;
    }

    @Override
    public final void e(d0 d0Var) {
        c0 c0Var = this.f43780c;
        c0Var.getClass();
        c0Var.e(this);
    }

    @Override
    public final void g() {
        this.f43778a.g();
    }

    @Override
    public final void h(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.f43780c;
        c0Var.getClass();
        c0Var.h(this);
    }

    @Override
    public final long i(long j3) {
        long j10 = this.f43779b;
        return this.f43778a.i(j3 - j10) + j10;
    }

    @Override
    public final void j(long j3) {
        this.f43778a.j(j3 - this.f43779b);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f43780c = c0Var;
        this.f43778a.k(this, j3 - this.f43779b);
    }

    @Override
    public final long n() {
        long n10 = this.f43778a.n();
        if (n10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return n10 + this.f43779b;
    }

    @Override
    public final boolean o(i2.s0 s0Var) {
        ?? obj = new Object();
        long j3 = s0Var.f10866a;
        obj.f10858b = s0Var.f10867b;
        obj.f10859c = s0Var.f10868c;
        obj.f10857a = j3 - this.f43779b;
        return this.f43778a.o(new i2.s0(obj));
    }

    @Override
    public final long p(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        b1[] b1VarArr2 = new b1[b1VarArr.length];
        int i10 = 0;
        while (true) {
            b1 b1Var = null;
            if (i10 >= b1VarArr.length) {
                break;
            }
            m1 m1Var = (m1) b1VarArr[i10];
            if (m1Var != null) {
                b1Var = m1Var.f43765a;
            }
            b1VarArr2[i10] = b1Var;
            i10++;
        }
        d0 d0Var = this.f43778a;
        long j10 = this.f43779b;
        long p5 = d0Var.p(rVarArr, zArr, b1VarArr2, zArr2, j3 - j10);
        for (int i11 = 0; i11 < b1VarArr.length; i11++) {
            b1 b1Var2 = b1VarArr2[i11];
            if (b1Var2 == null) {
                b1VarArr[i11] = null;
            } else {
                b1 b1Var3 = b1VarArr[i11];
                if (b1Var3 == null || ((m1) b1Var3).f43765a != b1Var2) {
                    b1VarArr[i11] = new m1(b1Var2, j10);
                }
            }
        }
        return p5 + j10;
    }

    @Override
    public final o1 r() {
        return this.f43778a.r();
    }

    @Override
    public final long s() {
        long s10 = this.f43778a.s();
        if (s10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s10 + this.f43779b;
    }

    @Override
    public final long t(long j3, q1 q1Var) {
        long j10 = this.f43779b;
        return this.f43778a.t(j3 - j10, q1Var) + j10;
    }

    @Override
    public final void u(long j3) {
        this.f43778a.u(j3 - this.f43779b);
    }
}
