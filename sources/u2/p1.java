package u2;

import i2.v1;
public final class p1 implements e0, d0 {
    public final e0 f49993a;
    public final long f49994b;
    public d0 f49995c;

    public p1(e0 e0Var, long j10) {
        this.f49993a = e0Var;
        this.f49994b = j10;
    }

    @Override
    public final long c() {
        long c10 = this.f49993a.c();
        if (c10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return c10 + this.f49994b;
    }

    @Override
    public final boolean d() {
        return this.f49993a.d();
    }

    @Override
    public final void e(e0 e0Var) {
        d0 d0Var = this.f49995c;
        d0Var.getClass();
        d0Var.e(this);
    }

    @Override
    public final void f() {
        this.f49993a.f();
    }

    @Override
    public final long g(long j10) {
        long j11 = this.f49994b;
        return this.f49993a.g(j10 - j11) + j11;
    }

    @Override
    public final void h(long j10) {
        this.f49993a.h(j10 - this.f49994b);
    }

    @Override
    public final void j(d0 d0Var, long j10) {
        this.f49995c = d0Var;
        this.f49993a.j(this, j10 - this.f49994b);
    }

    @Override
    public final long k() {
        long k10 = this.f49993a.k();
        if (k10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return k10 + this.f49994b;
    }

    @Override
    public final boolean m(i2.w0 w0Var) {
        ?? obj = new Object();
        long j10 = w0Var.f8108a;
        obj.f8100b = w0Var.f8109b;
        obj.f8101c = w0Var.f8110c;
        obj.f8099a = j10 - this.f49994b;
        return this.f49993a.m(new i2.w0(obj));
    }

    @Override
    public final long p(x2.q[] qVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        d1[] d1VarArr2 = new d1[d1VarArr.length];
        int i10 = 0;
        while (true) {
            d1 d1Var = null;
            if (i10 >= d1VarArr.length) {
                break;
            }
            o1 o1Var = (o1) d1VarArr[i10];
            if (o1Var != null) {
                d1Var = o1Var.f49984a;
            }
            d1VarArr2[i10] = d1Var;
            i10++;
        }
        e0 e0Var = this.f49993a;
        long j11 = this.f49994b;
        long p5 = e0Var.p(qVarArr, zArr, d1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < d1VarArr.length; i11++) {
            d1 d1Var2 = d1VarArr2[i11];
            if (d1Var2 == null) {
                d1VarArr[i11] = null;
            } else {
                d1 d1Var3 = d1VarArr[i11];
                if (d1Var3 == null || ((o1) d1Var3).f49984a != d1Var2) {
                    d1VarArr[i11] = new o1(d1Var2, j11);
                }
            }
        }
        return p5 + j11;
    }

    @Override
    public final r1 q() {
        return this.f49993a.q();
    }

    @Override
    public final void r(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f49995c;
        d0Var.getClass();
        d0Var.r(this);
    }

    @Override
    public final long s() {
        long s10 = this.f49993a.s();
        if (s10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s10 + this.f49994b;
    }

    @Override
    public final long t(long j10, v1 v1Var) {
        long j11 = this.f49994b;
        return this.f49993a.t(j10 - j11, v1Var) + j11;
    }

    @Override
    public final void u(long j10) {
        this.f49993a.u(j10 - this.f49994b);
    }
}
