package u2;
public final class n1 implements d0, c0 {
    public final d0 f43442a;
    public final long f43443b;
    public c0 f43444c;

    public n1(d0 d0Var, long j3) {
        this.f43442a = d0Var;
        this.f43443b = j3;
    }

    @Override
    public final void a(d0 d0Var) {
        c0 c0Var = this.f43444c;
        c0Var.getClass();
        c0Var.a(this);
    }

    @Override
    public final boolean c() {
        return this.f43442a.c();
    }

    @Override
    public final long d() {
        long d = this.f43442a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.f43443b;
    }

    @Override
    public final void g() {
        this.f43442a.g();
    }

    @Override
    public final long h(long j3) {
        long j10 = this.f43443b;
        return this.f43442a.h(j3 - j10) + j10;
    }

    @Override
    public final void i(long j3) {
        this.f43442a.i(j3 - this.f43443b);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f43444c = c0Var;
        this.f43442a.k(this, j3 - this.f43443b);
    }

    @Override
    public final long l() {
        long l4 = this.f43442a.l();
        if (l4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return l4 + this.f43443b;
    }

    @Override
    public final boolean m(i2.r0 r0Var) {
        ?? obj = new Object();
        long j3 = r0Var.f10866a;
        obj.f10861b = r0Var.f10867b;
        obj.f10862c = r0Var.f10868c;
        obj.f10860a = j3 - this.f43443b;
        return this.f43442a.m(new i2.r0(obj));
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
                b1Var = m1Var.f43436a;
            }
            b1VarArr2[i10] = b1Var;
            i10++;
        }
        d0 d0Var = this.f43442a;
        long j10 = this.f43443b;
        long p5 = d0Var.p(rVarArr, zArr, b1VarArr2, zArr2, j3 - j10);
        for (int i11 = 0; i11 < b1VarArr.length; i11++) {
            b1 b1Var2 = b1VarArr2[i11];
            if (b1Var2 == null) {
                b1VarArr[i11] = null;
            } else {
                b1 b1Var3 = b1VarArr[i11];
                if (b1Var3 == null || ((m1) b1Var3).f43436a != b1Var2) {
                    b1VarArr[i11] = new m1(b1Var2, j10);
                }
            }
        }
        return p5 + j10;
    }

    @Override
    public final o1 r() {
        return this.f43442a.r();
    }

    @Override
    public final long s() {
        long s10 = this.f43442a.s();
        if (s10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s10 + this.f43443b;
    }

    @Override
    public final long t(long j3, i2.p1 p1Var) {
        long j10 = this.f43443b;
        return this.f43442a.t(j3 - j10, p1Var) + j10;
    }

    @Override
    public final void u(long j3) {
        this.f43442a.u(j3 - this.f43443b);
    }

    @Override
    public final void v(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.f43444c;
        c0Var.getClass();
        c0Var.v(this);
    }
}
