package x2;

import l2.t1;
public final class n1 implements d0, c0 {
    public final d0 f58437a;
    public final long f58438b;
    public c0 f58439c;

    public n1(d0 d0Var, long j3) {
        this.f58437a = d0Var;
        this.f58438b = j3;
    }

    @Override
    public final void a(d0 d0Var) {
        c0 c0Var = this.f58439c;
        c0Var.getClass();
        c0Var.a(this);
    }

    @Override
    public final long b(a3.u[] uVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        b1[] b1VarArr2 = new b1[b1VarArr.length];
        int i7 = 0;
        while (true) {
            b1 b1Var = null;
            if (i7 >= b1VarArr.length) {
                break;
            }
            m1 m1Var = (m1) b1VarArr[i7];
            if (m1Var != null) {
                b1Var = m1Var.f58424a;
            }
            b1VarArr2[i7] = b1Var;
            i7++;
        }
        d0 d0Var = this.f58437a;
        long j10 = this.f58438b;
        long b10 = d0Var.b(uVarArr, zArr, b1VarArr2, zArr2, j3 - j10);
        for (int i10 = 0; i10 < b1VarArr.length; i10++) {
            b1 b1Var2 = b1VarArr2[i10];
            if (b1Var2 == null) {
                b1VarArr[i10] = null;
            } else {
                b1 b1Var3 = b1VarArr[i10];
                if (b1Var3 == null || ((m1) b1Var3).f58424a != b1Var2) {
                    b1VarArr[i10] = new m1(b1Var2, j10);
                }
            }
        }
        return b10 + j10;
    }

    @Override
    public final boolean c(l2.v0 v0Var) {
        ?? obj = new Object();
        long j3 = v0Var.f18068a;
        obj.f18060b = v0Var.f18069b;
        obj.f18061c = v0Var.f18070c;
        obj.f18059a = j3 - this.f58438b;
        return this.f58437a.c(new l2.v0(obj));
    }

    @Override
    public final void d(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.f58439c;
        c0Var.getClass();
        c0Var.d(this);
    }

    @Override
    public final long e() {
        long e10 = this.f58437a.e();
        if (e10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return e10 + this.f58438b;
    }

    @Override
    public final boolean g() {
        return this.f58437a.g();
    }

    @Override
    public final long h(long j3, t1 t1Var) {
        long j10 = this.f58438b;
        return this.f58437a.h(j3 - j10, t1Var) + j10;
    }

    @Override
    public final void i() {
        this.f58437a.i();
    }

    @Override
    public final long j(long j3) {
        long j10 = this.f58438b;
        return this.f58437a.j(j3 - j10) + j10;
    }

    @Override
    public final void k(long j3) {
        this.f58437a.k(j3 - this.f58438b);
    }

    @Override
    public final long n() {
        long n10 = this.f58437a.n();
        if (n10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return n10 + this.f58438b;
    }

    @Override
    public final p1 o() {
        return this.f58437a.o();
    }

    @Override
    public final long p() {
        long p10 = this.f58437a.p();
        if (p10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return p10 + this.f58438b;
    }

    @Override
    public final void q(c0 c0Var, long j3) {
        this.f58439c = c0Var;
        this.f58437a.q(this, j3 - this.f58438b);
    }

    @Override
    public final void r(long j3) {
        this.f58437a.r(j3 - this.f58438b);
    }
}
