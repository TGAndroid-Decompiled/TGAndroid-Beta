package x3;

import c2.b1;
import d5.f0;
import m3.s;
import m3.t;
import m3.u;
public final class d implements t {
    public final b1 f48876a;
    public final int f48877b;
    public final long f48878c;
    public final long d;
    public final long f48879e;

    public d(b1 b1Var, int i9, long j10, long j11) {
        this.f48876a = b1Var;
        this.f48877b = i9;
        this.f48878c = j10;
        long j12 = (j11 - j10) / b1Var.f2121c;
        this.d = j12;
        this.f48879e = f0.O(j12 * i9, 1000000L, b1Var.f2120b);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final s h(long j10) {
        b1 b1Var = this.f48876a;
        int i9 = this.f48877b;
        long j11 = (b1Var.f2120b * j10) / (i9 * 1000000);
        long j12 = this.d - 1;
        long i10 = f0.i(j11, 0L, j12);
        int i11 = b1Var.f2121c;
        long j13 = this.f48878c;
        long O = f0.O(i10 * i9, 1000000L, b1Var.f2120b);
        u uVar = new u(O, (i11 * i10) + j13);
        if (O < j10 && i10 != j12) {
            long j14 = i10 + 1;
            return new s(uVar, new u(f0.O(j14 * i9, 1000000L, b1Var.f2120b), (i11 * j14) + j13));
        }
        return new s(uVar, uVar);
    }

    @Override
    public final long i() {
        return this.f48879e;
    }
}
