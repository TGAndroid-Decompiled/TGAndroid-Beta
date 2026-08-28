package t3;

import d5.f0;
import m3.s;
import m3.u;
public final class g implements f {
    public final long[] f47625a;
    public final long[] f47626b;
    public final long f47627c;
    public final long d;

    public g(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f47625a = jArr;
        this.f47626b = jArr2;
        this.f47627c = j10;
        this.d = j11;
    }

    @Override
    public final long a(long j10) {
        return this.f47625a[f0.e(this.f47626b, j10, true)];
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
        long[] jArr = this.f47625a;
        int e10 = f0.e(jArr, j10, true);
        long j11 = jArr[e10];
        long[] jArr2 = this.f47626b;
        u uVar = new u(j11, jArr2[e10]);
        if (j11 < j10 && e10 != jArr.length - 1) {
            int i9 = e10 + 1;
            return new s(uVar, new u(jArr[i9], jArr2[i9]));
        }
        return new s(uVar, uVar);
    }

    @Override
    public final long i() {
        return this.f47627c;
    }
}
