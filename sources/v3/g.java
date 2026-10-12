package v3;

import c3.a0;
import c3.c0;
import e2.d0;
public final class g implements f {
    public final long[] f49338a;
    public final long[] f49339b;
    public final long f49340c;
    public final long d;
    public final long f49341e;
    public final int f49342f;

    public g(long[] jArr, long[] jArr2, long j3, long j10, long j11, int i10) {
        this.f49338a = jArr;
        this.f49339b = jArr2;
        this.f49340c = j3;
        this.d = j10;
        this.f49341e = j11;
        this.f49342f = i10;
    }

    @Override
    public final long a(long j3) {
        return this.f49338a[d0.e(this.f49339b, j3, true)];
    }

    @Override
    public final long d() {
        return this.f49341e;
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
        long[] jArr = this.f49338a;
        int e7 = d0.e(jArr, j3, true);
        long j10 = jArr[e7];
        long[] jArr2 = this.f49339b;
        c0 c0Var = new c0(j10, jArr2[e7]);
        if (j10 < j3 && e7 != jArr.length - 1) {
            int i10 = e7 + 1;
            return new a0(c0Var, new c0(jArr[i10], jArr2[i10]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final int k() {
        return this.f49342f;
    }

    @Override
    public final long l() {
        return this.f49340c;
    }
}
