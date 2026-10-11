package v3;

import c3.a0;
import c3.c0;
import e2.d0;
public final class g implements f {
    public final long[] f49189a;
    public final long[] f49190b;
    public final long f49191c;
    public final long d;
    public final long f49192e;
    public final int f49193f;

    public g(long[] jArr, long[] jArr2, long j3, long j10, long j11, int i10) {
        this.f49189a = jArr;
        this.f49190b = jArr2;
        this.f49191c = j3;
        this.d = j10;
        this.f49192e = j11;
        this.f49193f = i10;
    }

    @Override
    public final long b(long j3) {
        return this.f49189a[d0.e(this.f49190b, j3, true)];
    }

    @Override
    public final long d() {
        return this.f49192e;
    }

    @Override
    public final long e() {
        return this.d;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a0 j(long j3) {
        long[] jArr = this.f49189a;
        int e7 = d0.e(jArr, j3, true);
        long j10 = jArr[e7];
        long[] jArr2 = this.f49190b;
        c0 c0Var = new c0(j10, jArr2[e7]);
        if (j10 < j3 && e7 != jArr.length - 1) {
            int i10 = e7 + 1;
            return new a0(c0Var, new c0(jArr[i10], jArr2[i10]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final int k() {
        return this.f49193f;
    }

    @Override
    public final long l() {
        return this.f49191c;
    }
}
