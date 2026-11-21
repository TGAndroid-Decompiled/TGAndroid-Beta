package y3;

import f3.a0;
import f3.c0;
import h2.l0;
public final class i implements h {
    public final long[] f60782a;
    public final long[] f60783b;
    public final long f60784c;
    public final long d;
    public final long f60785e;
    public final int f60786f;

    public i(long[] jArr, long[] jArr2, long j3, long j10, long j11, int i7) {
        this.f60782a = jArr;
        this.f60783b = jArr2;
        this.f60784c = j3;
        this.d = j10;
        this.f60785e = j11;
        this.f60786f = i7;
    }

    @Override
    public final long a(long j3) {
        return this.f60782a[l0.f(this.f60783b, j3, true)];
    }

    @Override
    public final long b() {
        return this.f60785e;
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
    public final a0 f(long j3) {
        long[] jArr = this.f60782a;
        int f10 = l0.f(jArr, j3, true);
        long j10 = jArr[f10];
        long[] jArr2 = this.f60783b;
        c0 c0Var = new c0(j10, jArr2[f10]);
        if (j10 < j3 && f10 != jArr.length - 1) {
            int i7 = f10 + 1;
            return new a0(c0Var, new c0(jArr[i7], jArr2[i7]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final int g() {
        return this.f60786f;
    }

    @Override
    public final long h() {
        return this.f60784c;
    }
}
