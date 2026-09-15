package v3;

import c3.a0;
import c3.c0;
import e2.d0;
public final class g implements f {
    public final long[] f43890a;
    public final long[] f43891b;
    public final long f43892c;
    public final long d;
    public final long e;
    public final int f43893f;

    public g(long[] jArr, long[] jArr2, long j3, long j10, long j11, int i10) {
        this.f43890a = jArr;
        this.f43891b = jArr2;
        this.f43892c = j3;
        this.d = j10;
        this.e = j11;
        this.f43893f = i10;
    }

    @Override
    public final long b(long j3) {
        return this.f43890a[d0.e(this.f43891b, j3, true)];
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
        long[] jArr = this.f43890a;
        int e = d0.e(jArr, j3, true);
        long j10 = jArr[e];
        long[] jArr2 = this.f43891b;
        c0 c0Var = new c0(j10, jArr2[e]);
        if (j10 < j3 && e != jArr.length - 1) {
            int i10 = e + 1;
            return new a0(c0Var, new c0(jArr[i10], jArr2[i10]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final int k() {
        return this.f43893f;
    }

    @Override
    public final long l() {
        return this.f43892c;
    }
}
