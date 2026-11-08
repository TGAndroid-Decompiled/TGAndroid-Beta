package y3;

import f3.b0;
import f3.d0;
import h2.m0;
public final class i implements h {
    public final long[] f58954a;
    public final long[] f58955b;
    public final long f58956c;
    public final long d;
    public final long f58957e;
    public final int f58958f;

    public i(long[] jArr, long[] jArr2, long j3, long j10, long j11, int i7) {
        this.f58954a = jArr;
        this.f58955b = jArr2;
        this.f58956c = j3;
        this.d = j10;
        this.f58957e = j11;
        this.f58958f = i7;
    }

    @Override
    public final long a(long j3) {
        return this.f58954a[m0.f(this.f58955b, j3, true)];
    }

    @Override
    public final long b() {
        return this.f58957e;
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
    public final b0 f(long j3) {
        long[] jArr = this.f58954a;
        int f10 = m0.f(jArr, j3, true);
        long j10 = jArr[f10];
        long[] jArr2 = this.f58955b;
        d0 d0Var = new d0(j10, jArr2[f10]);
        if (j10 < j3 && f10 != jArr.length - 1) {
            int i7 = f10 + 1;
            return new b0(d0Var, new d0(jArr[i7], jArr2[i7]));
        }
        return new b0(d0Var, d0Var);
    }

    @Override
    public final int g() {
        return this.f58958f;
    }

    @Override
    public final long h() {
        return this.f58956c;
    }
}
