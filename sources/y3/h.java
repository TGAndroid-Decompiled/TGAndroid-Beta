package y3;

import h5.d0;
import r3.r;
import r3.t;
public final class h implements g {
    public final long[] f50774a;
    public final long[] f50775b;
    public final long f50776c;
    public final long d;

    public h(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f50774a = jArr;
        this.f50775b = jArr2;
        this.f50776c = j10;
        this.d = j11;
    }

    @Override
    public final long a(long j10) {
        return this.f50774a[d0.e(this.f50775b, j10, true)];
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
        long[] jArr = this.f50774a;
        int e6 = d0.e(jArr, j10, true);
        long j11 = jArr[e6];
        long[] jArr2 = this.f50775b;
        t tVar = new t(j11, jArr2[e6]);
        if (j11 < j10 && e6 != jArr.length - 1) {
            int i10 = e6 + 1;
            return new r(tVar, new t(jArr[i10], jArr2[i10]));
        }
        return new r(tVar, tVar);
    }

    @Override
    public final long g() {
        return this.f50776c;
    }
}
