package u2;
public final class n1 implements d0, c0 {
    public final d0 f46757a;
    public final long f46758b;
    public c0 f46759c;

    public n1(d0 d0Var, long j3) {
        this.f46757a = d0Var;
        this.f46758b = j3;
    }

    @Override
    public final void a(d0 d0Var) {
        c0 c0Var = this.f46759c;
        c0Var.getClass();
        c0Var.a(this);
    }

    @Override
    public final void b(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.f46759c;
        c0Var.getClass();
        c0Var.b(this);
    }

    @Override
    public final boolean c() {
        return this.f46757a.c();
    }

    @Override
    public final long d() {
        long d = this.f46757a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.f46758b;
    }

    @Override
    public final void j() {
        this.f46757a.j();
    }

    @Override
    public final long k(long j3) {
        long j10 = this.f46758b;
        return this.f46757a.k(j3 - j10) + j10;
    }

    @Override
    public final void l(long j3) {
        this.f46757a.l(j3 - this.f46758b);
    }

    @Override
    public final void n(c0 c0Var, long j3) {
        this.f46759c = c0Var;
        this.f46757a.n(this, j3 - this.f46758b);
    }

    @Override
    public final long o() {
        long o9 = this.f46757a.o();
        if (o9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o9 + this.f46758b;
    }

    @Override
    public final boolean p(i2.r0 r0Var) {
        ?? obj = new Object();
        long j3 = r0Var.f11727a;
        obj.f11720b = r0Var.f11728b;
        obj.f11721c = r0Var.f11729c;
        obj.f11719a = j3 - this.f46758b;
        return this.f46757a.p(new i2.r0(obj));
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
                b1Var = m1Var.f46751a;
            }
            b1VarArr2[i10] = b1Var;
            i10++;
        }
        d0 d0Var = this.f46757a;
        long j10 = this.f46758b;
        long q6 = d0Var.q(rVarArr, zArr, b1VarArr2, zArr2, j3 - j10);
        for (int i11 = 0; i11 < b1VarArr.length; i11++) {
            b1 b1Var2 = b1VarArr2[i11];
            if (b1Var2 == null) {
                b1VarArr[i11] = null;
            } else {
                b1 b1Var3 = b1VarArr[i11];
                if (b1Var3 == null || ((m1) b1Var3).f46751a != b1Var2) {
                    b1VarArr[i11] = new m1(b1Var2, j10);
                }
            }
        }
        return q6 + j10;
    }

    @Override
    public final o1 r() {
        return this.f46757a.r();
    }

    @Override
    public final long s() {
        long s10 = this.f46757a.s();
        if (s10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s10 + this.f46758b;
    }

    @Override
    public final long t(long j3, i2.p1 p1Var) {
        long j10 = this.f46758b;
        return this.f46757a.t(j3 - j10, p1Var) + j10;
    }

    @Override
    public final void u(long j3) {
        this.f46757a.u(j3 - this.f46758b);
    }
}
