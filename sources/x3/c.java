package x3;

import android.util.Pair;
import e3.a0;
import e3.c0;
import g2.n0;
public final class c implements h {
    public final long[] f58180a;
    public final long[] f58181b;
    public final long f58182c;

    public c(long j10, long[] jArr, long[] jArr2) {
        this.f58180a = jArr;
        this.f58181b = jArr2;
        this.f58182c = j10 == -9223372036854775807L ? n0.S(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair i(long j10, long[] jArr, long[] jArr2) {
        double d;
        int f10 = n0.f(jArr, j10, true);
        long j11 = jArr[f10];
        long j12 = jArr2[f10];
        int i3 = f10 + 1;
        if (i3 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i3];
        long j14 = jArr2[i3];
        if (j13 == j11) {
            d = 0.0d;
        } else {
            d = (j10 - j11) / (j13 - j11);
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) (d * (j14 - j12))) + j12));
    }

    @Override
    public final long a() {
        return -1L;
    }

    @Override
    public final long b(long j10) {
        return n0.S(((Long) i(j10, this.f58180a, this.f58181b).second).longValue());
    }

    @Override
    public final long c() {
        return 0L;
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
        Pair i3 = i(n0.h0(n0.j(j10, 0L, this.f58182c)), this.f58181b, this.f58180a);
        c0 c0Var = new c0(n0.S(((Long) i3.first).longValue()), ((Long) i3.second).longValue());
        return new a0(c0Var, c0Var);
    }

    @Override
    public final int g() {
        return -2147483647;
    }

    @Override
    public final long h() {
        return this.f58182c;
    }
}
