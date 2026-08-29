package z3;

import a4.k;
import f5.d0;
import o3.s;
import o3.t;
import o3.u;
public final class d implements t {
    public final k f50576a;
    public final int f50577b;
    public final long f50578c;
    public final long d;
    public final long f50579e;

    public d(k kVar, int i10, long j10, long j11) {
        this.f50576a = kVar;
        this.f50577b = i10;
        this.f50578c = j10;
        long j12 = (j11 - j10) / kVar.f97c;
        this.d = j12;
        this.f50579e = d0.O(j12 * i10, 1000000L, kVar.f96b);
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final s g(long j10) {
        k kVar = this.f50576a;
        int i10 = this.f50577b;
        long j11 = (kVar.f96b * j10) / (i10 * 1000000);
        long j12 = this.d - 1;
        long i11 = d0.i(j11, 0L, j12);
        int i12 = kVar.f97c;
        long j13 = this.f50578c;
        long O = d0.O(i11 * i10, 1000000L, kVar.f96b);
        u uVar = new u(O, (i12 * i11) + j13);
        if (O < j10 && i11 != j12) {
            long j14 = i11 + 1;
            return new s(uVar, new u(d0.O(j14 * i10, 1000000L, kVar.f96b), (i12 * j14) + j13));
        }
        return new s(uVar, uVar);
    }

    @Override
    public final long h() {
        return this.f50579e;
    }
}
