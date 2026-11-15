package y3;

import f3.a0;
import f3.c0;
import h2.l0;
public final class i implements h {
    public final long[] f60175a;
    public final long[] f60176b;
    public final long f60177c;
    public final long d;
    public final long f60178e;
    public final int f60179f;

    public i(long[] jArr, long[] jArr2, long j3, long j10, long j11, int i7) {
        this.f60175a = jArr;
        this.f60176b = jArr2;
        this.f60177c = j3;
        this.d = j10;
        this.f60178e = j11;
        this.f60179f = i7;
    }

    @Override
    public final long a() {
        return this.f60178e;
    }

    @Override
    public final long b(long j3) {
        return this.f60175a[l0.f(this.f60176b, j3, true)];
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
        long[] jArr = this.f60175a;
        int f10 = l0.f(jArr, j3, true);
        long j10 = jArr[f10];
        long[] jArr2 = this.f60176b;
        c0 c0Var = new c0(j10, jArr2[f10]);
        if (j10 < j3 && f10 != jArr.length - 1) {
            int i7 = f10 + 1;
            return new a0(c0Var, new c0(jArr[i7], jArr2[i7]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final int g() {
        return this.f60179f;
    }

    @Override
    public final long h() {
        return this.f60177c;
    }
}
