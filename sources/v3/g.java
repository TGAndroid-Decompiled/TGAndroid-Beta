package v3;

import c3.a0;
import c3.c0;
import e2.d0;
public final class g implements f {
    public final long[] f44144a;
    public final long[] f44145b;
    public final long f44146c;
    public final long d;
    public final long e;
    public final int f44147f;

    public g(long[] jArr, long[] jArr2, long j3, long j10, long j11, int i10) {
        this.f44144a = jArr;
        this.f44145b = jArr2;
        this.f44146c = j3;
        this.d = j10;
        this.e = j11;
        this.f44147f = i10;
    }

    @Override
    public final long b(long j3) {
        return this.f44144a[d0.e(this.f44145b, j3, true)];
    }

    @Override
    public final long d() {
        return this.e;
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
        long[] jArr = this.f44144a;
        int e = d0.e(jArr, j3, true);
        long j10 = jArr[e];
        long[] jArr2 = this.f44145b;
        c0 c0Var = new c0(j10, jArr2[e]);
        if (j10 < j3 && e != jArr.length - 1) {
            int i10 = e + 1;
            return new a0(c0Var, new c0(jArr[i10], jArr2[i10]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final int k() {
        return this.f44147f;
    }

    @Override
    public final long l() {
        return this.f44146c;
    }
}
