package u2;
public final class r1 implements f0, e0 {
    public final f0 f47879a;
    public final long f47880b;
    public e0 f47881c;

    public r1(f0 f0Var, long j10) {
        this.f47879a = f0Var;
        this.f47880b = j10;
    }

    @Override
    public final void a(f0 f0Var) {
        e0 e0Var = this.f47881c;
        e0Var.getClass();
        e0Var.a(this);
    }

    @Override
    public final void b(h1 h1Var) {
        f0 f0Var = (f0) h1Var;
        e0 e0Var = this.f47881c;
        e0Var.getClass();
        e0Var.b(this);
    }

    @Override
    public final boolean c() {
        return this.f47879a.c();
    }

    @Override
    public final long d() {
        long d = this.f47879a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.f47880b;
    }

    @Override
    public final void h() {
        this.f47879a.h();
    }

    @Override
    public final long i(long j10) {
        long j11 = this.f47880b;
        return this.f47879a.i(j10 - j11) + j11;
    }

    @Override
    public final void l(long j10) {
        this.f47879a.l(j10 - this.f47880b);
    }

    @Override
    public final void n(e0 e0Var, long j10) {
        this.f47881c = e0Var;
        this.f47879a.n(this, j10 - this.f47880b);
    }

    @Override
    public final long o() {
        long o10 = this.f47879a.o();
        if (o10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o10 + this.f47880b;
    }

    @Override
    public final boolean p(i2.u0 u0Var) {
        ?? obj = new Object();
        long j10 = u0Var.f12625a;
        obj.f12618b = u0Var.f12626b;
        obj.f12619c = u0Var.f12627c;
        obj.f12617a = j10 - this.f47880b;
        return this.f47879a.p(new i2.u0(obj));
    }

    @Override
    public final long q(x2.p[] pVarArr, boolean[] zArr, f1[] f1VarArr, boolean[] zArr2, long j10) {
        f1[] f1VarArr2 = new f1[f1VarArr.length];
        int i10 = 0;
        while (true) {
            f1 f1Var = null;
            if (i10 >= f1VarArr.length) {
                break;
            }
            q1 q1Var = (q1) f1VarArr[i10];
            if (q1Var != null) {
                f1Var = q1Var.f47869a;
            }
            f1VarArr2[i10] = f1Var;
            i10++;
        }
        f0 f0Var = this.f47879a;
        long j11 = this.f47880b;
        long q6 = f0Var.q(pVarArr, zArr, f1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < f1VarArr.length; i11++) {
            f1 f1Var2 = f1VarArr2[i11];
            if (f1Var2 == null) {
                f1VarArr[i11] = null;
            } else {
                f1 f1Var3 = f1VarArr[i11];
                if (f1Var3 == null || ((q1) f1Var3).f47869a != f1Var2) {
                    f1VarArr[i11] = new q1(f1Var2, j11);
                }
            }
        }
        return q6 + j11;
    }

    @Override
    public final t1 r() {
        return this.f47879a.r();
    }

    @Override
    public final long s() {
        long s10 = this.f47879a.s();
        if (s10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s10 + this.f47880b;
    }

    @Override
    public final long t(long j10, i2.s1 s1Var) {
        long j11 = this.f47880b;
        return this.f47879a.t(j10 - j11, s1Var) + j11;
    }

    @Override
    public final void u(long j10) {
        this.f47879a.u(j10 - this.f47880b);
    }
}
