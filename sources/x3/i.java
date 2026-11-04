package x3;

import e3.a0;
import e3.c0;
import g2.n0;
public final class i implements h {
    public final long[] f58208a;
    public final long[] f58209b;
    public final long f58210c;
    public final long d;
    public final long f58211e;
    public final int f58212f;

    public i(long[] jArr, long[] jArr2, long j10, long j11, long j12, int i3) {
        this.f58208a = jArr;
        this.f58209b = jArr2;
        this.f58210c = j10;
        this.d = j11;
        this.f58211e = j12;
        this.f58212f = i3;
    }

    @Override
    public final long a() {
        return this.f58211e;
    }

    @Override
    public final long b(long j10) {
        return this.f58208a[n0.f(this.f58209b, j10, true)];
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
        long[] jArr = this.f58208a;
        int f10 = n0.f(jArr, j10, true);
        long j11 = jArr[f10];
        long[] jArr2 = this.f58209b;
        c0 c0Var = new c0(j11, jArr2[f10]);
        if (j11 < j10 && f10 != jArr.length - 1) {
            int i3 = f10 + 1;
            return new a0(c0Var, new c0(jArr[i3], jArr2[i3]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final int g() {
        return this.f58212f;
    }

    @Override
    public final long h() {
        return this.f58210c;
    }
}
