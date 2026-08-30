package y3;

import h5.d0;
import r3.r;
import r3.t;
public final class g implements f {
    public final long[] f47054a;
    public final long[] f47055b;
    public final long f47056c;
    public final long d;

    public g(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f47054a = jArr;
        this.f47055b = jArr2;
        this.f47056c = j10;
        this.d = j11;
    }

    @Override
    public final long a(long j10) {
        return this.f47054a[d0.e(this.f47055b, j10, true)];
    }

    @Override
    public final long b() {
        return this.d;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final r f(long j10) {
        long[] jArr = this.f47054a;
        int e = d0.e(jArr, j10, true);
        long j11 = jArr[e];
        long[] jArr2 = this.f47055b;
        t tVar = new t(j11, jArr2[e]);
        if (j11 < j10 && e != jArr.length - 1) {
            int i10 = e + 1;
            return new r(tVar, new t(jArr[i10], jArr2[i10]));
        }
        return new r(tVar, tVar);
    }

    @Override
    public final long g() {
        return this.f47056c;
    }
}
