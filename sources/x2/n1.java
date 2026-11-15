package x2;
public final class n1 implements d0, c0 {
    public final d0 f59618a;
    public final long f59619b;
    public c0 f59620c;

    public n1(d0 d0Var, long j3) {
        this.f59618a = d0Var;
        this.f59619b = j3;
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
                b1Var = m1Var.f59605a;
            }
            b1VarArr2[i7] = b1Var;
            i7++;
        }
        d0 d0Var = this.f59618a;
        long j10 = this.f59619b;
        long b10 = d0Var.b(uVarArr, zArr, b1VarArr2, zArr2, j3 - j10);
        for (int i10 = 0; i10 < b1VarArr.length; i10++) {
            b1 b1Var2 = b1VarArr2[i10];
            if (b1Var2 == null) {
                b1VarArr[i10] = null;
            } else {
                b1 b1Var3 = b1VarArr[i10];
                if (b1Var3 == null || ((m1) b1Var3).f59605a != b1Var2) {
                    b1VarArr[i10] = new m1(b1Var2, j10);
                }
            }
        }
        return b10 + j10;
    }

    @Override
    public final boolean c(l2.s0 s0Var) {
        ?? obj = new Object();
        long j3 = s0Var.f19177a;
        obj.f19173b = s0Var.f19178b;
        obj.f19174c = s0Var.f19179c;
        obj.f19172a = j3 - this.f59619b;
        return this.f59618a.c(new l2.s0(obj));
    }

    @Override
    public final long e() {
        long e10 = this.f59618a.e();
        if (e10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return e10 + this.f59619b;
    }

    @Override
    public final void f0(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.f59620c;
        c0Var.getClass();
        c0Var.f0(this);
    }

    @Override
    public final boolean g() {
        return this.f59618a.g();
    }

    @Override
    public final long h(long j3, l2.p1 p1Var) {
        long j10 = this.f59619b;
        return this.f59618a.h(j3 - j10, p1Var) + j10;
    }

    @Override
    public final void i() {
        this.f59618a.i();
    }

    @Override
    public final long j(long j3) {
        long j10 = this.f59619b;
        return this.f59618a.j(j3 - j10) + j10;
    }

    @Override
    public final void k(d0 d0Var) {
        c0 c0Var = this.f59620c;
        c0Var.getClass();
        c0Var.k(this);
    }

    @Override
    public final void l(long j3) {
        this.f59618a.l(j3 - this.f59619b);
    }

    @Override
    public final long o() {
        long o4 = this.f59618a.o();
        if (o4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o4 + this.f59619b;
    }

    @Override
    public final q1 p() {
        return this.f59618a.p();
    }

    @Override
    public final long s() {
        long s5 = this.f59618a.s();
        if (s5 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s5 + this.f59619b;
    }

    @Override
    public final void t(c0 c0Var, long j3) {
        this.f59620c = c0Var;
        this.f59618a.t(this, j3 - this.f59619b);
    }

    @Override
    public final void u(long j3) {
        this.f59618a.u(j3 - this.f59619b);
    }
}
