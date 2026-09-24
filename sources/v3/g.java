package v3;

import c3.a0;
import c3.c0;
import e2.d0;
public final class g implements f {
    public final long[] f44158a;
    public final long[] f44159b;
    public final long f44160c;
    public final long d;
    public final long e;
    public final int f44161f;

    public g(long[] jArr, long[] jArr2, long j3, long j10, long j11, int i10) {
        this.f44158a = jArr;
        this.f44159b = jArr2;
        this.f44160c = j3;
        this.d = j10;
        this.e = j11;
        this.f44161f = i10;
    }

    @Override
    public final long b(long j3) {
        return this.f44158a[d0.e(this.f44159b, j3, true)];
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
        long[] jArr = this.f44158a;
        int e = d0.e(jArr, j3, true);
        long j10 = jArr[e];
        long[] jArr2 = this.f44159b;
        c0 c0Var = new c0(j10, jArr2[e]);
        if (j10 < j3 && e != jArr.length - 1) {
            int i10 = e + 1;
            return new a0(c0Var, new c0(jArr[i10], jArr2[i10]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final int k() {
        return this.f44161f;
    }

    @Override
    public final long l() {
        return this.f44160c;
    }
}
