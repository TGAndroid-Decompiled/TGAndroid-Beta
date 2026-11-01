package v3;

import c3.a0;
import c3.c0;
import e2.l0;
public final class i implements h {
    public final long[] f50375a;
    public final long[] f50376b;
    public final long f50377c;
    public final long d;
    public final long e;
    public final int f50378f;

    public i(long[] jArr, long[] jArr2, long j10, long j11, long j12, int i10) {
        this.f50375a = jArr;
        this.f50376b = jArr2;
        this.f50377c = j10;
        this.d = j11;
        this.e = j12;
        this.f50378f = i10;
    }

    @Override
    public final long a(long j10) {
        return this.f50375a[l0.f(this.f50376b, j10, true)];
    }

    @Override
    public final long b() {
        return this.e;
    }

    @Override
    public final long c() {
        return this.d;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final a0 f(long j10) {
        long[] jArr = this.f50375a;
        int f7 = l0.f(jArr, j10, true);
        long j11 = jArr[f7];
        long[] jArr2 = this.f50376b;
        c0 c0Var = new c0(j11, jArr2[f7]);
        if (j11 < j10 && f7 != jArr.length - 1) {
            int i10 = f7 + 1;
            return new a0(c0Var, new c0(jArr[i10], jArr2[i10]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final int g() {
        return this.f50378f;
    }

    @Override
    public final long h() {
        return this.f50377c;
    }
}
