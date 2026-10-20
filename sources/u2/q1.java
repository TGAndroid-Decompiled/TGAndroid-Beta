package u2;
public final class q1 implements e0, d0 {
    public final e0 f47422a;
    public final long f47423b;
    public d0 f47424c;

    public q1(e0 e0Var, long j10) {
        this.f47422a = e0Var;
        this.f47423b = j10;
    }

    @Override
    public final void a(e0 e0Var) {
        d0 d0Var = this.f47424c;
        d0Var.getClass();
        d0Var.a(this);
    }

    @Override
    public final boolean c() {
        return this.f47422a.c();
    }

    @Override
    public final long d() {
        long d = this.f47422a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.f47423b;
    }

    @Override
    public final void h(g1 g1Var) {
        e0 e0Var = (e0) g1Var;
        d0 d0Var = this.f47424c;
        d0Var.getClass();
        d0Var.h(this);
    }

    @Override
    public final void i() {
        this.f47422a.i();
    }

    @Override
    public final long j(long j10) {
        long j11 = this.f47423b;
        return this.f47422a.j(j10 - j11) + j11;
    }

    @Override
    public final void l(long j10) {
        this.f47422a.l(j10 - this.f47423b);
    }

    @Override
    public final void n(d0 d0Var, long j10) {
        this.f47424c = d0Var;
        this.f47422a.n(this, j10 - this.f47423b);
    }

    @Override
    public final long o() {
        long o10 = this.f47422a.o();
        if (o10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o10 + this.f47423b;
    }

    @Override
    public final boolean p(i2.v0 v0Var) {
        ?? obj = new Object();
        long j10 = v0Var.f12596a;
        obj.f12592b = v0Var.f12597b;
        obj.f12593c = v0Var.f12598c;
        obj.f12591a = j10 - this.f47423b;
        return this.f47422a.p(new i2.v0(obj));
    }

    @Override
    public final long q(x2.p[] pVarArr, boolean[] zArr, e1[] e1VarArr, boolean[] zArr2, long j10) {
        e1[] e1VarArr2 = new e1[e1VarArr.length];
        int i10 = 0;
        while (true) {
            e1 e1Var = null;
            if (i10 >= e1VarArr.length) {
                break;
            }
            p1 p1Var = (p1) e1VarArr[i10];
            if (p1Var != null) {
                e1Var = p1Var.f47412a;
            }
            e1VarArr2[i10] = e1Var;
            i10++;
        }
        e0 e0Var = this.f47422a;
        long j11 = this.f47423b;
        long q6 = e0Var.q(pVarArr, zArr, e1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < e1VarArr.length; i11++) {
            e1 e1Var2 = e1VarArr2[i11];
            if (e1Var2 == null) {
                e1VarArr[i11] = null;
            } else {
                e1 e1Var3 = e1VarArr[i11];
                if (e1Var3 == null || ((p1) e1Var3).f47412a != e1Var2) {
                    e1VarArr[i11] = new p1(e1Var2, j11);
                }
            }
        }
        return q6 + j11;
    }

    @Override
    public final s1 r() {
        return this.f47422a.r();
    }

    @Override
    public final long s() {
        long s10 = this.f47422a.s();
        if (s10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s10 + this.f47423b;
    }

    @Override
    public final long t(long j10, i2.s1 s1Var) {
        long j11 = this.f47423b;
        return this.f47422a.t(j10 - j11, s1Var) + j11;
    }

    @Override
    public final void u(long j10) {
        this.f47422a.u(j10 - this.f47423b);
    }
}
