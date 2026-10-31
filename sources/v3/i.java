package v3;

import c3.a0;
import c3.c0;
import e2.l0;
public final class i implements h {
    public final long[] f50361a;
    public final long[] f50362b;
    public final long f50363c;
    public final long d;
    public final long e;
    public final int f50364f;

    public i(long[] jArr, long[] jArr2, long j10, long j11, long j12, int i10) {
        this.f50361a = jArr;
        this.f50362b = jArr2;
        this.f50363c = j10;
        this.d = j11;
        this.e = j12;
        this.f50364f = i10;
    }

    @Override
    public final long a(long j10) {
        return this.f50361a[l0.f(this.f50362b, j10, true)];
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
        long[] jArr = this.f50361a;
        int f7 = l0.f(jArr, j10, true);
        long j11 = jArr[f7];
        long[] jArr2 = this.f50362b;
        c0 c0Var = new c0(j11, jArr2[f7]);
        if (j11 < j10 && f7 != jArr.length - 1) {
            int i10 = f7 + 1;
            return new a0(c0Var, new c0(jArr[i10], jArr2[i10]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final int g() {
        return this.f50364f;
    }

    @Override
    public final long h() {
        return this.f50363c;
    }
}
