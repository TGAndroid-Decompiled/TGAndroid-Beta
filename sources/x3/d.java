package x3;

import c2.a1;
import d5.g0;
import m3.s;
import m3.t;
import m3.u;

public final class d implements t {

    public final a1 f49356a;

    public final int f49357b;

    public final long f49358c;
    public final long d;

    public final long f49359e;

    public d(a1 a1Var, int i10, long j10, long j11) {
        this.f49356a = a1Var;
        this.f49357b = i10;
        this.f49358c = j10;
        long j12 = (j11 - j10) / ((long) a1Var.f2231c);
        this.d = j12;
        this.f49359e = g0.O(j12 * ((long) i10), 1000000L, a1Var.f2230b);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final s h(long j10) {
        a1 a1Var = this.f49356a;
        long j11 = ((long) a1Var.f2230b) * j10;
        int i10 = this.f49357b;
        long j12 = this.d - 1;
        long jI = g0.i(j11 / (((long) i10) * 1000000), 0L, j12);
        int i11 = a1Var.f2231c;
        long j13 = this.f49358c;
        long jO = g0.O(jI * ((long) i10), 1000000L, a1Var.f2230b);
        u uVar = new u(jO, (((long) i11) * jI) + j13);
        if (jO >= j10 || jI == j12) {
            return new s(uVar, uVar);
        }
        long j14 = jI + 1;
        return new s(uVar, new u(g0.O(j14 * ((long) i10), 1000000L, a1Var.f2230b), (((long) i11) * j14) + j13));
    }

    @Override
    public final long i() {
        return this.f49359e;
    }
}
