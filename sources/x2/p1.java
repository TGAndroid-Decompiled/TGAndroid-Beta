package x2;
public final class p1 implements e0, d0 {
    public final e0 f60325a;
    public final long f60326b;
    public d0 f60327c;

    public p1(e0 e0Var, long j3) {
        this.f60325a = e0Var;
        this.f60326b = j3;
    }

    @Override
    public final void V(e0 e0Var) {
        d0 d0Var = this.f60327c;
        d0Var.getClass();
        d0Var.V(this);
    }

    @Override
    public final long c(a3.u[] uVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        d1[] d1VarArr2 = new d1[d1VarArr.length];
        int i7 = 0;
        while (true) {
            d1 d1Var = null;
            if (i7 >= d1VarArr.length) {
                break;
            }
            o1 o1Var = (o1) d1VarArr[i7];
            if (o1Var != null) {
                d1Var = o1Var.f60315a;
            }
            d1VarArr2[i7] = d1Var;
            i7++;
        }
        e0 e0Var = this.f60325a;
        long j10 = this.f60326b;
        long c10 = e0Var.c(uVarArr, zArr, d1VarArr2, zArr2, j3 - j10);
        for (int i10 = 0; i10 < d1VarArr.length; i10++) {
            d1 d1Var2 = d1VarArr2[i10];
            if (d1Var2 == null) {
                d1VarArr[i10] = null;
            } else {
                d1 d1Var3 = d1VarArr[i10];
                if (d1Var3 == null || ((o1) d1Var3).f60315a != d1Var2) {
                    d1VarArr[i10] = new o1(d1Var2, j10);
                }
            }
        }
        return c10 + j10;
    }

    @Override
    public final boolean d(l2.t0 t0Var) {
        ?? obj = new Object();
        long j3 = t0Var.f19642a;
        obj.f19638b = t0Var.f19643b;
        obj.f19639c = t0Var.f19644c;
        obj.f19637a = j3 - this.f60326b;
        return this.f60325a.d(new l2.t0(obj));
    }

    @Override
    public final long f() {
        long f10 = this.f60325a.f();
        if (f10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return f10 + this.f60326b;
    }

    @Override
    public final boolean g() {
        return this.f60325a.g();
    }

    @Override
    public final long i(long j3, l2.q1 q1Var) {
        long j10 = this.f60326b;
        return this.f60325a.i(j3 - j10, q1Var) + j10;
    }

    @Override
    public final void i2(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f60327c;
        d0Var.getClass();
        d0Var.i2(this);
    }

    @Override
    public final void j() {
        this.f60325a.j();
    }

    @Override
    public final long l(long j3) {
        long j10 = this.f60326b;
        return this.f60325a.l(j3 - j10) + j10;
    }

    @Override
    public final void n(long j3) {
        this.f60325a.n(j3 - this.f60326b);
    }

    @Override
    public final long p() {
        long p10 = this.f60325a.p();
        if (p10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return p10 + this.f60326b;
    }

    @Override
    public final r1 q() {
        return this.f60325a.q();
    }

    @Override
    public final long r() {
        long r10 = this.f60325a.r();
        if (r10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return r10 + this.f60326b;
    }

    @Override
    public final void s(d0 d0Var, long j3) {
        this.f60327c = d0Var;
        this.f60325a.s(this, j3 - this.f60326b);
    }

    @Override
    public final void u(long j3) {
        this.f60325a.u(j3 - this.f60326b);
    }
}
