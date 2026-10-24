package v3;

import c3.d0;
import c3.f0;
import e2.m0;
public final class i implements h {
    public final long[] f48387a;
    public final long[] f48388b;
    public final long f48389c;
    public final long d;
    public final long e;
    public final int f48390f;

    public i(long[] jArr, long[] jArr2, long j10, long j11, long j12, int i10) {
        this.f48387a = jArr;
        this.f48388b = jArr2;
        this.f48389c = j10;
        this.d = j11;
        this.e = j12;
        this.f48390f = i10;
    }

    @Override
    public final long a() {
        return this.e;
    }

    @Override
    public final long b(long j10) {
        return this.f48387a[m0.f(this.f48388b, j10, true)];
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
    public final d0 f(long j10) {
        long[] jArr = this.f48387a;
        int f7 = m0.f(jArr, j10, true);
        long j11 = jArr[f7];
        long[] jArr2 = this.f48388b;
        f0 f0Var = new f0(j11, jArr2[f7]);
        if (j11 < j10 && f7 != jArr.length - 1) {
            int i10 = f7 + 1;
            return new d0(f0Var, new f0(jArr[i10], jArr2[i10]));
        }
        return new d0(f0Var, f0Var);
    }

    @Override
    public final int g() {
        return this.f48390f;
    }

    @Override
    public final long h() {
        return this.f48389c;
    }
}
