package x2;

import l2.t1;
public final class o1 implements e0, d0 {
    public final e0 f58338a;
    public final long f58339b;
    public d0 f58340c;

    public o1(e0 e0Var, long j3) {
        this.f58338a = e0Var;
        this.f58339b = j3;
    }

    @Override
    public final void a(e0 e0Var) {
        d0 d0Var = this.f58340c;
        d0Var.getClass();
        d0Var.a(this);
    }

    @Override
    public final long b(a3.u[] uVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        c1[] c1VarArr2 = new c1[c1VarArr.length];
        int i7 = 0;
        while (true) {
            c1 c1Var = null;
            if (i7 >= c1VarArr.length) {
                break;
            }
            n1 n1Var = (n1) c1VarArr[i7];
            if (n1Var != null) {
                c1Var = n1Var.f58324a;
            }
            c1VarArr2[i7] = c1Var;
            i7++;
        }
        e0 e0Var = this.f58338a;
        long j10 = this.f58339b;
        long b10 = e0Var.b(uVarArr, zArr, c1VarArr2, zArr2, j3 - j10);
        for (int i10 = 0; i10 < c1VarArr.length; i10++) {
            c1 c1Var2 = c1VarArr2[i10];
            if (c1Var2 == null) {
                c1VarArr[i10] = null;
            } else {
                c1 c1Var3 = c1VarArr[i10];
                if (c1Var3 == null || ((n1) c1Var3).f58324a != c1Var2) {
                    c1VarArr[i10] = new n1(c1Var2, j10);
                }
            }
        }
        return b10 + j10;
    }

    @Override
    public final boolean c(l2.v0 v0Var) {
        ?? obj = new Object();
        long j3 = v0Var.f18064a;
        obj.f18056b = v0Var.f18065b;
        obj.f18057c = v0Var.f18066c;
        obj.f18055a = j3 - this.f58339b;
        return this.f58338a.c(new l2.v0(obj));
    }

    @Override
    public final void d(e1 e1Var) {
        e0 e0Var = (e0) e1Var;
        d0 d0Var = this.f58340c;
        d0Var.getClass();
        d0Var.d(this);
    }

    @Override
    public final long e() {
        long e10 = this.f58338a.e();
        if (e10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return e10 + this.f58339b;
    }

    @Override
    public final boolean g() {
        return this.f58338a.g();
    }

    @Override
    public final long h(long j3, t1 t1Var) {
        long j10 = this.f58339b;
        return this.f58338a.h(j3 - j10, t1Var) + j10;
    }

    @Override
    public final void i() {
        this.f58338a.i();
    }

    @Override
    public final long j(long j3) {
        long j10 = this.f58339b;
        return this.f58338a.j(j3 - j10) + j10;
    }

    @Override
    public final void k(long j3) {
        this.f58338a.k(j3 - this.f58339b);
    }

    @Override
    public final long n() {
        long n10 = this.f58338a.n();
        if (n10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return n10 + this.f58339b;
    }

    @Override
    public final q1 o() {
        return this.f58338a.o();
    }

    @Override
    public final long p() {
        long p10 = this.f58338a.p();
        if (p10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return p10 + this.f58339b;
    }

    @Override
    public final void q(d0 d0Var, long j3) {
        this.f58340c = d0Var;
        this.f58338a.q(this, j3 - this.f58339b);
    }

    @Override
    public final void r(long j3) {
        this.f58338a.r(j3 - this.f58339b);
    }
}
