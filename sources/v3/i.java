package v3;

import c3.b0;
import c3.d0;
import e2.m0;
public final class i implements h {
    public final long[] f47941a;
    public final long[] f47942b;
    public final long f47943c;
    public final long d;
    public final long e;
    public final int f47944f;

    public i(long[] jArr, long[] jArr2, long j10, long j11, long j12, int i10) {
        this.f47941a = jArr;
        this.f47942b = jArr2;
        this.f47943c = j10;
        this.d = j11;
        this.e = j12;
        this.f47944f = i10;
    }

    @Override
    public final long a(long j10) {
        return this.f47941a[m0.f(this.f47942b, j10, true)];
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
    public final b0 f(long j10) {
        long[] jArr = this.f47941a;
        int f7 = m0.f(jArr, j10, true);
        long j11 = jArr[f7];
        long[] jArr2 = this.f47942b;
        d0 d0Var = new d0(j11, jArr2[f7]);
        if (j11 < j10 && f7 != jArr.length - 1) {
            int i10 = f7 + 1;
            return new b0(d0Var, new d0(jArr[i10], jArr2[i10]));
        }
        return new b0(d0Var, d0Var);
    }

    @Override
    public final int g() {
        return this.f47944f;
    }

    @Override
    public final long h() {
        return this.f47943c;
    }
}
