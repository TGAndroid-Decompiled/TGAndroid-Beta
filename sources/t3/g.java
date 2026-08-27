package t3;

import d5.g0;
import m3.s;
import m3.u;

public final class g implements f {

    public final long[] f48036a;

    public final long[] f48037b;

    public final long f48038c;
    public final long d;

    public g(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f48036a = jArr;
        this.f48037b = jArr2;
        this.f48038c = j10;
        this.d = j11;
    }

    @Override
    public final long a(long j10) {
        return this.f48036a[g0.e(this.f48037b, j10, true)];
    }

    @Override
    public final long d() {
        return this.d;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final s h(long j10) {
        long[] jArr = this.f48036a;
        int iE = g0.e(jArr, j10, true);
        long j11 = jArr[iE];
        long[] jArr2 = this.f48037b;
        u uVar = new u(j11, jArr2[iE]);
        if (j11 >= j10 || iE == jArr.length - 1) {
            return new s(uVar, uVar);
        }
        int i10 = iE + 1;
        return new s(uVar, new u(jArr[i10], jArr2[i10]));
    }

    @Override
    public final long i() {
        return this.f48038c;
    }
}
