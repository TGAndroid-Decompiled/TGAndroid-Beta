package u2;

import i2.q1;
public final class m1 implements d0, c0 {
    public final d0 f48723a;
    public final long f48724b;
    public c0 f48725c;

    public m1(d0 d0Var, long j3) {
        this.f48723a = d0Var;
        this.f48724b = j3;
    }

    @Override
    public final void D(c1 c1Var) {
        d0 d0Var = (d0) c1Var;
        c0 c0Var = this.f48725c;
        c0Var.getClass();
        c0Var.D(this);
    }

    @Override
    public final boolean c() {
        return this.f48723a.c();
    }

    @Override
    public final long d() {
        long d = this.f48723a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.f48724b;
    }

    @Override
    public final void g() {
        this.f48723a.g();
    }

    @Override
    public final long h(long j3) {
        long j10 = this.f48724b;
        return this.f48723a.h(j3 - j10) + j10;
    }

    @Override
    public final void i(long j3) {
        this.f48723a.i(j3 - this.f48724b);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f48725c = c0Var;
        this.f48723a.k(this, j3 - this.f48724b);
    }

    @Override
    public final long l() {
        long l4 = this.f48723a.l();
        if (l4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return l4 + this.f48724b;
    }

    @Override
    public final void m(d0 d0Var) {
        c0 c0Var = this.f48725c;
        c0Var.getClass();
        c0Var.m(this);
    }

    @Override
    public final boolean n(i2.s0 s0Var) {
        ?? obj = new Object();
        long j3 = s0Var.f11885a;
        obj.f11876b = s0Var.f11886b;
        obj.f11877c = s0Var.f11887c;
        obj.f11875a = j3 - this.f48724b;
        return this.f48723a.n(new i2.s0(obj));
    }

    @Override
    public final long o(x2.r[] rVarArr, boolean[] zArr, a1[] a1VarArr, boolean[] zArr2, long j3) {
        a1[] a1VarArr2 = new a1[a1VarArr.length];
        int i10 = 0;
        while (true) {
            a1 a1Var = null;
            if (i10 >= a1VarArr.length) {
                break;
            }
            l1 l1Var = (l1) a1VarArr[i10];
            if (l1Var != null) {
                a1Var = l1Var.f48717a;
            }
            a1VarArr2[i10] = a1Var;
            i10++;
        }
        d0 d0Var = this.f48723a;
        long j10 = this.f48724b;
        long o9 = d0Var.o(rVarArr, zArr, a1VarArr2, zArr2, j3 - j10);
        for (int i11 = 0; i11 < a1VarArr.length; i11++) {
            a1 a1Var2 = a1VarArr2[i11];
            if (a1Var2 == null) {
                a1VarArr[i11] = null;
            } else {
                a1 a1Var3 = a1VarArr[i11];
                if (a1Var3 == null || ((l1) a1Var3).f48717a != a1Var2) {
                    a1VarArr[i11] = new l1(a1Var2, j10);
                }
            }
        }
        return o9 + j10;
    }

    @Override
    public final n1 p() {
        return this.f48723a.p();
    }

    @Override
    public final long q() {
        long q6 = this.f48723a.q();
        if (q6 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return q6 + this.f48724b;
    }

    @Override
    public final long r(long j3, q1 q1Var) {
        long j10 = this.f48724b;
        return this.f48723a.r(j3 - j10, q1Var) + j10;
    }

    @Override
    public final void s(long j3) {
        this.f48723a.s(j3 - this.f48724b);
    }
}
