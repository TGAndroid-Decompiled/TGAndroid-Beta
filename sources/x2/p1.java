package x2;
public final class p1 implements e0, d0 {
    public final e0 f60242a;
    public final long f60243b;
    public d0 f60244c;

    public p1(e0 e0Var, long j3) {
        this.f60242a = e0Var;
        this.f60243b = j3;
    }

    @Override
    public final long b(a3.u[] uVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        d1[] d1VarArr2 = new d1[d1VarArr.length];
        int i7 = 0;
        while (true) {
            d1 d1Var = null;
            if (i7 >= d1VarArr.length) {
                break;
            }
            o1 o1Var = (o1) d1VarArr[i7];
            if (o1Var != null) {
                d1Var = o1Var.f60232a;
            }
            d1VarArr2[i7] = d1Var;
            i7++;
        }
        e0 e0Var = this.f60242a;
        long j10 = this.f60243b;
        long b10 = e0Var.b(uVarArr, zArr, d1VarArr2, zArr2, j3 - j10);
        for (int i10 = 0; i10 < d1VarArr.length; i10++) {
            d1 d1Var2 = d1VarArr2[i10];
            if (d1Var2 == null) {
                d1VarArr[i10] = null;
            } else {
                d1 d1Var3 = d1VarArr[i10];
                if (d1Var3 == null || ((o1) d1Var3).f60232a != d1Var2) {
                    d1VarArr[i10] = new o1(d1Var2, j10);
                }
            }
        }
        return b10 + j10;
    }

    @Override
    public final boolean c(l2.s0 s0Var) {
        ?? obj = new Object();
        long j3 = s0Var.f19572a;
        obj.f19568b = s0Var.f19573b;
        obj.f19569c = s0Var.f19574c;
        obj.f19567a = j3 - this.f60243b;
        return this.f60242a.c(new l2.s0(obj));
    }

    @Override
    public final void c0(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f60244c;
        d0Var.getClass();
        d0Var.c0(this);
    }

    @Override
    public final long e() {
        long e10 = this.f60242a.e();
        if (e10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return e10 + this.f60243b;
    }

    @Override
    public final long f(long j3, l2.p1 p1Var) {
        long j10 = this.f60243b;
        return this.f60242a.f(j3 - j10, p1Var) + j10;
    }

    @Override
    public final boolean g() {
        return this.f60242a.g();
    }

    @Override
    public final void i() {
        this.f60242a.i();
    }

    @Override
    public final long k(long j3) {
        long j10 = this.f60243b;
        return this.f60242a.k(j3 - j10) + j10;
    }

    @Override
    public final void m(e0 e0Var) {
        d0 d0Var = this.f60244c;
        d0Var.getClass();
        d0Var.m(this);
    }

    @Override
    public final void n(long j3) {
        this.f60242a.n(j3 - this.f60243b);
    }

    @Override
    public final long o() {
        long o4 = this.f60242a.o();
        if (o4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o4 + this.f60243b;
    }

    @Override
    public final r1 q() {
        return this.f60242a.q();
    }

    @Override
    public final long r() {
        long r10 = this.f60242a.r();
        if (r10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return r10 + this.f60243b;
    }

    @Override
    public final void t(d0 d0Var, long j3) {
        this.f60244c = d0Var;
        this.f60242a.t(this, j3 - this.f60243b);
    }

    @Override
    public final void u(long j3) {
        this.f60242a.u(j3 - this.f60243b);
    }
}
