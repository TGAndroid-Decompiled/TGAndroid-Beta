package u2;

import i2.q1;
public final class m1 implements d0, c0 {
    public final d0 f48872a;
    public final long f48873b;
    public c0 f48874c;

    public m1(d0 d0Var, long j3) {
        this.f48872a = d0Var;
        this.f48873b = j3;
    }

    @Override
    public final void a(d0 d0Var) {
        c0 c0Var = this.f48874c;
        c0Var.getClass();
        c0Var.a(this);
    }

    @Override
    public final void b(c1 c1Var) {
        d0 d0Var = (d0) c1Var;
        c0 c0Var = this.f48874c;
        c0Var.getClass();
        c0Var.b(this);
    }

    @Override
    public final boolean c() {
        return this.f48872a.c();
    }

    @Override
    public final long d() {
        long d = this.f48872a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.f48873b;
    }

    @Override
    public final void g() {
        this.f48872a.g();
    }

    @Override
    public final long h(long j3) {
        long j10 = this.f48873b;
        return this.f48872a.h(j3 - j10) + j10;
    }

    @Override
    public final void i(long j3) {
        this.f48872a.i(j3 - this.f48873b);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f48874c = c0Var;
        this.f48872a.k(this, j3 - this.f48873b);
    }

    @Override
    public final long l() {
        long l4 = this.f48872a.l();
        if (l4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return l4 + this.f48873b;
    }

    @Override
    public final boolean m(i2.s0 s0Var) {
        ?? obj = new Object();
        long j3 = s0Var.f11884a;
        obj.f11875b = s0Var.f11885b;
        obj.f11876c = s0Var.f11886c;
        obj.f11874a = j3 - this.f48873b;
        return this.f48872a.m(new i2.s0(obj));
    }

    @Override
    public final long n(x2.r[] rVarArr, boolean[] zArr, a1[] a1VarArr, boolean[] zArr2, long j3) {
        a1[] a1VarArr2 = new a1[a1VarArr.length];
        int i10 = 0;
        while (true) {
            a1 a1Var = null;
            if (i10 >= a1VarArr.length) {
                break;
            }
            l1 l1Var = (l1) a1VarArr[i10];
            if (l1Var != null) {
                a1Var = l1Var.f48866a;
            }
            a1VarArr2[i10] = a1Var;
            i10++;
        }
        d0 d0Var = this.f48872a;
        long j10 = this.f48873b;
        long n10 = d0Var.n(rVarArr, zArr, a1VarArr2, zArr2, j3 - j10);
        for (int i11 = 0; i11 < a1VarArr.length; i11++) {
            a1 a1Var2 = a1VarArr2[i11];
            if (a1Var2 == null) {
                a1VarArr[i11] = null;
            } else {
                a1 a1Var3 = a1VarArr[i11];
                if (a1Var3 == null || ((l1) a1Var3).f48866a != a1Var2) {
                    a1VarArr[i11] = new l1(a1Var2, j10);
                }
            }
        }
        return n10 + j10;
    }

    @Override
    public final n1 o() {
        return this.f48872a.o();
    }

    @Override
    public final long p() {
        long p5 = this.f48872a.p();
        if (p5 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return p5 + this.f48873b;
    }

    @Override
    public final long q(long j3, q1 q1Var) {
        long j10 = this.f48873b;
        return this.f48872a.q(j3 - j10, q1Var) + j10;
    }

    @Override
    public final void r(long j3) {
        this.f48872a.r(j3 - this.f48873b);
    }
}
