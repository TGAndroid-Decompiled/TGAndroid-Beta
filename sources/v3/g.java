package v3;

import c3.a0;
import c3.c0;
import e2.d0;
public final class g implements f {
    public final long[] f49102a;
    public final long[] f49103b;
    public final long f49104c;
    public final long d;
    public final long f49105e;
    public final int f49106f;

    public g(long[] jArr, long[] jArr2, long j3, long j10, long j11, int i10) {
        this.f49102a = jArr;
        this.f49103b = jArr2;
        this.f49104c = j3;
        this.d = j10;
        this.f49105e = j11;
        this.f49106f = i10;
    }

    @Override
    public final long b(long j3) {
        return this.f49102a[d0.e(this.f49103b, j3, true)];
    }

    @Override
    public final long d() {
        return this.f49105e;
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
        long[] jArr = this.f49102a;
        int e7 = d0.e(jArr, j3, true);
        long j10 = jArr[e7];
        long[] jArr2 = this.f49103b;
        c0 c0Var = new c0(j10, jArr2[e7]);
        if (j10 < j3 && e7 != jArr.length - 1) {
            int i10 = e7 + 1;
            return new a0(c0Var, new c0(jArr[i10], jArr2[i10]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final int k() {
        return this.f49106f;
    }

    @Override
    public final long l() {
        return this.f49104c;
    }
}
